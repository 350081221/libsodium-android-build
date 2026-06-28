package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.i0;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b$\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004J-\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u000e\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0016R\u0016\u0010\u001c\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u0016R*\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u000f\u001a\u0004\b\u001f\u0010\u0011\"\u0004\b \u0010\u0013R$\u0010#\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\u0011\"\u0004\b\"\u0010\u0013\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006%"}, d2 = {"Landroidx/compose/animation/core/SpringSimulation;", "", "Lkotlin/r2;", "init", "", "lastDisplacement", "lastVelocity", "getAcceleration", "", "timeElapsed", "Landroidx/compose/animation/core/Motion;", "updateValues-IJZedt4$animation_core_release", "(FFJ)J", "updateValues", "finalPosition", "F", "getFinalPosition", "()F", "setFinalPosition", "(F)V", "", "naturalFreq", "D", "", "initialized", "Z", "gammaPlus", "gammaMinus", "dampedFreq", t0.b.f22420d, "dampingRatio", "getDampingRatio", "setDampingRatio", "getStiffness", "setStiffness", "stiffness", "<init>", "animation-core_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SpringSimulation {
    public static final int $stable = 8;
    private double dampedFreq;
    private float finalPosition;
    private double gammaMinus;
    private double gammaPlus;
    private boolean initialized;
    private double naturalFreq = Math.sqrt(50.0d);
    private float dampingRatio = 1.0f;

    public SpringSimulation(float f5) {
        this.finalPosition = f5;
    }

    private final void init() {
        boolean z4;
        if (this.initialized) {
            return;
        }
        if (this.finalPosition == SpringSimulationKt.getUNSET()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            float f5 = this.dampingRatio;
            double d5 = f5 * f5;
            if (f5 > 1.0f) {
                double d6 = this.naturalFreq;
                double d7 = d5 - 1;
                this.gammaPlus = ((-f5) * d6) + (d6 * Math.sqrt(d7));
                double d8 = -this.dampingRatio;
                double d9 = this.naturalFreq;
                this.gammaMinus = (d8 * d9) - (d9 * Math.sqrt(d7));
            } else if (f5 >= 0.0f && f5 < 1.0f) {
                this.dampedFreq = this.naturalFreq * Math.sqrt(1 - d5);
            }
            this.initialized = true;
            return;
        }
        throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
    }

    public final float getAcceleration(float f5, float f6) {
        float f7 = f5 - this.finalPosition;
        double d5 = this.naturalFreq;
        return (float) (((-(d5 * d5)) * f7) - (((d5 * 2.0d) * this.dampingRatio) * f6));
    }

    public final float getDampingRatio() {
        return this.dampingRatio;
    }

    public final float getFinalPosition() {
        return this.finalPosition;
    }

    public final float getStiffness() {
        double d5 = this.naturalFreq;
        return (float) (d5 * d5);
    }

    public final void setDampingRatio(float f5) {
        if (f5 >= 0.0f) {
            this.dampingRatio = f5;
            this.initialized = false;
            return;
        }
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }

    public final void setFinalPosition(float f5) {
        this.finalPosition = f5;
    }

    public final void setStiffness(float f5) {
        if (getStiffness() > 0.0f) {
            this.naturalFreq = Math.sqrt(f5);
            this.initialized = false;
            return;
        }
        throw new IllegalArgumentException("Spring stiffness constant must be positive.");
    }

    /* renamed from: updateValues-IJZedt4$animation_core_release, reason: not valid java name */
    public final long m135updateValuesIJZedt4$animation_core_release(float f5, float f6, long j5) {
        boolean z4;
        double cos;
        double d5;
        init();
        float f7 = f5 - this.finalPosition;
        double d6 = j5 / 1000.0d;
        float f8 = this.dampingRatio;
        if (f8 > 1.0f) {
            double d7 = f7;
            double d8 = this.gammaMinus;
            double d9 = f6;
            double d10 = this.gammaPlus;
            double d11 = d7 - (((d8 * d7) - d9) / (d8 - d10));
            double d12 = ((d7 * d8) - d9) / (d8 - d10);
            d5 = (Math.exp(d8 * d6) * d11) + (Math.exp(this.gammaPlus * d6) * d12);
            double d13 = this.gammaMinus;
            double exp = d11 * d13 * Math.exp(d13 * d6);
            double d14 = this.gammaPlus;
            cos = exp + (d12 * d14 * Math.exp(d14 * d6));
        } else {
            if (f8 == 1.0f) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                double d15 = this.naturalFreq;
                double d16 = f7;
                double d17 = f6 + (d15 * d16);
                double d18 = d16 + (d17 * d6);
                double exp2 = Math.exp((-d15) * d6) * d18;
                double exp3 = d18 * Math.exp((-this.naturalFreq) * d6);
                double d19 = this.naturalFreq;
                cos = (exp3 * (-d19)) + (d17 * Math.exp((-d19) * d6));
                d5 = exp2;
            } else {
                double d20 = 1 / this.dampedFreq;
                double d21 = this.naturalFreq;
                double d22 = f7;
                double d23 = d20 * ((f8 * d21 * d22) + f6);
                double exp4 = Math.exp((-f8) * d21 * d6) * ((Math.cos(this.dampedFreq * d6) * d22) + (Math.sin(this.dampedFreq * d6) * d23));
                double d24 = this.naturalFreq;
                double d25 = (-d24) * exp4 * this.dampingRatio;
                double exp5 = Math.exp((-r5) * d24 * d6);
                double d26 = this.dampedFreq;
                double sin = (-d26) * d22 * Math.sin(d26 * d6);
                double d27 = this.dampedFreq;
                cos = d25 + (exp5 * (sin + (d23 * d27 * Math.cos(d27 * d6))));
                d5 = exp4;
            }
        }
        return SpringSimulationKt.Motion((float) (d5 + this.finalPosition), (float) cos);
    }
}
