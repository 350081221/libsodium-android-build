package kotlin.time;

import kotlin.g1;
import kotlin.i0;
import kotlin.time.s;

@i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ \u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u000bJ\u0018\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u0006H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0004H\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0019"}, d2 = {"Lkotlin/time/MonotonicTimeSource;", "Lkotlin/time/TimeSource$WithComparableMarks;", "()V", "zero", "", "adjustReading", "Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;", "timeMark", "duration", "Lkotlin/time/Duration;", "adjustReading-6QKq23U", "(JJ)J", "differenceBetween", "one", "another", "differenceBetween-fRLX17w", "elapsedFrom", "elapsedFrom-6eNON_k", "(J)J", "markNow", "markNow-z9LOYto", "()J", "read", "toString", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@g1(version = "1.3")
/* loaded from: classes4.dex */
public final class p implements s.c {

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    public static final p f19825b = new p();

    /* renamed from: c, reason: collision with root package name */
    private static final long f19826c = System.nanoTime();

    private p() {
    }

    private final long f() {
        return System.nanoTime() - f19826c;
    }

    @Override // kotlin.time.s.c, kotlin.time.s
    public /* bridge */ /* synthetic */ d a() {
        return s.b.a.h(e());
    }

    public final long b(long j5, long j6) {
        return s.b.a.k(m.d(j5, h.NANOSECONDS, j6));
    }

    public final long c(long j5, long j6) {
        return m.h(j5, j6, h.NANOSECONDS);
    }

    public final long d(long j5) {
        return m.f(f(), j5, h.NANOSECONDS);
    }

    public long e() {
        return s.b.a.k(f());
    }

    @p4.l
    public String toString() {
        return "TimeSource(System.nanoTime())";
    }

    @Override // kotlin.time.s
    public /* bridge */ /* synthetic */ r a() {
        return s.b.a.h(e());
    }
}
