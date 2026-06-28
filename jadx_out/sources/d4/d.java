package d4;

import java.time.Duration;
import kotlin.g1;
import kotlin.i0;
import kotlin.internal.f;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.time.e;
import kotlin.time.g;
import kotlin.time.l;
import kotlin.v2;
import u3.h;

@i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0005\u001a\u00020\u0002*\u00020\u0001H\u0087\bø\u0001\u0001¢\u0006\u0002\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"toJavaDuration", "Ljava/time/Duration;", "Lkotlin/time/Duration;", "toJavaDuration-LRDsOJo", "(J)Ljava/time/Duration;", "toKotlinDuration", "(Ljava/time/Duration;)J", "kotlin-stdlib-jdk8"}, k = 2, mv = {1, 9, 0}, pn = "kotlin.time", xi = 48)
@h(name = "DurationConversionsJDK8Kt")
@r1({"SMAP\nDurationConversions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DurationConversions.kt\nkotlin/time/jdk8/DurationConversionsJDK8Kt\n+ 2 Duration.kt\nkotlin/time/Duration\n*L\n1#1,33:1\n731#2,2:34\n*S KotlinDebug\n*F\n+ 1 DurationConversions.kt\nkotlin/time/jdk8/DurationConversionsJDK8Kt\n*L\n33#1:34,2\n*E\n"})
/* loaded from: classes4.dex */
public final class d {
    @g1(version = "1.6")
    @f
    @v2(markerClass = {l.class})
    private static final Duration a(long j5) {
        Duration ofSeconds;
        ofSeconds = Duration.ofSeconds(e.P(j5), e.T(j5));
        l0.o(ofSeconds, "toJavaDuration-LRDsOJo");
        return ofSeconds;
    }

    @g1(version = "1.6")
    @f
    @v2(markerClass = {l.class})
    private static final long b(Duration duration) {
        long seconds;
        int nano;
        l0.p(duration, "<this>");
        seconds = duration.getSeconds();
        long n02 = g.n0(seconds, kotlin.time.h.SECONDS);
        nano = duration.getNano();
        return e.h0(n02, g.m0(nano, kotlin.time.h.NANOSECONDS));
    }
}
