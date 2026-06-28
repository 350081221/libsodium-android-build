package kotlin.collections;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a,\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0003\u001a\u0002H\u0002H\u0086\u0002¢\u0006\u0002\u0010\u0004\u001a4\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0006H\u0086\u0002¢\u0006\u0002\u0010\u0007\u001a-\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\bH\u0086\u0002\u001a-\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\tH\u0086\u0002\u001a,\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0003\u001a\u0002H\u0002H\u0087\b¢\u0006\u0002\u0010\u0004\u001a,\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0003\u001a\u0002H\u0002H\u0086\u0002¢\u0006\u0002\u0010\u0004\u001a4\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0006H\u0086\u0002¢\u0006\u0002\u0010\u0007\u001a-\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\bH\u0086\u0002\u001a-\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\tH\u0086\u0002\u001a,\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0003\u001a\u0002H\u0002H\u0087\b¢\u0006\u0002\u0010\u0004¨\u0006\r"}, d2 = {"minus", "", "T", "element", "(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/Set;", "elements", "", "(Ljava/util/Set;[Ljava/lang/Object;)Ljava/util/Set;", "", "Lkotlin/sequences/Sequence;", "minusElement", "plus", "plusElement", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/SetsKt")
@kotlin.jvm.internal.r1({"SMAP\n_Sets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Sets.kt\nkotlin/collections/SetsKt___SetsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,139:1\n857#2,2:140\n847#2,2:142\n1#3:144\n*S KotlinDebug\n*F\n+ 1 _Sets.kt\nkotlin/collections/SetsKt___SetsKt\n*L\n28#1:140,2\n52#1:142,2\n*E\n"})
/* loaded from: classes3.dex */
public class m1 extends l1 {
    @p4.l
    public static final <T> Set<T> A(@p4.l Set<? extends T> set, @p4.l T[] elements) {
        kotlin.jvm.internal.l0.p(set, "<this>");
        kotlin.jvm.internal.l0.p(elements, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(set);
        b0.H0(linkedHashSet, elements);
        return linkedHashSet;
    }

    @kotlin.internal.f
    private static final <T> Set<T> B(Set<? extends T> set, T t5) {
        Set<T> y4;
        kotlin.jvm.internal.l0.p(set, "<this>");
        y4 = y(set, t5);
        return y4;
    }

    @p4.l
    public static <T> Set<T> C(@p4.l Set<? extends T> set, @p4.l Iterable<? extends T> elements) {
        int size;
        int j5;
        kotlin.jvm.internal.l0.p(set, "<this>");
        kotlin.jvm.internal.l0.p(elements, "elements");
        Integer Z = x.Z(elements);
        if (Z != null) {
            size = set.size() + Z.intValue();
        } else {
            size = set.size() * 2;
        }
        j5 = z0.j(size);
        LinkedHashSet linkedHashSet = new LinkedHashSet(j5);
        linkedHashSet.addAll(set);
        b0.n0(linkedHashSet, elements);
        return linkedHashSet;
    }

    @p4.l
    public static <T> Set<T> D(@p4.l Set<? extends T> set, T t5) {
        int j5;
        kotlin.jvm.internal.l0.p(set, "<this>");
        j5 = z0.j(set.size() + 1);
        LinkedHashSet linkedHashSet = new LinkedHashSet(j5);
        linkedHashSet.addAll(set);
        linkedHashSet.add(t5);
        return linkedHashSet;
    }

    @p4.l
    public static final <T> Set<T> E(@p4.l Set<? extends T> set, @p4.l kotlin.sequences.m<? extends T> elements) {
        int j5;
        kotlin.jvm.internal.l0.p(set, "<this>");
        kotlin.jvm.internal.l0.p(elements, "elements");
        j5 = z0.j(set.size() * 2);
        LinkedHashSet linkedHashSet = new LinkedHashSet(j5);
        linkedHashSet.addAll(set);
        b0.o0(linkedHashSet, elements);
        return linkedHashSet;
    }

    @p4.l
    public static final <T> Set<T> F(@p4.l Set<? extends T> set, @p4.l T[] elements) {
        int j5;
        kotlin.jvm.internal.l0.p(set, "<this>");
        kotlin.jvm.internal.l0.p(elements, "elements");
        j5 = z0.j(set.size() + elements.length);
        LinkedHashSet linkedHashSet = new LinkedHashSet(j5);
        linkedHashSet.addAll(set);
        b0.p0(linkedHashSet, elements);
        return linkedHashSet;
    }

    @kotlin.internal.f
    private static final <T> Set<T> G(Set<? extends T> set, T t5) {
        Set<T> D;
        kotlin.jvm.internal.l0.p(set, "<this>");
        D = D(set, t5);
        return D;
    }

    @p4.l
    public static final <T> Set<T> x(@p4.l Set<? extends T> set, @p4.l Iterable<? extends T> elements) {
        Collection<?> q02;
        Set<T> X5;
        kotlin.jvm.internal.l0.p(set, "<this>");
        kotlin.jvm.internal.l0.p(elements, "elements");
        q02 = b0.q0(elements);
        if (q02.isEmpty()) {
            X5 = e0.X5(set);
            return X5;
        }
        if (q02 instanceof Set) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (T t5 : set) {
                if (!q02.contains(t5)) {
                    linkedHashSet.add(t5);
                }
            }
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(set);
        linkedHashSet2.removeAll(q02);
        return linkedHashSet2;
    }

    @p4.l
    public static <T> Set<T> y(@p4.l Set<? extends T> set, T t5) {
        int j5;
        kotlin.jvm.internal.l0.p(set, "<this>");
        j5 = z0.j(set.size());
        LinkedHashSet linkedHashSet = new LinkedHashSet(j5);
        boolean z4 = false;
        for (T t6 : set) {
            boolean z5 = true;
            if (!z4 && kotlin.jvm.internal.l0.g(t6, t5)) {
                z4 = true;
                z5 = false;
            }
            if (z5) {
                linkedHashSet.add(t6);
            }
        }
        return linkedHashSet;
    }

    @p4.l
    public static final <T> Set<T> z(@p4.l Set<? extends T> set, @p4.l kotlin.sequences.m<? extends T> elements) {
        kotlin.jvm.internal.l0.p(set, "<this>");
        kotlin.jvm.internal.l0.p(elements, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(set);
        b0.G0(linkedHashSet, elements);
        return linkedHashSet;
    }
}
