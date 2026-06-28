package kotlin.time;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

@i0(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\u001a\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0002\u001a\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000bH\u0000\u001a\u0018\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000bH\u0000\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u001c\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\b¨\u0006\u0011"}, d2 = {"durationAssertionsEnabled", "", "getDurationAssertionsEnabled", "()Z", "precisionFormats", "", "Ljava/lang/ThreadLocal;", "Ljava/text/DecimalFormat;", "[Ljava/lang/ThreadLocal;", "createFormatForDecimals", "decimals", "", "formatToExactDecimals", "", t0.b.f22420d, "", "formatUpToDecimals", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nDurationJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DurationJvm.kt\nkotlin/time/DurationJvmKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,33:1\n1#2:34\n*E\n"})
/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f19817a = false;

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    private static final ThreadLocal<DecimalFormat>[] f19818b;

    static {
        ThreadLocal<DecimalFormat>[] threadLocalArr = new ThreadLocal[4];
        for (int i5 = 0; i5 < 4; i5++) {
            threadLocalArr[i5] = new ThreadLocal<>();
        }
        f19818b = threadLocalArr;
    }

    private static final DecimalFormat a(int i5) {
        DecimalFormat decimalFormat = new DecimalFormat("0");
        if (i5 > 0) {
            decimalFormat.setMinimumFractionDigits(i5);
        }
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        return decimalFormat;
    }

    @p4.l
    public static final String b(double d5, int i5) {
        DecimalFormat a5;
        ThreadLocal<DecimalFormat>[] threadLocalArr = f19818b;
        if (i5 < threadLocalArr.length) {
            ThreadLocal<DecimalFormat> threadLocal = threadLocalArr[i5];
            DecimalFormat decimalFormat = threadLocal.get();
            if (decimalFormat == null) {
                decimalFormat = a(i5);
                threadLocal.set(decimalFormat);
            } else {
                l0.o(decimalFormat, "get() ?: default().also(this::set)");
            }
            a5 = decimalFormat;
        } else {
            a5 = a(i5);
        }
        String format = a5.format(d5);
        l0.o(format, "format.format(value)");
        return format;
    }

    @p4.l
    public static final String c(double d5, int i5) {
        DecimalFormat a5 = a(0);
        a5.setMaximumFractionDigits(i5);
        String format = a5.format(d5);
        l0.o(format, "createFormatForDecimals(… }\n        .format(value)");
        return format;
    }

    public static final boolean d() {
        return f19817a;
    }
}
