package kotlin.time;

import kotlin.g1;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.v2;

@g1(version = "1.9")
@v2(markerClass = {l.class})
@i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\f\u0010\nJ\b\u0010\r\u001a\u00020\u0004H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lkotlin/time/TestTimeSource;", "Lkotlin/time/AbstractLongTimeSource;", "()V", "reading", "", "overflow", "", "duration", "Lkotlin/time/Duration;", "overflow-LRDsOJo", "(J)V", "plusAssign", "plusAssign-LRDsOJo", "read", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nTimeSources.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimeSources.kt\nkotlin/time/TestTimeSource\n+ 2 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n1#1,199:1\n80#2:200\n80#2:201\n*S KotlinDebug\n*F\n+ 1 TimeSources.kt\nkotlin/time/TestTimeSource\n*L\n173#1:200\n180#1:201\n*E\n"})
/* loaded from: classes4.dex */
public final class q extends b {

    /* renamed from: d, reason: collision with root package name */
    private long f19827d;

    public q() {
        super(h.NANOSECONDS);
        a();
    }

    private final void g(long j5) {
        throw new IllegalStateException("TestTimeSource will overflow if its reading " + this.f19827d + k.h(d()) + " is advanced by " + ((Object) e.u0(j5)) + external.org.apache.commons.lang3.d.f15957a);
    }

    @Override // kotlin.time.b
    protected long f() {
        return this.f19827d;
    }

    public final void h(long j5) {
        boolean z4;
        long r02 = e.r0(j5, d());
        boolean z5 = true;
        if (((r02 - 1) | 1) == Long.MAX_VALUE) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            long j6 = this.f19827d;
            long j7 = j6 + r02;
            if ((r02 ^ j6) >= 0 && (j6 ^ j7) < 0) {
                g(j5);
            }
            this.f19827d = j7;
            return;
        }
        long p5 = e.p(j5, 2);
        if ((1 | (e.r0(p5, d()) - 1)) != Long.MAX_VALUE) {
            z5 = false;
        }
        if (!z5) {
            long j8 = this.f19827d;
            try {
                h(p5);
                h(e.g0(j5, p5));
                return;
            } catch (IllegalStateException e5) {
                this.f19827d = j8;
                throw e5;
            }
        }
        g(j5);
    }
}
