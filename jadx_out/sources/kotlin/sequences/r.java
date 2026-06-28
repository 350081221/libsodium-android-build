package kotlin.sequences;

import java.util.Enumeration;
import java.util.Iterator;
import kotlin.i0;
import kotlin.jvm.internal.l0;

@i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001f\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0087\b¨\u0006\u0004"}, d2 = {"asSequence", "Lkotlin/sequences/Sequence;", "T", "Ljava/util/Enumeration;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/sequences/SequencesKt")
/* loaded from: classes4.dex */
class r extends q {
    @kotlin.internal.f
    private static final <T> m<T> c(Enumeration<T> enumeration) {
        Iterator c02;
        m<T> e5;
        l0.p(enumeration, "<this>");
        c02 = kotlin.collections.y.c0(enumeration);
        e5 = s.e(c02);
        return e5;
    }
}
