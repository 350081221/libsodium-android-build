package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.r2;
import kotlin.v2;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;

@kotlin.i0(d1 = {"\u0000\u0088\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000f\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aC\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00070\b\"\u0004\b\u0000\u0010\u00072\u0006\u0010\f\u001a\u00020\u00062!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u0002H\u00070\u000eH\u0087\bø\u0001\u0000\u001aC\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0013\"\u0004\b\u0000\u0010\u00072\u0006\u0010\f\u001a\u00020\u00062!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u0002H\u00070\u000eH\u0087\bø\u0001\u0000\u001a\u001f\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u0002H\u00070\u0015j\b\u0012\u0004\u0012\u0002H\u0007`\u0016\"\u0004\b\u0000\u0010\u0007H\u0087\b\u001a5\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u0002H\u00070\u0015j\b\u0012\u0004\u0012\u0002H\u0007`\u0016\"\u0004\b\u0000\u0010\u00072\u0012\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00070\u0018\"\u0002H\u0007¢\u0006\u0002\u0010\u0019\u001aN\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u001b0\b\"\u0004\b\u0000\u0010\u001b2\u0006\u0010\u001c\u001a\u00020\u00062\u001f\b\u0001\u0010\u001d\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001b0\u0013\u0012\u0004\u0012\u00020\u001e0\u000e¢\u0006\u0002\b\u001fH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001\u001aF\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u001b0\b\"\u0004\b\u0000\u0010\u001b2\u001f\b\u0001\u0010\u001d\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001b0\u0013\u0012\u0004\u0012\u00020\u001e0\u000e¢\u0006\u0002\b\u001fH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u001a\u0012\u0010 \u001a\b\u0012\u0004\u0012\u0002H\u00070\b\"\u0004\b\u0000\u0010\u0007\u001a\u0015\u0010!\u001a\b\u0012\u0004\u0012\u0002H\u00070\b\"\u0004\b\u0000\u0010\u0007H\u0087\b\u001a+\u0010!\u001a\b\u0012\u0004\u0012\u0002H\u00070\b\"\u0004\b\u0000\u0010\u00072\u0012\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00070\u0018\"\u0002H\u0007¢\u0006\u0002\u0010\"\u001a%\u0010#\u001a\b\u0012\u0004\u0012\u0002H\u00070\b\"\b\b\u0000\u0010\u0007*\u00020$2\b\u0010%\u001a\u0004\u0018\u0001H\u0007¢\u0006\u0002\u0010&\u001a3\u0010#\u001a\b\u0012\u0004\u0012\u0002H\u00070\b\"\b\b\u0000\u0010\u0007*\u00020$2\u0016\u0010\u0017\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u0001H\u00070\u0018\"\u0004\u0018\u0001H\u0007¢\u0006\u0002\u0010\"\u001a\u0015\u0010'\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0013\"\u0004\b\u0000\u0010\u0007H\u0087\b\u001a+\u0010'\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0013\"\u0004\b\u0000\u0010\u00072\u0012\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00070\u0018\"\u0002H\u0007¢\u0006\u0002\u0010\"\u001a%\u0010(\u001a\u00020\u001e2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u0006H\u0002¢\u0006\u0002\b+\u001a\b\u0010,\u001a\u00020\u001eH\u0001\u001a\b\u0010-\u001a\u00020\u001eH\u0001\u001a%\u0010.\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0002\"\u0004\b\u0000\u0010\u0007*\n\u0012\u0006\b\u0001\u0012\u0002H\u00070\u0018H\u0000¢\u0006\u0002\u0010/\u001aS\u00100\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\b2\u0006\u0010%\u001a\u0002H\u00072\u001a\u00101\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u000702j\n\u0012\u0006\b\u0000\u0012\u0002H\u0007`32\b\b\u0002\u0010)\u001a\u00020\u00062\b\b\u0002\u0010*\u001a\u00020\u0006¢\u0006\u0002\u00104\u001a>\u00100\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\b2\b\b\u0002\u0010)\u001a\u00020\u00062\b\b\u0002\u0010*\u001a\u00020\u00062\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\u00060\u000e\u001aE\u00100\u001a\u00020\u0006\"\u000e\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u000706*\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00070\b2\b\u0010%\u001a\u0004\u0018\u0001H\u00072\b\b\u0002\u0010)\u001a\u00020\u00062\b\b\u0002\u0010*\u001a\u00020\u0006¢\u0006\u0002\u00107\u001ag\u00108\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0007\"\u000e\b\u0001\u00109*\b\u0012\u0004\u0012\u0002H906*\b\u0012\u0004\u0012\u0002H\u00070\b2\b\u0010:\u001a\u0004\u0018\u0001H92\b\b\u0002\u0010)\u001a\u00020\u00062\b\b\u0002\u0010*\u001a\u00020\u00062\u0016\b\u0004\u0010;\u001a\u0010\u0012\u0004\u0012\u0002H\u0007\u0012\u0006\u0012\u0004\u0018\u0001H90\u000eH\u0086\bø\u0001\u0000¢\u0006\u0002\u0010<\u001a,\u0010=\u001a\u00020>\"\t\b\u0000\u0010\u0007¢\u0006\u0002\b?*\b\u0012\u0004\u0012\u0002H\u00070\u00022\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0002H\u0087\b\u001a;\u0010@\u001a\u0002HA\"\u0010\b\u0000\u0010B*\u0006\u0012\u0002\b\u00030\u0002*\u0002HA\"\u0004\b\u0001\u0010A*\u0002HB2\f\u0010C\u001a\b\u0012\u0004\u0012\u0002HA0DH\u0087\bø\u0001\u0000¢\u0006\u0002\u0010E\u001a\u0019\u0010F\u001a\u00020>\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\u0002H\u0087\b\u001a,\u0010G\u001a\u00020>\"\u0004\b\u0000\u0010\u0007*\n\u0012\u0004\u0012\u0002H\u0007\u0018\u00010\u0002H\u0087\b\u0082\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0001\u001a\u0004\b\u0003\u0010\u0000\u001a\u001e\u0010H\u001a\b\u0012\u0004\u0012\u0002H\u00070\b\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\bH\u0000\u001a!\u0010I\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0002\"\u0004\b\u0000\u0010\u0007*\n\u0012\u0004\u0012\u0002H\u0007\u0018\u00010\u0002H\u0087\b\u001a!\u0010I\u001a\b\u0012\u0004\u0012\u0002H\u00070\b\"\u0004\b\u0000\u0010\u0007*\n\u0012\u0004\u0012\u0002H\u0007\u0018\u00010\bH\u0087\b\u001a&\u0010J\u001a\b\u0012\u0004\u0012\u0002H\u00070\b\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070K2\u0006\u0010L\u001a\u00020MH\u0007\"\u0019\u0010\u0000\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"!\u0010\u0005\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006N"}, d2 = {"indices", "Lkotlin/ranges/IntRange;", "", "getIndices", "(Ljava/util/Collection;)Lkotlin/ranges/IntRange;", "lastIndex", "", "T", "", "getLastIndex", "(Ljava/util/List;)I", "List", "size", "init", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "index", "MutableList", "", "arrayListOf", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "elements", "", "([Ljava/lang/Object;)Ljava/util/ArrayList;", "buildList", "E", "capacity", "builderAction", "", "Lkotlin/ExtensionFunctionType;", "emptyList", "listOf", "([Ljava/lang/Object;)Ljava/util/List;", "listOfNotNull", "", "element", "(Ljava/lang/Object;)Ljava/util/List;", "mutableListOf", "rangeCheck", "fromIndex", "toIndex", "rangeCheck$CollectionsKt__CollectionsKt", "throwCountOverflow", "throwIndexOverflow", "asCollection", "([Ljava/lang/Object;)Ljava/util/Collection;", "binarySearch", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "(Ljava/util/List;Ljava/lang/Object;Ljava/util/Comparator;II)I", "comparison", "", "(Ljava/util/List;Ljava/lang/Comparable;II)I", "binarySearchBy", "K", DatabaseFileArchive.COLUMN_KEY, "selector", "(Ljava/util/List;Ljava/lang/Comparable;IILkotlin/jvm/functions/Function1;)I", "containsAll", "", "Lkotlin/internal/OnlyInputTypes;", "ifEmpty", "R", "C", "defaultValue", "Lkotlin/Function0;", "(Ljava/util/Collection;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "isNotEmpty", "isNullOrEmpty", "optimizeReadOnlyList", "orEmpty", "shuffled", "", "random", "Lkotlin/random/Random;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
@kotlin.jvm.internal.r1({"SMAP\nCollections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collections.kt\nkotlin/collections/CollectionsKt__CollectionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,481:1\n404#1:483\n1#2:482\n*S KotlinDebug\n*F\n+ 1 Collections.kt\nkotlin/collections/CollectionsKt__CollectionsKt\n*L\n398#1:483\n*E\n"})
/* loaded from: classes3.dex */
public class w extends v {

    @kotlin.i0(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000f\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\u0006\u0010\u0005\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "K", "", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 176)
    @kotlin.jvm.internal.r1({"SMAP\nCollections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collections.kt\nkotlin/collections/CollectionsKt__CollectionsKt$binarySearchBy$1\n*L\n1#1,481:1\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class a<T> extends kotlin.jvm.internal.n0 implements v3.l<T, Integer> {
        final /* synthetic */ Comparable $key;
        final /* synthetic */ v3.l<T, K> $selector;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v3.l lVar, Comparable comparable) {
            super(1);
            this.$selector = lVar;
            this.$key = comparable;
        }

        @Override // v3.l
        @p4.l
        public final Integer invoke(T t5) {
            int l5;
            l5 = kotlin.comparisons.g.l((Comparable) this.$selector.invoke(t5), this.$key);
            return Integer.valueOf(l5);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v3.l
        public /* bridge */ /* synthetic */ Integer invoke(Object obj) {
            return invoke((a<T>) obj);
        }
    }

    public static /* synthetic */ int A(List list, Comparable comparable, int i5, int i6, v3.l lVar, int i7, Object obj) {
        int t5;
        if ((i7 & 2) != 0) {
            i5 = 0;
        }
        if ((i7 & 4) != 0) {
            i6 = list.size();
        }
        t5 = t(list, i5, i6, new a(lVar, comparable));
        return t5;
    }

    @kotlin.g1(version = "1.6")
    @kotlin.internal.f
    @v2(markerClass = {kotlin.r.class})
    private static final <E> List<E> B(int i5, @kotlin.b v3.l<? super List<E>, r2> builderAction) {
        List j5;
        List<E> a5;
        kotlin.jvm.internal.l0.p(builderAction, "builderAction");
        j5 = v.j(i5);
        builderAction.invoke(j5);
        a5 = v.a(j5);
        return a5;
    }

    @kotlin.g1(version = "1.6")
    @kotlin.internal.f
    @v2(markerClass = {kotlin.r.class})
    private static final <E> List<E> C(@kotlin.b v3.l<? super List<E>, r2> builderAction) {
        List i5;
        List<E> a5;
        kotlin.jvm.internal.l0.p(builderAction, "builderAction");
        i5 = v.i();
        builderAction.invoke(i5);
        a5 = v.a(i5);
        return a5;
    }

    @kotlin.internal.f
    private static final <T> boolean D(Collection<? extends T> collection, Collection<? extends T> elements) {
        kotlin.jvm.internal.l0.p(collection, "<this>");
        kotlin.jvm.internal.l0.p(elements, "elements");
        return collection.containsAll(elements);
    }

    @p4.l
    public static <T> List<T> E() {
        return h0.INSTANCE;
    }

    @p4.l
    public static kotlin.ranges.l F(@p4.l Collection<?> collection) {
        kotlin.jvm.internal.l0.p(collection, "<this>");
        return new kotlin.ranges.l(0, collection.size() - 1);
    }

    public static <T> int G(@p4.l List<? extends T> list) {
        kotlin.jvm.internal.l0.p(list, "<this>");
        return list.size() - 1;
    }

    @kotlin.g1(version = "1.3")
    @kotlin.internal.f
    private static final Object H(Collection collection, v3.a defaultValue) {
        kotlin.jvm.internal.l0.p(defaultValue, "defaultValue");
        if (collection.isEmpty()) {
            return defaultValue.invoke();
        }
        return collection;
    }

    @kotlin.internal.f
    private static final <T> boolean I(Collection<? extends T> collection) {
        kotlin.jvm.internal.l0.p(collection, "<this>");
        return !collection.isEmpty();
    }

    @kotlin.g1(version = "1.3")
    @kotlin.internal.f
    private static final <T> boolean J(Collection<? extends T> collection) {
        return collection == null || collection.isEmpty();
    }

    @kotlin.internal.f
    private static final <T> List<T> K() {
        List<T> E;
        E = E();
        return E;
    }

    @p4.l
    public static <T> List<T> L(@p4.l T... elements) {
        List<T> E;
        List<T> t5;
        kotlin.jvm.internal.l0.p(elements, "elements");
        if (elements.length > 0) {
            t5 = o.t(elements);
            return t5;
        }
        E = E();
        return E;
    }

    @p4.l
    public static <T> List<T> M(@p4.m T t5) {
        List<T> E;
        List<T> k5;
        if (t5 != null) {
            k5 = v.k(t5);
            return k5;
        }
        E = E();
        return E;
    }

    @p4.l
    public static <T> List<T> N(@p4.l T... elements) {
        List<T> Ta;
        kotlin.jvm.internal.l0.p(elements, "elements");
        Ta = p.Ta(elements);
        return Ta;
    }

    @kotlin.g1(version = "1.1")
    @kotlin.internal.f
    private static final <T> List<T> O() {
        return new ArrayList();
    }

    @p4.l
    public static <T> List<T> P(@p4.l T... elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        if (elements.length == 0) {
            return new ArrayList();
        }
        return new ArrayList(new j(elements, true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @p4.l
    public static final <T> List<T> Q(@p4.l List<? extends T> list) {
        List<T> E;
        List<T> k5;
        kotlin.jvm.internal.l0.p(list, "<this>");
        int size = list.size();
        if (size != 0) {
            if (size == 1) {
                k5 = v.k(list.get(0));
                return k5;
            }
            return list;
        }
        E = E();
        return E;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.internal.f
    private static final <T> Collection<T> R(Collection<? extends T> collection) {
        List E;
        if (collection != 0) {
            return collection;
        }
        E = E();
        return E;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.internal.f
    private static final <T> List<T> S(List<? extends T> list) {
        List<T> E;
        if (list != 0) {
            return list;
        }
        E = E();
        return E;
    }

    private static final void T(int i5, int i6, int i7) {
        if (i6 <= i7) {
            if (i6 >= 0) {
                if (i7 <= i5) {
                    return;
                }
                throw new IndexOutOfBoundsException("toIndex (" + i7 + ") is greater than size (" + i5 + ").");
            }
            throw new IndexOutOfBoundsException("fromIndex (" + i6 + ") is less than zero.");
        }
        throw new IllegalArgumentException("fromIndex (" + i6 + ") is greater than toIndex (" + i7 + ").");
    }

    @p4.l
    @kotlin.g1(version = "1.3")
    public static final <T> List<T> U(@p4.l Iterable<? extends T> iterable, @p4.l kotlin.random.f random) {
        kotlin.jvm.internal.l0.p(iterable, "<this>");
        kotlin.jvm.internal.l0.p(random, "random");
        List<T> U5 = e0.U5(iterable);
        e0.b5(U5, random);
        return U5;
    }

    @kotlin.g1(version = "1.3")
    @kotlin.a1
    public static void V() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    @kotlin.g1(version = "1.3")
    @kotlin.a1
    public static void W() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    @kotlin.g1(version = "1.1")
    @kotlin.internal.f
    private static final <T> List<T> o(int i5, v3.l<? super Integer, ? extends T> init) {
        kotlin.jvm.internal.l0.p(init, "init");
        ArrayList arrayList = new ArrayList(i5);
        for (int i6 = 0; i6 < i5; i6++) {
            arrayList.add(init.invoke(Integer.valueOf(i6)));
        }
        return arrayList;
    }

    @kotlin.g1(version = "1.1")
    @kotlin.internal.f
    private static final <T> List<T> p(int i5, v3.l<? super Integer, ? extends T> init) {
        kotlin.jvm.internal.l0.p(init, "init");
        ArrayList arrayList = new ArrayList(i5);
        for (int i6 = 0; i6 < i5; i6++) {
            arrayList.add(init.invoke(Integer.valueOf(i6)));
        }
        return arrayList;
    }

    @kotlin.g1(version = "1.1")
    @kotlin.internal.f
    private static final <T> ArrayList<T> q() {
        return new ArrayList<>();
    }

    @p4.l
    public static <T> ArrayList<T> r(@p4.l T... elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        if (elements.length == 0) {
            return new ArrayList<>();
        }
        return new ArrayList<>(new j(elements, true));
    }

    @p4.l
    public static final <T> Collection<T> s(@p4.l T[] tArr) {
        kotlin.jvm.internal.l0.p(tArr, "<this>");
        return new j(tArr, false);
    }

    public static <T> int t(@p4.l List<? extends T> list, int i5, int i6, @p4.l v3.l<? super T, Integer> comparison) {
        kotlin.jvm.internal.l0.p(list, "<this>");
        kotlin.jvm.internal.l0.p(comparison, "comparison");
        T(list.size(), i5, i6);
        int i7 = i6 - 1;
        while (i5 <= i7) {
            int i8 = (i5 + i7) >>> 1;
            int intValue = comparison.invoke(list.get(i8)).intValue();
            if (intValue < 0) {
                i5 = i8 + 1;
            } else if (intValue > 0) {
                i7 = i8 - 1;
            } else {
                return i8;
            }
        }
        return -(i5 + 1);
    }

    public static final <T extends Comparable<? super T>> int u(@p4.l List<? extends T> list, @p4.m T t5, int i5, int i6) {
        int l5;
        kotlin.jvm.internal.l0.p(list, "<this>");
        T(list.size(), i5, i6);
        int i7 = i6 - 1;
        while (i5 <= i7) {
            int i8 = (i5 + i7) >>> 1;
            l5 = kotlin.comparisons.g.l(list.get(i8), t5);
            if (l5 < 0) {
                i5 = i8 + 1;
            } else if (l5 > 0) {
                i7 = i8 - 1;
            } else {
                return i8;
            }
        }
        return -(i5 + 1);
    }

    public static final <T> int v(@p4.l List<? extends T> list, T t5, @p4.l Comparator<? super T> comparator, int i5, int i6) {
        kotlin.jvm.internal.l0.p(list, "<this>");
        kotlin.jvm.internal.l0.p(comparator, "comparator");
        T(list.size(), i5, i6);
        int i7 = i6 - 1;
        while (i5 <= i7) {
            int i8 = (i5 + i7) >>> 1;
            int compare = comparator.compare(list.get(i8), t5);
            if (compare < 0) {
                i5 = i8 + 1;
            } else if (compare > 0) {
                i7 = i8 - 1;
            } else {
                return i8;
            }
        }
        return -(i5 + 1);
    }

    public static /* synthetic */ int w(List list, int i5, int i6, v3.l lVar, int i7, Object obj) {
        int t5;
        if ((i7 & 1) != 0) {
            i5 = 0;
        }
        if ((i7 & 2) != 0) {
            i6 = list.size();
        }
        t5 = t(list, i5, i6, lVar);
        return t5;
    }

    public static /* synthetic */ int x(List list, Comparable comparable, int i5, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i5 = 0;
        }
        if ((i7 & 4) != 0) {
            i6 = list.size();
        }
        return u(list, comparable, i5, i6);
    }

    public static /* synthetic */ int y(List list, Object obj, Comparator comparator, int i5, int i6, int i7, Object obj2) {
        if ((i7 & 4) != 0) {
            i5 = 0;
        }
        if ((i7 & 8) != 0) {
            i6 = list.size();
        }
        return v(list, obj, comparator, i5, i6);
    }

    public static final <T, K extends Comparable<? super K>> int z(@p4.l List<? extends T> list, @p4.m K k5, int i5, int i6, @p4.l v3.l<? super T, ? extends K> selector) {
        int t5;
        kotlin.jvm.internal.l0.p(list, "<this>");
        kotlin.jvm.internal.l0.p(selector, "selector");
        t5 = t(list, i5, i6, new a(selector, k5));
        return t5;
    }
}
