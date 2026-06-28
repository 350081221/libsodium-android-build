package kotlin.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Random;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000T\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u0001\u001a?\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0006\u001a\u00020\u00072\u001d\u0010\b\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0004\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u000bH\u0081\bø\u0001\u0000\u001a7\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u001d\u0010\b\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0004\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u000bH\u0081\bø\u0001\u0000\u001a\u0011\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007H\u0081\b\u001a\u0011\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007H\u0081\b\u001a\"\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00112\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0014H\u0081\b¢\u0006\u0002\u0010\u0015\u001a4\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00160\u0011\"\u0004\b\u0000\u0010\u00162\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00160\u0011H\u0081\b¢\u0006\u0002\u0010\u0018\u001a\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004\"\u0004\b\u0000\u0010\u0002H\u0001\u001a\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u001a\u001f\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00160\u0001\"\u0004\b\u0000\u0010\u00162\u0006\u0010\u001b\u001a\u0002H\u0016¢\u0006\u0002\u0010\u001c\u001a1\u0010\u001d\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00120\u0011\"\u0004\b\u0000\u0010\u0016*\n\u0012\u0006\b\u0001\u0012\u0002H\u00160\u00112\u0006\u0010\u001e\u001a\u00020\u001fH\u0000¢\u0006\u0002\u0010 \u001a\u001e\u0010!\u001a\b\u0012\u0004\u0012\u0002H\u00160\u0001\"\u0004\b\u0000\u0010\u0016*\b\u0012\u0004\u0012\u0002H\u00160\"H\u0007\u001a&\u0010!\u001a\b\u0012\u0004\u0012\u0002H\u00160\u0001\"\u0004\b\u0000\u0010\u0016*\b\u0012\u0004\u0012\u0002H\u00160\"2\u0006\u0010#\u001a\u00020$H\u0007\u001a\u001f\u0010%\u001a\b\u0012\u0004\u0012\u0002H\u00160\u0001\"\u0004\b\u0000\u0010\u0016*\b\u0012\u0004\u0012\u0002H\u00160&H\u0087\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006'"}, d2 = {"build", "", "E", "builder", "", "buildListInternal", "capacity", "", "builderAction", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "checkCountOverflow", "count", "checkIndexOverflow", "index", "copyToArrayImpl", "", "", "collection", "", "(Ljava/util/Collection;)[Ljava/lang/Object;", "T", "array", "(Ljava/util/Collection;[Ljava/lang/Object;)[Ljava/lang/Object;", "createListBuilder", "listOf", "element", "(Ljava/lang/Object;)Ljava/util/List;", "copyToArrayOfAny", "isVarargs", "", "([Ljava/lang/Object;Z)[Ljava/lang/Object;", "shuffled", "", "random", "Ljava/util/Random;", "toList", "Ljava/util/Enumeration;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
@kotlin.jvm.internal.r1({"SMAP\nCollectionsJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionsJVM.kt\nkotlin/collections/CollectionsKt__CollectionsJVMKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,122:1\n1#2:123\n*E\n"})
/* loaded from: classes3.dex */
public class v {
    @p4.l
    @kotlin.g1(version = "1.3")
    @kotlin.a1
    public static <E> List<E> a(@p4.l List<E> builder) {
        kotlin.jvm.internal.l0.p(builder, "builder");
        return ((kotlin.collections.builders.b) builder).build();
    }

    @kotlin.g1(version = "1.3")
    @kotlin.a1
    @kotlin.internal.f
    private static final <E> List<E> b(int i5, v3.l<? super List<E>, r2> builderAction) {
        List j5;
        List<E> a5;
        kotlin.jvm.internal.l0.p(builderAction, "builderAction");
        j5 = j(i5);
        builderAction.invoke(j5);
        a5 = a(j5);
        return a5;
    }

    @kotlin.g1(version = "1.3")
    @kotlin.a1
    @kotlin.internal.f
    private static final <E> List<E> c(v3.l<? super List<E>, r2> builderAction) {
        List i5;
        List<E> a5;
        kotlin.jvm.internal.l0.p(builderAction, "builderAction");
        i5 = i();
        builderAction.invoke(i5);
        a5 = a(i5);
        return a5;
    }

    @kotlin.g1(version = "1.3")
    @kotlin.a1
    @kotlin.internal.f
    private static final int d(int i5) {
        if (i5 < 0) {
            if (kotlin.internal.m.a(1, 3, 0)) {
                w.V();
            } else {
                throw new ArithmeticException("Count overflow has happened.");
            }
        }
        return i5;
    }

    @kotlin.g1(version = "1.3")
    @kotlin.a1
    @kotlin.internal.f
    private static final int e(int i5) {
        if (i5 < 0) {
            if (kotlin.internal.m.a(1, 3, 0)) {
                w.W();
            } else {
                throw new ArithmeticException("Index overflow has happened.");
            }
        }
        return i5;
    }

    @kotlin.internal.f
    private static final Object[] f(Collection<?> collection) {
        kotlin.jvm.internal.l0.p(collection, "collection");
        return kotlin.jvm.internal.v.a(collection);
    }

    @kotlin.internal.f
    private static final <T> T[] g(Collection<?> collection, T[] array) {
        kotlin.jvm.internal.l0.p(collection, "collection");
        kotlin.jvm.internal.l0.p(array, "array");
        return (T[]) kotlin.jvm.internal.v.b(collection, array);
    }

    @p4.l
    public static final <T> Object[] h(@p4.l T[] tArr, boolean z4) {
        kotlin.jvm.internal.l0.p(tArr, "<this>");
        if (!z4 || !kotlin.jvm.internal.l0.g(tArr.getClass(), Object[].class)) {
            Object[] copyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
            kotlin.jvm.internal.l0.o(copyOf, "copyOf(this, this.size, Array<Any?>::class.java)");
            return copyOf;
        }
        return tArr;
    }

    @p4.l
    @kotlin.g1(version = "1.3")
    @kotlin.a1
    public static <E> List<E> i() {
        return new kotlin.collections.builders.b();
    }

    @p4.l
    @kotlin.g1(version = "1.3")
    @kotlin.a1
    public static <E> List<E> j(int i5) {
        return new kotlin.collections.builders.b(i5);
    }

    @p4.l
    public static <T> List<T> k(T t5) {
        List<T> singletonList = Collections.singletonList(t5);
        kotlin.jvm.internal.l0.o(singletonList, "singletonList(element)");
        return singletonList;
    }

    @p4.l
    @kotlin.g1(version = "1.2")
    public static final <T> List<T> l(@p4.l Iterable<? extends T> iterable) {
        kotlin.jvm.internal.l0.p(iterable, "<this>");
        List<T> U5 = e0.U5(iterable);
        Collections.shuffle(U5);
        return U5;
    }

    @p4.l
    @kotlin.g1(version = "1.2")
    public static final <T> List<T> m(@p4.l Iterable<? extends T> iterable, @p4.l Random random) {
        kotlin.jvm.internal.l0.p(iterable, "<this>");
        kotlin.jvm.internal.l0.p(random, "random");
        List<T> U5 = e0.U5(iterable);
        Collections.shuffle(U5, random);
        return U5;
    }

    @kotlin.internal.f
    private static final <T> List<T> n(Enumeration<T> enumeration) {
        kotlin.jvm.internal.l0.p(enumeration, "<this>");
        ArrayList list = Collections.list(enumeration);
        kotlin.jvm.internal.l0.o(list, "list(this)");
        return list;
    }
}
