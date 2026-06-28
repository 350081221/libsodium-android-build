package androidx.compose.ui.input.pointer.util;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.HistoricalChange;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.core.app.NotificationCompat;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.umeng.analytics.pro.bi;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.ranges.u;
import p4.l;
import t0.b;

@i0(d1 = {"\u0000N\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\u001a3\u0010\t\u001a\u00020\b*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u0012\u0010\u000e\u001a\u00020\b*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f\u001a\u0014\u0010\u000f\u001a\u00020\b*\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0002\u001a\u0014\u0010\u0010\u001a\u00020\b*\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0002\u001a2\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u0011H\u0000\u001a(\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0002\u001a\u0011\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0006H\u0082\b\u001a\u0014\u0010\u001f\u001a\u00020\u0006*\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u0011H\u0002\u001a\r\u0010 \u001a\u00020\u0006*\u00020\u0011H\u0082\b\u001a*\u0010$\u001a\f\u0012\b\u0012\u00060\u0011j\u0002`#0\u00002\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u0002H\u0082\b¢\u0006\u0004\b$\u0010%\u001a.\u0010)\u001a\u00020\u0006*\f\u0012\u0004\u0012\u00020\u00110\u0000j\u0002`&2\u0006\u0010'\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u0002H\u0082\n¢\u0006\u0004\b)\u0010*\u001a6\u0010\t\u001a\u00020\b*\f\u0012\u0004\u0012\u00020\u00110\u0000j\u0002`&2\u0006\u0010'\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u0006H\u0082\n¢\u0006\u0004\b\t\u0010,\"\u0014\u0010-\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010.\"\u0014\u0010/\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b/\u0010.\"\u0014\u00100\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b0\u0010.\"\u0014\u00101\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b1\u00102\"1\u0010<\u001a\u00020\u00192\u0006\u00103\u001a\u00020\u00198G@GX\u0087\u008e\u0002¢\u0006\u0018\n\u0004\b4\u00105\u0012\u0004\b:\u0010;\u001a\u0004\b6\u00107\"\u0004\b8\u00109*\u0018\b\u0002\u0010$\"\b\u0012\u0004\u0012\u00020\u00110\u00002\b\u0012\u0004\u0012\u00020\u00110\u0000*\f\b\u0002\u0010=\"\u00020\u00112\u00020\u0011¨\u0006>"}, d2 = {"", "Landroidx/compose/ui/input/pointer/util/DataPointAtTime;", "", "index", "", CrashHianalyticsData.TIME, "", "dataPoint", "Lkotlin/r2;", "set", "([Landroidx/compose/ui/input/pointer/util/DataPointAtTime;IJF)V", "Landroidx/compose/ui/input/pointer/util/VelocityTracker;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", NotificationCompat.CATEGORY_EVENT, "addPointerInputChange", "addPointerInputChangeLegacy", "addPointerInputChangeWithFix", "", "x", "y", "sampleCount", "degree", "coefficients", "polyFitLeastSquares", "dataPoints", "", "isDataDifferential", "calculateImpulseVelocity", "kineticEnergy", "kineticEnergyToVelocity", bi.ay, "dot", "norm", "rows", "cols", "Landroidx/compose/ui/input/pointer/util/Vector;", "Matrix", "(II)[[F", "Landroidx/compose/ui/input/pointer/util/Matrix;", "row", "col", "get", "([[FII)F", b.f22420d, "([[FIIF)V", "AssumePointerMoveStoppedMilliseconds", "I", "HistorySize", "HorizonMilliseconds", "DefaultWeight", "F", "<set-?>", "VelocityTrackerAddPointsFix$delegate", "Landroidx/compose/runtime/MutableState;", "getVelocityTrackerAddPointsFix", "()Z", "setVelocityTrackerAddPointsFix", "(Z)V", "getVelocityTrackerAddPointsFix$annotations", "()V", "VelocityTrackerAddPointsFix", "Vector", "ui_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nVelocityTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VelocityTracker.kt\nandroidx/compose/ui/input/pointer/util/VelocityTrackerKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,728:1\n706#1:741\n713#1,2:742\n709#1,6:744\n706#1:750\n706#1:751\n701#1:752\n709#1:753\n709#1:754\n687#1:755\n687#1:756\n33#2,6:729\n33#2,6:735\n81#3:757\n107#3,2:758\n*S KotlinDebug\n*F\n+ 1 VelocityTracker.kt\nandroidx/compose/ui/input/pointer/util/VelocityTrackerKt\n*L\n487#1:741\n489#1:742,2\n491#1:744,6\n498#1:750\n500#1:751\n515#1:752\n557#1:753\n559#1:754\n667#1:755\n677#1:756\n385#1:729,6\n421#1:735,6\n727#1:757\n727#1:758,2\n*E\n"})
/* loaded from: classes.dex */
public final class VelocityTrackerKt {
    private static final int AssumePointerMoveStoppedMilliseconds = 40;
    private static final float DefaultWeight = 1.0f;
    private static final int HistorySize = 20;
    private static final int HorizonMilliseconds = 100;

