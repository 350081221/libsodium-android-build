package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import kotlin.c2;
import kotlin.d2;
import kotlin.g2;
import kotlin.h2;
import kotlin.m2;
import kotlin.n2;
import kotlin.v2;
import kotlin.y1;
import kotlin.z1;

@kotlin.i0(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u001c\u0010\u0000\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00070\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\n0\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0005\u001a\u001a\u0010\f\u001a\u00020\r*\b\u0012\u0004\u0012\u00020\u00030\u000eH\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a\u001a\u0010\u0010\u001a\u00020\u0011*\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0012\u001a\u001a\u0010\u0013\u001a\u00020\u0014*\b\u0012\u0004\u0012\u00020\u00070\u000eH\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0015\u001a\u001a\u0010\u0016\u001a\u00020\u0017*\b\u0012\u0004\u0012\u00020\n0\u000eH\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"sum", "Lkotlin/UInt;", "", "Lkotlin/UByte;", "sumOfUByte", "(Ljava/lang/Iterable;)I", "sumOfUInt", "Lkotlin/ULong;", "sumOfULong", "(Ljava/lang/Iterable;)J", "Lkotlin/UShort;", "sumOfUShort", "toUByteArray", "Lkotlin/UByteArray;", "", "(Ljava/util/Collection;)[B", "toUIntArray", "Lkotlin/UIntArray;", "(Ljava/util/Collection;)[I", "toULongArray", "Lkotlin/ULongArray;", "(Ljava/util/Collection;)[J", "toUShortArray", "Lkotlin/UShortArray;", "(Ljava/util/Collection;)[S", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/UCollectionsKt")
/* loaded from: classes3.dex */
class t1 {
    @u3.h(name = "sumOfUByte")
    @kotlin.g1(version = "1.5")
    @v2(markerClass = {kotlin.t.class})
    public static final int a(@p4.l Iterable<y1> iterable) {
        kotlin.jvm.internal.l0.p(iterable, "<this>");
        Iterator<y1> it = iterable.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            i5 = c2.l(i5 + c2.l(it.next().j0() & y1.f19838d));
        }
        return i5;
    }

    @u3.h(name = "sumOfUInt")
    @kotlin.g1(version = "1.5")
    @v2(markerClass = {kotlin.t.class})
    public static final int b(@p4.l Iterable<c2> iterable) {
        kotlin.jvm.internal.l0.p(iterable, "<this>");
        Iterator<c2> it = iterable.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            i5 = c2.l(i5 + it.next().l0());
        }
        return i5;
    }

    @u3.h(name = "sumOfULong")
    @kotlin.g1(version = "1.5")
    @v2(markerClass = {kotlin.t.class})
    public static final long c(@p4.l Iterable<g2> iterable) {
        kotlin.jvm.internal.l0.p(iterable, "<this>");
        Iterator<g2> it = iterable.iterator();
        long j5 = 0;
        while (it.hasNext()) {
            j5 = g2.l(j5 + it.next().l0());
        }
        return j5;
    }

    @u3.h(name = "sumOfUShort")
    @kotlin.g1(version = "1.5")
    @v2(markerClass = {kotlin.t.class})
    public static final int d(@p4.l Iterable<m2> iterable) {
        kotlin.jvm.internal.l0.p(iterable, "<this>");
        Iterator<m2> it = iterable.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            i5 = c2.l(i5 + c2.l(it.next().j0() & m2.f19496d));
        }
        return i5;
    }

    @p4.l
    @kotlin.g1(version = "1.3")
    @kotlin.t
    public static final byte[] e(@p4.l Collection<y1> collection) {
        kotlin.jvm.internal.l0.p(collection, "<this>");
        byte[] e5 = z1.e(collection.size());
        Iterator<y1> it = collection.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            z1.u(e5, i5, it.next().j0());
            i5++;
        }
        return e5;
    }

    @p4.l
    @kotlin.g1(version = "1.3")
    @kotlin.t
    public static final int[] f(@p4.l Collection<c2> collection) {
        kotlin.jvm.internal.l0.p(collection, "<this>");
        int[] e5 = d2.e(collection.size());
        Iterator<c2> it = collection.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            d2.u(e5, i5, it.next().l0());
            i5++;
        }
        return e5;
    }

    @p4.l
    @kotlin.g1(version = "1.3")
    @kotlin.t
    public static final long[] g(@p4.l Collection<g2> collection) {
        kotlin.jvm.internal.l0.p(collection, "<this>");
        long[] e5 = h2.e(collection.size());
        Iterator<g2> it = collection.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            h2.u(e5, i5, it.next().l0());
            i5++;
        }
        return e5;
    }

    @p4.l
    @kotlin.g1(version = "1.3")
    @kotlin.t
    public static final short[] h(@p4.l Collection<m2> collection) {
        kotlin.jvm.internal.l0.p(collection, "<this>");
        short[] e5 = n2.e(collection.size());
        Iterator<m2> it = collection.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            n2.u(e5, i5, it.next().j0());
            i5++;
        }
        return e5;
    }
}
