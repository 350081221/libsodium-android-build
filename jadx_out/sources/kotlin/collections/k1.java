package kotlin.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000B\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\"\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u0001\u001a?\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0006\u001a\u00020\u00072\u001d\u0010\b\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0004\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u000bH\u0081\bø\u0001\u0000\u001a7\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u001d\u0010\b\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0004\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u000bH\u0081\bø\u0001\u0000\u001a\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004\"\u0004\b\u0000\u0010\u0002H\u0001\u001a\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u001a\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u0001\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u000f\u001a\u0002H\u000e¢\u0006\u0002\u0010\u0010\u001a+\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u0012\"\u0004\b\u0000\u0010\u000e2\u0012\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u000e0\u0014\"\u0002H\u000e¢\u0006\u0002\u0010\u0015\u001aG\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u0012\"\u0004\b\u0000\u0010\u000e2\u001a\u0010\u0016\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u000e0\u0017j\n\u0012\u0006\b\u0000\u0012\u0002H\u000e`\u00182\u0012\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u000e0\u0014\"\u0002H\u000e¢\u0006\u0002\u0010\u0019\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001a"}, d2 = {"build", "", "E", "builder", "", "buildSetInternal", "capacity", "", "builderAction", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "createSetBuilder", "setOf", "T", "element", "(Ljava/lang/Object;)Ljava/util/Set;", "sortedSetOf", "Ljava/util/TreeSet;", "elements", "", "([Ljava/lang/Object;)Ljava/util/TreeSet;", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "(Ljava/util/Comparator;[Ljava/lang/Object;)Ljava/util/TreeSet;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/SetsKt")
/* loaded from: classes3.dex */
public class k1 {
    @p4.l
    @kotlin.g1(version = "1.3")
    @kotlin.a1
    public static <E> Set<E> a(@p4.l Set<E> builder) {
        kotlin.jvm.internal.l0.p(builder, "builder");
        return ((kotlin.collections.builders.j) builder).build();
    }

    @kotlin.g1(version = "1.3")
    @kotlin.a1
    @kotlin.internal.f
    private static final <E> Set<E> b(int i5, v3.l<? super Set<E>, r2> builderAction) {
        Set e5;
        Set<E> a5;
        kotlin.jvm.internal.l0.p(builderAction, "builderAction");
        e5 = e(i5);
        builderAction.invoke(e5);
        a5 = a(e5);
        return a5;
    }

    @kotlin.g1(version = "1.3")
    @kotlin.a1
    @kotlin.internal.f
    private static final <E> Set<E> c(v3.l<? super Set<E>, r2> builderAction) {
        Set d5;
        Set<E> a5;
        kotlin.jvm.internal.l0.p(builderAction, "builderAction");
        d5 = d();
        builderAction.invoke(d5);
        a5 = a(d5);
        return a5;
    }

    @p4.l
    @kotlin.g1(version = "1.3")
    @kotlin.a1
    public static <E> Set<E> d() {
        return new kotlin.collections.builders.j();
    }

    @p4.l
    @kotlin.g1(version = "1.3")
    @kotlin.a1
    public static <E> Set<E> e(int i5) {
        return new kotlin.collections.builders.j(i5);
    }

    @p4.l
    public static <T> Set<T> f(T t5) {
        Set<T> singleton = Collections.singleton(t5);
        kotlin.jvm.internal.l0.o(singleton, "singleton(element)");
        return singleton;
    }

    @p4.l
    public static final <T> TreeSet<T> g(@p4.l Comparator<? super T> comparator, @p4.l T... elements) {
        kotlin.jvm.internal.l0.p(comparator, "comparator");
        kotlin.jvm.internal.l0.p(elements, "elements");
        return (TreeSet) p.oy(elements, new TreeSet(comparator));
    }

    @p4.l
    public static <T> TreeSet<T> h(@p4.l T... elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        return (TreeSet) p.oy(elements, new TreeSet());
    }
}
