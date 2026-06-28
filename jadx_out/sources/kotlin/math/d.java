package kotlin.math;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.umeng.analytics.pro.au;
import com.umeng.analytics.pro.bi;
import kotlin.g1;
import kotlin.i0;
import kotlin.internal.f;
import kotlin.r;
import kotlin.v2;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b8\u001a\u0011\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\tH\u0087\b\u001a\u0011\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\fH\u0087\b\u001a\u0011\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0010\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0007\u001a\u0011\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0010\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0007\u001a\u0011\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0019\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0019\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0010\u0010 \u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0007\u001a\u0011\u0010 \u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010!\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010!\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010\"\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\"\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010#\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010#\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010$\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010$\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010%\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010%\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010&\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010&\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010'\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010'\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0019\u0010(\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u0001H\u0087\b\u001a\u0019\u0010(\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010)\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010)\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010*\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010*\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0018\u0010+\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010,\u001a\u00020\u0001H\u0007\u001a\u0018\u0010+\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u0006H\u0007\u001a\u0011\u0010-\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010-\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0010\u0010.\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0007\u001a\u0010\u0010.\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0007\u001a\u0019\u0010/\u001a\u00020\u00012\u0006\u00100\u001a\u00020\u00012\u0006\u00101\u001a\u00020\u0001H\u0087\b\u001a\u0019\u0010/\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u0006H\u0087\b\u001a\u0019\u0010/\u001a\u00020\t2\u0006\u00100\u001a\u00020\t2\u0006\u00101\u001a\u00020\tH\u0087\b\u001a\u0019\u0010/\u001a\u00020\f2\u0006\u00100\u001a\u00020\f2\u0006\u00101\u001a\u00020\fH\u0087\b\u001a\u0019\u00102\u001a\u00020\u00012\u0006\u00100\u001a\u00020\u00012\u0006\u00101\u001a\u00020\u0001H\u0087\b\u001a\u0019\u00102\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u0006H\u0087\b\u001a\u0019\u00102\u001a\u00020\t2\u0006\u00100\u001a\u00020\t2\u0006\u00101\u001a\u00020\tH\u0087\b\u001a\u0019\u00102\u001a\u00020\f2\u0006\u00100\u001a\u00020\f2\u0006\u00101\u001a\u00020\fH\u0087\b\u001a\u0011\u00103\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u00103\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u00104\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u00104\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u00105\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u00105\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u00106\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u00106\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u00107\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u00107\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u00108\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u00108\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0010\u00109\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0007\u001a\u0010\u00109\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0007\u001a\u0015\u0010:\u001a\u00020\u0001*\u00020\u00012\u0006\u0010;\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010:\u001a\u00020\u0006*\u00020\u00062\u0006\u0010;\u001a\u00020\u0006H\u0087\b\u001a\r\u0010<\u001a\u00020\u0001*\u00020\u0001H\u0087\b\u001a\r\u0010<\u001a\u00020\u0006*\u00020\u0006H\u0087\b\u001a\u0015\u0010=\u001a\u00020\u0001*\u00020\u00012\u0006\u0010>\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010=\u001a\u00020\u0006*\u00020\u00062\u0006\u0010>\u001a\u00020\u0006H\u0087\b\u001a\r\u0010?\u001a\u00020\u0001*\u00020\u0001H\u0087\b\u001a\r\u0010?\u001a\u00020\u0006*\u00020\u0006H\u0087\b\u001a\u0015\u0010@\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010@\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0018\u001a\u00020\tH\u0087\b\u001a\u0015\u0010@\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0015\u0010@\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0018\u001a\u00020\tH\u0087\b\u001a\f\u0010A\u001a\u00020\t*\u00020\u0001H\u0007\u001a\f\u0010A\u001a\u00020\t*\u00020\u0006H\u0007\u001a\f\u0010B\u001a\u00020\f*\u00020\u0001H\u0007\u001a\f\u0010B\u001a\u00020\f*\u00020\u0006H\u0007\u001a\u0015\u0010C\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010C\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\tH\u0087\b\u001a\u0015\u0010C\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0087\b\u001a\u0015\u0010C\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u000f\u001a\u00020\tH\u0087\b\"\u001f\u0010\u0000\u001a\u00020\u0001*\u00020\u00018Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u001f\u0010\u0000\u001a\u00020\u0006*\u00020\u00068Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0002\u0010\u0007\u001a\u0004\b\u0004\u0010\b\"\u001f\u0010\u0000\u001a\u00020\t*\u00020\t8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0002\u0010\n\u001a\u0004\b\u0004\u0010\u000b\"\u001f\u0010\u0000\u001a\u00020\f*\u00020\f8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0002\u0010\r\u001a\u0004\b\u0004\u0010\u000e\"\u001f\u0010\u000f\u001a\u00020\u0001*\u00020\u00018Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0003\u001a\u0004\b\u0011\u0010\u0005\"\u001f\u0010\u000f\u001a\u00020\u0006*\u00020\u00068Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0007\u001a\u0004\b\u0011\u0010\b\"\u001e\u0010\u000f\u001a\u00020\t*\u00020\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\n\u001a\u0004\b\u0011\u0010\u000b\"\u001e\u0010\u000f\u001a\u00020\t*\u00020\f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u0012\"\u001f\u0010\u0013\u001a\u00020\u0001*\u00020\u00018Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u0003\u001a\u0004\b\u0015\u0010\u0005\"\u001f\u0010\u0013\u001a\u00020\u0006*\u00020\u00068Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u0007\u001a\u0004\b\u0015\u0010\b¨\u0006D"}, d2 = {"absoluteValue", "", "getAbsoluteValue$annotations", "(D)V", "getAbsoluteValue", "(D)D", "", "(F)V", "(F)F", "", "(I)V", "(I)I", "", "(J)V", "(J)J", "sign", "getSign$annotations", "getSign", "(J)I", "ulp", "getUlp$annotations", "getUlp", "abs", "x", "n", "acos", "acosh", "asin", "asinh", "atan", "atan2", "y", "atanh", "cbrt", "ceil", "cos", "cosh", au.f12194b, "expm1", "floor", "hypot", "ln", "ln1p", "log", "base", "log10", "log2", "max", bi.ay, "b", "min", "round", "sin", "sinh", "sqrt", "tan", "tanh", "truncate", "IEEErem", "divisor", "nextDown", "nextTowards", TypedValues.TransitionType.S_TO, "nextUp", "pow", "roundToInt", "roundToLong", "withSign", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/math/MathKt")
/* loaded from: classes4.dex */
public class d extends c {
    @g1(version = "1.2")
    @f
    private static final double A(double d5) {
        return Math.cos(d5);
    }

    @g1(version = "1.2")
    @f
    private static final double A0(double d5, double d6) {
        return Math.nextAfter(d5, d6);
    }

    @g1(version = "1.2")
    @f
    private static final float B(float f5) {
        return (float) Math.cos(f5);
    }

    @g1(version = "1.2")
    @f
    private static final float B0(float f5, float f6) {
        return Math.nextAfter(f5, f6);
    }

    @g1(version = "1.2")
    @f
    private static final double C(double d5) {
        return Math.cosh(d5);
    }

    @g1(version = "1.2")
    @f
    private static final double C0(double d5) {
        return Math.nextUp(d5);
    }

    @g1(version = "1.2")
    @f
    private static final float D(float f5) {
        return (float) Math.cosh(f5);
    }

    @g1(version = "1.2")
    @f
    private static final float D0(float f5) {
        return Math.nextUp(f5);
    }

    @g1(version = "1.2")
    @f
    private static final double E(double d5) {
        return Math.exp(d5);
    }

    @g1(version = "1.2")
    @f
    private static final double E0(double d5, double d6) {
        return Math.pow(d5, d6);
    }

    @g1(version = "1.2")
    @f
    private static final float F(float f5) {
        return (float) Math.exp(f5);
    }

    @g1(version = "1.2")
    @f
    private static final double F0(double d5, int i5) {
        return Math.pow(d5, i5);
    }

    @g1(version = "1.2")
    @f
    private static final double G(double d5) {
        return Math.expm1(d5);
    }

    @g1(version = "1.2")
    @f
    private static final float G0(float f5, float f6) {
        return (float) Math.pow(f5, f6);
    }

    @g1(version = "1.2")
    @f
    private static final float H(float f5) {
        return (float) Math.expm1(f5);
    }

    @g1(version = "1.2")
    @f
    private static final float H0(float f5, int i5) {
        return (float) Math.pow(f5, i5);
    }

    @g1(version = "1.2")
    @f
    private static final double I(double d5) {
        return Math.floor(d5);
    }

    @g1(version = "1.2")
    @f
    private static final double I0(double d5) {
        return Math.rint(d5);
    }

    @g1(version = "1.2")
    @f
    private static final float J(float f5) {
        return (float) Math.floor(f5);
    }

    @g1(version = "1.2")
    @f
    private static final float J0(float f5) {
        return (float) Math.rint(f5);
    }

    private static final double K(double d5) {
        return Math.abs(d5);
    }

    @g1(version = "1.2")
    public static int K0(double d5) {
        if (!Double.isNaN(d5)) {
            if (d5 > 2.147483647E9d) {
                return Integer.MAX_VALUE;
            }
            if (d5 < -2.147483648E9d) {
                return Integer.MIN_VALUE;
            }
            return (int) Math.round(d5);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    private static final float L(float f5) {
        return Math.abs(f5);
    }

    @g1(version = "1.2")
    public static int L0(float f5) {
        if (Float.isNaN(f5)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f5);
    }

    private static final int M(int i5) {
        return Math.abs(i5);
    }

    @g1(version = "1.2")
    public static long M0(double d5) {
        if (Double.isNaN(d5)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(d5);
    }

    private static final long N(long j5) {
        return Math.abs(j5);
    }

    @g1(version = "1.2")
    public static long N0(float f5) {
        long M0;
        M0 = M0(f5);
        return M0;
    }

    @g1(version = "1.2")
    @f
    public static /* synthetic */ void O(double d5) {
    }

    @g1(version = "1.2")
    @f
    private static final double O0(double d5) {
        return Math.signum(d5);
    }

    @g1(version = "1.2")
    @f
    public static /* synthetic */ void P(float f5) {
    }

    @g1(version = "1.2")
    @f
    private static final float P0(float f5) {
        return Math.signum(f5);
    }

    @g1(version = "1.2")
    @f
    public static /* synthetic */ void Q(int i5) {
    }

    @g1(version = "1.2")
    @f
    private static final double Q0(double d5) {
        return Math.sin(d5);
    }

    @g1(version = "1.2")
    @f
    public static /* synthetic */ void R(long j5) {
    }

    @g1(version = "1.2")
    @f
    private static final float R0(float f5) {
        return (float) Math.sin(f5);
    }

    private static final double S(double d5) {
        return Math.signum(d5);
    }

    @g1(version = "1.2")
    @f
    private static final double S0(double d5) {
        return Math.sinh(d5);
    }

    private static final float T(float f5) {
        return Math.signum(f5);
    }

    @g1(version = "1.2")
    @f
    private static final float T0(float f5) {
        return (float) Math.sinh(f5);
    }

    public static int U(int i5) {
        if (i5 < 0) {
            return -1;
        }
        return i5 > 0 ? 1 : 0;
    }

    @g1(version = "1.2")
    @f
    private static final double U0(double d5) {
        return Math.sqrt(d5);
    }

    public static int V(long j5) {
        if (j5 < 0) {
            return -1;
        }
        return j5 > 0 ? 1 : 0;
    }

    @g1(version = "1.2")
    @f
    private static final float V0(float f5) {
        return (float) Math.sqrt(f5);
    }

    @g1(version = "1.2")
    @f
    public static /* synthetic */ void W(double d5) {
    }

    @g1(version = "1.2")
    @f
    private static final double W0(double d5) {
        return Math.tan(d5);
    }

    @g1(version = "1.2")
    @f
    public static /* synthetic */ void X(float f5) {
    }

    @g1(version = "1.2")
    @f
    private static final float X0(float f5) {
        return (float) Math.tan(f5);
    }

    @g1(version = "1.2")
    public static /* synthetic */ void Y(int i5) {
    }

    @g1(version = "1.2")
    @f
    private static final double Y0(double d5) {
        return Math.tanh(d5);
    }

    @g1(version = "1.2")
    public static /* synthetic */ void Z(long j5) {
    }

    @g1(version = "1.2")
    @f
    private static final float Z0(float f5) {
        return (float) Math.tanh(f5);
    }

    private static final double a0(double d5) {
        return Math.ulp(d5);
    }

    @g1(version = "1.2")
    public static final double a1(double d5) {
        if (!Double.isNaN(d5) && !Double.isInfinite(d5)) {
            if (d5 > 0.0d) {
                return Math.floor(d5);
            }
            return Math.ceil(d5);
        }
        return d5;
    }

    private static final float b0(float f5) {
        return Math.ulp(f5);
    }

    @g1(version = "1.2")
    public static final float b1(float f5) {
        double ceil;
        if (!Float.isNaN(f5) && !Float.isInfinite(f5)) {
            if (f5 > 0.0f) {
                ceil = Math.floor(f5);
            } else {
                ceil = Math.ceil(f5);
            }
            return (float) ceil;
        }
        return f5;
    }

    @g1(version = "1.2")
    @f
    private static final double c(double d5, double d6) {
        return Math.IEEEremainder(d5, d6);
    }

    @g1(version = "1.2")
    @f
    public static /* synthetic */ void c0(double d5) {
    }

    @g1(version = "1.2")
    @f
    private static final double c1(double d5, double d6) {
        return Math.copySign(d5, d6);
    }

    @g1(version = "1.2")
    @f
    private static final float d(float f5, float f6) {
        return (float) Math.IEEEremainder(f5, f6);
    }

    @g1(version = "1.2")
    @f
    public static /* synthetic */ void d0(float f5) {
    }

    @g1(version = "1.2")
    @f
    private static final double d1(double d5, int i5) {
        return Math.copySign(d5, i5);
    }

    @g1(version = "1.2")
    @f
    private static final double e(double d5) {
        return Math.abs(d5);
    }

    @g1(version = "1.2")
    @f
    private static final double e0(double d5, double d6) {
        return Math.hypot(d5, d6);
    }

    @g1(version = "1.2")
    @f
    private static final float e1(float f5, float f6) {
        return Math.copySign(f5, f6);
    }

    @g1(version = "1.2")
    @f
    private static final float f(float f5) {
        return Math.abs(f5);
    }

    @g1(version = "1.2")
    @f
    private static final float f0(float f5, float f6) {
        return (float) Math.hypot(f5, f6);
    }

    @g1(version = "1.2")
    @f
    private static final float f1(float f5, int i5) {
        return Math.copySign(f5, i5);
    }

    @g1(version = "1.2")
    @f
    private static final int g(int i5) {
        return Math.abs(i5);
    }

    @g1(version = "1.2")
    @f
    private static final double g0(double d5) {
        return Math.log(d5);
    }

    @g1(version = "1.2")
    @f
    private static final long h(long j5) {
        return Math.abs(j5);
    }

    @g1(version = "1.2")
    @f
    private static final float h0(float f5) {
        return (float) Math.log(f5);
    }

    @g1(version = "1.2")
    @f
    private static final double i(double d5) {
        return Math.acos(d5);
    }

    @g1(version = "1.2")
    @f
    private static final double i0(double d5) {
        return Math.log1p(d5);
    }

    @g1(version = "1.2")
    @f
    private static final float j(float f5) {
        return (float) Math.acos(f5);
    }

    @g1(version = "1.2")
    @f
    private static final float j0(float f5) {
        return (float) Math.log1p(f5);
    }

    @g1(version = "1.2")
    public static final double k(double d5) {
        if (d5 < 1.0d) {
            return Double.NaN;
        }
        if (d5 > a.f19505f) {
            return Math.log(d5) + a.f19501b;
        }
        double d6 = 1;
        double d7 = d5 - d6;
        if (d7 >= a.f19504e) {
            return Math.log(d5 + Math.sqrt((d5 * d5) - d6));
        }
        double sqrt = Math.sqrt(d7);
        if (sqrt >= a.f19503d) {
            sqrt -= ((sqrt * sqrt) * sqrt) / 12;
        }
        return sqrt * Math.sqrt(2.0d);
    }

    @g1(version = "1.2")
    public static final double k0(double d5, double d6) {
        if (d6 <= 0.0d) {
            return Double.NaN;
        }
        if (d6 == 1.0d) {
            return Double.NaN;
        }
        return Math.log(d5) / Math.log(d6);
    }

    @g1(version = "1.2")
    @f
    private static final float l(float f5) {
        return (float) k(f5);
    }

    @g1(version = "1.2")
    public static final float l0(float f5, float f6) {
        if (f6 <= 0.0f) {
            return Float.NaN;
        }
        if (f6 == 1.0f) {
            return Float.NaN;
        }
        return (float) (Math.log(f5) / Math.log(f6));
    }

    @g1(version = "1.2")
    @f
    private static final double m(double d5) {
        return Math.asin(d5);
    }

    @g1(version = "1.2")
    @f
    private static final double m0(double d5) {
        return Math.log10(d5);
    }

    @g1(version = "1.2")
    @f
    private static final float n(float f5) {
        return (float) Math.asin(f5);
    }

    @g1(version = "1.2")
    @f
    private static final float n0(float f5) {
        return (float) Math.log10(f5);
    }

    @g1(version = "1.2")
    public static final double o(double d5) {
        double d6 = a.f19504e;
        if (d5 >= d6) {
            if (d5 > a.f19506g) {
                if (d5 > a.f19505f) {
                    return Math.log(d5) + a.f19501b;
                }
                double d7 = d5 * 2;
                return Math.log(d7 + (1 / d7));
            }
            return Math.log(d5 + Math.sqrt((d5 * d5) + 1));
        }
        if (d5 <= (-d6)) {
            return -o(-d5);
        }
        if (Math.abs(d5) >= a.f19503d) {
            return d5 - (((d5 * d5) * d5) / 6);
        }
        return d5;
    }

    @g1(version = "1.2")
    public static final double o0(double d5) {
        return Math.log(d5) / a.f19501b;
    }

    @g1(version = "1.2")
    @f
    private static final float p(float f5) {
        return (float) o(f5);
    }

    @g1(version = "1.2")
    public static final float p0(float f5) {
        return (float) (Math.log(f5) / a.f19501b);
    }

    @g1(version = "1.2")
    @f
    private static final double q(double d5) {
        return Math.atan(d5);
    }

    @g1(version = "1.2")
    @f
    private static final double q0(double d5, double d6) {
        return Math.max(d5, d6);
    }

    @g1(version = "1.2")
    @f
    private static final float r(float f5) {
        return (float) Math.atan(f5);
    }

    @g1(version = "1.2")
    @f
    private static final float r0(float f5, float f6) {
        return Math.max(f5, f6);
    }

    @g1(version = "1.2")
    @f
    private static final double s(double d5, double d6) {
        return Math.atan2(d5, d6);
    }

    @g1(version = "1.2")
    @f
    private static final int s0(int i5, int i6) {
        return Math.max(i5, i6);
    }

    @g1(version = "1.2")
    @f
    private static final float t(float f5, float f6) {
        return (float) Math.atan2(f5, f6);
    }

    @g1(version = "1.2")
    @f
    private static final long t0(long j5, long j6) {
        return Math.max(j5, j6);
    }

    @g1(version = "1.2")
    public static final double u(double d5) {
        if (Math.abs(d5) < a.f19504e) {
            if (Math.abs(d5) > a.f19503d) {
                return d5 + (((d5 * d5) * d5) / 3);
            }
            return d5;
        }
        double d6 = 1;
        return Math.log((d6 + d5) / (d6 - d5)) / 2;
    }

    @g1(version = "1.2")
    @f
    private static final double u0(double d5, double d6) {
        return Math.min(d5, d6);
    }

    @g1(version = "1.2")
    @f
    private static final float v(float f5) {
        return (float) u(f5);
    }

    @g1(version = "1.2")
    @f
    private static final float v0(float f5, float f6) {
        return Math.min(f5, f6);
    }

    @g1(version = "1.8")
    @f
    @v2(markerClass = {r.class})
    private static final double w(double d5) {
        return Math.cbrt(d5);
    }

    @g1(version = "1.2")
    @f
    private static final int w0(int i5, int i6) {
        return Math.min(i5, i6);
    }

    @g1(version = "1.8")
    @f
    @v2(markerClass = {r.class})
    private static final float x(float f5) {
        return (float) Math.cbrt(f5);
    }

    @g1(version = "1.2")
    @f
    private static final long x0(long j5, long j6) {
        return Math.min(j5, j6);
    }

    @g1(version = "1.2")
    @f
    private static final double y(double d5) {
        return Math.ceil(d5);
    }

    @g1(version = "1.2")
    @f
    private static final double y0(double d5) {
        return Math.nextAfter(d5, Double.NEGATIVE_INFINITY);
    }

    @g1(version = "1.2")
    @f
    private static final float z(float f5) {
        return (float) Math.ceil(f5);
    }

    @g1(version = "1.2")
    @f
    private static final float z0(float f5) {
        return Math.nextAfter(f5, Double.NEGATIVE_INFINITY);
    }
}
