package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public final class ViewingConditions {
    public static final ViewingConditions DEFAULT = defaultWithBackgroundLstar(50.0d);
    private final double aw;

    /* renamed from: c, reason: collision with root package name */
    private final double f7331c;
    private final double fl;
    private final double flRoot;

    /* renamed from: n, reason: collision with root package name */
    private final double f7332n;
    private final double nbb;
    private final double nc;
    private final double ncb;
    private final double[] rgbD;

    /* renamed from: z, reason: collision with root package name */
    private final double f7333z;

    private ViewingConditions(double d5, double d6, double d7, double d8, double d9, double d10, double[] dArr, double d11, double d12, double d13) {
        this.f7332n = d5;
        this.aw = d6;
        this.nbb = d7;
        this.ncb = d8;
        this.f7331c = d9;
        this.nc = d10;
        this.rgbD = dArr;
        this.fl = d11;
        this.flRoot = d12;
        this.f7333z = d13;
    }

    public static ViewingConditions defaultWithBackgroundLstar(double d5) {
        return make(ColorUtils.whitePointD65(), (ColorUtils.yFromLstar(50.0d) * 63.66197723675813d) / 100.0d, d5, 2.0d, false);
    }

    public static ViewingConditions make(double[] dArr, double d5, double d6, double d7, boolean z4) {
        double lerp;
        double exp;
        double max = Math.max(0.1d, d6);
        double[][] dArr2 = Cam16.XYZ_TO_CAM16RGB;
        double d8 = dArr[0];
        double[] dArr3 = dArr2[0];
        double d9 = dArr3[0] * d8;
        double d10 = dArr[1];
        double d11 = d9 + (dArr3[1] * d10);
        double d12 = dArr[2];
        double d13 = d11 + (dArr3[2] * d12);
        double[] dArr4 = dArr2[1];
        double d14 = (dArr4[0] * d8) + (dArr4[1] * d10) + (dArr4[2] * d12);
        double[] dArr5 = dArr2[2];
        double d15 = (d8 * dArr5[0]) + (d10 * dArr5[1]) + (d12 * dArr5[2]);
        double d16 = (d7 / 10.0d) + 0.8d;
        if (d16 >= 0.9d) {
            lerp = MathUtils.lerp(0.59d, 0.69d, (d16 - 0.9d) * 10.0d);
        } else {
            lerp = MathUtils.lerp(0.525d, 0.59d, (d16 - 0.8d) * 10.0d);
        }
        double d17 = lerp;
        if (z4) {
            exp = 1.0d;
        } else {
            exp = (1.0d - (Math.exp(((-d5) - 42.0d) / 92.0d) * 0.2777777777777778d)) * d16;
        }
        double clampDouble = MathUtils.clampDouble(0.0d, 1.0d, exp);
        double[] dArr6 = {(((100.0d / d13) * clampDouble) + 1.0d) - clampDouble, (((100.0d / d14) * clampDouble) + 1.0d) - clampDouble, (((100.0d / d15) * clampDouble) + 1.0d) - clampDouble};
        double d18 = 5.0d * d5;
        double d19 = 1.0d / (d18 + 1.0d);
        double d20 = d19 * d19 * d19 * d19;
        double d21 = 1.0d - d20;
        double cbrt = (d20 * d5) + (0.1d * d21 * d21 * Math.cbrt(d18));
        double yFromLstar = ColorUtils.yFromLstar(max) / dArr[1];
        double sqrt = Math.sqrt(yFromLstar) + 1.48d;
        double pow = 0.725d / Math.pow(yFromLstar, 0.2d);
        double pow2 = Math.pow(((dArr6[2] * cbrt) * d15) / 100.0d, 0.42d);
        double[] dArr7 = {Math.pow(((dArr6[0] * cbrt) * d13) / 100.0d, 0.42d), Math.pow(((dArr6[1] * cbrt) * d14) / 100.0d, 0.42d), pow2};
        double d22 = dArr7[0];
        double d23 = (d22 * 400.0d) / (d22 + 27.13d);
        double d24 = dArr7[1];
        return new ViewingConditions(yFromLstar, ((d23 * 2.0d) + ((d24 * 400.0d) / (d24 + 27.13d)) + (((400.0d * pow2) / (pow2 + 27.13d)) * 0.05d)) * pow, pow, pow, d17, d16, dArr6, cbrt, Math.pow(cbrt, 0.25d), sqrt);
    }

    public double getAw() {
        return this.aw;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public double getC() {
        return this.f7331c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public double getFl() {
        return this.fl;
    }

    public double getFlRoot() {
        return this.flRoot;
    }

    public double getN() {
        return this.f7332n;
    }

    public double getNbb() {
        return this.nbb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public double getNc() {
        return this.nc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public double getNcb() {
        return this.ncb;
    }

    public double[] getRgbD() {
        return this.rgbD;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public double getZ() {
        return this.f7333z;
    }
}
