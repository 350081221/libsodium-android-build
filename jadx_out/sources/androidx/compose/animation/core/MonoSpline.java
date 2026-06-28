package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.umeng.analytics.pro.bi;
import java.util.ArrayList;
import java.util.List;
import kotlin.i0;
import p4.l;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b&\u0010'J(\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J&\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\tH\u0002J\u0018\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0002J8\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\fH\u0002J8\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\fH\u0002J\u0016\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0006J\u0016\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0002J\u0016\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u001cJ\u0016\u0010\u000f\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0006J\u0016\u0010\u000f\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u001cR\u0014\u0010\u001d\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR$\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R$\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010 R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082D¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001e¨\u0006("}, d2 = {"Landroidx/compose/animation/core/MonoSpline;", "", "", bi.ay, "b", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "makeFloatArray", "", "y", "copyData", "", CrashHianalyticsData.TIME, "j", "getSlope", bi.aJ, "x", "y1", "y2", "t1", "t2", "interpolate", "diff", bi.aL, "v", "Lkotlin/r2;", "getPos", "Landroidx/compose/animation/core/AnimationVector;", "timePoints", "[F", "values", "Ljava/util/ArrayList;", "tangents", "", "isExtrapolate", "Z", "slopeTemp", "<init>", "([FLjava/util/List;)V", "animation-core_release"}, k = 1, mv = {1, 8, 0})
@ExperimentalAnimationSpecApi
/* loaded from: classes.dex */
public final class MonoSpline {
    public static final int $stable = 8;
    private final boolean isExtrapolate = true;

    @l
    private final float[] slopeTemp;

    @l
    private final ArrayList<float[]> tangents;

    @l
    private final float[] timePoints;

    @l
    private final ArrayList<float[]> values;

    public MonoSpline(@l float[] fArr, @l List<float[]> list) {
        int i5;
        int i6;
        int length = fArr.length;
        int i7 = 0;
        int length2 = list.get(0).length;
        this.slopeTemp = new float[length2];
        int i8 = length - 1;
        ArrayList<float[]> makeFloatArray = makeFloatArray(i8, length2);
        ArrayList<float[]> makeFloatArray2 = makeFloatArray(length, length2);
        for (int i9 = 0; i9 < length2; i9++) {
            int i10 = 0;
            while (i10 < i8) {
                int i11 = i10 + 1;
                makeFloatArray.get(i10)[i9] = (list.get(i11)[i9] - list.get(i10)[i9]) / (fArr[i11] - fArr[i10]);
                if (i10 == 0) {
                    makeFloatArray2.get(i10)[i9] = makeFloatArray.get(i10)[i9];
                } else {
                    makeFloatArray2.get(i10)[i9] = (makeFloatArray.get(i10 - 1)[i9] + makeFloatArray.get(i10)[i9]) * 0.5f;
                }
                i10 = i11;
            }
            makeFloatArray2.get(i8)[i9] = makeFloatArray.get(length - 2)[i9];
        }
        int i12 = 0;
        while (i12 < i8) {
            int i13 = i7;
            while (i13 < length2) {
                if (makeFloatArray.get(i12)[i13] == 0.0f) {
                    i5 = 1;
                } else {
                    i5 = i7;
                }
                if (i5 != 0) {
                    makeFloatArray2.get(i12)[i13] = 0.0f;
                    makeFloatArray2.get(i12 + 1)[i13] = 0.0f;
                    i6 = length2;
                } else {
                    float f5 = makeFloatArray2.get(i12)[i13] / makeFloatArray.get(i12)[i13];
                    int i14 = i12 + 1;
                    float f6 = makeFloatArray2.get(i14)[i13] / makeFloatArray.get(i12)[i13];
                    i6 = length2;
                    float hypot = (float) Math.hypot(f5, f6);
                    if (hypot > 9.0d) {
                        float f7 = 3.0f / hypot;
                        makeFloatArray2.get(i12)[i13] = f5 * f7 * makeFloatArray.get(i12)[i13];
                        makeFloatArray2.get(i14)[i13] = f7 * f6 * makeFloatArray.get(i12)[i13];
                    }
                }
                i13++;
                length2 = i6;
                i7 = 0;
            }
            i12++;
            i7 = 0;
        }
        this.timePoints = fArr;
        this.values = copyData(list);
        this.tangents = makeFloatArray2;
    }

    private final ArrayList<float[]> copyData(List<float[]> list) {
        ArrayList<float[]> arrayList = new ArrayList<>();
        arrayList.addAll(list);
        return arrayList;
    }

    private final float diff(float f5, float f6, float f7, float f8, float f9, float f10) {
        float f11 = f6 * f6;
        float f12 = 6;
        float f13 = f12 * f6;
        float f14 = (((((-6) * f11) * f8) + (f8 * f13)) + ((f12 * f11) * f7)) - (f13 * f7);
        float f15 = 3 * f5;
        return ((((f14 + ((f15 * f10) * f11)) + ((f15 * f9) * f11)) - (((2 * f5) * f10) * f6)) - (((4 * f5) * f9) * f6)) + (f5 * f9);
    }

