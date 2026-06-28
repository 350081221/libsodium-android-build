package androidx.constraintlayout.core.motion.utils;

/* loaded from: classes2.dex */
public class SpringStopEngine implements StopEngine {
    private static final double UNSET = Double.MAX_VALUE;
    private float mLastTime;
    private double mLastVelocity;
    private float mMass;
    private float mPos;
    private double mStiffness;
    private float mStopThreshold;
    private double mTargetPos;
    private float mV;
    double mDamping = 0.5d;
    private boolean mInitialized = false;
    private int mBoundaryMode = 0;

    private void compute(double d5) {
        double d6 = this.mStiffness;
        double d7 = this.mDamping;
        int sqrt = (int) ((9.0d / ((Math.sqrt(d6 / this.mMass) * d5) * 4.0d)) + 1.0d);
        double d8 = d5 / sqrt;
        int i5 = 0;
        while (i5 < sqrt) {
            float f5 = this.mPos;
            double d9 = this.mTargetPos;
            float f6 = this.mV;
            double d10 = d6;
            double d11 = ((-d6) * (f5 - d9)) - (f6 * d7);
            float f7 = this.mMass;
            double d12 = d7;
            double d13 = f6 + (((d11 / f7) * d8) / 2.0d);
            double d14 = ((((-((f5 + ((d8 * d13) / 2.0d)) - d9)) * d10) - (d13 * d12)) / f7) * d8;
            float f8 = (float) (f6 + d14);
            this.mV = f8;
            float f9 = (float) (f5 + ((f6 + (d14 / 2.0d)) * d8));
            this.mPos = f9;
            int i6 = this.mBoundaryMode;
            if (i6 > 0) {
                if (f9 < 0.0f && (i6 & 1) == 1) {
                    this.mPos = -f9;
                    this.mV = -f8;
                }
                float f10 = this.mPos;
                if (f10 > 1.0f && (i6 & 2) == 2) {
                    this.mPos = 2.0f - f10;
                    this.mV = -this.mV;
                }
            }
            i5++;
            d6 = d10;
            d7 = d12;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public String debug(String str, float f5) {
        return null;
    }

    public float getAcceleration() {
        return ((float) (((-this.mStiffness) * (this.mPos - this.mTargetPos)) - (this.mDamping * this.mV))) / this.mMass;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getInterpolation(float f5) {
        compute(f5 - this.mLastTime);
        this.mLastTime = f5;
        return this.mPos;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getVelocity() {
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getVelocity(float f5) {
        return this.mV;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public boolean isStopped() {
        double d5 = this.mPos - this.mTargetPos;
        double d6 = this.mStiffness;
        double d7 = this.mV;
        if (Math.sqrt((((d7 * d7) * this.mMass) + ((d6 * d5) * d5)) / d6) <= this.mStopThreshold) {
            return true;
        }
        return false;
    }

    void log(String str) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String str2 = ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName() + "() ";
        System.out.println(str2 + str);
    }

    public void springConfig(float f5, float f6, float f7, float f8, float f9, float f10, float f11, int i5) {
        this.mTargetPos = f6;
        this.mDamping = f10;
        this.mInitialized = false;
        this.mPos = f5;
        this.mLastVelocity = f7;
        this.mStiffness = f9;
        this.mMass = f8;
        this.mStopThreshold = f11;
        this.mBoundaryMode = i5;
        this.mLastTime = 0.0f;
    }
}
