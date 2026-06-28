package kotlin.collections;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u001a\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001\u001a#\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0007¢\u0006\u0002\b\u0004\u001a\u001d\u0010\u0005\u001a\u00020\u0006*\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0002\b\b\u001a\u001d\u0010\t\u001a\u00020\u0006*\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0002\b\n\u001a\u001d\u0010\u000b\u001a\u00020\u0006*\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0002\b\f¨\u0006\r"}, d2 = {"asReversed", "", "T", "", "asReversedMutable", "reverseElementIndex", "", "index", "reverseElementIndex$CollectionsKt__ReversedViewsKt", "reverseIteratorIndex", "reverseIteratorIndex$CollectionsKt__ReversedViewsKt", "reversePositionIndex", "reversePositionIndex$CollectionsKt__ReversedViewsKt", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
/* loaded from: classes3.dex */
public class c0 extends b0 {
    @p4.l
    public static <T> List<T> X0(@p4.l List<? extends T> list) {
        kotlin.jvm.internal.l0.p(list, "<this>");
        return new h1(list);
    }

    @p4.l
    @u3.h(name = "asReversedMutable")
    public static final <T> List<T> Y0(@p4.l List<T> list) {
        kotlin.jvm.internal.l0.p(list, "<this>");
        return new g1(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int Z0(List<?> list, int i5) {
        int G;
        int G2;
        int G3;
        G = w.G(list);
        if (new kotlin.ranges.l(0, G).l(i5)) {
            G3 = w.G(list);
            return G3 - i5;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Element index ");
        sb.append(i5);
        sb.append(" must be in range [");
        G2 = w.G(list);
        sb.append(new kotlin.ranges.l(0, G2));
        sb.append("].");
        throw new IndexOutOfBoundsException(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int a1(List<?> list, int i5) {
        int G;
        G = w.G(list);
        return G - i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int b1(List<?> list, int i5) {
        if (new kotlin.ranges.l(0, list.size()).l(i5)) {
            return list.size() - i5;
        }
        throw new IndexOutOfBoundsException("Position index " + i5 + " must be in range [" + new kotlin.ranges.l(0, list.size()) + "].");
    }
}
