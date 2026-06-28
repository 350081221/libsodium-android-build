package kotlin.time;

import java.util.concurrent.TimeUnit;
import kotlin.g1;
import kotlin.i0;
import kotlin.j0;
import kotlin.jvm.internal.l0;
import kotlin.v2;

@i0(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0001\u001a \u0010\u0000\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0001\u001a \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0001\u001a\f\u0010\b\u001a\u00020\u0004*\u00020\tH\u0007\u001a\f\u0010\n\u001a\u00020\t*\u00020\u0004H\u0007¨\u0006\u000b"}, d2 = {"convertDurationUnit", "", t0.b.f22420d, "sourceUnit", "Lkotlin/time/DurationUnit;", "targetUnit", "", "convertDurationUnitOverflow", "toDurationUnit", "Ljava/util/concurrent/TimeUnit;", "toTimeUnit", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/time/DurationUnitKt")
/* loaded from: classes4.dex */
class j {

    @i0(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19823a;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TimeUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TimeUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TimeUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TimeUnit.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f19823a = iArr;
        }
    }

    @g1(version = "1.3")
    public static final double a(double d5, @p4.l h sourceUnit, @p4.l h targetUnit) {
        l0.p(sourceUnit, "sourceUnit");
        l0.p(targetUnit, "targetUnit");
        long convert = targetUnit.getTimeUnit$kotlin_stdlib().convert(1L, sourceUnit.getTimeUnit$kotlin_stdlib());
        if (convert > 0) {
            return d5 * convert;
        }
        return d5 / sourceUnit.getTimeUnit$kotlin_stdlib().convert(1L, targetUnit.getTimeUnit$kotlin_stdlib());
    }

    @g1(version = "1.5")
    public static final long b(long j5, @p4.l h sourceUnit, @p4.l h targetUnit) {
        l0.p(sourceUnit, "sourceUnit");
        l0.p(targetUnit, "targetUnit");
        return targetUnit.getTimeUnit$kotlin_stdlib().convert(j5, sourceUnit.getTimeUnit$kotlin_stdlib());
    }

    @g1(version = "1.5")
    public static final long c(long j5, @p4.l h sourceUnit, @p4.l h targetUnit) {
        l0.p(sourceUnit, "sourceUnit");
        l0.p(targetUnit, "targetUnit");
        return targetUnit.getTimeUnit$kotlin_stdlib().convert(j5, sourceUnit.getTimeUnit$kotlin_stdlib());
    }

    @p4.l
    @g1(version = "1.8")
    @v2(markerClass = {l.class})
    public static final h d(@p4.l TimeUnit timeUnit) {
        l0.p(timeUnit, "<this>");
        switch (a.f19823a[timeUnit.ordinal()]) {
            case 1:
                return h.NANOSECONDS;
            case 2:
                return h.MICROSECONDS;
            case 3:
                return h.MILLISECONDS;
            case 4:
                return h.SECONDS;
            case 5:
                return h.MINUTES;
            case 6:
                return h.HOURS;
            case 7:
                return h.DAYS;
            default:
                throw new j0();
        }
    }

    @p4.l
    @g1(version = "1.8")
    @v2(markerClass = {l.class})
    public static final TimeUnit e(@p4.l h hVar) {
        l0.p(hVar, "<this>");
        return hVar.getTimeUnit$kotlin_stdlib();
    }
}
