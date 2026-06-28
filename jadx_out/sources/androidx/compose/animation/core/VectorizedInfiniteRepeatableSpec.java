package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.i0;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.m;
import p4.l;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B!\b\u0017\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b!\u0010\"B)\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010$\u001a\u00020#¢\u0006\u0004\b!\u0010%J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J/\u0010\n\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u000bJ/\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u000bJ'\u0010\u0011\u001a\u00020\u00042\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006&"}, d2 = {"Landroidx/compose/animation/core/VectorizedInfiniteRepeatableSpec;", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/VectorizedAnimationSpec;", "", "playTimeNanos", "repetitionPlayTimeNanos", "start", "startVelocity", "end", "repetitionStartVelocity", "(JLandroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "initialValue", "targetValue", "initialVelocity", "getValueFromNanos", "getVelocityFromNanos", "getDurationNanos", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)J", "Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;", "animation", "Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;", "Landroidx/compose/animation/core/RepeatMode;", "repeatMode", "Landroidx/compose/animation/core/RepeatMode;", "durationNanos", "J", "getDurationNanos$animation_core_release", "()J", "initialOffsetNanos", "", "isInfinite", "()Z", "<init>", "(Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;Landroidx/compose/animation/core/RepeatMode;)V", "Landroidx/compose/animation/core/StartOffset;", "initialStartOffset", "(Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;Landroidx/compose/animation/core/RepeatMode;JLkotlin/jvm/internal/w;)V", "animation-core_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class VectorizedInfiniteRepeatableSpec<V extends AnimationVector> implements VectorizedAnimationSpec<V> {
    public static final int $stable = 8;

    @l
    private final VectorizedDurationBasedAnimationSpec<V> animation;
    private final long durationNanos;
    private final long initialOffsetNanos;

    @l
    private final RepeatMode repeatMode;

    private VectorizedInfiniteRepeatableSpec(VectorizedDurationBasedAnimationSpec<V> vectorizedDurationBasedAnimationSpec, RepeatMode repeatMode, long j5) {
        this.animation = vectorizedDurationBasedAnimationSpec;
        this.repeatMode = repeatMode;
        this.durationNanos = (vectorizedDurationBasedAnimationSpec.getDelayMillis() + vectorizedDurationBasedAnimationSpec.getDurationMillis()) * AnimationKt.MillisToNanos;
        this.initialOffsetNanos = j5 * AnimationKt.MillisToNanos;
    }

    public /* synthetic */ VectorizedInfiniteRepeatableSpec(VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec, RepeatMode repeatMode, long j5, w wVar) {
        this(vectorizedDurationBasedAnimationSpec, repeatMode, j5);
    }

    private final long repetitionPlayTimeNanos(long j5) {
        long j6 = this.initialOffsetNanos;
        if (j5 + j6 <= 0) {
            return 0L;
        }
        long j7 = j5 + j6;
        long j8 = this.durationNanos;
        long j9 = j7 / j8;
        if (this.repeatMode != RepeatMode.Restart && j9 % 2 != 0) {
            return ((j9 + 1) * j8) - j7;
        }
        return j7 - (j9 * j8);
    }

    private final V repetitionStartVelocity(long j5, V v4, V v5, V v6) {
        long j6 = this.initialOffsetNanos;
        long j7 = j5 + j6;
        long j8 = this.durationNanos;
        if (j7 > j8) {
            return this.animation.getVelocityFromNanos(j8 - j6, v4, v6, v5);
        }
        return v5;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public long getDurationNanos(@l V v4, @l V v5, @l V v6) {
        return Long.MAX_VALUE;
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

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public boolean isInfinite() {
        return true;
    }

    public /* synthetic */ VectorizedInfiniteRepeatableSpec(VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec, RepeatMode repeatMode, long j5, int i5, w wVar) {
        this(vectorizedDurationBasedAnimationSpec, (i5 & 2) != 0 ? RepeatMode.Restart : repeatMode, (i5 & 4) != 0 ? StartOffset.m139constructorimpl$default(0, 0, 2, null) : j5, (w) null);
    }

    public /* synthetic */ VectorizedInfiniteRepeatableSpec(VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec, RepeatMode repeatMode, int i5, w wVar) {
        this(vectorizedDurationBasedAnimationSpec, (i5 & 2) != 0 ? RepeatMode.Restart : repeatMode);
    }

    @k(level = m.HIDDEN, message = "This method has been deprecated in favor of the constructor that accepts start offset.")
    public /* synthetic */ VectorizedInfiniteRepeatableSpec(VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec, RepeatMode repeatMode) {
        this(vectorizedDurationBasedAnimationSpec, repeatMode, StartOffset.m139constructorimpl$default(0, 0, 2, null), (w) null);
    }
}
