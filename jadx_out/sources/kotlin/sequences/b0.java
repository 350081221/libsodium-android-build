package kotlin.sequences;

import java.util.Iterator;
import kotlin.c2;
import kotlin.g1;
import kotlin.g2;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.m2;
import kotlin.v2;
import kotlin.y1;

@i0(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u001c\u0010\u0000\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00070\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\n0\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"sum", "Lkotlin/UInt;", "Lkotlin/sequences/Sequence;", "Lkotlin/UByte;", "sumOfUByte", "(Lkotlin/sequences/Sequence;)I", "sumOfUInt", "Lkotlin/ULong;", "sumOfULong", "(Lkotlin/sequences/Sequence;)J", "Lkotlin/UShort;", "sumOfUShort", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/sequences/USequencesKt")
/* loaded from: classes4.dex */
class b0 {
    @u3.h(name = "sumOfUByte")
    @g1(version = "1.5")
    @v2(markerClass = {kotlin.t.class})
    public static final int a(@p4.l m<y1> mVar) {
        l0.p(mVar, "<this>");
        Iterator<y1> it = mVar.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            i5 = c2.l(i5 + c2.l(it.next().j0() & y1.f19838d));
        }
        return i5;
    }

    @u3.h(name = "sumOfUInt")
    @g1(version = "1.5")
    @v2(markerClass = {kotlin.t.class})
    public static final int b(@p4.l m<c2> mVar) {
        l0.p(mVar, "<this>");
        Iterator<c2> it = mVar.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            i5 = c2.l(i5 + it.next().l0());
        }
        return i5;
    }

    @u3.h(name = "sumOfULong")
    @g1(version = "1.5")
    @v2(markerClass = {kotlin.t.class})
    public static final long c(@p4.l m<g2> mVar) {
        l0.p(mVar, "<this>");
        Iterator<g2> it = mVar.iterator();
        long j5 = 0;
        while (it.hasNext()) {
            j5 = g2.l(j5 + it.next().l0());
        }
        return j5;
    }

    @u3.h(name = "sumOfUShort")
    @g1(version = "1.5")
    @v2(markerClass = {kotlin.t.class})
    public static final int d(@p4.l m<m2> mVar) {
        l0.p(mVar, "<this>");
        Iterator<m2> it = mVar.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            i5 = c2.l(i5 + c2.l(it.next().j0() & m2.f19496d));
        }
        return i5;
    }
}
