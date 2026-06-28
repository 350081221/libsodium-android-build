package androidx.dynamicanimation.animation;

import androidx.annotation.FloatRange;
import androidx.annotation.RestrictTo;
import androidx.dynamicanimation.animation.DynamicAnimation;

/* loaded from: classes2.dex */
public final class SpringForce implements Force {
    public static final float DAMPING_RATIO_HIGH_BOUNCY = 0.2f;
    public static final float DAMPING_RATIO_LOW_BOUNCY = 0.75f;
    public static final float DAMPING_RATIO_MEDIUM_BOUNCY = 0.5f;
    public static final float DAMPING_RATIO_NO_BOUNCY = 1.0f;
    public static final float STIFFNESS_HIGH = 10000.0f;
    public static final float STIFFNESS_LOW = 200.0f;
    public static final float STIFFNESS_MEDIUM = 1500.0f;
    public static final float STIFFNESS_VERY_LOW = 50.0f;
    private static final double UNSET = Double.MAX_VALUE;
    private static final double VELOCITY_THRESHOLD_MULTIPLIER = 62.5d;
    private double mDampedFreq;
    double mDampingRatio;
    private double mFinalPosition;
    private double mGammaMinus;
    private double mGammaPlus;
    private boolean mInitialized;
    private final DynamicAnimation.MassState mMassState;
    double mNaturalFreq;
    private double mValueThreshold;
    private double mVelocityThreshold;

    public SpringForce() {
        this.mNaturalFreq = Math.sqrt(1500.0d);
        this.mDampingRatio = 0.5d;
        this.mInitialized = false;
        this.mFinalPosition = Double.MAX_VALUE;
        this.mMassState = new DynamicAnimation.MassState();
    }

    private void init() {
        if (this.mInitialized) {
            return;
        }
        if (this.mFinalPosition != Double.MAX_VALUE) {
            double d5 = this.mDampingRatio;
            if (d5 > 1.0d) {
                double d6 = this.mNaturalFreq;
                this.mGammaPlus = ((-d5) * d6) + (d6 * Math.sqrt((d5 * d5) - 1.0d));
                double d7 = this.mDampingRatio;
                double d8 = this.mNaturalFreq;
                this.mGammaMinus = ((-d7) * d8) - (d8 * Math.sqrt((d7 * d7) - 1.0d));
            } else if (d5 >= 0.0d && d5 < 1.0d) {
                this.mDampedFreq = this.mNaturalFreq * Math.sqrt(1.0d - (d5 * d5));
            }
            this.mInitialized = true;
            return;
        }
        throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
    }

    @Override // androidx.dynamicanimation.animation.Force
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public float getAcceleration(float f5, float f6) {
        float finalPosition = f5 - getFinalPosition();
        double d5 = this.mNaturalFreq;
        return (float) (((-(d5 * d5)) * finalPosition) - (((d5 * 2.0d) * this.mDampingRatio) * f6));
    }

    public float getDampingRatio() {
        return (float) this.mDampingRatio;
    }

    public float getFinalPosition() {
        return (float) this.mFinalPosition;
    }

    public float getStiffness() {
        double d5 = this.mNaturalFreq;
        return (float) (d5 * d5);
    }

    @Override // androidx.dynamicanimation.animation.Force
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean isAtEquilibrium(float f5, float f6) {
        if (Math.abs(f6) < this.mVelocityThreshold && Math.abs(f5 - getFinalPosition()) < this.mValueThreshold) {
            return true;
        }
        return false;
    }

    public SpringForce setDampingRatio(@FloatRange(from = 0.0d) float f5) {
        if (f5 >= 0.0f) {
            this.mDampingRatio = f5;
            this.mInitialized = false;
            return this;
        }
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }

    public SpringForce setFinalPosition(float f5) {
        this.mFinalPosition = f5;
        return this;
    }

    public SpringForce setStiffness(@FloatRange(from = 0.0d, fromInclusive = false) float f5) {
        if (f5 > 0.0f) {
            this.mNaturalFreq = Math.sqrt(f5);
            this.mInitialized = false;
            return this;
        }
        throw new IllegalArgumentException("Spring stiffness constant must be positive.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setValueThreshold(double d5) {
        double abs = Math.abs(d5);
        this.mValueThreshold = abs;
        this.mVelocityThreshold = abs * VELOCITY_THRESHOLD_MULTIPLIER;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DynamicAnimation.MassState updateValues(double d5, double d6, long j5) {
        double cos;
        double d7;
        init();
        double d8 = j5 / 1000.0d;
        double d9 = d5 - this.mFinalPosition;
        double d10 = this.mDampingRatio;
        if (d10 > 1.0d) {
            double d11 = this.mGammaMinus;
            double d12 = this.mGammaPlus;
            double d13 = d9 - (((d11 * d9) - d6) / (d11 - d12));
            double d14 = ((d9 * d11) - d6) / (d11 - d12);
            d7 = (Math.pow(2.718281828459045d, d11 * d8) * d13) + (Math.pow(2.718281828459045d, this.mGammaPlus * d8) * d14);
            double d15 = this.mGammaMinus;
            double pow = d13 * d15 * Math.pow(2.718281828459045d, d15 * d8);
            double d16 = this.mGammaPlus;
            cos = pow + (d14 * d16 * Math.pow(2.718281828459045d, d16 * d8));
        } else if (d10 == 1.0d) {
            double d17 = this.mNaturalFreq;
            double d18 = d6 + (d17 * d9);
            double d19 = d9 + (d18 * d8);
            d7 = Math.pow(2.718281828459045d, (-d17) * d8) * d19;
            double pow2 = d19 * Math.pow(2.718281828459045d, (-this.mNaturalFreq) * d8);
            double d20 = this.mNaturalFreq;
            cos = (d18 * Math.pow(2.718281828459045d, (-d20) * d8)) + (pow2 * (-d20));
        } else {
            double d21 = 1.0d / this.mDampedFreq;
            double d22 = this.mNaturalFreq;
            double d23 = d21 * ((d10 * d22 * d9) + d6);
            double pow3 = Math.pow(2.718281828459045d, (-d10) * d22 * d8) * ((Math.cos(this.mDampedFreq * d8) * d9) + (Math.sin(this.mDampedFreq * d8) * d23));
            double d24 = this.mNaturalFreq;
            double d25 = this.mDampingRatio;
            double d26 = (-d24) * pow3 * d25;
            double pow4 = Math.pow(2.718281828459045d, (-d25) * d24 * d8);
            double d27 = this.mDampedFreq;
            double sin = (-d27) * d9 * Math.sin(d27 * d8);
            double d28 = this.mDampedFreq;
            cos = d26 + (pow4 * (sin + (d23 * d28 * Math.cos(d28 * d8))));
            d7 = pow3;
        }
        DynamicAnimation.MassState massState = this.mMassState;
        massState.mValue = (float) (d7 + this.mFinalPosition);
        massState.mVelocity = (float) cos;
        return massState;
    }

    public SpringForce(float f5) {
        this.mNaturalFreq = Math.sqrt(1500.0d);
        this.mDampingRatio = 0.5d;
        this.mInitialized = false;
        this.mFinalPosition = Double.MAX_VALUE;
        this.mMassState = new DynamicAnimation.MassState();
        this.mFinalPosition = f5;
    }
}
