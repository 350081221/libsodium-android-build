package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a.\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004H\u0087\bø\u0001\u0000\u001a \u0010\u0006\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\b\u001a\u00020\u0007H\u0001\u001a\u001f\u0010\t\u001a\u0004\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0001¢\u0006\u0002\u0010\n\u001a\"\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\f\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00010\u0001\u001a@\u0010\r\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000f0\f0\u000e\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u000f*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u000f0\u000e0\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0010"}, d2 = {"Iterable", "", "T", "iterator", "Lkotlin/Function0;", "", "collectionSizeOrDefault", "", "default", "collectionSizeOrNull", "(Ljava/lang/Iterable;)Ljava/lang/Integer;", "flatten", "", "unzip", "Lkotlin/Pair;", "R", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
/* loaded from: classes3.dex */
public class x extends w {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.i0(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¨\u0006\u0004"}, d2 = {"kotlin/collections/CollectionsKt__IterablesKt$Iterable$1", "", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 176)
    @kotlin.jvm.internal.r1({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n*L\n1#1,70:1\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class a<T> implements Iterable<T>, w3.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ v3.a<Iterator<T>> f19191a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(v3.a<? extends Iterator<? extends T>> aVar) {
            this.f19191a = aVar;
        }

        @Override // java.lang.Iterable
        @p4.l
        public Iterator<T> iterator() {
            return this.f19191a.invoke();
        }
    }

    @kotlin.internal.f
    private static final <T> Iterable<T> X(v3.a<? extends Iterator<? extends T>> iterator) {
        kotlin.jvm.internal.l0.p(iterator, "iterator");
        return new a(iterator);
    }

    @kotlin.a1
    public static <T> int Y(@p4.l Iterable<? extends T> iterable, int i5) {
        kotlin.jvm.internal.l0.p(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return i5;
    }

    @kotlin.a1
    @p4.m
    public static final <T> Integer Z(@p4.l Iterable<? extends T> iterable) {
        kotlin.jvm.internal.l0.p(iterable, "<this>");
        if (iterable instanceof Collection) {
            return Integer.valueOf(((Collection) iterable).size());
        }
        return null;
    }

    @p4.l
    public static <T> List<T> a0(@p4.l Iterable<? extends Iterable<? extends T>> iterable) {
        kotlin.jvm.internal.l0.p(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends Iterable<? extends T>> it = iterable.iterator();
        while (it.hasNext()) {
            b0.n0(arrayList, it.next());
        }
        return arrayList;
    }

    @p4.l
    public static final <T, R> kotlin.u0<List<T>, List<R>> b0(@p4.l Iterable<? extends kotlin.u0<? extends T, ? extends R>> iterable) {
        int Y;
        kotlin.jvm.internal.l0.p(iterable, "<this>");
        Y = Y(iterable, 10);
        ArrayList arrayList = new ArrayList(Y);
        ArrayList arrayList2 = new ArrayList(Y);
        for (kotlin.u0<? extends T, ? extends R> u0Var : iterable) {
            arrayList.add(u0Var.getFirst());
            arrayList2.add(u0Var.getSecond());
        }
        return kotlin.q1.a(arrayList, arrayList2);
    }
}
