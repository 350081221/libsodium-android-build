package androidx.core.content.res;

import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.Size;
import androidx.core.graphics.ColorUtils;
import kotlin.jvm.internal.x;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class CamColor {
    private static final float CHROMA_SEARCH_ENDPOINT = 0.4f;
    private static final float DE_MAX = 1.0f;
    private static final float DL_MAX = 0.2f;
    private static final float LIGHTNESS_SEARCH_ENDPOINT = 0.01f;
    private final float mAstar;
    private final float mBstar;
    private final float mChroma;
    private final float mHue;
    private final float mJ;
    private final float mJstar;
    private final float mM;
    private final float mQ;
    private final float mS;

    CamColor(float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13) {
        this.mHue = f5;
        this.mChroma = f6;
        this.mJ = f7;
        this.mQ = f8;
        this.mM = f9;
        this.mS = f10;
        this.mJstar = f11;
        this.mAstar = f12;
        this.mBstar = f13;
    }

    @Nullable
    private static CamColor findCamByJ(@FloatRange(from = 0.0d, to = 360.0d) float f5, @FloatRange(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float f6, @FloatRange(from = 0.0d, to = 100.0d) float f7) {
        float f8 = 100.0f;
        float f9 = 1000.0f;
        float f10 = 0.0f;
        CamColor camColor = null;
        float f11 = 1000.0f;
        while (Math.abs(f10 - f8) > 0.01f) {
            float f12 = ((f8 - f10) / 2.0f) + f10;
            int viewedInSrgb = fromJch(f12, f6, f5).viewedInSrgb();
            float lStarFromInt = CamUtils.lStarFromInt(viewedInSrgb);
            float abs = Math.abs(f7 - lStarFromInt);
            if (abs < 0.2f) {
                CamColor fromColor = fromColor(viewedInSrgb);
                float distance = fromColor.distance(fromJch(fromColor.getJ(), fromColor.getChroma(), f5));
                if (distance <= 1.0f) {
                    camColor = fromColor;
                    f9 = abs;
                    f11 = distance;
                }
            }
            if (f9 == 0.0f && f11 == 0.0f) {
                break;
            }
            if (lStarFromInt < f7) {
                f10 = f12;
            } else {
                f8 = f12;
            }
        }
        return camColor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public static CamColor fromColor(@ColorInt int i5) {
        float[] fArr = new float[7];
        float[] fArr2 = new float[3];
        fromColorInViewingConditions(i5, ViewingConditions.DEFAULT, fArr, fArr2);
        return new CamColor(fArr2[0], fArr2[1], fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5], fArr[6]);
    }

    static void fromColorInViewingConditions(@ColorInt int i5, @NonNull ViewingConditions viewingConditions, @Nullable @Size(7) float[] fArr, @NonNull @Size(3) float[] fArr2) {
        float f5;
        CamUtils.xyzFromInt(i5, fArr2);
        float[][] fArr3 = CamUtils.XYZ_TO_CAM16RGB;
        float f6 = fArr2[0];
        float[] fArr4 = fArr3[0];
        float f7 = fArr4[0] * f6;
        float f8 = fArr2[1];
        float f9 = f7 + (fArr4[1] * f8);
        float f10 = fArr2[2];
        float f11 = f9 + (fArr4[2] * f10);
        float[] fArr5 = fArr3[1];
        float f12 = (fArr5[0] * f6) + (fArr5[1] * f8) + (fArr5[2] * f10);
        float[] fArr6 = fArr3[2];
        float f13 = (f6 * fArr6[0]) + (f8 * fArr6[1]) + (f10 * fArr6[2]);
        float f14 = viewingConditions.getRgbD()[0] * f11;
        float f15 = viewingConditions.getRgbD()[1] * f12;
        float f16 = viewingConditions.getRgbD()[2] * f13;
        float pow = (float) Math.pow((viewingConditions.getFl() * Math.abs(f14)) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow((viewingConditions.getFl() * Math.abs(f15)) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((viewingConditions.getFl() * Math.abs(f16)) / 100.0d, 0.42d);
        float signum = ((Math.signum(f14) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f15) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f16) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d5 = signum3;
        float f17 = ((float) (((signum * 11.0d) + (signum2 * (-12.0d))) + d5)) / 11.0f;
        float f18 = ((float) ((signum + signum2) - (d5 * 2.0d))) / 9.0f;
        float f19 = signum2 * 20.0f;
        float f20 = (((signum * 20.0f) + f19) + (21.0f * signum3)) / 20.0f;
        float f21 = (((signum * 40.0f) + f19) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f18, f17)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f22 = (3.1415927f * atan2) / 180.0f;
        float pow4 = ((float) Math.pow((f21 * viewingConditions.getNbb()) / viewingConditions.getAw(), viewingConditions.getC() * viewingConditions.getZ())) * 100.0f;
        float c5 = (4.0f / viewingConditions.getC()) * ((float) Math.sqrt(pow4 / 100.0f)) * (viewingConditions.getAw() + 4.0f) * viewingConditions.getFlRoot();
        if (atan2 < 20.14d) {
            f5 = 360.0f + atan2;
        } else {
            f5 = atan2;
        }
        float sqrt = ((float) Math.sqrt(pow4 / 100.0d)) * ((float) Math.pow(1.64d - Math.pow(0.29d, viewingConditions.getN()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((f5 * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * viewingConditions.getNc()) * viewingConditions.getNcb()) * ((float) Math.sqrt((f17 * f17) + (f18 * f18)))) / (f20 + 0.305f), 0.9d));
        float flRoot = viewingConditions.getFlRoot() * sqrt;
        float sqrt2 = ((float) Math.sqrt((r7 * viewingConditions.getC()) / (viewingConditions.getAw() + 4.0f))) * 50.0f;
        float f23 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((0.0228f * flRoot) + 1.0f)) * 43.85965f;
        double d6 = f22;
        float cos = ((float) Math.cos(d6)) * log;
        float sin = log * ((float) Math.sin(d6));
        fArr2[0] = atan2;
        fArr2[1] = sqrt;
        if (fArr != null) {
            fArr[0] = pow4;
            fArr[1] = c5;
            fArr[2] = flRoot;
            fArr[3] = sqrt2;
            fArr[4] = f23;
            fArr[5] = cos;
            fArr[6] = sin;
        }
    }

    @NonNull
    private static CamColor fromJch(@FloatRange(from = 0.0d, to = 100.0d) float f5, @FloatRange(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float f6, @FloatRange(from = 0.0d, to = 360.0d) float f7) {
        return fromJchInFrame(f5, f6, f7, ViewingConditions.DEFAULT);
    }

    @NonNull
    private static CamColor fromJchInFrame(@FloatRange(from = 0.0d, to = 100.0d) float f5, @FloatRange(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float f6, @FloatRange(from = 0.0d, to = 360.0d) float f7, ViewingConditions viewingConditions) {
        float c5 = (4.0f / viewingConditions.getC()) * ((float) Math.sqrt(f5 / 100.0d)) * (viewingConditions.getAw() + 4.0f) * viewingConditions.getFlRoot();
        float flRoot = f6 * viewingConditions.getFlRoot();
        float sqrt = ((float) Math.sqrt(((f6 / ((float) Math.sqrt(r4))) * viewingConditions.getC()) / (viewingConditions.getAw() + 4.0f))) * 50.0f;
        float f8 = (1.7f * f5) / ((0.007f * f5) + 1.0f);
        float log = ((float) Math.log((flRoot * 0.0228d) + 1.0d)) * 43.85965f;
        double d5 = (3.1415927f * f7) / 180.0f;
        return new CamColor(f7, f6, f5, c5, flRoot, sqrt, f8, log * ((float) Math.cos(d5)), log * ((float) Math.sin(d5)));
    }

    public static void getM3HCTfromColor(@ColorInt int i5, @NonNull @Size(3) float[] fArr) {
        fromColorInViewingConditions(i5, ViewingConditions.DEFAULT, null, fArr);
        fArr[2] = CamUtils.lStarFromInt(i5);
    }

    public static int toColor(@FloatRange(from = 0.0d, to = 360.0d) float f5, @FloatRange(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float f6, @FloatRange(from = 0.0d, to = 100.0d) float f7) {
        return toColor(f5, f6, f7, ViewingConditions.DEFAULT);
    }

    float distance(@NonNull CamColor camColor) {
        float jStar = getJStar() - camColor.getJStar();
        float aStar = getAStar() - camColor.getAStar();
        float bStar = getBStar() - camColor.getBStar();
        return (float) (Math.pow(Math.sqrt((jStar * jStar) + (aStar * aStar) + (bStar * bStar)), 0.63d) * 1.41d);
    }

    @FloatRange(from = x.f19487e, fromInclusive = false, to = x.f19486d, toInclusive = false)
    float getAStar() {
        return this.mAstar;
    }

    @FloatRange(from = x.f19487e, fromInclusive = false, to = x.f19486d, toInclusive = false)
    float getBStar() {
        return this.mBstar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @FloatRange(from = 0.0d, to = x.f19486d, toInclusive = false)
    public float getChroma() {
        return this.mChroma;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @FloatRange(from = 0.0d, to = 360.0d, toInclusive = false)
    public float getHue() {
        return this.mHue;
    }

    @FloatRange(from = 0.0d, to = 100.0d)
    float getJ() {
        return this.mJ;
    }

    @FloatRange(from = 0.0d, to = 100.0d)
    float getJStar() {
        return this.mJstar;
    }

    @FloatRange(from = 0.0d, to = x.f19486d, toInclusive = false)
    float getM() {
        return this.mM;
    }

    @FloatRange(from = 0.0d, to = x.f19486d, toInclusive = false)
    float getQ() {
        return this.mQ;
    }

    @FloatRange(from = 0.0d, to = x.f19486d, toInclusive = false)
    float getS() {
        return this.mS;
    }

    @ColorInt
    int viewed(@NonNull ViewingConditions viewingConditions) {
        float f5;
        if (getChroma() != 0.0d && getJ() != 0.0d) {
            f5 = getChroma() / ((float) Math.sqrt(getJ() / 100.0d));
        } else {
            f5 = 0.0f;
        }
        float pow = (float) Math.pow(f5 / Math.pow(1.64d - Math.pow(0.29d, viewingConditions.getN()), 0.73d), 1.1111111111111112d);
        double hue = (getHue() * 3.1415927f) / 180.0f;
        float cos = ((float) (Math.cos(2.0d + hue) + 3.8d)) * 0.25f;
        float aw = viewingConditions.getAw() * ((float) Math.pow(getJ() / 100.0d, (1.0d / viewingConditions.getC()) / viewingConditions.getZ()));
        float nc = cos * 3846.1538f * viewingConditions.getNc() * viewingConditions.getNcb();
        float nbb = aw / viewingConditions.getNbb();
        float sin = (float) Math.sin(hue);
        float cos2 = (float) Math.cos(hue);
        float f6 = (((0.305f + nbb) * 23.0f) * pow) / (((nc * 23.0f) + ((11.0f * pow) * cos2)) + ((pow * 108.0f) * sin));
        float f7 = cos2 * f6;
        float f8 = f6 * sin;
        float f9 = nbb * 460.0f;
        float f10 = (((451.0f * f7) + f9) + (288.0f * f8)) / 1403.0f;
        float f11 = ((f9 - (891.0f * f7)) - (261.0f * f8)) / 1403.0f;
        float signum = Math.signum(f10) * (100.0f / viewingConditions.getFl()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f10) * 27.13d) / (400.0d - Math.abs(f10))), 2.380952380952381d));
        float signum2 = Math.signum(f11) * (100.0f / viewingConditions.getFl()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f11) * 27.13d) / (400.0d - Math.abs(f11))), 2.380952380952381d));
        float signum3 = Math.signum(((f9 - (f7 * 220.0f)) - (f8 * 6300.0f)) / 1403.0f) * (100.0f / viewingConditions.getFl()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(r8) * 27.13d) / (400.0d - Math.abs(r8))), 2.380952380952381d));
        float f12 = signum / viewingConditions.getRgbD()[0];
        float f13 = signum2 / viewingConditions.getRgbD()[1];
        float f14 = signum3 / viewingConditions.getRgbD()[2];
        float[][] fArr = CamUtils.CAM16RGB_TO_XYZ;
        float[] fArr2 = fArr[0];
        float f15 = (fArr2[0] * f12) + (fArr2[1] * f13) + (fArr2[2] * f14);
        float[] fArr3 = fArr[1];
        float f16 = (fArr3[0] * f12) + (fArr3[1] * f13) + (fArr3[2] * f14);
        float[] fArr4 = fArr[2];
        return ColorUtils.XYZToColor(f15, f16, (f12 * fArr4[0]) + (f13 * fArr4[1]) + (f14 * fArr4[2]));
    }

    @ColorInt
    int viewedInSrgb() {
        return viewed(ViewingConditions.DEFAULT);
    }

    @ColorInt
    static int toColor(@FloatRange(from = 0.0d, to = 360.0d) float f5, @FloatRange(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float f6, @FloatRange(from = 0.0d, to = 100.0d) float f7, @NonNull ViewingConditions viewingConditions) {
        if (f6 >= 1.0d && Math.round(f7) > 0.0d && Math.round(f7) < 100.0d) {
            float min = f5 < 0.0f ? 0.0f : Math.min(360.0f, f5);
            CamColor camColor = null;
            boolean z4 = true;
            float f8 = 0.0f;
            float f9 = f6;
            while (Math.abs(f8 - f6) >= 0.4f) {
                CamColor findCamByJ = findCamByJ(min, f9, f7);
                if (!z4) {
                    if (findCamByJ == null) {
                        f6 = f9;
                    } else {
                        f8 = f9;
                        camColor = findCamByJ;
                    }
                    f9 = ((f6 - f8) / 2.0f) + f8;
                } else {
                    if (findCamByJ != null) {
                        return findCamByJ.viewed(viewingConditions);
                    }
                    f9 = ((f6 - f8) / 2.0f) + f8;
                    z4 = false;
                }
            }
            if (camColor == null) {
                return CamUtils.intFromLStar(f7);
            }
            return camColor.viewed(viewingConditions);
        }
        return CamUtils.intFromLStar(f7);
    }
}