    private final float interpolate(float f5, float f6, float f7, float f8, float f9, float f10) {
        float f11 = f6 * f6;
        float f12 = f11 * f6;
        float f13 = 3 * f11;
        float f14 = ((-2) * f12 * f8) + (f8 * f13);
        float f15 = 2;
        float f16 = f10 * f5;
        float f17 = ((f14 + ((f15 * f12) * f7)) - (f13 * f7)) + f7 + (f16 * f12);
        float f18 = f5 * f9;
        return (((f17 + (f12 * f18)) - (f16 * f11)) - (((f15 * f5) * f9) * f11)) + (f18 * f6);
    }

    private final ArrayList<float[]> makeFloatArray(int i5, int i6) {
        ArrayList<float[]> arrayList = new ArrayList<>();
        for (int i7 = 0; i7 < i5; i7++) {
            arrayList.add(new float[i6]);
        }
        return arrayList;
    }

    public final void getPos(float f5, @l float[] fArr) {
        int length = this.timePoints.length;
        int i5 = 0;
        int length2 = this.values.get(0).length;
        if (this.isExtrapolate) {
            float[] fArr2 = this.timePoints;
            float f6 = fArr2[0];
            if (f5 <= f6) {
                getSlope(f6, this.slopeTemp);
                for (int i6 = 0; i6 < length2; i6++) {
                    fArr[i6] = this.values.get(0)[i6] + ((f5 - this.timePoints[0]) * this.slopeTemp[i6]);
                }
                return;
            }
            int i7 = length - 1;
            float f7 = fArr2[i7];
            if (f5 >= f7) {
                getSlope(f7, this.slopeTemp);
                while (i5 < length2) {
                    fArr[i5] = this.values.get(i7)[i5] + ((f5 - this.timePoints[i7]) * this.slopeTemp[i5]);
                    i5++;
                }
                return;
            }
        } else {
            float[] fArr3 = this.timePoints;
            if (f5 <= fArr3[0]) {
                for (int i8 = 0; i8 < length2; i8++) {
                    fArr[i8] = this.values.get(0)[i8];
                }
                return;
            }
            int i9 = length - 1;
            if (f5 >= fArr3[i9]) {
                while (i5 < length2) {
                    fArr[i5] = this.values.get(i9)[i5];
                    i5++;
                }
                return;
            }
        }
        int i10 = length - 1;
        int i11 = 0;
        while (i11 < i10) {
            if (f5 == this.timePoints[i11]) {
                for (int i12 = 0; i12 < length2; i12++) {
                    fArr[i12] = this.values.get(i11)[i12];
                }
            }
            float[] fArr4 = this.timePoints;
            int i13 = i11 + 1;
            float f8 = fArr4[i13];
            if (f5 < f8) {
                float f9 = fArr4[i11];
                float f10 = f8 - f9;
                float f11 = (f5 - f9) / f10;
                for (int i14 = 0; i14 < length2; i14++) {
                    fArr[i14] = interpolate(f10, f11, this.values.get(i11)[i14], this.values.get(i13)[i14], this.tangents.get(i11)[i14], this.tangents.get(i13)[i14]);
                }
                return;
            }
            i11 = i13;
        }
    }

    public final void getSlope(float f5, @l float[] fArr) {
        float f6;
        int length = this.timePoints.length;
        int length2 = this.values.get(0).length;
        float[] fArr2 = this.timePoints;
        float f7 = fArr2[0];
        if (f5 <= f7) {
            f6 = f7;
        } else {
            f6 = fArr2[length - 1];
            if (f5 < f6) {
                f6 = f5;
            }
        }
        int i5 = length - 1;
        int i6 = 0;
        while (i6 < i5) {
            float[] fArr3 = this.timePoints;
            int i7 = i6 + 1;
            float f8 = fArr3[i7];
            if (f6 <= f8) {
                float f9 = fArr3[i6];
                float f10 = f8 - f9;
                float f11 = (f6 - f9) / f10;
                for (int i8 = 0; i8 < length2; i8++) {
                    fArr[i8] = diff(f10, f11, this.values.get(i6)[i8], this.values.get(i7)[i8], this.tangents.get(i6)[i8], this.tangents.get(i7)[i8]) / f10;
                }
                return;
            }
            i6 = i7;
        }
    }

    public final void getSlope(float f5, @l AnimationVector animationVector) {
        float f6;
        int length = this.timePoints.length;
        int length2 = this.values.get(0).length;
        float[] fArr = this.timePoints;
        float f7 = fArr[0];
        if (f5 <= f7) {
            f6 = f7;
        } else {
            f6 = fArr[length - 1];
            if (f5 < f6) {
                f6 = f5;
            }
        }
        int i5 = length - 1;
        int i6 = 0;
        while (i6 < i5) {
            float[] fArr2 = this.timePoints;
            int i7 = i6 + 1;
            float f8 = fArr2[i7];
            if (f6 <= f8) {
                float f9 = fArr2[i6];
                float f10 = f8 - f9;
                float f11 = (f6 - f9) / f10;
                for (int i8 = 0; i8 < length2; i8++) {
                    animationVector.set$animation_core_release(i8, diff(f10, f11, this.values.get(i6)[i8], this.values.get(i7)[i8], this.tangents.get(i6)[i8], this.tangents.get(i7)[i8]) / f10);
                }
                return;
            }
            i6 = i7;
        }
    }

