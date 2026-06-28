package kotlin.time;

import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.time.r;

@i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B\u0018\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0002\u0010\u0005J\u0015\u0010\u000b\u001a\u00020\u0004H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u0007J\u001b\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u0004H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0011"}, d2 = {"Lkotlin/time/AdjustedTimeMark;", "Lkotlin/time/TimeMark;", "mark", "adjustment", "Lkotlin/time/Duration;", "(Lkotlin/time/TimeMark;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAdjustment-UwyO8pc", "()J", "J", "getMark", "()Lkotlin/time/TimeMark;", "elapsedNow", "elapsedNow-UwyO8pc", "plus", "duration", "plus-LRDsOJo", "(J)Lkotlin/time/TimeMark;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class c implements r {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final r f19810a;

    /* renamed from: b, reason: collision with root package name */
    private final long f19811b;

    private c(r mark, long j5) {
        l0.p(mark, "mark");
        this.f19810a = mark;
        this.f19811b = j5;
    }

    public /* synthetic */ c(r rVar, long j5, w wVar) {
        this(rVar, j5);
    }

    @Override // kotlin.time.r
    @p4.l
    public r a(long j5) {
        return new c(this.f19810a, e.h0(this.f19811b, j5), null);
    }

    @Override // kotlin.time.r
    @p4.l
    public r b(long j5) {
        return r.a.c(this, j5);
    }

    @Override // kotlin.time.r
    public long c() {
        return e.g0(this.f19810a.c(), this.f19811b);
    }

    @Override // kotlin.time.r
    public boolean e() {
        return r.a.b(this);
    }

    @Override // kotlin.time.r
    public boolean f() {
        return r.a.a(this);
    }

    public final long h() {
        return this.f19811b;
    }

    @p4.l
    public final r i() {
        return this.f19810a;
    }
}
