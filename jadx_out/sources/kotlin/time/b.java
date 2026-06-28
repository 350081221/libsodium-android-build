package kotlin.time;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.d0;
import kotlin.f0;
import kotlin.g1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.time.d;
import kotlin.time.s;
import kotlin.v2;

@i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\bH\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\bH$R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u0012"}, d2 = {"Lkotlin/time/AbstractLongTimeSource;", "Lkotlin/time/TimeSource$WithComparableMarks;", "unit", "Lkotlin/time/DurationUnit;", "(Lkotlin/time/DurationUnit;)V", "getUnit", "()Lkotlin/time/DurationUnit;", "zero", "", "getZero", "()J", "zero$delegate", "Lkotlin/Lazy;", "adjustedRead", "markNow", "Lkotlin/time/ComparableTimeMark;", "read", "LongTimeMark", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@g1(version = "1.9")
@v2(markerClass = {l.class})
/* loaded from: classes4.dex */
public abstract class b implements s.c {

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    private final h f19805b;

    /* renamed from: c, reason: collision with root package name */
    @p4.l
    private final d0 f19806c;

    /* JADX INFO: Access modifiers changed from: private */
    @i0(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B \u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0002\u0010\bJ\u0015\u0010\n\u001a\u00020\u0007H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u001e\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0001H\u0096\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0007H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u001a\u001a\u00020\u001bH\u0016R\u0016\u0010\u0006\u001a\u00020\u0007X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\u001c"}, d2 = {"Lkotlin/time/AbstractLongTimeSource$LongTimeMark;", "Lkotlin/time/ComparableTimeMark;", "startedAt", "", "timeSource", "Lkotlin/time/AbstractLongTimeSource;", TypedValues.CycleType.S_WAVE_OFFSET, "Lkotlin/time/Duration;", "(JLkotlin/time/AbstractLongTimeSource;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "elapsedNow", "elapsedNow-UwyO8pc", "()J", "equals", "", "other", "", TTDownloadField.TT_HASHCODE, "", "minus", "minus-UwyO8pc", "(Lkotlin/time/ComparableTimeMark;)J", "plus", "duration", "plus-LRDsOJo", "(J)Lkotlin/time/ComparableTimeMark;", "toString", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nTimeSources.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimeSources.kt\nkotlin/time/AbstractLongTimeSource$LongTimeMark\n+ 2 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n1#1,199:1\n80#2:200\n*S KotlinDebug\n*F\n+ 1 TimeSources.kt\nkotlin/time/AbstractLongTimeSource$LongTimeMark\n*L\n67#1:200\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class a implements d {

        /* renamed from: a, reason: collision with root package name */
        private final long f19807a;

        /* renamed from: b, reason: collision with root package name */
        @p4.l
        private final b f19808b;

        /* renamed from: c, reason: collision with root package name */
        private final long f19809c;

        private a(long j5, b timeSource, long j6) {
            l0.p(timeSource, "timeSource");
            this.f19807a = j5;
            this.f19808b = timeSource;
            this.f19809c = j6;
        }

        public /* synthetic */ a(long j5, b bVar, long j6, w wVar) {
            this(j5, bVar, j6);
        }

        @Override // kotlin.time.r
        @p4.l
        public d b(long j5) {
            return d.a.d(this, j5);
        }

        @Override // kotlin.time.r
        public long c() {
            return e.g0(m.h(this.f19808b.c(), this.f19807a, this.f19808b.d()), this.f19809c);
        }

        @Override // kotlin.time.d
        public long d(@p4.l d other) {
            l0.p(other, "other");
            if (other instanceof a) {
                a aVar = (a) other;
                if (l0.g(this.f19808b, aVar.f19808b)) {
                    return e.h0(m.h(this.f19807a, aVar.f19807a, this.f19808b.d()), e.g0(this.f19809c, aVar.f19809c));
                }
            }
            throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + this + " and " + other);
        }

        @Override // kotlin.time.r
        public boolean e() {
            return d.a.c(this);
        }

        @Override // kotlin.time.d
        public boolean equals(@p4.m Object obj) {
            return (obj instanceof a) && l0.g(this.f19808b, ((a) obj).f19808b) && e.r(d((d) obj), e.f19812b.W());
        }

        @Override // kotlin.time.r
        public boolean f() {
            return d.a.b(this);
        }

        @Override // java.lang.Comparable
        /* renamed from: g */
        public int compareTo(@p4.l d dVar) {
            return d.a.a(this, dVar);
        }

        @Override // kotlin.time.d
        public int hashCode() {
            return (e.Z(this.f19809c) * 37) + Long.hashCode(this.f19807a);
        }

        @p4.l
        public String toString() {
            return "LongTimeMark(" + this.f19807a + k.h(this.f19808b.d()) + " + " + ((Object) e.u0(this.f19809c)) + ", " + this.f19808b + ')';
        }

        @Override // kotlin.time.r
        @p4.l
        public d a(long j5) {
            int V;
            h d5 = this.f19808b.d();
            if (e.d0(j5)) {
                return new a(m.d(this.f19807a, d5, j5), this.f19808b, e.f19812b.W(), null);
            }
            long x02 = e.x0(j5, d5);
            long h02 = e.h0(e.g0(j5, x02), this.f19809c);
            long d6 = m.d(this.f19807a, d5, x02);
            long x03 = e.x0(h02, d5);
            long d7 = m.d(d6, d5, x03);
            long g02 = e.g0(h02, x03);
            long O = e.O(g02);
            if (d7 != 0 && O != 0 && (d7 ^ O) < 0) {
                V = kotlin.math.d.V(O);
                long m02 = g.m0(V, d5);
                d7 = m.d(d7, d5, m02);
                g02 = e.g0(g02, m02);
            }
            if ((1 | (d7 - 1)) == Long.MAX_VALUE) {
                g02 = e.f19812b.W();
            }
            return new a(d7, this.f19808b, g02, null);
        }
    }

    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Long;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.time.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0567b extends n0 implements v3.a<Long> {
        C0567b() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // v3.a
        @p4.l
        public final Long invoke() {
            return Long.valueOf(b.this.f());
        }
    }

    public b(@p4.l h unit) {
        d0 c5;
        l0.p(unit, "unit");
        this.f19805b = unit;
        c5 = f0.c(new C0567b());
        this.f19806c = c5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long c() {
        return f() - e();
    }

    private final long e() {
        return ((Number) this.f19806c.getValue()).longValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @p4.l
    public final h d() {
        return this.f19805b;
    }

    protected abstract long f();

    @Override // kotlin.time.s
    @p4.l
    public d a() {
        return new a(c(), this, e.f19812b.W(), null);
    }
}
