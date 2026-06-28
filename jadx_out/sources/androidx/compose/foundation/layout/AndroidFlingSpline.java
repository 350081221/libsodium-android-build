package androidx.compose.foundation.layout;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import kotlin.i0;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.r1;
import p4.l;

@i0(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bJ\u001b\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"Landroidx/compose/foundation/layout/AndroidFlingSpline;", "", "()V", "NbSamples", "", "SplinePositions", "", "SplineTimes", "deceleration", "", "velocity", "", "friction", "flingPosition", "Landroidx/compose/foundation/layout/AndroidFlingSpline$FlingResult;", CrashHianalyticsData.TIME, "flingPosition-LfoxSSI", "(F)J", "FlingResult", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nWindowInsetsConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/AndroidFlingSpline\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,725:1\n25#2,3:726\n*S KotlinDebug\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/AndroidFlingSpline\n*L\n700#1:726,3\n*E\n"})
/* loaded from: classes.dex */
final class AndroidFlingSpline {
    private static final int NbSamples = 100;

    @l
    public static final AndroidFlingSpline INSTANCE = new AndroidFlingSpline();

    @l
    private static final float[] SplinePositions = new float[101];

    @l
    private static final float[] SplineTimes = new float[101];

    @u3.f
    @i0(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\t\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/layout/AndroidFlingSpline$FlingResult;", "", "packedValue", "", "constructor-impl", "(J)J", "distanceCoefficient", "", "getDistanceCoefficient-impl", "(J)F", "velocityCoefficient", "getVelocityCoefficient-impl", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", TTDownloadField.TT_HASHCODE, "", "hashCode-impl", "(J)I", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nWindowInsetsConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/AndroidFlingSpline$FlingResult\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,725:1\n34#2:726\n41#2:727\n*S KotlinDebug\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/AndroidFlingSpline$FlingResult\n*L\n717#1:726\n722#1:727\n*E\n"})
    /* loaded from: classes.dex */
    public static final class FlingResult {
        private final long packedValue;

        private /* synthetic */ FlingResult(long j5) {
            this.packedValue = j5;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ FlingResult m453boximpl(long j5) {
            return new FlingResult(j5);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static long m454constructorimpl(long j5) {
            return j5;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m455equalsimpl(long j5, Object obj) {
            return (obj instanceof FlingResult) && j5 == ((FlingResult) obj).m461unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m456equalsimpl0(long j5, long j6) {
            return j5 == j6;
        }

        /* renamed from: getDistanceCoefficient-impl, reason: not valid java name */
        public static final float m457getDistanceCoefficientimpl(long j5) {
            a0 a0Var = a0.f19382a;
            return Float.intBitsToFloat((int) (j5 >> 32));
        }

        /* renamed from: getVelocityCoefficient-impl, reason: not valid java name */
        public static final float m458getVelocityCoefficientimpl(long j5) {
            a0 a0Var = a0.f19382a;
            return Float.intBitsToFloat((int) (j5 & 4294967295L));
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m459hashCodeimpl(long j5) {
            return Long.hashCode(j5);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m460toStringimpl(long j5) {
            return "FlingResult(packedValue=" + j5 + ')';
        }

        public boolean equals(Object obj) {
            return m455equalsimpl(this.packedValue, obj);
        }

        public int hashCode() {
            return m459hashCodeimpl(this.packedValue);
        }

        public String toString() {
            return m460toStringimpl(this.packedValue);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ long m461unboximpl() {
            return this.packedValue;
        }
    }

    static {
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13 = 0.0f;
        float f14 = 0.0f;
        for (int i5 = 0; i5 < 100; i5++) {
            float f15 = i5 / 100;
            float f16 = 1.0f;
            while (true) {
                f5 = ((f16 - f13) / 2.0f) + f13;
                f6 = 1.0f - f5;
                f7 = f5 * 3.0f * f6;
                f8 = f5 * f5 * f5;
                float f17 = (((f6 * 0.175f) + (f5 * 0.35000002f)) * f7) + f8;
                if (Math.abs(f17 - f15) < 1.0E-5d) {
                    break;
                } else if (f17 > f15) {
                    f16 = f5;
                } else {
                    f13 = f5;
                }
            }
            float f18 = 0.5f;
            SplinePositions[i5] = (f7 * ((f6 * 0.5f) + f5)) + f8;
            float f19 = 1.0f;
            while (true) {
                f9 = ((f19 - f14) / 2.0f) + f14;
                f10 = 1.0f - f9;
                f11 = f9 * 3.0f * f10;
                f12 = f9 * f9 * f9;
                float f20 = (((f10 * f18) + f9) * f11) + f12;
                if (Math.abs(f20 - f15) >= 1.0E-5d) {
                    if (f20 > f15) {
                        f19 = f9;
                    } else {
                        f14 = f9;
                    }
                    f18 = 0.5f;
                }
            }
            SplineTimes[i5] = (f11 * ((f10 * 0.175f) + (f9 * 0.35000002f))) + f12;
        }
        SplineTimes[100] = 1.0f;
        SplinePositions[100] = 1.0f;
    }

    private AndroidFlingSpline() {
    }

    public final double deceleration(float f5, float f6) {
        return Math.log((Math.abs(f5) * 0.35f) / f6);
    }

    /* renamed from: flingPosition-LfoxSSI, reason: not valid java name */
    public final long m452flingPositionLfoxSSI(float f5) {
        float f6;
        float f7;
        float f8 = 100;
        int i5 = (int) (f8 * f5);
        if (i5 < 100) {
            float f9 = i5 / f8;
            int i6 = i5 + 1;
            float f10 = i6 / f8;
            float[] fArr = SplinePositions;
            float f11 = fArr[i5];
            f7 = (fArr[i6] - f11) / (f10 - f9);
            f6 = f11 + ((f5 - f9) * f7);
        } else {
            f6 = 1.0f;
            f7 = 0.0f;
        }
        return FlingResult.m454constructorimpl((Float.floatToRawIntBits(f7) & 4294967295L) | (Float.floatToRawIntBits(f6) << 32));
    }
}
