package androidx.compose.ui.input.pointer.util;

import androidx.compose.runtime.internal.StabilityInferred;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import kotlin.collections.o;
import kotlin.i0;
import kotlin.j0;
import kotlin.jvm.internal.w;
import kotlin.ranges.u;
import p4.l;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001:\u0001&B\u001d\b\u0000\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b#\u0010$B\u0011\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b#\u0010%J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0016\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0007J\u0006\u0010\u000e\u001a\u00020\u0007J\u000e\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007J\u0006\u0010\u0010\u001a\u00020\fR\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u0014\u0010\u001f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010 R\u0014\u0010\"\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010 ¨\u0006'"}, d2 = {"Landroidx/compose/ui/input/pointer/util/VelocityTracker1D;", "", "", "dataPoints", CrashHianalyticsData.TIME, "", "sampleCount", "", "calculateLeastSquaresVelocity", "", "timeMillis", "dataPoint", "Lkotlin/r2;", "addDataPoint", "calculateVelocity", "maximumVelocity", "resetTracking", "", "isDataDifferential", "Z", "()Z", "Landroidx/compose/ui/input/pointer/util/VelocityTracker1D$Strategy;", "strategy", "Landroidx/compose/ui/input/pointer/util/VelocityTracker1D$Strategy;", "minSampleSize", "I", "", "Landroidx/compose/ui/input/pointer/util/DataPointAtTime;", "samples", "[Landroidx/compose/ui/input/pointer/util/DataPointAtTime;", "index", "reusableDataPointsArray", "[F", "reusableTimeArray", "reusableVelocityCoefficients", "<init>", "(ZLandroidx/compose/ui/input/pointer/util/VelocityTracker1D$Strategy;)V", "(Z)V", "Strategy", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class VelocityTracker1D {
    public static final int $stable = 8;
    private int index;
    private final boolean isDataDifferential;
    private final int minSampleSize;

    @l
    private final float[] reusableDataPointsArray;

    @l
    private final float[] reusableTimeArray;

    @l
    private final float[] reusableVelocityCoefficients;

    @l
    private final DataPointAtTime[] samples;

    @l
    private final Strategy strategy;

    @i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/input/pointer/util/VelocityTracker1D$Strategy;", "", "(Ljava/lang/String;I)V", "Lsq2", "Impulse", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public enum Strategy {
        Lsq2,
        Impulse
    }

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Strategy.values().length];
            try {
                iArr[Strategy.Impulse.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Strategy.Lsq2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VelocityTracker1D() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public VelocityTracker1D(boolean z4, @l Strategy strategy) {
        this.isDataDifferential = z4;
        this.strategy = strategy;
        if (z4 && strategy.equals(Strategy.Lsq2)) {
            throw new IllegalStateException("Lsq2 not (yet) supported for differential axes");
        }
        int i5 = WhenMappings.$EnumSwitchMapping$0[strategy.ordinal()];
        int i6 = 2;
        if (i5 != 1) {
            if (i5 != 2) {
                throw new j0();
            }
            i6 = 3;
        }
        this.minSampleSize = i6;
        this.samples = new DataPointAtTime[20];
        this.reusableDataPointsArray = new float[20];
        this.reusableTimeArray = new float[20];
        this.reusableVelocityCoefficients = new float[3];
    }

    private final float calculateLeastSquaresVelocity(float[] fArr, float[] fArr2, int i5) {
        try {
            return VelocityTrackerKt.polyFitLeastSquares(fArr2, fArr, i5, 2, this.reusableVelocityCoefficients)[1];
        } catch (IllegalArgumentException unused) {
            return 0.0f;
        }
    }

    public final void addDataPoint(long j5, float f5) {
        int i5 = (this.index + 1) % 20;
        this.index = i5;
        VelocityTrackerKt.set(this.samples, i5, j5, f5);
    }

    public final float calculateVelocity() {
        float calculateImpulseVelocity;
        float[] fArr = this.reusableDataPointsArray;
        float[] fArr2 = this.reusableTimeArray;
        int i5 = this.index;
        DataPointAtTime dataPointAtTime = this.samples[i5];
        if (dataPointAtTime == null) {
            return 0.0f;
        }
        int i6 = 0;
        DataPointAtTime dataPointAtTime2 = dataPointAtTime;
        while (true) {
            DataPointAtTime dataPointAtTime3 = this.samples[i5];
            if (dataPointAtTime3 != null) {
                float time = (float) (dataPointAtTime.getTime() - dataPointAtTime3.getTime());
                float abs = (float) Math.abs(dataPointAtTime3.getTime() - dataPointAtTime2.getTime());
                if (time > 100.0f || abs > 40.0f) {
                    break;
                }
                fArr[i6] = dataPointAtTime3.getDataPoint();
                fArr2[i6] = -time;
                if (i5 == 0) {
                    i5 = 20;
                }
                i5--;
                i6++;
                if (i6 >= 20) {
                    break;
                }
                dataPointAtTime2 = dataPointAtTime3;
            } else {
                break;
            }
        }
        if (i6 < this.minSampleSize) {
            return 0.0f;
        }
        int i7 = WhenMappings.$EnumSwitchMapping$0[this.strategy.ordinal()];
        if (i7 == 1) {
            calculateImpulseVelocity = VelocityTrackerKt.calculateImpulseVelocity(fArr, fArr2, i6, this.isDataDifferential);
        } else {
            if (i7 != 2) {
                throw new j0();
            }
            calculateImpulseVelocity = calculateLeastSquaresVelocity(fArr, fArr2, i6);
        }
        return calculateImpulseVelocity * 1000;
    }

    public final boolean isDataDifferential() {
        return this.isDataDifferential;
    }

    public final void resetTracking() {
        o.V1(this.samples, null, 0, 0, 6, null);
        this.index = 0;
    }

    public /* synthetic */ VelocityTracker1D(boolean z4, Strategy strategy, int i5, w wVar) {
        this((i5 & 1) != 0 ? false : z4, (i5 & 2) != 0 ? Strategy.Lsq2 : strategy);
    }

    public final float calculateVelocity(float f5) {
        float t5;
        float A;
        if (f5 > 0.0f) {
            float calculateVelocity = calculateVelocity();
            if (calculateVelocity == 0.0f) {
                return 0.0f;
            }
            if (calculateVelocity > 0.0f) {
                A = u.A(calculateVelocity, f5);
                return A;
            }
            t5 = u.t(calculateVelocity, -f5);
            return t5;
        }
        throw new IllegalStateException(("maximumVelocity should be a positive value. You specified=" + f5).toString());
    }

    public VelocityTracker1D(boolean z4) {
        this(z4, Strategy.Impulse);
    }
}
