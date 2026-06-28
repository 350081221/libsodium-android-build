package androidx.compose.animation.core;

import androidx.annotation.FloatRange;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.i0;
import kotlin.jvm.internal.w;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H\u0016J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H\u0016J \u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H\u0016J \u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H\u0016R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Landroidx/compose/animation/core/FloatExponentialDecaySpec;", "Landroidx/compose/animation/core/FloatDecayAnimationSpec;", "frictionMultiplier", "", "absVelocityThreshold", "(FF)V", "getAbsVelocityThreshold", "()F", "friction", "getDurationNanos", "", "initialValue", "initialVelocity", "getTargetValue", "getValueFromNanos", "playTimeNanos", "getVelocityFromNanos", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FloatExponentialDecaySpec implements FloatDecayAnimationSpec {
    public static final int $stable = 0;
    private final float absVelocityThreshold;
    private final float friction;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FloatExponentialDecaySpec() {
        /*
            r3 = this;
            r0 = 3
            r1 = 0
            r2 = 0
            r3.<init>(r2, r2, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.FloatExponentialDecaySpec.<init>():void");
    }

    public FloatExponentialDecaySpec(@FloatRange(from = 0.0d, fromInclusive = false) float f5, @FloatRange(from = 0.0d, fromInclusive = false) float f6) {
        this.absVelocityThreshold = Math.max(1.0E-7f, Math.abs(f6));
        this.friction = Math.max(1.0E-4f, f5) * (-4.2f);
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getAbsVelocityThreshold() {
        return this.absVelocityThreshold;
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public long getDurationNanos(float f5, float f6) {
        return ((((float) Math.log(getAbsVelocityThreshold() / Math.abs(f6))) * 1000.0f) / this.friction) * AnimationKt.MillisToNanos;
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getTargetValue(float f5, float f6) {
        if (Math.abs(f6) <= getAbsVelocityThreshold()) {
            return f5;
        }
        double log = Math.log(Math.abs(getAbsVelocityThreshold() / f6));
        float f7 = this.friction;
        return (f5 - (f6 / f7)) + ((f6 / f7) * ((float) Math.exp((f7 * ((log / f7) * 1000)) / 1000.0f)));
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getValueFromNanos(long j5, float f5, float f6) {
        long j6 = j5 / AnimationKt.MillisToNanos;
        float f7 = this.friction;
        return (f5 - (f6 / f7)) + ((f6 / f7) * ((float) Math.exp((f7 * ((float) j6)) / 1000.0f)));
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getVelocityFromNanos(long j5, float f5, float f6) {
        return f6 * ((float) Math.exp((((float) (j5 / AnimationKt.MillisToNanos)) / 1000.0f) * this.friction));
    }

    public /* synthetic */ FloatExponentialDecaySpec(float f5, float f6, int i5, w wVar) {
        this((i5 & 1) != 0 ? 1.0f : f5, (i5 & 2) != 0 ? 0.1f : f6);
    }
}
