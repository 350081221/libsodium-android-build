package kotlin.time;

import kotlin.b1;
import kotlin.g1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.ranges.u;
import kotlin.v2;

@i0(d1 = {"\u0000>\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b*\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a \u0010#\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u00012\u0006\u0010%\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0002\u0010&\u001a\u0018\u0010'\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0002\u0010\u0010\u001a\u0018\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0002\u0010\u0010\u001a\u0018\u0010+\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0002\u0010\u0010\u001a\u0018\u0010-\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0002\u0010\u0010\u001a\u0010\u0010/\u001a\u00020\u00012\u0006\u0010*\u001a\u00020\u0001H\u0002\u001a\u0010\u00100\u001a\u00020\u00012\u0006\u0010.\u001a\u00020\u0001H\u0002\u001a \u00101\u001a\u00020\u00072\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u000205H\u0002ø\u0001\u0000¢\u0006\u0002\u00106\u001a\u0010\u00107\u001a\u00020\u00012\u0006\u00102\u001a\u000203H\u0002\u001a)\u00108\u001a\u00020\u0005*\u0002032\u0006\u00109\u001a\u00020\u00052\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u0002050;H\u0082\b\u001a)\u0010=\u001a\u000203*\u0002032\u0006\u00109\u001a\u00020\u00052\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u0002050;H\u0082\b\u001a\u001f\u0010>\u001a\u00020\u0007*\u00020\b2\u0006\u0010?\u001a\u00020\u0007H\u0087\nø\u0001\u0000¢\u0006\u0004\b@\u0010A\u001a\u001f\u0010>\u001a\u00020\u0007*\u00020\u00052\u0006\u0010?\u001a\u00020\u0007H\u0087\nø\u0001\u0000¢\u0006\u0004\bB\u0010C\u001a\u001c\u0010D\u001a\u00020\u0007*\u00020\b2\u0006\u0010E\u001a\u00020FH\u0007ø\u0001\u0000¢\u0006\u0002\u0010G\u001a\u001c\u0010D\u001a\u00020\u0007*\u00020\u00052\u0006\u0010E\u001a\u00020FH\u0007ø\u0001\u0000¢\u0006\u0002\u0010H\u001a\u001c\u0010D\u001a\u00020\u0007*\u00020\u00012\u0006\u0010E\u001a\u00020FH\u0007ø\u0001\u0000¢\u0006\u0002\u0010I\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000\"!\u0010\u0006\u001a\u00020\u0007*\u00020\b8FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"!\u0010\u0006\u001a\u00020\u0007*\u00020\u00058FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\t\u0010\r\u001a\u0004\b\u000b\u0010\u000e\"!\u0010\u0006\u001a\u00020\u0007*\u00020\u00018FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\t\u0010\u000f\u001a\u0004\b\u000b\u0010\u0010\"!\u0010\u0011\u001a\u00020\u0007*\u00020\b8FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0012\u0010\n\u001a\u0004\b\u0013\u0010\f\"!\u0010\u0011\u001a\u00020\u0007*\u00020\u00058FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000e\"!\u0010\u0011\u001a\u00020\u0007*\u00020\u00018FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0010\"!\u0010\u0014\u001a\u00020\u0007*\u00020\b8FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0015\u0010\n\u001a\u0004\b\u0016\u0010\f\"!\u0010\u0014\u001a\u00020\u0007*\u00020\u00058FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0015\u0010\r\u001a\u0004\b\u0016\u0010\u000e\"!\u0010\u0014\u001a\u00020\u0007*\u00020\u00018FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0010\"!\u0010\u0017\u001a\u00020\u0007*\u00020\b8FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0018\u0010\n\u001a\u0004\b\u0019\u0010\f\"!\u0010\u0017\u001a\u00020\u0007*\u00020\u00058FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0018\u0010\r\u001a\u0004\b\u0019\u0010\u000e\"!\u0010\u0017\u001a\u00020\u0007*\u00020\u00018FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0018\u0010\u000f\u001a\u0004\b\u0019\u0010\u0010\"!\u0010\u001a\u001a\u00020\u0007*\u00020\b8FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001b\u0010\n\u001a\u0004\b\u001c\u0010\f\"!\u0010\u001a\u001a\u00020\u0007*\u00020\u00058FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001b\u0010\r\u001a\u0004\b\u001c\u0010\u000e\"!\u0010\u001a\u001a\u00020\u0007*\u00020\u00018FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001b\u0010\u000f\u001a\u0004\b\u001c\u0010\u0010\"!\u0010\u001d\u001a\u00020\u0007*\u00020\b8FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001e\u0010\n\u001a\u0004\b\u001f\u0010\f\"!\u0010\u001d\u001a\u00020\u0007*\u00020\u00058FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001e\u0010\r\u001a\u0004\b\u001f\u0010\u000e\"!\u0010\u001d\u001a\u00020\u0007*\u00020\u00018FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001e\u0010\u000f\u001a\u0004\b\u001f\u0010\u0010\"!\u0010 \u001a\u00020\u0007*\u00020\b8FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b!\u0010\n\u001a\u0004\b\"\u0010\f\"!\u0010 \u001a\u00020\u0007*\u00020\u00058FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b!\u0010\r\u001a\u0004\b\"\u0010\u000e\"!\u0010 \u001a\u00020\u0007*\u00020\u00018FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b!\u0010\u000f\u001a\u0004\b\"\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006J"}, d2 = {"MAX_MILLIS", "", "MAX_NANOS", "MAX_NANOS_IN_MILLIS", "NANOS_IN_MILLIS", "", "days", "Lkotlin/time/Duration;", "", "getDays$annotations", "(D)V", "getDays", "(D)J", "(I)V", "(I)J", "(J)V", "(J)J", "hours", "getHours$annotations", "getHours", "microseconds", "getMicroseconds$annotations", "getMicroseconds", "milliseconds", "getMilliseconds$annotations", "getMilliseconds", "minutes", "getMinutes$annotations", "getMinutes", "nanoseconds", "getNanoseconds$annotations", "getNanoseconds", "seconds", "getSeconds$annotations", "getSeconds", "durationOf", "normalValue", "unitDiscriminator", "(JI)J", "durationOfMillis", "normalMillis", "durationOfMillisNormalized", "millis", "durationOfNanos", "normalNanos", "durationOfNanosNormalized", "nanos", "millisToNanos", "nanosToMillis", "parseDuration", t0.b.f22420d, "", "strictIso", "", "(Ljava/lang/String;Z)J", "parseOverLongIsoComponent", "skipWhile", "startIndex", "predicate", "Lkotlin/Function1;", "", "substringWhile", "times", "duration", "times-kIfJnKk", "(DJ)J", "times-mvk6XK0", "(IJ)J", "toDuration", "unit", "Lkotlin/time/DurationUnit;", "(DLkotlin/time/DurationUnit;)J", "(ILkotlin/time/DurationUnit;)J", "(JLkotlin/time/DurationUnit;)J", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nDuration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Duration.kt\nkotlin/time/DurationKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1495:1\n1447#1,6:1497\n1450#1,3:1503\n1447#1,6:1506\n1447#1,6:1512\n1450#1,3:1521\n1#2:1496\n1726#3,3:1518\n*S KotlinDebug\n*F\n+ 1 Duration.kt\nkotlin/time/DurationKt\n*L\n1371#1:1497,6\n1405#1:1503,3\n1408#1:1506,6\n1411#1:1512,6\n1447#1:1521,3\n1436#1:1518,3\n*E\n"})
/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a */
    public static final int f19819a = 1000000;

    /* renamed from: b */
    public static final long f19820b = 4611686018426999999L;

    /* renamed from: c */
    public static final long f19821c = 4611686018427387903L;

    /* renamed from: d */
    private static final long f19822d = 4611686018426L;

    @g1(version = "1.3")
    @kotlin.k(message = "Use 'Double.microseconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "this.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
    @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @l
    public static /* synthetic */ void C(double d5) {
    }

    @g1(version = "1.3")
    @kotlin.k(message = "Use 'Int.microseconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "this.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
    @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @l
    public static /* synthetic */ void D(int i5) {
    }

    @g1(version = "1.3")
    @kotlin.k(message = "Use 'Long.microseconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "this.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
    @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @l
    public static /* synthetic */ void E(long j5) {
    }

    @g1(version = "1.3")
    @kotlin.k(message = "Use 'Double.milliseconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "this.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
    @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @l
    public static /* synthetic */ void I(double d5) {
    }

    @g1(version = "1.3")
    @kotlin.k(message = "Use 'Int.milliseconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "this.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
    @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @l
    public static /* synthetic */ void J(int i5) {
    }

    @g1(version = "1.3")
    @kotlin.k(message = "Use 'Long.milliseconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "this.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
    @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @l
    public static /* synthetic */ void K(long j5) {
    }

    @g1(version = "1.3")
    @kotlin.k(message = "Use 'Double.minutes' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "this.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
    @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @l
    public static /* synthetic */ void O(double d5) {
    }

    @g1(version = "1.3")
    @kotlin.k(message = "Use 'Int.minutes' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "this.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
    @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @l
    public static /* synthetic */ void P(int i5) {
    }

    @g1(version = "1.3")
    @kotlin.k(message = "Use 'Long.minutes' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "this.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
    @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @l
    public static /* synthetic */ void Q(long j5) {
    }

    @g1(version = "1.3")
    @kotlin.k(message = "Use 'Double.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "this.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
    @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @l
    public static /* synthetic */ void U(double d5) {
    }

    @g1(version = "1.3")
    @kotlin.k(message = "Use 'Int.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "this.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
    @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @l
    public static /* synthetic */ void V(int i5) {
    }

    @g1(version = "1.3")
    @kotlin.k(message = "Use 'Long.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "this.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
    @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @l
    public static /* synthetic */ void W(long j5) {
    }

    @g1(version = "1.3")
    @kotlin.k(message = "Use 'Double.seconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "this.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
    @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @l
    public static /* synthetic */ void a0(double d5) {
    }

    @g1(version = "1.3")
    @kotlin.k(message = "Use 'Int.seconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "this.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
    @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @l
    public static /* synthetic */ void b0(int i5) {
    }

    @g1(version = "1.3")
    @kotlin.k(message = "Use 'Long.seconds' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "this.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
    @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @l
    public static /* synthetic */ void c0(long j5) {
    }

    public static final long d0(long j5) {
        return j5 * 1000000;
    }

    public static final long e0(long j5) {
        return j5 / 1000000;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009a A[LOOP:1: B:25:0x006c->B:33:0x009a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a6 A[EDGE_INSN: B:34:0x00a6->B:35:0x00a6 BREAK  A[LOOP:1: B:25:0x006c->B:33:0x009a], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long f0(java.lang.String r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 727
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.time.g.f0(java.lang.String, boolean):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final long g0(java.lang.String r9) {
        /*
            int r0 = r9.length()
            r1 = 0
            r2 = 2
            r3 = 1
            r4 = 0
            if (r0 <= 0) goto L18
            java.lang.String r5 = "+-"
            char r6 = r9.charAt(r4)
            boolean r5 = kotlin.text.v.S2(r5, r6, r4, r2, r1)
            if (r5 == 0) goto L18
            r5 = r3
            goto L19
        L18:
            r5 = r4
        L19:
            int r0 = r0 - r5
            r6 = 16
            if (r0 <= r6) goto L6e
            kotlin.ranges.l r0 = new kotlin.ranges.l
            int r6 = kotlin.text.v.g3(r9)
            r0.<init>(r5, r6)
            boolean r5 = r0 instanceof java.util.Collection
            if (r5 == 0) goto L36
            r5 = r0
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L36
        L34:
            r0 = r3
            goto L5b
        L36:
            java.util.Iterator r0 = r0.iterator()
        L3a:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L34
            r5 = r0
            kotlin.collections.s0 r5 = (kotlin.collections.s0) r5
            int r5 = r5.nextInt()
            kotlin.ranges.c r6 = new kotlin.ranges.c
            r7 = 48
            r8 = 57
            r6.<init>(r7, r8)
            char r5 = r9.charAt(r5)
            boolean r5 = r6.l(r5)
            if (r5 != 0) goto L3a
            r0 = r4
        L5b:
            if (r0 == 0) goto L6e
            char r9 = r9.charAt(r4)
            r0 = 45
            if (r9 != r0) goto L68
            r0 = -9223372036854775808
            goto L6d
        L68:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L6d:
            return r0
        L6e:
            java.lang.String r0 = "+"
            boolean r0 = kotlin.text.v.s2(r9, r0, r4, r2, r1)
            if (r0 == 0) goto L7a
            java.lang.String r9 = kotlin.text.v.y6(r9, r3)
        L7a:
            long r0 = java.lang.Long.parseLong(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.time.g.g0(java.lang.String):long");
    }

    private static final int h0(String str, int i5, v3.l<? super Character, Boolean> lVar) {
        while (i5 < str.length() && lVar.invoke(Character.valueOf(str.charAt(i5))).booleanValue()) {
            i5++;
        }
        return i5;
    }

    public static final long i(long j5, int i5) {
        return e.m((j5 << 1) + i5);
    }

    private static final String i0(String str, int i5, v3.l<? super Character, Boolean> lVar) {
        int i6 = i5;
        while (i6 < str.length() && lVar.invoke(Character.valueOf(str.charAt(i6))).booleanValue()) {
            i6++;
        }
        l0.n(str, "null cannot be cast to non-null type java.lang.String");
        String substring = str.substring(i5, i6);
        l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final long j(long j5) {
        return e.m((j5 << 1) + 1);
    }

    @g1(version = "1.6")
    @kotlin.internal.f
    @v2(markerClass = {l.class})
    private static final long j0(double d5, long j5) {
        return e.i0(j5, d5);
    }

    public static final long k(long j5) {
        long K;
        if (new kotlin.ranges.o(-4611686018426L, f19822d).l(j5)) {
            return l(d0(j5));
        }
        K = u.K(j5, -4611686018427387903L, f19821c);
        return j(K);
    }

    @g1(version = "1.6")
    @kotlin.internal.f
    @v2(markerClass = {l.class})
    private static final long k0(int i5, long j5) {
        return e.j0(j5, i5);
    }

    public static final long l(long j5) {
        return e.m(j5 << 1);
    }

    @g1(version = "1.6")
    @v2(markerClass = {l.class})
    public static final long l0(double d5, @p4.l h unit) {
        long M0;
        long M02;
        l0.p(unit, "unit");
        double a5 = j.a(d5, unit, h.NANOSECONDS);
        if (!Double.isNaN(a5)) {
            M0 = kotlin.math.d.M0(a5);
            if (new kotlin.ranges.o(-4611686018426999999L, f19820b).l(M0)) {
                return l(M0);
            }
            M02 = kotlin.math.d.M0(j.a(d5, unit, h.MILLISECONDS));
            return k(M02);
        }
        throw new IllegalArgumentException("Duration value cannot be NaN.".toString());
    }

    public static final long m(long j5) {
        if (new kotlin.ranges.o(-4611686018426999999L, f19820b).l(j5)) {
            return l(j5);
        }
        return j(e0(j5));
    }

    @g1(version = "1.6")
    @v2(markerClass = {l.class})
    public static final long m0(int i5, @p4.l h unit) {
        l0.p(unit, "unit");
        if (unit.compareTo(h.SECONDS) <= 0) {
            return l(j.c(i5, unit, h.NANOSECONDS));
        }
        return n0(i5, unit);
    }

    @g1(version = "1.6")
    @v2(markerClass = {l.class})
    public static final long n0(long j5, @p4.l h unit) {
        long K;
        l0.p(unit, "unit");
        h hVar = h.NANOSECONDS;
        long c5 = j.c(f19820b, hVar, unit);
        if (new kotlin.ranges.o(-c5, c5).l(j5)) {
            return l(j.c(j5, unit, hVar));
        }
        K = u.K(j.b(j5, unit, h.MILLISECONDS), -4611686018427387903L, f19821c);
        return j(K);
    }

    @g1(version = "1.3")
    @kotlin.k(message = "Use 'Double.days' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "this.days", imports = {"kotlin.time.Duration.Companion.days"}))
    @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @l
    public static /* synthetic */ void q(double d5) {
    }

    @g1(version = "1.3")
    @kotlin.k(message = "Use 'Int.days' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "this.days", imports = {"kotlin.time.Duration.Companion.days"}))
    @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @l
    public static /* synthetic */ void r(int i5) {
    }

    @g1(version = "1.3")
    @kotlin.k(message = "Use 'Long.days' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "this.days", imports = {"kotlin.time.Duration.Companion.days"}))
    @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @l
    public static /* synthetic */ void s(long j5) {
    }

    @g1(version = "1.3")
    @kotlin.k(message = "Use 'Double.hours' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "this.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
    @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @l
    public static /* synthetic */ void w(double d5) {
    }

    @g1(version = "1.3")
    @kotlin.k(message = "Use 'Int.hours' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "this.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
    @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @l
    public static /* synthetic */ void x(int i5) {
    }

    @g1(version = "1.3")
    @kotlin.k(message = "Use 'Long.hours' extension property from Duration.Companion instead.", replaceWith = @b1(expression = "this.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
    @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @l
    public static /* synthetic */ void y(long j5) {
    }
}
