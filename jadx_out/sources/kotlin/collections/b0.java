package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.internal.u1;
import kotlin.v2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000P\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001f\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\u001a-\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0005¢\u0006\u0002\u0010\u0006\u001a&\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0007\u001a&\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\b\u001a\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00020\n\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0007H\u0000\u001a9\u0010\u000b\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0001H\u0002¢\u0006\u0002\b\u0010\u001a9\u0010\u000b\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00112\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0001H\u0002¢\u0006\u0002\b\u0010\u001a(\u0010\u0012\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\u0006\u0010\u0014\u001a\u0002H\u0002H\u0087\n¢\u0006\u0002\u0010\u0015\u001a.\u0010\u0012\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\u0087\n¢\u0006\u0002\u0010\u0016\u001a)\u0010\u0012\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0007H\u0087\n\u001a)\u0010\u0012\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\bH\u0087\n\u001a(\u0010\u0017\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\u0006\u0010\u0014\u001a\u0002H\u0002H\u0087\n¢\u0006\u0002\u0010\u0015\u001a.\u0010\u0017\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\u0087\n¢\u0006\u0002\u0010\u0016\u001a)\u0010\u0017\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0007H\u0087\n\u001a)\u0010\u0017\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\bH\u0087\n\u001a-\u0010\u0018\u001a\u00020\u0001\"\t\b\u0000\u0010\u0002¢\u0006\u0002\b\u0019*\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u00032\u0006\u0010\u0014\u001a\u0002H\u0002H\u0087\b¢\u0006\u0002\u0010\u001a\u001a&\u0010\u0018\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001cH\u0087\b¢\u0006\u0002\u0010\u001d\u001a-\u0010\u001e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0005¢\u0006\u0002\u0010\u0006\u001a&\u0010\u001e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0007\u001a&\u0010\u001e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\b\u001a.\u0010\u001e\u001a\u00020\u0001\"\t\b\u0000\u0010\u0002¢\u0006\u0002\b\u0019*\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\nH\u0087\b\u001a*\u0010\u001e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u000e\u001a*\u0010\u001e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00112\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u000e\u001a\u001d\u0010\u001f\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0011H\u0007¢\u0006\u0002\u0010 \u001a\u001f\u0010!\u001a\u0004\u0018\u0001H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0011H\u0007¢\u0006\u0002\u0010 \u001a\u001d\u0010\"\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0011H\u0007¢\u0006\u0002\u0010 \u001a\u001f\u0010#\u001a\u0004\u0018\u0001H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0011H\u0007¢\u0006\u0002\u0010 \u001a-\u0010$\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0005¢\u0006\u0002\u0010\u0006\u001a&\u0010$\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0007\u001a&\u0010$\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\b\u001a.\u0010$\u001a\u00020\u0001\"\t\b\u0000\u0010\u0002¢\u0006\u0002\b\u0019*\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\nH\u0087\b\u001a*\u0010$\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u000e\u001a*\u0010$\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00112\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u000e\u001a\u0015\u0010%\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0003H\u0002¢\u0006\u0002\b&¨\u0006'"}, d2 = {"addAll", "", "T", "", "elements", "", "(Ljava/util/Collection;[Ljava/lang/Object;)Z", "", "Lkotlin/sequences/Sequence;", "convertToListIfNotCollection", "", "filterInPlace", "", "predicate", "Lkotlin/Function1;", "predicateResultToRemove", "filterInPlace$CollectionsKt__MutableCollectionsKt", "", "minusAssign", "", "element", "(Ljava/util/Collection;Ljava/lang/Object;)V", "(Ljava/util/Collection;[Ljava/lang/Object;)V", "plusAssign", "remove", "Lkotlin/internal/OnlyInputTypes;", "(Ljava/util/Collection;Ljava/lang/Object;)Z", "index", "", "(Ljava/util/List;I)Ljava/lang/Object;", "removeAll", "removeFirst", "(Ljava/util/List;)Ljava/lang/Object;", "removeFirstOrNull", "removeLast", "removeLastOrNull", "retainAll", "retainNothing", "retainNothing$CollectionsKt__MutableCollectionsKt", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
/* loaded from: classes3.dex */
public class b0 extends a0 {
    @kotlin.internal.f
    private static final <T> void A0(Collection<? super T> collection, T[] elements) {
        kotlin.jvm.internal.l0.p(collection, "<this>");
        kotlin.jvm.internal.l0.p(elements, "elements");
        p0(collection, elements);
    }

    @kotlin.k(level = kotlin.m.ERROR, message = "Use removeAt(index) instead.", replaceWith = @kotlin.b1(expression = "removeAt(index)", imports = {}))
    @kotlin.internal.f
    private static final <T> T B0(List<T> list, int i5) {
        kotlin.jvm.internal.l0.p(list, "<this>");
        return list.remove(i5);
    }

    @kotlin.internal.f
    private static final <T> boolean C0(Collection<? extends T> collection, T t5) {
        kotlin.jvm.internal.l0.p(collection, "<this>");
        return u1.a(collection).remove(t5);
    }

    public static <T> boolean D0(@p4.l Iterable<? extends T> iterable, @p4.l v3.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.l0.p(iterable, "<this>");
        kotlin.jvm.internal.l0.p(predicate, "predicate");
        return r0(iterable, predicate, true);
    }

    public static <T> boolean E0(@p4.l Collection<? super T> collection, @p4.l Iterable<? extends T> elements) {
        Collection<?> q02;
        kotlin.jvm.internal.l0.p(collection, "<this>");
        kotlin.jvm.internal.l0.p(elements, "elements");
        q02 = q0(elements);
        return collection.removeAll(q02);
    }

    @kotlin.internal.f
    private static final <T> boolean F0(Collection<? extends T> collection, Collection<? extends T> elements) {
        kotlin.jvm.internal.l0.p(collection, "<this>");
        kotlin.jvm.internal.l0.p(elements, "elements");
        return u1.a(collection).removeAll(elements);
    }

    public static <T> boolean G0(@p4.l Collection<? super T> collection, @p4.l kotlin.sequences.m<? extends T> elements) {
        List c32;
        kotlin.jvm.internal.l0.p(collection, "<this>");
        kotlin.jvm.internal.l0.p(elements, "elements");
        c32 = kotlin.sequences.u.c3(elements);
        List list = c32;
        if ((!list.isEmpty()) && collection.removeAll(list)) {
            return true;
        }
        return false;
    }

    public static <T> boolean H0(@p4.l Collection<? super T> collection, @p4.l T[] elements) {
        boolean z4;
        List t5;
        kotlin.jvm.internal.l0.p(collection, "<this>");
        kotlin.jvm.internal.l0.p(elements, "elements");
        if (elements.length == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!(!z4)) {
            return false;
        }
        t5 = o.t(elements);
        if (!collection.removeAll(t5)) {
            return false;
        }
        return true;
    }

    public static <T> boolean I0(@p4.l List<T> list, @p4.l v3.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.l0.p(list, "<this>");
        kotlin.jvm.internal.l0.p(predicate, "predicate");
        return s0(list, predicate, true);
    }

    @kotlin.g1(version = "1.4")
    @v2(markerClass = {kotlin.r.class})
    public static <T> T J0(@p4.l List<T> list) {
        kotlin.jvm.internal.l0.p(list, "<this>");
        if (!list.isEmpty()) {
            return list.remove(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    @kotlin.g1(version = "1.4")
    @v2(markerClass = {kotlin.r.class})
    @p4.m
    public static <T> T K0(@p4.l List<T> list) {
        kotlin.jvm.internal.l0.p(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }

    @kotlin.g1(version = "1.4")
    @v2(markerClass = {kotlin.r.class})
    public static <T> T L0(@p4.l List<T> list) {
        int G;
        kotlin.jvm.internal.l0.p(list, "<this>");
        if (!list.isEmpty()) {
            G = w.G(list);
            return list.remove(G);
        }
        throw new NoSuchElementException("List is empty.");
    }

    @kotlin.g1(version = "1.4")
    @v2(markerClass = {kotlin.r.class})
    @p4.m
    public static <T> T M0(@p4.l List<T> list) {
        int G;
        kotlin.jvm.internal.l0.p(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        G = w.G(list);
        return list.remove(G);
    }

    public static <T> boolean N0(@p4.l Iterable<? extends T> iterable, @p4.l v3.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.l0.p(iterable, "<this>");
        kotlin.jvm.internal.l0.p(predicate, "predicate");
        return r0(iterable, predicate, false);
    }

    public static <T> boolean O0(@p4.l Collection<? super T> collection, @p4.l Iterable<? extends T> elements) {
        Collection<?> q02;
        kotlin.jvm.internal.l0.p(collection, "<this>");
        kotlin.jvm.internal.l0.p(elements, "elements");
        q02 = q0(elements);
        return collection.retainAll(q02);
    }

    @kotlin.internal.f
    private static final <T> boolean P0(Collection<? extends T> collection, Collection<? extends T> elements) {
        kotlin.jvm.internal.l0.p(collection, "<this>");
        kotlin.jvm.internal.l0.p(elements, "elements");
        return u1.a(collection).retainAll(elements);
    }

    public static final <T> boolean Q0(@p4.l Collection<? super T> collection, @p4.l kotlin.sequences.m<? extends T> elements) {
        List c32;
        kotlin.jvm.internal.l0.p(collection, "<this>");
        kotlin.jvm.internal.l0.p(elements, "elements");
        c32 = kotlin.sequences.u.c3(elements);
        List list = c32;
        if (!list.isEmpty()) {
            return collection.retainAll(list);
        }
        return T0(collection);
    }

    public static final <T> boolean R0(@p4.l Collection<? super T> collection, @p4.l T[] elements) {
        boolean z4;
        List t5;
        kotlin.jvm.internal.l0.p(collection, "<this>");
        kotlin.jvm.internal.l0.p(elements, "elements");
        if (elements.length == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            t5 = o.t(elements);
            return collection.retainAll(t5);
        }
        return T0(collection);
    }

    public static final <T> boolean S0(@p4.l List<T> list, @p4.l v3.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.l0.p(list, "<this>");
        kotlin.jvm.internal.l0.p(predicate, "predicate");
        return s0(list, predicate, false);
    }

    private static final boolean T0(Collection<?> collection) {
        boolean z4 = !collection.isEmpty();
        collection.clear();
        return z4;
    }

    public static <T> boolean n0(@p4.l Collection<? super T> collection, @p4.l Iterable<? extends T> elements) {
        kotlin.jvm.internal.l0.p(collection, "<this>");
        kotlin.jvm.internal.l0.p(elements, "elements");
        if (elements instanceof Collection) {
            return collection.addAll((Collection) elements);
        }
        Iterator<? extends T> it = elements.iterator();
        boolean z4 = false;
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z4 = true;
            }
        }
        return z4;
    }

    public static <T> boolean o0(@p4.l Collection<? super T> collection, @p4.l kotlin.sequences.m<? extends T> elements) {
        kotlin.jvm.internal.l0.p(collection, "<this>");
        kotlin.jvm.internal.l0.p(elements, "elements");
        Iterator<? extends T> it = elements.iterator();
        boolean z4 = false;
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z4 = true;
            }
        }
        return z4;
    }

    public static <T> boolean p0(@p4.l Collection<? super T> collection, @p4.l T[] elements) {
        List t5;
        kotlin.jvm.internal.l0.p(collection, "<this>");
        kotlin.jvm.internal.l0.p(elements, "elements");
        t5 = o.t(elements);
        return collection.addAll(t5);
    }

    @p4.l
    public static <T> Collection<T> q0(@p4.l Iterable<? extends T> iterable) {
        kotlin.jvm.internal.l0.p(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            iterable = e0.S5(iterable);
        }
        return (Collection) iterable;
    }

    private static final <T> boolean r0(Iterable<? extends T> iterable, v3.l<? super T, Boolean> lVar, boolean z4) {
        Iterator<? extends T> it = iterable.iterator();
        boolean z5 = false;
        while (it.hasNext()) {
            if (lVar.invoke(it.next()).booleanValue() == z4) {
                it.remove();
                z5 = true;
            }
        }
        return z5;
    }

    private static final <T> boolean s0(List<T> list, v3.l<? super T, Boolean> lVar, boolean z4) {
        int G;
        int G2;
        if (!(list instanceof RandomAccess)) {
            kotlin.jvm.internal.l0.n(list, "null cannot be cast to non-null type kotlin.collections.MutableIterable<T of kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace>");
            return r0(u1.c(list), lVar, z4);
        }
        G = w.G(list);
        s0 it = new kotlin.ranges.l(0, G).iterator();
        int i5 = 0;
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            T t5 = list.get(nextInt);
            if (lVar.invoke(t5).booleanValue() != z4) {
                if (i5 != nextInt) {
                    list.set(i5, t5);
                }
                i5++;
            }
        }
        if (i5 >= list.size()) {
            return false;
        }
        G2 = w.G(list);
        if (i5 > G2) {
            return true;
        }
        while (true) {
            list.remove(G2);
            if (G2 != i5) {
                G2--;
            } else {
                return true;
            }
        }
    }

    @kotlin.internal.f
    private static final <T> void t0(Collection<? super T> collection, Iterable<? extends T> elements) {
        kotlin.jvm.internal.l0.p(collection, "<this>");
        kotlin.jvm.internal.l0.p(elements, "elements");
        E0(collection, elements);
    }

    @kotlin.internal.f
    private static final <T> void u0(Collection<? super T> collection, T t5) {
        kotlin.jvm.internal.l0.p(collection, "<this>");
        collection.remove(t5);
    }

    @kotlin.internal.f
    private static final <T> void v0(Collection<? super T> collection, kotlin.sequences.m<? extends T> elements) {
        kotlin.jvm.internal.l0.p(collection, "<this>");
        kotlin.jvm.internal.l0.p(elements, "elements");
        G0(collection, elements);
    }

    @kotlin.internal.f
    private static final <T> void w0(Collection<? super T> collection, T[] elements) {
        kotlin.jvm.internal.l0.p(collection, "<this>");
        kotlin.jvm.internal.l0.p(elements, "elements");
        H0(collection, elements);
    }

    @kotlin.internal.f
    private static final <T> void x0(Collection<? super T> collection, Iterable<? extends T> elements) {
        kotlin.jvm.internal.l0.p(collection, "<this>");
        kotlin.jvm.internal.l0.p(elements, "elements");
        n0(collection, elements);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.internal.f
    private static final <T> void y0(Collection<? super T> collection, T t5) {
        kotlin.jvm.internal.l0.p(collection, "<this>");
        collection.add(t5);
    }

    @kotlin.internal.f
    private static final <T> void z0(Collection<? super T> collection, kotlin.sequences.m<? extends T> elements) {
        kotlin.jvm.internal.l0.p(collection, "<this>");
        kotlin.jvm.internal.l0.p(elements, "elements");
        o0(collection, elements);
    }
}
