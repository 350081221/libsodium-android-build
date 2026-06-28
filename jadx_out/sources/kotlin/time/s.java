package kotlin.time;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.g1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.time.d;
import kotlin.v2;

@i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000 \u00042\u00020\u0001:\u0003\u0004\u0005\u0006J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0007"}, d2 = {"Lkotlin/time/TimeSource;", "", "markNow", "Lkotlin/time/TimeMark;", "Companion", "Monotonic", "WithComparableMarks", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@g1(version = "1.9")
@v2(markerClass = {l.class})
/* loaded from: classes4.dex */
public interface s {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    public static final a f19828a = a.f19829a;

    @i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/time/TimeSource$Companion;", "", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f19829a = new a();

        private a() {
        }
    }

    @i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\tB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016\u0082\u0002\b\n\u0002\b!\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lkotlin/time/TimeSource$Monotonic;", "Lkotlin/time/TimeSource$WithComparableMarks;", "()V", "markNow", "Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;", "markNow-z9LOYto", "()J", "toString", "", "ValueTimeMark", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class b implements c {

        /* renamed from: b, reason: collision with root package name */
        @p4.l
        public static final b f19830b = new b();

        @g1(version = "1.9")
        @u3.f
        @v2(markerClass = {l.class})
        @i0(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u0018\b\u0000\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\rH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u0006J\u001a\u0010\u000f\u001a\u00020\u00102\b\u0010\t\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0018\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001e\u0010\u001c\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0001H\u0096\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\rH\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u001b\u0010\u001c\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\"\u0010!J\u001b\u0010#\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\rH\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b$\u0010!J\u0010\u0010%\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(R\u0012\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004X\u0080\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00060\u0003j\u0002`\u0004ø\u0001\u0000\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006)"}, d2 = {"Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;", "Lkotlin/time/ComparableTimeMark;", "reading", "", "Lkotlin/time/ValueTimeMarkReading;", "constructor-impl", "(J)J", "compareTo", "", "other", "compareTo-6eNON_k", "(JJ)I", "elapsedNow", "Lkotlin/time/Duration;", "elapsedNow-UwyO8pc", "equals", "", "", "equals-impl", "(JLjava/lang/Object;)Z", "hasNotPassedNow", "hasNotPassedNow-impl", "(J)Z", "hasPassedNow", "hasPassedNow-impl", TTDownloadField.TT_HASHCODE, "hashCode-impl", "(J)I", "minus", "minus-UwyO8pc", "(JLkotlin/time/ComparableTimeMark;)J", "duration", "minus-LRDsOJo", "(JJ)J", "minus-6eNON_k", "plus", "plus-LRDsOJo", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class a implements d {

            /* renamed from: a, reason: collision with root package name */
            private final long f19831a;

            private /* synthetic */ a(long j5) {
                this.f19831a = j5;
            }

            public static final /* synthetic */ a h(long j5) {
                return new a(j5);
            }

            public static final int i(long j5, long j6) {
                return e.l(r(j5, j6), e.f19812b.W());
            }

            public static int j(long j5, @p4.l d other) {
                l0.p(other, "other");
                return h(j5).compareTo(other);
            }

            public static long k(long j5) {
                return j5;
            }

            public static long l(long j5) {
                return p.f19825b.d(j5);
            }

            public static boolean m(long j5, Object obj) {
                return (obj instanceof a) && j5 == ((a) obj).y();
            }

            public static final boolean n(long j5, long j6) {
                return j5 == j6;
            }

            public static boolean o(long j5) {
                return e.e0(l(j5));
            }

            public static boolean p(long j5) {
                return !e.e0(l(j5));
            }

            public static int q(long j5) {
                return Long.hashCode(j5);
            }

            public static final long r(long j5, long j6) {
                return p.f19825b.c(j5, j6);
            }

            public static long t(long j5, long j6) {
                return p.f19825b.b(j5, e.y0(j6));
            }

            public static long u(long j5, @p4.l d other) {
                l0.p(other, "other");
                if (other instanceof a) {
                    return r(j5, ((a) other).y());
                }
                throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + ((Object) x(j5)) + " and " + other);
            }

            public static long w(long j5, long j6) {
                return p.f19825b.b(j5, j6);
            }

            public static String x(long j5) {
                return "ValueTimeMark(reading=" + j5 + ')';
            }

            @Override // kotlin.time.d, kotlin.time.r
            public /* bridge */ /* synthetic */ d a(long j5) {
                return h(v(j5));
            }

            @Override // kotlin.time.d, kotlin.time.r
            public /* bridge */ /* synthetic */ d b(long j5) {
                return h(s(j5));
            }

            @Override // kotlin.time.r
            public long c() {
                return l(this.f19831a);
            }

            @Override // kotlin.time.d
            public long d(@p4.l d other) {
                l0.p(other, "other");
                return u(this.f19831a, other);
            }

            @Override // kotlin.time.r
            public boolean e() {
                return p(this.f19831a);
            }

            @Override // kotlin.time.d
            public boolean equals(Object obj) {
                return m(this.f19831a, obj);
            }

            @Override // kotlin.time.r
            public boolean f() {
                return o(this.f19831a);
            }

            @Override // java.lang.Comparable
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public int compareTo(@p4.l d dVar) {
                return d.a.a(this, dVar);
            }

            @Override // kotlin.time.d
            public int hashCode() {
                return q(this.f19831a);
            }

            public long s(long j5) {
                return t(this.f19831a, j5);
            }

            public String toString() {
                return x(this.f19831a);
            }

            public long v(long j5) {
                return w(this.f19831a, j5);
            }

            public final /* synthetic */ long y() {
                return this.f19831a;
            }

            @Override // kotlin.time.r
            public /* bridge */ /* synthetic */ r a(long j5) {
                return h(v(j5));
            }

            @Override // kotlin.time.r
            public /* bridge */ /* synthetic */ r b(long j5) {
                return h(s(j5));
            }
        }

        private b() {
        }

        @Override // kotlin.time.s.c, kotlin.time.s
        public /* bridge */ /* synthetic */ d a() {
            return a.h(b());
        }

        public long b() {
            return p.f19825b.e();
        }

        @p4.l
        public String toString() {
            return p.f19825b.toString();
        }

        @Override // kotlin.time.s
        public /* bridge */ /* synthetic */ r a() {
            return a.h(b());
        }
    }

    @g1(version = "1.9")
    @v2(markerClass = {l.class})
    @i0(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lkotlin/time/TimeSource$WithComparableMarks;", "Lkotlin/time/TimeSource;", "markNow", "Lkotlin/time/ComparableTimeMark;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public interface c extends s {
        @Override // kotlin.time.s
        @p4.l
        d a();
    }

    @p4.l
    r a();
}
