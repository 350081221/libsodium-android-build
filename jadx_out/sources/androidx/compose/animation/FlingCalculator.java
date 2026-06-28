package androidx.compose.animation;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Density;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import kotlin.i0;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0013B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\u000e\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u0003J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u0003J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u0003H\u0002R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Landroidx/compose/animation/FlingCalculator;", "", "friction", "", "density", "Landroidx/compose/ui/unit/Density;", "(FLandroidx/compose/ui/unit/Density;)V", "getDensity", "()Landroidx/compose/ui/unit/Density;", "magicPhysicalCoefficient", "computeDeceleration", "flingDistance", "velocity", "flingDuration", "", "flingInfo", "Landroidx/compose/animation/FlingCalculator$FlingInfo;", "getSplineDeceleration", "", "FlingInfo", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FlingCalculator {
    public static final int $stable = 0;

    @l
    private final Density density;
    private final float friction;
    private final float magicPhysicalCoefficient;

    @StabilityInferred(parameters = 1)
    @i0(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u000e\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0006J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u000e\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0006R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u001b"}, d2 = {"Landroidx/compose/animation/FlingCalculator$FlingInfo;", "", "initialVelocity", "", "distance", "duration", "", "(FFJ)V", "getDistance", "()F", "getDuration", "()J", "getInitialVelocity", "component1", "component2", "component3", "copy", "equals", "", "other", TTDownloadField.TT_HASHCODE, "", "position", CrashHianalyticsData.TIME, "toString", "", "velocity", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class FlingInfo {
        public static final int $stable = 0;
        private final float distance;
        private final long duration;
        private final float initialVelocity;

        public FlingInfo(float f5, float f6, long j5) {
            this.initialVelocity = f5;
            this.distance = f6;
            this.duration = j5;
        }

        public static /* synthetic */ FlingInfo copy$default(FlingInfo flingInfo, float f5, float f6, long j5, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                f5 = flingInfo.initialVelocity;
            }
            if ((i5 & 2) != 0) {
                f6 = flingInfo.distance;
            }
            if ((i5 & 4) != 0) {
                j5 = flingInfo.duration;
            }
            return flingInfo.copy(f5, f6, j5);
        }

        public final float component1() {
            return this.initialVelocity;
        }

        public final float component2() {
            return this.distance;
        }

        public final long component3() {
            return this.duration;
        }

        @l
        public final FlingInfo copy(float f5, float f6, long j5) {
            return new FlingInfo(f5, f6, j5);
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FlingInfo)) {
                return false;
            }
            FlingInfo flingInfo = (FlingInfo) obj;
            return Float.compare(this.initialVelocity, flingInfo.initialVelocity) == 0 && Float.compare(this.distance, flingInfo.distance) == 0 && this.duration == flingInfo.duration;
        }

        public final float getDistance() {
            return this.distance;
        }

        public final long getDuration() {
            return this.duration;
        }

        public final float getInitialVelocity() {
            return this.initialVelocity;
        }

        public int hashCode() {
            return (((Float.hashCode(this.initialVelocity) * 31) + Float.hashCode(this.distance)) * 31) + Long.hashCode(this.duration);
        }

        public final float position(long j5) {
            float f5;
            long j6 = this.duration;
            if (j6 > 0) {
                f5 = ((float) j5) / ((float) j6);
            } else {
                f5 = 1.0f;
            }
            return this.distance * Math.signum(this.initialVelocity) * AndroidFlingSpline.INSTANCE.flingPosition(f5).getDistanceCoefficient();
        }

        @l
        public String toString() {
            return "FlingInfo(initialVelocity=" + this.initialVelocity + ", distance=" + this.distance + ", duration=" + this.duration + ')';
        }

        public final float velocity(long j5) {
            float f5;
            long j6 = this.duration;
            if (j6 > 0) {
                f5 = ((float) j5) / ((float) j6);
            } else {
                f5 = 1.0f;
            }
            return (((AndroidFlingSpline.INSTANCE.flingPosition(f5).getVelocityCoefficient() * Math.signum(this.initialVelocity)) * this.distance) / ((float) this.duration)) * 1000.0f;
        }
    }

    public FlingCalculator(float f5, @l Density density) {
        this.friction = f5;
        this.density = density;
        this.magicPhysicalCoefficient = computeDeceleration(density);
    }

    private final float computeDeceleration(Density density) {
        float computeDeceleration;
        computeDeceleration = FlingCalculatorKt.computeDeceleration(0.84f, density.getDensity());
        return computeDeceleration;
    }

    private final double getSplineDeceleration(float f5) {
        return AndroidFlingSpline.INSTANCE.deceleration(f5, this.friction * this.magicPhysicalCoefficient);
    }

    public final float flingDistance(float f5) {
        float f6;
        float f7;
        double splineDeceleration = getSplineDeceleration(f5);
        f6 = FlingCalculatorKt.DecelerationRate;
        double d5 = f6 - 1.0d;
        double d6 = this.friction * this.magicPhysicalCoefficient;
        f7 = FlingCalculatorKt.DecelerationRate;
        return (float) (d6 * Math.exp((f7 / d5) * splineDeceleration));
    }

    public final long flingDuration(float f5) {
        float f6;
        double splineDeceleration = getSplineDeceleration(f5);
        f6 = FlingCalculatorKt.DecelerationRate;
        return (long) (Math.exp(splineDeceleration / (f6 - 1.0d)) * 1000.0d);
    }

    @l
    public final FlingInfo flingInfo(float f5) {
        float f6;
        float f7;
        double splineDeceleration = getSplineDeceleration(f5);
        f6 = FlingCalculatorKt.DecelerationRate;
        double d5 = f6 - 1.0d;
        double d6 = this.friction * this.magicPhysicalCoefficient;
        f7 = FlingCalculatorKt.DecelerationRate;
        return new FlingInfo(f5, (float) (d6 * Math.exp((f7 / d5) * splineDeceleration)), (long) (Math.exp(splineDeceleration / d5) * 1000.0d));
    }

    @l
    public final Density getDensity() {
        return this.density;
    }
}
