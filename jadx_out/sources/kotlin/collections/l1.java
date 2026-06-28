package kotlin.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.r2;
import kotlin.v2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000J\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0005\u001aN\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u001f\b\u0001\u0010\u0005\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001\u001aF\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u001f\b\u0001\u0010\u0005\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u001a\u0012\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u0001\"\u0004\b\u0000\u0010\u000b\u001a\u001f\u0010\f\u001a\u0012\u0012\u0004\u0012\u0002H\u000b0\rj\b\u0012\u0004\u0012\u0002H\u000b`\u000e\"\u0004\b\u0000\u0010\u000bH\u0087\b\u001a5\u0010\f\u001a\u0012\u0012\u0004\u0012\u0002H\u000b0\rj\b\u0012\u0004\u0012\u0002H\u000b`\u000e\"\u0004\b\u0000\u0010\u000b2\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u000b0\u0010\"\u0002H\u000b¢\u0006\u0002\u0010\u0011\u001a\u001f\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u0002H\u000b0\u0013j\b\u0012\u0004\u0012\u0002H\u000b`\u0014\"\u0004\b\u0000\u0010\u000bH\u0087\b\u001a5\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u0002H\u000b0\u0013j\b\u0012\u0004\u0012\u0002H\u000b`\u0014\"\u0004\b\u0000\u0010\u000b2\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u000b0\u0010\"\u0002H\u000b¢\u0006\u0002\u0010\u0015\u001a\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u0007\"\u0004\b\u0000\u0010\u000bH\u0087\b\u001a+\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u0007\"\u0004\b\u0000\u0010\u000b2\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u000b0\u0010\"\u0002H\u000b¢\u0006\u0002\u0010\u0017\u001a\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u0001\"\u0004\b\u0000\u0010\u000bH\u0087\b\u001a+\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u0001\"\u0004\b\u0000\u0010\u000b2\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u000b0\u0010\"\u0002H\u000b¢\u0006\u0002\u0010\u0017\u001a'\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u0001\"\b\b\u0000\u0010\u000b*\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u0001H\u000bH\u0007¢\u0006\u0002\u0010\u001c\u001a5\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u0001\"\b\b\u0000\u0010\u000b*\u00020\u001a2\u0016\u0010\u000f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u0001H\u000b0\u0010\"\u0004\u0018\u0001H\u000bH\u0007¢\u0006\u0002\u0010\u0017\u001a\u001e\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u0001\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u0002H\u000b0\u0001H\u0000\u001a!\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u0001\"\u0004\b\u0000\u0010\u000b*\n\u0012\u0004\u0012\u0002H\u000b\u0018\u00010\u0001H\u0087\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001f"}, d2 = {"buildSet", "", "E", "capacity", "", "builderAction", "Lkotlin/Function1;", "", "", "Lkotlin/ExtensionFunctionType;", "emptySet", "T", "hashSetOf", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "elements", "", "([Ljava/lang/Object;)Ljava/util/HashSet;", "linkedSetOf", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "([Ljava/lang/Object;)Ljava/util/LinkedHashSet;", "mutableSetOf", "([Ljava/lang/Object;)Ljava/util/Set;", "setOf", "setOfNotNull", "", "element", "(Ljava/lang/Object;)Ljava/util/Set;", "optimizeReadOnlySet", "orEmpty", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/SetsKt")
/* loaded from: classes3.dex */
public class l1 extends k1 {
    @kotlin.g1(version = "1.6")
    @kotlin.internal.f
    @v2(markerClass = {kotlin.r.class})
    private static final <E> Set<E> i(int i5, @kotlin.b v3.l<? super Set<E>, r2> builderAction) {
        Set e5;
        Set<E> a5;
        kotlin.jvm.internal.l0.p(builderAction, "builderAction");
        e5 = k1.e(i5);
        builderAction.invoke(e5);
        a5 = k1.a(e5);
        return a5;
    }

    @kotlin.g1(version = "1.6")
    @kotlin.internal.f
    @v2(markerClass = {kotlin.r.class})
    private static final <E> Set<E> j(@kotlin.b v3.l<? super Set<E>, r2> builderAction) {
        Set d5;
        Set<E> a5;
        kotlin.jvm.internal.l0.p(builderAction, "builderAction");
        d5 = k1.d();
        builderAction.invoke(d5);
        a5 = k1.a(d5);
        return a5;
    }

    @p4.l
    public static <T> Set<T> k() {
        return j0.INSTANCE;
    }

    @kotlin.g1(version = "1.1")
    @kotlin.internal.f
    private static final <T> HashSet<T> l() {
        return new HashSet<>();
    }

    @p4.l
    public static final <T> HashSet<T> m(@p4.l T... elements) {
        int j5;
        kotlin.jvm.internal.l0.p(elements, "elements");
        j5 = z0.j(elements.length);
        return (HashSet) p.oy(elements, new HashSet(j5));
    }

    @kotlin.g1(version = "1.1")
    @kotlin.internal.f
    private static final <T> LinkedHashSet<T> n() {
        return new LinkedHashSet<>();
    }

    @p4.l
    public static final <T> LinkedHashSet<T> o(@p4.l T... elements) {
        int j5;
        kotlin.jvm.internal.l0.p(elements, "elements");
        j5 = z0.j(elements.length);
        return (LinkedHashSet) p.oy(elements, new LinkedHashSet(j5));
    }

    @kotlin.g1(version = "1.1")
    @kotlin.internal.f
    private static final <T> Set<T> p() {
        return new LinkedHashSet();
    }

    @p4.l
    public static final <T> Set<T> q(@p4.l T... elements) {
        int j5;
        kotlin.jvm.internal.l0.p(elements, "elements");
        j5 = z0.j(elements.length);
        return (Set) p.oy(elements, new LinkedHashSet(j5));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @p4.l
    public static final <T> Set<T> r(@p4.l Set<? extends T> set) {
        Set<T> k5;
        Set<T> f5;
        kotlin.jvm.internal.l0.p(set, "<this>");
        int size = set.size();
        if (size != 0) {
            if (size == 1) {
                f5 = k1.f(set.iterator().next());
                return f5;
            }
            return set;
        }
        k5 = k();
        return k5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.internal.f
    private static final <T> Set<T> s(Set<? extends T> set) {
        Set<T> k5;
        if (set != 0) {
            return set;
        }
        k5 = k();
        return k5;
    }

    @kotlin.internal.f
    private static final <T> Set<T> t() {
        Set<T> k5;
        k5 = k();
        return k5;
    }

    @p4.l
    public static <T> Set<T> u(@p4.l T... elements) {
        Set<T> k5;
        Set<T> lz;
        kotlin.jvm.internal.l0.p(elements, "elements");
        if (elements.length > 0) {
            lz = p.lz(elements);
            return lz;
        }
        k5 = k();
        return k5;
    }

    @p4.l
    @kotlin.g1(version = "1.4")
    public static final <T> Set<T> v(@p4.m T t5) {
        Set<T> k5;
        Set<T> f5;
        if (t5 != null) {
            f5 = k1.f(t5);
            return f5;
        }
        k5 = k();
        return k5;
    }

    @p4.l
    @kotlin.g1(version = "1.4")
    public static final <T> Set<T> w(@p4.l T... elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        return (Set) p.Ua(elements, new LinkedHashSet());
    }
}
