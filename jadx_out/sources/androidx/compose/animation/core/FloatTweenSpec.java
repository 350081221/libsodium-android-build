package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.i0;
import kotlin.jvm.internal.w;
import kotlin.ranges.u;
import p4.l;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002J \u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0016J(\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0016J(\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Landroidx/compose/animation/core/FloatTweenSpec;", "Landroidx/compose/animation/core/FloatAnimationSpec;", "duration", "", "delay", "easing", "Landroidx/compose/animation/core/Easing;", "(IILandroidx/compose/animation/core/Easing;)V", "getDelay", "()I", "getDuration", "clampPlayTime", "", "playTime", "getDurationNanos", "initialValue", "", "targetValue", "initialVelocity", "getValueFromNanos", "playTimeNanos", "getVelocityFromNanos", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FloatTweenSpec implements FloatAnimationSpec {
    public static final int $stable = 0;
    private final int delay;
    private final int duration;

    @l
    private final Easing easing;

    public FloatTweenSpec() {
        this(0, 0, null, 7, null);
    }

    public FloatTweenSpec(int i5, int i6, @l Easing easing) {
        this.duration = i5;
        this.delay = i6;
        this.easing = easing;
    }

    private final long clampPlayTime(long j5) {
        long K;
        K = u.K(j5 - this.delay, 0L, this.duration);
        return K;
    }

    public final int getDelay() {
        return this.delay;
    }

    public final int getDuration() {
        return this.duration;
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public long getDurationNanos(float f5, float f6, float f7) {
        return (this.delay + this.duration) * AnimationKt.MillisToNanos;
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public float getValueFromNanos(long j5, float f5, float f6, float f7) {
        float f8;
        float H;
        long clampPlayTime = clampPlayTime(j5 / AnimationKt.MillisToNanos);
        int i5 = this.duration;
        if (i5 == 0) {
            f8 = 1.0f;
        } else {
            f8 = ((float) clampPlayTime) / i5;
        }
        Easing easing = this.easing;
        H = u.H(f8, 0.0f, 1.0f);
        return VectorConvertersKt.lerp(f5, f6, easing.transform(H));
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public float getVelocityFromNanos(long j5, float f5, float f6, float f7) {
        long clampPlayTime = clampPlayTime(j5 / AnimationKt.MillisToNanos);
        if (clampPlayTime < 0) {
            return 0.0f;
        }
        if (clampPlayTime == 0) {
            return f7;
        }
        return (getValueFromNanos(clampPlayTime * AnimationKt.MillisToNanos, f5, f6, f7) - getValueFromNanos((clampPlayTime - 1) * AnimationKt.MillisToNanos, f5, f6, f7)) * 1000.0f;
    }

    public /* synthetic */ FloatTweenSpec(int i5, int i6, Easing easing, int i7, w wVar) {
        this((i7 & 1) != 0 ? 300 : i5, (i7 & 2) != 0 ? 0 : i6, (i7 & 4) != 0 ? EasingKt.getFastOutSlowInEasing() : easing);
    }
}