    private final float getSlope(float f5, int i5) {
        float[] fArr = this.timePoints;
        int length = fArr.length;
        int i6 = 0;
        float f6 = fArr[0];
        if (f5 < f6) {
            f5 = f6;
        } else {
            float f7 = fArr[length - 1];
            if (f5 >= f7) {
                f5 = f7;
            }
        }
        int i7 = length - 1;
        while (i6 < i7) {
            float[] fArr2 = this.timePoints;
            int i8 = i6 + 1;
            float f8 = fArr2[i8];
            if (f5 <= f8) {
                float f9 = fArr2[i6];
                float f10 = f8 - f9;
                return diff(f10, (f5 - f9) / f10, this.values.get(i6)[i5], this.values.get(i8)[i5], this.tangents.get(i6)[i5], this.tangents.get(i8)[i5]) / f10;
            }
            i6 = i8;
        }
        return 0.0f;
    }

    public final float getPos(float f5, int i5) {
        float f6;
        float f7;
        float slope;
        float[] fArr = this.timePoints;
        int length = fArr.length;
        if (this.isExtrapolate) {
            if (f5 <= fArr[0]) {
                f6 = this.values.get(0)[i5];
                float f8 = this.timePoints[0];
                f7 = f5 - f8;
                slope = getSlope(f8, i5);
            } else {
                int i6 = length - 1;
                if (f5 >= fArr[i6]) {
                    f6 = this.values.get(i6)[i5];
                    float f9 = this.timePoints[i6];
                    f7 = f5 - f9;
                    slope = getSlope(f9, i5);
                }
            }
            return f6 + (f7 * slope);
        }
        if (f5 <= fArr[0]) {
            return this.values.get(0)[i5];
        }
        int i7 = length - 1;
        if (f5 >= fArr[i7]) {
            return this.values.get(i7)[i5];
        }
        int i8 = length - 1;
        int i9 = 0;
        while (i9 < i8) {
            float[] fArr2 = this.timePoints;
            float f10 = fArr2[i9];
            if (f5 == f10) {
                return this.values.get(i9)[i5];
            }
            int i10 = i9 + 1;
            float f11 = fArr2[i10];
            if (f5 < f11) {
                float f12 = f11 - f10;
                return interpolate(f12, (f5 - f10) / f12, this.values.get(i9)[i5], this.values.get(i10)[i5], this.tangents.get(i9)[i5], this.tangents.get(i10)[i5]);
            }
            i9 = i10;
        }
        return 0.0f;
    }

    public final void getPos(float f5, @l AnimationVector animationVector) {
        int length = this.timePoints.length;
        int i5 = 0;
        int length2 = this.values.get(0).length;
        if (this.isExtrapolate) {
            float[] fArr = this.timePoints;
            float f6 = fArr[0];
            if (f5 <= f6) {
                getSlope(f6, this.slopeTemp);
                for (int i6 = 0; i6 < length2; i6++) {
                    animationVector.set$animation_core_release(i6, this.values.get(0)[i6] + ((f5 - this.timePoints[0]) * this.slopeTemp[i6]));
                }
                return;
            }
            int i7 = length - 1;
            float f7 = fArr[i7];
            if (f5 >= f7) {
                getSlope(f7, this.slopeTemp);
                while (i5 < length2) {
                    animationVector.set$animation_core_release(i5, this.values.get(i7)[i5] + ((f5 - this.timePoints[i7]) * this.slopeTemp[i5]));
                    i5++;
                }
                return;
            }
        } else {
            float[] fArr2 = this.timePoints;
            if (f5 <= fArr2[0]) {
                for (int i8 = 0; i8 < length2; i8++) {
                    animationVector.set$animation_core_release(i8, this.values.get(0)[i8]);
                }
                return;
            }
            int i9 = length - 1;
            if (f5 >= fArr2[i9]) {
                while (i5 < length2) {
                    animationVector.set$animation_core_release(i5, this.values.get(i9)[i5]);
                    i5++;
                }
                return;
            }
        }
        int i10 = length - 1;
        int i11 = 0;
        while (i11 < i10) {
            if (f5 == this.timePoints[i11]) {
                for (int i12 = 0; i12 < length2; i12++) {
                    animationVector.set$animation_core_release(i12, this.values.get(i11)[i12]);
                }
            }
            float[] fArr3 = this.timePoints;
            int i13 = i11 + 1;
            float f8 = fArr3[i13];
            if (f5 < f8) {
                float f9 = fArr3[i11];
                float f10 = f8 - f9;
                float f11 = (f5 - f9) / f10;
                for (int i14 = 0; i14 < length2; i14++) {
                    animationVector.set$animation_core_release(i14, interpolate(f10, f11, this.values.get(i11)[i14], this.values.get(i13)[i14], this.tangents.get(i11)[i14], this.tangents.get(i13)[i14]));
                }
                return;
            }
            i11 = i13;
        }
    }
}
