package kotlin.time;

import com.umeng.analytics.pro.bi;
import kotlin.g1;
import kotlin.i0;
import kotlin.jvm.internal.l0;

@i0(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0001\u001a\u0010\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\bH\u0001\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\u0001H\u0001¨\u0006\t"}, d2 = {"durationUnitByIsoChar", "Lkotlin/time/DurationUnit;", "isoChar", "", "isTimeComponent", "", "durationUnitByShortName", "shortName", "", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/time/DurationUnitKt")
/* loaded from: classes4.dex */
class k extends j {

    @i0(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19824a;

        static {
            int[] iArr = new int[h.values().length];
            try {
                iArr[h.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[h.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[h.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[h.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[h.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[h.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f19824a = iArr;
        }
    }

    @p4.l
    @g1(version = "1.5")
    public static final h f(char c5, boolean z4) {
        if (!z4) {
            if (c5 == 'D') {
                return h.DAYS;
            }
            throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + c5);
        }
        if (c5 == 'H') {
            return h.HOURS;
        }
        if (c5 == 'M') {
            return h.MINUTES;
        }
        if (c5 == 'S') {
            return h.SECONDS;
        }
        throw new IllegalArgumentException("Invalid duration ISO time unit: " + c5);
    }

    @p4.l
    @g1(version = "1.5")
    public static final h g(@p4.l String shortName) {
        l0.p(shortName, "shortName");
        int hashCode = shortName.hashCode();
        if (hashCode != 100) {
            if (hashCode != 104) {
                if (hashCode != 109) {
                    if (hashCode != 115) {
                        if (hashCode != 3494) {
                            if (hashCode != 3525) {
                                if (hashCode == 3742 && shortName.equals("us")) {
                                    return h.MICROSECONDS;
                                }
                            } else if (shortName.equals("ns")) {
                                return h.NANOSECONDS;
                            }
                        } else if (shortName.equals("ms")) {
                            return h.MILLISECONDS;
                        }
                    } else if (shortName.equals(bi.aE)) {
                        return h.SECONDS;
                    }
                } else if (shortName.equals("m")) {
                    return h.MINUTES;
                }
            } else if (shortName.equals(bi.aJ)) {
                return h.HOURS;
            }
        } else if (shortName.equals("d")) {
            return h.DAYS;
        }
        throw new IllegalArgumentException("Unknown duration unit short name: " + shortName);
    }

    @p4.l
    @g1(version = "1.3")
    public static final String h(@p4.l h hVar) {
        l0.p(hVar, "<this>");
        switch (a.f19824a[hVar.ordinal()]) {
            case 1:
                return "ns";
            case 2:
                return "us";
            case 3:
                return "ms";
            case 4:
                return bi.aE;
            case 5:
                return "m";
            case 6:
                return bi.aJ;
            case 7:
                return "d";
            default:
                throw new IllegalStateException(("Unknown unit: " + hVar).toString());
        }
    }
}
