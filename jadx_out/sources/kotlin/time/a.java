package kotlin.time;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.g1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.time.d;
import kotlin.time.s;

@g1(version = "1.3")
@kotlin.k(message = "Using AbstractDoubleTimeSource is no longer recommended, use AbstractLongTimeSource instead.")
@l
@i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001:\u0001\u000bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH$R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lkotlin/time/AbstractDoubleTimeSource;", "Lkotlin/time/TimeSource$WithComparableMarks;", "unit", "Lkotlin/time/DurationUnit;", "(Lkotlin/time/DurationUnit;)V", "getUnit", "()Lkotlin/time/DurationUnit;", "markNow", "Lkotlin/time/ComparableTimeMark;", "read", "", "DoubleTimeMark", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class a implements s.c {

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    private final h f19801b;

    /* JADX INFO: Access modifiers changed from: private */
    @i0(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B \u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0002\u0010\bJ\u0015\u0010\n\u001a\u00020\u0007H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u001e\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0001H\u0096\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0007H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u001a\u001a\u00020\u001bH\u0016R\u0016\u0010\u0006\u001a\u00020\u0007X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\u001c"}, d2 = {"Lkotlin/time/AbstractDoubleTimeSource$DoubleTimeMark;", "Lkotlin/time/ComparableTimeMark;", "startedAt", "", "timeSource", "Lkotlin/time/AbstractDoubleTimeSource;", TypedValues.CycleType.S_WAVE_OFFSET, "Lkotlin/time/Duration;", "(DLkotlin/time/AbstractDoubleTimeSource;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "elapsedNow", "elapsedNow-UwyO8pc", "()J", "equals", "", "other", "", TTDownloadField.TT_HASHCODE, "", "minus", "minus-UwyO8pc", "(Lkotlin/time/ComparableTimeMark;)J", "plus", "duration", "plus-LRDsOJo", "(J)Lkotlin/time/ComparableTimeMark;", "toString", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.time.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0566a implements d {

        /* renamed from: a, reason: collision with root package name */
        private final double f19802a;

        /* renamed from: b, reason: collision with root package name */
        @p4.l
        private final a f19803b;

        /* renamed from: c, reason: collision with root package name */
        private final long f19804c;

        private C0566a(double d5, a timeSource, long j5) {
            l0.p(timeSource, "timeSource");
            this.f19802a = d5;
            this.f19803b = timeSource;
            this.f19804c = j5;
        }

        public /* synthetic */ C0566a(double d5, a aVar, long j5, w wVar) {
            this(d5, aVar, j5);
        }

        @Override // kotlin.time.r
        @p4.l
        public d b(long j5) {
            return d.a.d(this, j5);
        }

        @Override // kotlin.time.r
        public long c() {
            return e.g0(g.l0(this.f19803b.c() - this.f19802a, this.f19803b.b()), this.f19804c);
        }

        @Override // kotlin.time.d
        public long d(@p4.l d other) {
            l0.p(other, "other");
            if (other instanceof C0566a) {
                C0566a c0566a = (C0566a) other;
                if (l0.g(this.f19803b, c0566a.f19803b)) {
                    if (e.r(this.f19804c, c0566a.f19804c) && e.d0(this.f19804c)) {
                        return e.f19812b.W();
                    }
                    long g02 = e.g0(this.f19804c, c0566a.f19804c);
                    long l02 = g.l0(this.f19802a - c0566a.f19802a, this.f19803b.b());
                    if (e.r(l02, e.y0(g02))) {
                        return e.f19812b.W();
                    }
                    return e.h0(l02, g02);
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
            return (obj instanceof C0566a) && l0.g(this.f19803b, ((C0566a) obj).f19803b) && e.r(d((d) obj), e.f19812b.W());
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
            return e.Z(e.h0(g.l0(this.f19802a, this.f19803b.b()), this.f19804c));
        }

        @p4.l
        public String toString() {
            return "DoubleTimeMark(" + this.f19802a + k.h(this.f19803b.b()) + " + " + ((Object) e.u0(this.f19804c)) + ", " + this.f19803b + ')';
        }

        @Override // kotlin.time.r
        @p4.l
        public d a(long j5) {
            return new C0566a(this.f19802a, this.f19803b, e.h0(this.f19804c, j5), null);
        }
    }

    public a(@p4.l h unit) {
        l0.p(unit, "unit");
        this.f19801b = unit;
    }

    @p4.l
    protected final h b() {
        return this.f19801b;
    }

    protected abstract double c();

    @Override // kotlin.time.s
    @p4.l
    public d a() {
        return new C0566a(c(), this, e.f19812b.W(), null);
    }
}
