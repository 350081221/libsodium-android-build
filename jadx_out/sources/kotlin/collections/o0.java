package kotlin.collections;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;

@kotlin.i0(d1 = {"\u0000@\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u009e\u0001\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00020\u00052b\u0010\u0006\u001a^\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u0001H\u0003¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u0002H\u00030\u0007H\u0087\bø\u0001\u0000\u001a·\u0001\u0010\u000f\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u0003\"\u0016\b\u0003\u0010\u0010*\u0010\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0011*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\u0012\u001a\u0002H\u00102b\u0010\u0006\u001a^\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u0001H\u0003¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u0002H\u00030\u0007H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0013\u001aI\u0010\u0014\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0002\"\u0016\b\u0002\u0010\u0010*\u0010\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00150\u0011*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\u0012\u001a\u0002H\u0010H\u0007¢\u0006\u0002\u0010\u0016\u001a¿\u0001\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00020\u000526\u0010\u0018\u001a2\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u0002H\u00030\u00192K\u0010\u0006\u001aG\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u0011H\u0003¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u0002H\u00030\u001aH\u0087\bø\u0001\u0000\u001a\u007f\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\u001b\u001a\u0002H\u000326\u0010\u0006\u001a2\u0012\u0013\u0012\u0011H\u0003¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u0002H\u00030\u0019H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001aØ\u0001\u0010\u001d\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u0003\"\u0016\b\u0003\u0010\u0010*\u0010\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0011*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\u0012\u001a\u0002H\u001026\u0010\u0018\u001a2\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u0002H\u00030\u00192K\u0010\u0006\u001aG\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u0011H\u0003¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u0002H\u00030\u001aH\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u001e\u001a\u0093\u0001\u0010\u001d\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u0003\"\u0016\b\u0003\u0010\u0010*\u0010\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0011*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\u0012\u001a\u0002H\u00102\u0006\u0010\u001b\u001a\u0002H\u000326\u0010\u0006\u001a2\u0012\u0013\u0012\u0011H\u0003¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u0002H\u00030\u0019H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u001f\u001a\u008b\u0001\u0010 \u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H!0\u0001\"\u0004\b\u0000\u0010!\"\b\b\u0001\u0010\u0004*\u0002H!\"\u0004\b\u0002\u0010\u0002*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00020\u00052K\u0010\u0006\u001aG\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u0011H!¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u0002H!0\u001aH\u0087\bø\u0001\u0000\u001a¤\u0001\u0010\"\u001a\u0002H\u0010\"\u0004\b\u0000\u0010!\"\b\b\u0001\u0010\u0004*\u0002H!\"\u0004\b\u0002\u0010\u0002\"\u0016\b\u0003\u0010\u0010*\u0010\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H!0\u0011*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\u0012\u001a\u0002H\u00102K\u0010\u0006\u001aG\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u0011H!¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u0002H!0\u001aH\u0087\bø\u0001\u0000¢\u0006\u0002\u0010#\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006$"}, d2 = {"aggregate", "", "K", "R", "T", "Lkotlin/collections/Grouping;", "operation", "Lkotlin/Function4;", "Lkotlin/ParameterName;", "name", DatabaseFileArchive.COLUMN_KEY, "accumulator", "element", "", "first", "aggregateTo", "M", "", "destination", "(Lkotlin/collections/Grouping;Ljava/util/Map;Lkotlin/jvm/functions/Function4;)Ljava/util/Map;", "eachCountTo", "", "(Lkotlin/collections/Grouping;Ljava/util/Map;)Ljava/util/Map;", "fold", "initialValueSelector", "Lkotlin/Function2;", "Lkotlin/Function3;", "initialValue", "(Lkotlin/collections/Grouping;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/Map;", "foldTo", "(Lkotlin/collections/Grouping;Ljava/util/Map;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;)Ljava/util/Map;", "(Lkotlin/collections/Grouping;Ljava/util/Map;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/Map;", "reduce", "S", "reduceTo", "(Lkotlin/collections/Grouping;Ljava/util/Map;Lkotlin/jvm/functions/Function3;)Ljava/util/Map;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/GroupingKt")
@kotlin.jvm.internal.r1({"SMAP\nGrouping.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Grouping.kt\nkotlin/collections/GroupingKt__GroupingKt\n*L\n1#1,291:1\n80#1,6:292\n53#1:298\n80#1,6:299\n80#1,6:305\n53#1:311\n80#1,6:312\n80#1,6:318\n53#1:324\n80#1,6:325\n80#1,6:331\n189#1:337\n80#1,6:338\n*S KotlinDebug\n*F\n+ 1 Grouping.kt\nkotlin/collections/GroupingKt__GroupingKt\n*L\n53#1:292,6\n112#1:298\n112#1:299,6\n143#1:305,6\n164#1:311\n164#1:312,6\n189#1:318,6\n211#1:324\n211#1:325,6\n239#1:331,6\n257#1:337\n257#1:338,6\n*E\n"})
/* loaded from: classes3.dex */
class o0 extends n0 {
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    @p4.l
    @kotlin.g1(version = "1.1")
    public static final <T, K, R> Map<K, R> c(@p4.l l0<T, ? extends K> l0Var, @p4.l v3.r<? super K, ? super R, ? super T, ? super Boolean, ? extends R> operation) {
        boolean z4;
        kotlin.jvm.internal.l0.p(l0Var, "<this>");
        kotlin.jvm.internal.l0.p(operation, "operation");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> b5 = l0Var.b();
        while (b5.hasNext()) {
            ?? next = b5.next();
            Object a5 = l0Var.a(next);
            a1.a aVar = (Object) linkedHashMap.get(a5);
            if (aVar == null && !linkedHashMap.containsKey(a5)) {
                z4 = true;
            } else {
                z4 = false;
            }
            linkedHashMap.put(a5, operation.invoke(a5, aVar, next, Boolean.valueOf(z4)));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    @p4.l
    @kotlin.g1(version = "1.1")
    public static final <T, K, R, M extends Map<? super K, R>> M d(@p4.l l0<T, ? extends K> l0Var, @p4.l M destination, @p4.l v3.r<? super K, ? super R, ? super T, ? super Boolean, ? extends R> operation) {
        boolean z4;
        kotlin.jvm.internal.l0.p(l0Var, "<this>");
        kotlin.jvm.internal.l0.p(destination, "destination");
        kotlin.jvm.internal.l0.p(operation, "operation");
        Iterator<T> b5 = l0Var.b();
        while (b5.hasNext()) {
            ?? next = b5.next();
            Object a5 = l0Var.a(next);
            a1.a aVar = (Object) destination.get(a5);
            if (aVar == null && !destination.containsKey(a5)) {
                z4 = true;
            } else {
                z4 = false;
            }
            destination.put(a5, operation.invoke(a5, aVar, next, Boolean.valueOf(z4)));
        }
        return destination;
    }

    @p4.l
    @kotlin.g1(version = "1.1")
    public static final <T, K, M extends Map<? super K, Integer>> M e(@p4.l l0<T, ? extends K> l0Var, @p4.l M destination) {
        boolean z4;
        kotlin.jvm.internal.l0.p(l0Var, "<this>");
        kotlin.jvm.internal.l0.p(destination, "destination");
        Iterator<T> b5 = l0Var.b();
        while (b5.hasNext()) {
            K a5 = l0Var.a(b5.next());
            Object obj = destination.get(a5);
            if (obj == null && !destination.containsKey(a5)) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                obj = 0;
            }
            destination.put(a5, Integer.valueOf(((Number) obj).intValue() + 1));
        }
        return destination;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    @p4.l
    @kotlin.g1(version = "1.1")
    public static final <T, K, R> Map<K, R> f(@p4.l l0<T, ? extends K> l0Var, R r5, @p4.l v3.p<? super R, ? super T, ? extends R> operation) {
        boolean z4;
        kotlin.jvm.internal.l0.p(l0Var, "<this>");
        kotlin.jvm.internal.l0.p(operation, "operation");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> b5 = l0Var.b();
        while (b5.hasNext()) {
            ?? next = b5.next();
            K a5 = l0Var.a(next);
            a1.b bVar = (Object) linkedHashMap.get(a5);
            if (bVar == null && !linkedHashMap.containsKey(a5)) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                bVar = (Object) r5;
            }
            linkedHashMap.put(a5, operation.invoke(bVar, next));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    @p4.l
    @kotlin.g1(version = "1.1")
    public static final <T, K, R> Map<K, R> g(@p4.l l0<T, ? extends K> l0Var, @p4.l v3.p<? super K, ? super T, ? extends R> initialValueSelector, @p4.l v3.q<? super K, ? super R, ? super T, ? extends R> operation) {
        boolean z4;
        kotlin.jvm.internal.l0.p(l0Var, "<this>");
        kotlin.jvm.internal.l0.p(initialValueSelector, "initialValueSelector");
        kotlin.jvm.internal.l0.p(operation, "operation");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> b5 = l0Var.b();
        while (b5.hasNext()) {
            ?? next = b5.next();
            Object a5 = l0Var.a(next);
            R r5 = (Object) linkedHashMap.get(a5);
            if (r5 == null && !linkedHashMap.containsKey(a5)) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                r5 = initialValueSelector.invoke(a5, next);
            }
            linkedHashMap.put(a5, operation.invoke(a5, r5, next));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    @p4.l
    @kotlin.g1(version = "1.1")
    public static final <T, K, R, M extends Map<? super K, R>> M h(@p4.l l0<T, ? extends K> l0Var, @p4.l M destination, R r5, @p4.l v3.p<? super R, ? super T, ? extends R> operation) {
        boolean z4;
        kotlin.jvm.internal.l0.p(l0Var, "<this>");
        kotlin.jvm.internal.l0.p(destination, "destination");
        kotlin.jvm.internal.l0.p(operation, "operation");
        Iterator<T> b5 = l0Var.b();
        while (b5.hasNext()) {
            ?? next = b5.next();
            K a5 = l0Var.a(next);
            a1.b bVar = (Object) destination.get(a5);
            if (bVar == null && !destination.containsKey(a5)) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                bVar = (Object) r5;
            }
            destination.put(a5, operation.invoke(bVar, next));
        }
        return destination;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    @p4.l
    @kotlin.g1(version = "1.1")
    public static final <T, K, R, M extends Map<? super K, R>> M i(@p4.l l0<T, ? extends K> l0Var, @p4.l M destination, @p4.l v3.p<? super K, ? super T, ? extends R> initialValueSelector, @p4.l v3.q<? super K, ? super R, ? super T, ? extends R> operation) {
        boolean z4;
        kotlin.jvm.internal.l0.p(l0Var, "<this>");
        kotlin.jvm.internal.l0.p(destination, "destination");
        kotlin.jvm.internal.l0.p(initialValueSelector, "initialValueSelector");
        kotlin.jvm.internal.l0.p(operation, "operation");
        Iterator<T> b5 = l0Var.b();
        while (b5.hasNext()) {
            ?? next = b5.next();
            Object a5 = l0Var.a(next);
            R r5 = (Object) destination.get(a5);
            if (r5 == null && !destination.containsKey(a5)) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                r5 = initialValueSelector.invoke(a5, next);
            }
            destination.put(a5, operation.invoke(a5, r5, next));
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @p4.l
    @kotlin.g1(version = "1.1")
    public static final <S, T extends S, K> Map<K, S> j(@p4.l l0<T, ? extends K> l0Var, @p4.l v3.q<? super K, ? super S, ? super T, ? extends S> operation) {
        boolean z4;
        kotlin.jvm.internal.l0.p(l0Var, "<this>");
        kotlin.jvm.internal.l0.p(operation, "operation");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator b5 = l0Var.b();
        while (b5.hasNext()) {
            S s5 = (Object) b5.next();
            Object a5 = l0Var.a(s5);
            a1.a aVar = (Object) linkedHashMap.get(a5);
            if (aVar == null && !linkedHashMap.containsKey(a5)) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z4) {
                s5 = operation.invoke(a5, aVar, s5);
            }
            linkedHashMap.put(a5, s5);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @p4.l
    @kotlin.g1(version = "1.1")
    public static final <S, T extends S, K, M extends Map<? super K, S>> M k(@p4.l l0<T, ? extends K> l0Var, @p4.l M destination, @p4.l v3.q<? super K, ? super S, ? super T, ? extends S> operation) {
        boolean z4;
        kotlin.jvm.internal.l0.p(l0Var, "<this>");
        kotlin.jvm.internal.l0.p(destination, "destination");
        kotlin.jvm.internal.l0.p(operation, "operation");
        Iterator b5 = l0Var.b();
        while (b5.hasNext()) {
            S s5 = (Object) b5.next();
            Object a5 = l0Var.a(s5);
            a1.a aVar = (Object) destination.get(a5);
            if (aVar == null && !destination.containsKey(a5)) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z4) {
                s5 = operation.invoke(a5, aVar, s5);
            }
            destination.put(a5, s5);
        }
        return destination;
    }
}
