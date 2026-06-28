package kotlin.ranges;

import kotlin.g1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.v2;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0004\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a@\u0010\u0006\u001a\u00020\u0003\"\b\b\u0000\u0010\u0007*\u00020\b\"\u0018\b\u0001\u0010\t*\b\u0012\u0004\u0012\u0002H\u00070\n*\b\u0012\u0004\u0012\u0002H\u00070\u000b*\u0002H\t2\b\u0010\f\u001a\u0004\u0018\u0001H\u0007H\u0087\n¢\u0006\u0002\u0010\r\u001a@\u0010\u0006\u001a\u00020\u0003\"\b\b\u0000\u0010\u0007*\u00020\b\"\u0018\b\u0001\u0010\t*\b\u0012\u0004\u0012\u0002H\u00070\u000e*\b\u0012\u0004\u0012\u0002H\u00070\u000b*\u0002H\t2\b\u0010\f\u001a\u0004\u0018\u0001H\u0007H\u0087\n¢\u0006\u0002\u0010\u000f\u001a0\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00070\n\"\u000e\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\u0011*\u0002H\u00072\u0006\u0010\u0012\u001a\u0002H\u0007H\u0086\u0002¢\u0006\u0002\u0010\u0013\u001a\u001b\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014*\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0015H\u0087\u0002\u001a\u001b\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00160\u0014*\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0016H\u0087\u0002\u001a0\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00070\u000e\"\u000e\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\u0011*\u0002H\u00072\u0006\u0010\u0012\u001a\u0002H\u0007H\u0087\u0002¢\u0006\u0002\u0010\u0018\u001a\u001b\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u000e*\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0015H\u0087\u0002\u001a\u001b\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u000e*\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0016H\u0087\u0002¨\u0006\u0019"}, d2 = {"checkStepIsPositive", "", "isPositive", "", "step", "", "contains", "T", "", "R", "Lkotlin/ranges/ClosedRange;", "", "element", "(Lkotlin/ranges/ClosedRange;Ljava/lang/Object;)Z", "Lkotlin/ranges/OpenEndRange;", "(Lkotlin/ranges/OpenEndRange;Ljava/lang/Object;)Z", "rangeTo", "", "that", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Lkotlin/ranges/ClosedRange;", "Lkotlin/ranges/ClosedFloatingPointRange;", "", "", "rangeUntil", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Lkotlin/ranges/OpenEndRange;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/ranges/RangesKt")
/* loaded from: classes4.dex */
public class t {
    public static final void a(boolean z4, @p4.l Number step) {
        l0.p(step, "step");
        if (z4) {
            return;
        }
        throw new IllegalArgumentException("Step must be positive, was: " + step + external.org.apache.commons.lang3.d.f15957a);
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;R::Lkotlin/ranges/g<TT;>;:Ljava/lang/Iterable<+TT;>;>(TR;TT;)Z */
    @g1(version = "1.3")
    @kotlin.internal.f
    private static final boolean b(g gVar, Object obj) {
        l0.p(gVar, "<this>");
        if (obj != null && gVar.contains((Comparable) obj)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;R::Lkotlin/ranges/r<TT;>;:Ljava/lang/Iterable<+TT;>;>(TR;TT;)Z */
    @g1(version = "1.9")
    @kotlin.internal.f
    @v2(markerClass = {kotlin.r.class})
    private static final boolean c(r rVar, Object obj) {
        l0.p(rVar, "<this>");
        if (obj != null && rVar.contains((Comparable) obj)) {
            return true;
        }
        return false;
    }

    @p4.l
    @g1(version = "1.1")
    public static final f<Double> d(double d5, double d6) {
        return new d(d5, d6);
    }

    @p4.l
    @g1(version = "1.1")
    public static f<Float> e(float f5, float f6) {
        return new e(f5, f6);
    }

    @p4.l
    public static final <T extends Comparable<? super T>> g<T> f(@p4.l T t5, @p4.l T that) {
        l0.p(t5, "<this>");
        l0.p(that, "that");
        return new i(t5, that);
    }

    @p4.l
    @g1(version = "1.9")
    @v2(markerClass = {kotlin.r.class})
    public static final r<Double> g(double d5, double d6) {
        return new p(d5, d6);
    }

    @p4.l
    @g1(version = "1.9")
    @v2(markerClass = {kotlin.r.class})
    public static final r<Float> h(float f5, float f6) {
        return new q(f5, f6);
    }

    @p4.l
    @g1(version = "1.9")
    @v2(markerClass = {kotlin.r.class})
    public static final <T extends Comparable<? super T>> r<T> i(@p4.l T t5, @p4.l T that) {
        l0.p(t5, "<this>");
        l0.p(that, "that");
        return new h(t5, that);
    }
}
