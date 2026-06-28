package kotlin.time;

import kotlin.g1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlin.time.s;
import kotlin.v2;

@i0(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a/\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0087\bø\u0001\u0000ø\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\u0005\u001a3\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\b0\u0003H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u001a3\u0010\u0000\u001a\u00020\u0001*\u00020\t2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0087\bø\u0001\u0000ø\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\n\u001a3\u0010\u0000\u001a\u00020\u0001*\u00020\u000b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0087\bø\u0001\u0000ø\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\f\u001a7\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\b*\u00020\t2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\b0\u0003H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u001a7\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\b*\u00020\u000b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\b0\u0003H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u0082\u0002\u000b\n\u0005\b\u009920\u0001\n\u0002\b\u0019¨\u0006\r"}, d2 = {"measureTime", "Lkotlin/time/Duration;", "block", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)J", "measureTimedValue", "Lkotlin/time/TimedValue;", "T", "Lkotlin/time/TimeSource;", "(Lkotlin/time/TimeSource;Lkotlin/jvm/functions/Function0;)J", "Lkotlin/time/TimeSource$Monotonic;", "(Lkotlin/time/TimeSource$Monotonic;Lkotlin/jvm/functions/Function0;)J", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nmeasureTime.kt\nKotlin\n*S Kotlin\n*F\n+ 1 measureTime.kt\nkotlin/time/MeasureTimeKt\n*L\n1#1,121:1\n50#1,7:122\n113#1,7:129\n*S KotlinDebug\n*F\n+ 1 measureTime.kt\nkotlin/time/MeasureTimeKt\n*L\n21#1:122,7\n83#1:129,7\n*E\n"})
/* loaded from: classes4.dex */
public final class n {
    @g1(version = "1.9")
    @v2(markerClass = {l.class})
    public static final long a(@p4.l s.b bVar, @p4.l v3.a<r2> block) {
        l0.p(bVar, "<this>");
        l0.p(block, "block");
        long b5 = bVar.b();
        block.invoke();
        return s.b.a.l(b5);
    }

    @g1(version = "1.9")
    @v2(markerClass = {l.class})
    public static final long b(@p4.l s sVar, @p4.l v3.a<r2> block) {
        l0.p(sVar, "<this>");
        l0.p(block, "block");
        r a5 = sVar.a();
        block.invoke();
        return a5.c();
    }

    @g1(version = "1.9")
    @v2(markerClass = {l.class})
    public static final long c(@p4.l v3.a<r2> block) {
        l0.p(block, "block");
        long b5 = s.b.f19830b.b();
        block.invoke();
        return s.b.a.l(b5);
    }

    @p4.l
    @g1(version = "1.9")
    @v2(markerClass = {l.class})
    public static final <T> t<T> d(@p4.l s.b bVar, @p4.l v3.a<? extends T> block) {
        l0.p(bVar, "<this>");
        l0.p(block, "block");
        return new t<>(block.invoke(), s.b.a.l(bVar.b()), null);
    }

    @p4.l
    @g1(version = "1.9")
    @v2(markerClass = {l.class})
    public static final <T> t<T> e(@p4.l s sVar, @p4.l v3.a<? extends T> block) {
        l0.p(sVar, "<this>");
        l0.p(block, "block");
        return new t<>(block.invoke(), sVar.a().c(), null);
    }

    @p4.l
    @g1(version = "1.9")
    @v2(markerClass = {l.class})
    public static final <T> t<T> f(@p4.l v3.a<? extends T> block) {
        l0.p(block, "block");
        return new t<>(block.invoke(), s.b.a.l(s.b.f19830b.b()), null);
    }
}