    @l
    private static final MutableState VelocityTrackerAddPointsFix$delegate;

    static {
        MutableState mutableStateOf$default;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        VelocityTrackerAddPointsFix$delegate = mutableStateOf$default;
    }

    private static final float[][] Matrix(int i5, int i6) {
        float[][] fArr = new float[i5];
        for (int i7 = 0; i7 < i5; i7++) {
            fArr[i7] = new float[i6];
        }
        return fArr;
    }

    public static final void addPointerInputChange(@l VelocityTracker velocityTracker, @l PointerInputChange pointerInputChange) {
        if (getVelocityTrackerAddPointsFix()) {
            addPointerInputChangeWithFix(velocityTracker, pointerInputChange);
        } else {
            addPointerInputChangeLegacy(velocityTracker, pointerInputChange);
        }
    }

    private static final void addPointerInputChangeLegacy(VelocityTracker velocityTracker, PointerInputChange pointerInputChange) {
        if (PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange)) {
            velocityTracker.m4974setCurrentPointerPositionAccumulatork4lQ0M$ui_release(pointerInputChange.m4872getPositionF1C5BW0());
            velocityTracker.resetTracking();
        }
        long m4873getPreviousPositionF1C5BW0 = pointerInputChange.m4873getPreviousPositionF1C5BW0();
        List<HistoricalChange> historical = pointerInputChange.getHistorical();
        int size = historical.size();
        int i5 = 0;
        while (i5 < size) {
            HistoricalChange historicalChange = historical.get(i5);
            long m3497minusMKHz9U = Offset.m3497minusMKHz9U(historicalChange.m4799getPositionF1C5BW0(), m4873getPreviousPositionF1C5BW0);
            long m4799getPositionF1C5BW0 = historicalChange.m4799getPositionF1C5BW0();
            velocityTracker.m4974setCurrentPointerPositionAccumulatork4lQ0M$ui_release(Offset.m3498plusMKHz9U(velocityTracker.m4973getCurrentPointerPositionAccumulatorF1C5BW0$ui_release(), m3497minusMKHz9U));
            velocityTracker.m4970addPositionUv8p0NA(historicalChange.getUptimeMillis(), velocityTracker.m4973getCurrentPointerPositionAccumulatorF1C5BW0$ui_release());
            i5++;
            m4873getPreviousPositionF1C5BW0 = m4799getPositionF1C5BW0;
        }
        velocityTracker.m4974setCurrentPointerPositionAccumulatork4lQ0M$ui_release(Offset.m3498plusMKHz9U(velocityTracker.m4973getCurrentPointerPositionAccumulatorF1C5BW0$ui_release(), Offset.m3497minusMKHz9U(pointerInputChange.m4872getPositionF1C5BW0(), m4873getPreviousPositionF1C5BW0)));
        velocityTracker.m4970addPositionUv8p0NA(pointerInputChange.getUptimeMillis(), velocityTracker.m4973getCurrentPointerPositionAccumulatorF1C5BW0$ui_release());
    }

    private static final void addPointerInputChangeWithFix(VelocityTracker velocityTracker, PointerInputChange pointerInputChange) {
        if (PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange)) {
            velocityTracker.resetTracking();
        }
        if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
            List<HistoricalChange> historical = pointerInputChange.getHistorical();
            int size = historical.size();
            for (int i5 = 0; i5 < size; i5++) {
                HistoricalChange historicalChange = historical.get(i5);
                velocityTracker.m4970addPositionUv8p0NA(historicalChange.getUptimeMillis(), historicalChange.m4798getOriginalEventPositionF1C5BW0$ui_release());
            }
            velocityTracker.m4970addPositionUv8p0NA(pointerInputChange.getUptimeMillis(), pointerInputChange.m4871getOriginalEventPositionF1C5BW0$ui_release());
        }
        if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange) && pointerInputChange.getUptimeMillis() - velocityTracker.getLastMoveEventTimeStamp$ui_release() > 40) {
            velocityTracker.resetTracking();
        }
        velocityTracker.setLastMoveEventTimeStamp$ui_release(pointerInputChange.getUptimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calculateImpulseVelocity(float[] fArr, float[] fArr2, int i5, boolean z4) {
        boolean z5;
        float f5;
        boolean z6;
        float f6;
        float f7 = 0.0f;
        if (i5 < 2) {
            return 0.0f;
        }
        if (i5 == 2) {
            float f8 = fArr2[0];
            float f9 = fArr2[1];
            if (f8 == f9) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (z6) {
                return 0.0f;
            }
            if (z4) {
                f6 = fArr[0];
            } else {
                f6 = fArr[0] - fArr[1];
            }
            return f6 / (f8 - f9);
        }
        int i6 = i5 - 1;
        for (int i7 = i6; i7 > 0; i7--) {
            int i8 = i7 - 1;
            if (fArr2[i7] == fArr2[i8]) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (!z5) {
                float signum = Math.signum(f7) * ((float) Math.sqrt(2 * Math.abs(f7)));
                if (z4) {
                    f5 = -fArr[i8];
                } else {
                    f5 = fArr[i7] - fArr[i8];
                }
                float f10 = f5 / (fArr2[i7] - fArr2[i8]);
                f7 += (f10 - signum) * Math.abs(f10);
                if (i7 == i6) {
                    f7 *= 0.5f;
                }
            }
        }
        return Math.signum(f7) * ((float) Math.sqrt(2 * Math.abs(f7)));
    }

    private static final float dot(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f5 = 0.0f;
        for (int i5 = 0; i5 < length; i5++) {
            f5 += fArr[i5] * fArr2[i5];
        }
        return f5;
    }

    private static final float get(float[][] fArr, int i5, int i6) {
        return fArr[i5][i6];
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ExperimentalComposeUiApi
    public static final boolean getVelocityTrackerAddPointsFix() {
        return ((Boolean) VelocityTrackerAddPointsFix$delegate.getValue()).booleanValue();
    }

    @ExperimentalComposeUiApi
    public static /* synthetic */ void getVelocityTrackerAddPointsFix$annotations() {
    }

    private static final float kineticEnergyToVelocity(float f5) {
        return Math.signum(f5) * ((float) Math.sqrt(2 * Math.abs(f5)));
    }

    private static final float norm(float[] fArr) {
        return (float) Math.sqrt(dot(fArr, fArr));
    }

    @l
    public static final float[] polyFitLeastSquares(@l float[] fArr, @l float[] fArr2, int i5, int i6, @l float[] fArr3) {
        float dot;
        int i7 = i6;
        if (i7 >= 1) {
            if (i5 != 0) {
                if (i7 >= i5) {
                    i7 = i5 - 1;
                }
                int i8 = i7 + 1;
                float[][] fArr4 = new float[i8];
                for (int i9 = 0; i9 < i8; i9++) {
                    fArr4[i9] = new float[i5];
                }
                for (int i10 = 0; i10 < i5; i10++) {
                    fArr4[0][i10] = 1.0f;
                    for (int i11 = 1; i11 < i8; i11++) {
                        fArr4[i11][i10] = fArr4[i11 - 1][i10] * fArr[i10];
                    }
                }
                float[][] fArr5 = new float[i8];
                for (int i12 = 0; i12 < i8; i12++) {
                    fArr5[i12] = new float[i5];
                }
                float[][] fArr6 = new float[i8];
                for (int i13 = 0; i13 < i8; i13++) {
                    fArr6[i13] = new float[i8];
                }
                for (int i14 = 0; i14 < i8; i14++) {
                    float[] fArr7 = fArr5[i14];
                    float[] fArr8 = fArr4[i14];
                    for (int i15 = 0; i15 < i5; i15++) {
                        fArr7[i15] = fArr8[i15];
                    }
                    for (int i16 = 0; i16 < i14; i16++) {
                        float[] fArr9 = fArr5[i16];
                        float dot2 = dot(fArr7, fArr9);
                        for (int i17 = 0; i17 < i5; i17++) {
                            fArr7[i17] = fArr7[i17] - (fArr9[i17] * dot2);
                        }
                    }
                    float sqrt = (float) Math.sqrt(dot(fArr7, fArr7));
                    if (sqrt >= 1.0E-6f) {
                        float f5 = 1.0f / sqrt;
                        for (int i18 = 0; i18 < i5; i18++) {
                            fArr7[i18] = fArr7[i18] * f5;
                        }
                        float[] fArr10 = fArr6[i14];
                        for (int i19 = 0; i19 < i8; i19++) {
                            if (i19 < i14) {
                                dot = 0.0f;
                            } else {
                                dot = dot(fArr7, fArr4[i19]);
                            }
                            fArr10[i19] = dot;
                        }
                    } else {
                        throw new IllegalArgumentException("Vectors are linearly dependent or zero so no solution. TODO(shepshapard), actually determine what this means");
                    }
                }
                int i20 = i8 - 1;
                for (int i21 = i20; -1 < i21; i21--) {
                    fArr3[i21] = dot(fArr5[i21], fArr2);
                    int i22 = i21 + 1;
                    if (i22 <= i20) {
                        int i23 = i20;
                        while (true) {
                            fArr3[i21] = fArr3[i21] - (fArr6[i21][i23] * fArr3[i23]);
                            if (i23 != i22) {
                                i23--;
                            }
                        }
                    }
                    fArr3[i21] = fArr3[i21] / fArr6[i21][i21];
                }
                return fArr3;
            }
            throw new IllegalArgumentException("At least one point must be provided");
        }
        throw new IllegalArgumentException("The degree must be at positive integer");
    }

    public static /* synthetic */ float[] polyFitLeastSquares$default(float[] fArr, float[] fArr2, int i5, int i6, float[] fArr3, int i7, Object obj) {
        int u4;
        if ((i7 & 16) != 0) {
            u4 = u.u(i6 + 1, 0);
            fArr3 = new float[u4];
        }
        return polyFitLeastSquares(fArr, fArr2, i5, i6, fArr3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void set(DataPointAtTime[] dataPointAtTimeArr, int i5, long j5, float f5) {
        DataPointAtTime dataPointAtTime = dataPointAtTimeArr[i5];
        if (dataPointAtTime == null) {
            dataPointAtTimeArr[i5] = new DataPointAtTime(j5, f5);
        } else {
            dataPointAtTime.setTime(j5);
            dataPointAtTime.setDataPoint(f5);
        }
    }

    @ExperimentalComposeUiApi
    public static final void setVelocityTrackerAddPointsFix(boolean z4) {
        VelocityTrackerAddPointsFix$delegate.setValue(Boolean.valueOf(z4));
    }

    private static final void set(float[][] fArr, int i5, int i6, float f5) {
        fArr[i5][i6] = f5;
    }
}
