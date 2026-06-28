package androidx.transition;

import java.util.Arrays;

/* loaded from: classes2.dex */
class VelocityTracker1D {
    private static final int ASSUME_POINTER_MOVE_STOPPED_MILLIS = 40;
    private static final int HISTORY_SIZE = 20;
    private static final int HORIZON_MILLIS = 100;
    private float[] mDataSamples = new float[20];
    private int mIndex = 0;
    private long[] mTimeSamples;

    /* JADX INFO: Access modifiers changed from: package-private */
    public VelocityTracker1D() {
        long[] jArr = new long[20];
        this.mTimeSamples = jArr;
        Arrays.fill(jArr, Long.MIN_VALUE);
    }

    private float kineticEnergyToVelocity(float f5) {
        return (float) (Math.signum(f5) * Math.sqrt(Math.abs(f5) * 2.0f));
    }

    public void addDataPoint(long j5, float f5) {
        int i5 = (this.mIndex + 1) % 20;
        this.mIndex = i5;
        this.mTimeSamples[i5] = j5;
        this.mDataSamples[i5] = f5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float calculateVelocity() {
        float kineticEnergyToVelocity;
        int i5 = this.mIndex;
        if (i5 == 0 && this.mTimeSamples[i5] == Long.MIN_VALUE) {
            return 0.0f;
        }
        long j5 = this.mTimeSamples[i5];
        int i6 = 0;
        long j6 = j5;
        while (true) {
            long j7 = this.mTimeSamples[i5];
            if (j7 == Long.MIN_VALUE) {
                break;
            }
            float f5 = (float) (j5 - j7);
            float abs = (float) Math.abs(j7 - j6);
            if (f5 > 100.0f || abs > 40.0f) {
                break;
            }
            if (i5 == 0) {
                i5 = 20;
            }
            i5--;
            i6++;
            if (i6 >= 20) {
                break;
            }
            j6 = j7;
        }
        if (i6 < 2) {
            return 0.0f;
        }
        if (i6 == 2) {
            int i7 = this.mIndex;
            int i8 = i7 == 0 ? 19 : i7 - 1;
            long[] jArr = this.mTimeSamples;
            float f6 = (float) (jArr[i7] - jArr[i8]);
            if (f6 == 0.0f) {
                return 0.0f;
            }
            float[] fArr = this.mDataSamples;
            kineticEnergyToVelocity = (fArr[i7] - fArr[i8]) / f6;
        } else {
            int i9 = this.mIndex;
            int i10 = (((i9 - i6) + 20) + 1) % 20;
            int i11 = ((i9 + 1) + 20) % 20;
            long j8 = this.mTimeSamples[i10];
            float f7 = this.mDataSamples[i10];
            int i12 = i10 + 1;
            float f8 = 0.0f;
            for (int i13 = i12 % 20; i13 != i11; i13 = (i13 + 1) % 20) {
                long j9 = this.mTimeSamples[i13];
                float f9 = (float) (j9 - j8);
                if (f9 != 0.0f) {
                    float f10 = this.mDataSamples[i13];
                    float f11 = (f10 - f7) / f9;
                    f8 += (f11 - kineticEnergyToVelocity(f8)) * Math.abs(f11);
                    if (i13 == i12) {
                        f8 *= 0.5f;
                    }
                    f7 = f10;
                    j8 = j9;
                }
            }
            kineticEnergyToVelocity = kineticEnergyToVelocity(f8);
        }
        return kineticEnergyToVelocity * 1000.0f;
    }

    public void resetTracking() {
        this.mIndex = 0;
        Arrays.fill(this.mTimeSamples, Long.MIN_VALUE);
        Arrays.fill(this.mDataSamples, 0.0f);
    }
}
