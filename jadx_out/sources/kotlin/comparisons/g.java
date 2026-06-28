package kotlin.comparisons;

import com.umeng.analytics.pro.bi;
import java.util.Comparator;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a>\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u00022\u001a\b\u0004\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u0005H\u0087\bø\u0001\u0000\u001aY\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u000226\u0010\u0007\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u00050\b\"\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u0005¢\u0006\u0002\u0010\t\u001aZ\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\n2\u001a\u0010\u000b\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\n0\u0001j\n\u0012\u0006\b\u0000\u0012\u0002H\n`\u00032\u0014\b\u0004\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\n0\u0005H\u0087\bø\u0001\u0000\u001a>\u0010\f\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u00022\u001a\b\u0004\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u0005H\u0087\bø\u0001\u0000\u001aZ\u0010\f\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\n2\u001a\u0010\u000b\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\n0\u0001j\n\u0012\u0006\b\u0000\u0012\u0002H\n`\u00032\u0014\b\u0004\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\n0\u0005H\u0087\bø\u0001\u0000\u001a-\u0010\r\u001a\u00020\u000e\"\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00062\b\u0010\u000f\u001a\u0004\u0018\u0001H\u00022\b\u0010\u0010\u001a\u0004\u0018\u0001H\u0002¢\u0006\u0002\u0010\u0011\u001aA\u0010\u0012\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u000f\u001a\u0002H\u00022\u0006\u0010\u0010\u001a\u0002H\u00022\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u0005H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0013\u001aY\u0010\u0012\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u000f\u001a\u0002H\u00022\u0006\u0010\u0010\u001a\u0002H\u000226\u0010\u0007\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u00050\b\"\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u0005¢\u0006\u0002\u0010\u0014\u001a]\u0010\u0012\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\n2\u0006\u0010\u000f\u001a\u0002H\u00022\u0006\u0010\u0010\u001a\u0002H\u00022\u001a\u0010\u000b\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\n0\u0001j\n\u0012\u0006\b\u0000\u0012\u0002H\n`\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\n0\u0005H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0015\u001aG\u0010\u0016\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u000f\u001a\u0002H\u00022\u0006\u0010\u0010\u001a\u0002H\u00022 \u0010\u0007\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u00050\bH\u0002¢\u0006\u0004\b\u0017\u0010\u0014\u001a&\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0006\u001a-\u0010\u0019\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0001j\n\u0012\u0006\u0012\u0004\u0018\u0001H\u0002`\u0003\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0006H\u0087\b\u001a@\u0010\u0019\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0001j\n\u0012\u0006\u0012\u0004\u0018\u0001H\u0002`\u0003\"\b\b\u0000\u0010\u0002*\u00020\u001a2\u001a\u0010\u000b\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u00020\u0001j\n\u0012\u0006\b\u0000\u0012\u0002H\u0002`\u0003\u001a-\u0010\u001b\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0001j\n\u0012\u0006\u0012\u0004\u0018\u0001H\u0002`\u0003\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0006H\u0087\b\u001a@\u0010\u001b\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0001j\n\u0012\u0006\u0012\u0004\u0018\u0001H\u0002`\u0003\"\b\b\u0000\u0010\u0002*\u00020\u001a2\u001a\u0010\u000b\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u00020\u0001j\n\u0012\u0006\b\u0000\u0012\u0002H\u0002`\u0003\u001a&\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0006\u001a0\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002*\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\u001aO\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002*\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u00032\u001a\u0010\u000b\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u00020\u0001j\n\u0012\u0006\b\u0000\u0012\u0002H\u0002`\u0003H\u0086\u0004\u001aR\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002*\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u00032\u001a\b\u0004\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u0005H\u0087\bø\u0001\u0000\u001an\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\n*\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u00032\u001a\u0010\u000b\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\n0\u0001j\n\u0012\u0006\b\u0000\u0012\u0002H\n`\u00032\u0014\b\u0004\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\n0\u0005H\u0087\bø\u0001\u0000\u001aR\u0010 \u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002*\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u00032\u001a\b\u0004\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u0005H\u0087\bø\u0001\u0000\u001an\u0010 \u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\n*\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u00032\u001a\u0010\u000b\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\n0\u0001j\n\u0012\u0006\b\u0000\u0012\u0002H\n`\u00032\u0014\b\u0004\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\n0\u0005H\u0087\bø\u0001\u0000\u001ap\u0010!\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002*\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u000328\b\u0004\u0010\"\u001a2\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u000e0#H\u0087\bø\u0001\u0000\u001aO\u0010&\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002*\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u00032\u001a\u0010\u000b\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u00020\u0001j\n\u0012\u0006\b\u0000\u0012\u0002H\u0002`\u0003H\u0086\u0004\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006'"}, d2 = {"compareBy", "Ljava/util/Comparator;", "T", "Lkotlin/Comparator;", "selector", "Lkotlin/Function1;", "", "selectors", "", "([Lkotlin/jvm/functions/Function1;)Ljava/util/Comparator;", "K", "comparator", "compareByDescending", "compareValues", "", bi.ay, "b", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)I", "compareValuesBy", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)I", "(Ljava/lang/Object;Ljava/lang/Object;[Lkotlin/jvm/functions/Function1;)I", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;Lkotlin/jvm/functions/Function1;)I", "compareValuesByImpl", "compareValuesByImpl$ComparisonsKt__ComparisonsKt", "naturalOrder", "nullsFirst", "", "nullsLast", "reverseOrder", "reversed", "then", "thenBy", "thenByDescending", "thenComparator", "comparison", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "thenDescending", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/comparisons/ComparisonsKt")
/* loaded from: classes3.dex */
public class g {

    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", bi.ay, "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I"}, k = 3, mv = {1, 9, 0}, xi = 176)
    @r1({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n*L\n1#1,328:1\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class a<T> implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ v3.l<T, Comparable<?>> f19201a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(v3.l<? super T, ? extends Comparable<?>> lVar) {
            this.f19201a = lVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t5, T t6) {
            int l5;
            v3.l<T, Comparable<?>> lVar = this.f19201a;
            l5 = g.l(lVar.invoke(t5), lVar.invoke(t6));
            return l5;
        }
    }

    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u000e\u0010\u0004\u001a\n \u0005*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0006\u001a\n \u0005*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "T", "K", bi.ay, "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I"}, k = 3, mv = {1, 9, 0}, xi = 176)
    @r1({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$3\n*L\n1#1,328:1\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class b<T> implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Comparator<? super K> f19202a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ v3.l<T, K> f19203b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Comparator<? super K> comparator, v3.l<? super T, ? extends K> lVar) {
            this.f19202a = comparator;
            this.f19203b = lVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t5, T t6) {
            Comparator<? super K> comparator = this.f19202a;
            v3.l<T, K> lVar = this.f19203b;
            return comparator.compare(lVar.invoke(t5), lVar.invoke(t6));
        }
    }

    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", bi.ay, "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I"}, k = 3, mv = {1, 9, 0}, xi = 176)
    @r1({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n*L\n1#1,328:1\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class c<T> implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ v3.l<T, Comparable<?>> f19204a;

        /* JADX WARN: Multi-variable type inference failed */
        public c(v3.l<? super T, ? extends Comparable<?>> lVar) {
            this.f19204a = lVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t5, T t6) {
            int l5;
            v3.l<T, Comparable<?>> lVar = this.f19204a;
            l5 = g.l(lVar.invoke(t6), lVar.invoke(t5));
            return l5;
        }
    }

    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u000e\u0010\u0004\u001a\n \u0005*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0006\u001a\n \u0005*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "T", "K", bi.ay, "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I"}, k = 3, mv = {1, 9, 0}, xi = 176)
    @r1({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$2\n*L\n1#1,328:1\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class d<T> implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Comparator<? super K> f19205a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ v3.l<T, K> f19206b;

        /* JADX WARN: Multi-variable type inference failed */
        public d(Comparator<? super K> comparator, v3.l<? super T, ? extends K> lVar) {
            this.f19205a = comparator;
            this.f19206b = lVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t5, T t6) {
            Comparator<? super K> comparator = this.f19205a;
            v3.l<T, K> lVar = this.f19206b;
            return comparator.compare(lVar.invoke(t6), lVar.invoke(t5));
        }
    }

    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", bi.ay, "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I"}, k = 3, mv = {1, 9, 0}, xi = 176)
    @r1({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenBy$1\n*L\n1#1,328:1\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class e<T> implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Comparator<T> f19207a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ v3.l<T, Comparable<?>> f19208b;

        /* JADX WARN: Multi-variable type inference failed */
        public e(Comparator<T> comparator, v3.l<? super T, ? extends Comparable<?>> lVar) {
            this.f19207a = comparator;
            this.f19208b = lVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t5, T t6) {
            int l5;
            int compare = this.f19207a.compare(t5, t6);
            if (compare == 0) {
                v3.l<T, Comparable<?>> lVar = this.f19208b;
                l5 = g.l(lVar.invoke(t5), lVar.invoke(t6));
                return l5;
            }
            return compare;
        }
    }

    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u000e\u0010\u0004\u001a\n \u0005*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0006\u001a\n \u0005*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "T", "K", bi.ay, "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I"}, k = 3, mv = {1, 9, 0}, xi = 176)
    @r1({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenBy$2\n*L\n1#1,328:1\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class f<T> implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Comparator<T> f19209a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Comparator<? super K> f19210b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ v3.l<T, K> f19211c;

        /* JADX WARN: Multi-variable type inference failed */
        public f(Comparator<T> comparator, Comparator<? super K> comparator2, v3.l<? super T, ? extends K> lVar) {
            this.f19209a = comparator;
            this.f19210b = comparator2;
            this.f19211c = lVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t5, T t6) {
            int compare = this.f19209a.compare(t5, t6);
            if (compare == 0) {
                Comparator<? super K> comparator = this.f19210b;
                v3.l<T, K> lVar = this.f19211c;
                return comparator.compare(lVar.invoke(t5), lVar.invoke(t6));
            }
            return compare;
        }
    }

    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", bi.ay, "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I"}, k = 3, mv = {1, 9, 0}, xi = 176)
    @r1({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenByDescending$1\n*L\n1#1,328:1\n*E\n"})
    /* renamed from: kotlin.comparisons.g$g, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0549g<T> implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Comparator<T> f19212a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ v3.l<T, Comparable<?>> f19213b;

        /* JADX WARN: Multi-variable type inference failed */
        public C0549g(Comparator<T> comparator, v3.l<? super T, ? extends Comparable<?>> lVar) {
            this.f19212a = comparator;
            this.f19213b = lVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t5, T t6) {
            int l5;
            int compare = this.f19212a.compare(t5, t6);
            if (compare == 0) {
                v3.l<T, Comparable<?>> lVar = this.f19213b;
                l5 = g.l(lVar.invoke(t6), lVar.invoke(t5));
                return l5;
            }
            return compare;
        }
    }

    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u000e\u0010\u0004\u001a\n \u0005*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0006\u001a\n \u0005*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "T", "K", bi.ay, "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I"}, k = 3, mv = {1, 9, 0}, xi = 176)
    @r1({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenByDescending$2\n*L\n1#1,328:1\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class h<T> implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Comparator<T> f19214a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Comparator<? super K> f19215b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ v3.l<T, K> f19216c;

        /* JADX WARN: Multi-variable type inference failed */
        public h(Comparator<T> comparator, Comparator<? super K> comparator2, v3.l<? super T, ? extends K> lVar) {
            this.f19214a = comparator;
            this.f19215b = comparator2;
            this.f19216c = lVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t5, T t6) {
            int compare = this.f19214a.compare(t5, t6);
            if (compare == 0) {
                Comparator<? super K> comparator = this.f19215b;
                v3.l<T, K> lVar = this.f19216c;
                return comparator.compare(lVar.invoke(t6), lVar.invoke(t5));
            }
            return compare;
        }
    }

    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", bi.ay, "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I"}, k = 3, mv = {1, 9, 0}, xi = 176)
    @r1({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenComparator$1\n*L\n1#1,328:1\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class i<T> implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Comparator<T> f19217a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ p<T, T, Integer> f19218b;

        /* JADX WARN: Multi-variable type inference failed */
        public i(Comparator<T> comparator, p<? super T, ? super T, Integer> pVar) {
            this.f19217a = comparator;
            this.f19218b = pVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t5, T t6) {
            int compare = this.f19217a.compare(t5, t6);
            if (compare == 0) {
                return this.f19218b.invoke(t5, t6).intValue();
            }
            return compare;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int A(Comparator this_then, Comparator comparator, Object obj, Object obj2) {
        l0.p(this_then, "$this_then");
        l0.p(comparator, "$comparator");
        int compare = this_then.compare(obj, obj2);
        if (compare == 0) {
            return comparator.compare(obj, obj2);
        }
        return compare;
    }

    @kotlin.internal.f
    private static final <T, K> Comparator<T> B(Comparator<T> comparator, Comparator<? super K> comparator2, v3.l<? super T, ? extends K> selector) {
        l0.p(comparator, "<this>");
        l0.p(comparator2, "comparator");
        l0.p(selector, "selector");
        return new f(comparator, comparator2, selector);
    }

    @kotlin.internal.f
    private static final <T> Comparator<T> C(Comparator<T> comparator, v3.l<? super T, ? extends Comparable<?>> selector) {
        l0.p(comparator, "<this>");
        l0.p(selector, "selector");
        return new e(comparator, selector);
    }

    @kotlin.internal.f
    private static final <T, K> Comparator<T> D(Comparator<T> comparator, Comparator<? super K> comparator2, v3.l<? super T, ? extends K> selector) {
        l0.p(comparator, "<this>");
        l0.p(comparator2, "comparator");
        l0.p(selector, "selector");
        return new h(comparator, comparator2, selector);
    }

    @kotlin.internal.f
    private static final <T> Comparator<T> E(Comparator<T> comparator, v3.l<? super T, ? extends Comparable<?>> selector) {
        l0.p(comparator, "<this>");
        l0.p(selector, "selector");
        return new C0549g(comparator, selector);
    }

    @kotlin.internal.f
    private static final <T> Comparator<T> F(Comparator<T> comparator, p<? super T, ? super T, Integer> comparison) {
        l0.p(comparator, "<this>");
        l0.p(comparison, "comparison");
        return new i(comparator, comparison);
    }

    @p4.l
    public static final <T> Comparator<T> G(@p4.l final Comparator<T> comparator, @p4.l final Comparator<? super T> comparator2) {
        l0.p(comparator, "<this>");
        l0.p(comparator2, "comparator");
        return new Comparator() { // from class: kotlin.comparisons.d
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int H;
                H = g.H(comparator, comparator2, obj, obj2);
                return H;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int H(Comparator this_thenDescending, Comparator comparator, Object obj, Object obj2) {
        l0.p(this_thenDescending, "$this_thenDescending");
        l0.p(comparator, "$comparator");
        int compare = this_thenDescending.compare(obj, obj2);
        if (compare == 0) {
            return comparator.compare(obj2, obj);
        }
        return compare;
    }

    @kotlin.internal.f
    private static final <T, K> Comparator<T> f(Comparator<? super K> comparator, v3.l<? super T, ? extends K> selector) {
        l0.p(comparator, "comparator");
        l0.p(selector, "selector");
        return new b(comparator, selector);
    }

    @kotlin.internal.f
    private static final <T> Comparator<T> g(v3.l<? super T, ? extends Comparable<?>> selector) {
        l0.p(selector, "selector");
        return new a(selector);
    }

    @p4.l
    public static final <T> Comparator<T> h(@p4.l final v3.l<? super T, ? extends Comparable<?>>... selectors) {
        boolean z4;
        l0.p(selectors, "selectors");
        if (selectors.length > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return new Comparator() { // from class: kotlin.comparisons.c
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int i5;
                    i5 = g.i(selectors, obj, obj2);
                    return i5;
                }
            };
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int i(v3.l[] selectors, Object obj, Object obj2) {
        l0.p(selectors, "$selectors");
        return p(obj, obj2, selectors);
    }

    @kotlin.internal.f
    private static final <T, K> Comparator<T> j(Comparator<? super K> comparator, v3.l<? super T, ? extends K> selector) {
        l0.p(comparator, "comparator");
        l0.p(selector, "selector");
        return new d(comparator, selector);
    }

    @kotlin.internal.f
    private static final <T> Comparator<T> k(v3.l<? super T, ? extends Comparable<?>> selector) {
        l0.p(selector, "selector");
        return new c(selector);
    }

    public static <T extends Comparable<?>> int l(@p4.m T t5, @p4.m T t6) {
        if (t5 == t6) {
            return 0;
        }
        if (t5 == null) {
            return -1;
        }
        if (t6 == null) {
            return 1;
        }
        return t5.compareTo(t6);
    }

    @kotlin.internal.f
    private static final <T, K> int m(T t5, T t6, Comparator<? super K> comparator, v3.l<? super T, ? extends K> selector) {
        l0.p(comparator, "comparator");
        l0.p(selector, "selector");
        return comparator.compare(selector.invoke(t5), selector.invoke(t6));
    }

    @kotlin.internal.f
    private static final <T> int n(T t5, T t6, v3.l<? super T, ? extends Comparable<?>> selector) {
        int l5;
        l0.p(selector, "selector");
        l5 = l(selector.invoke(t5), selector.invoke(t6));
        return l5;
    }

    public static final <T> int o(T t5, T t6, @p4.l v3.l<? super T, ? extends Comparable<?>>... selectors) {
        boolean z4;
        l0.p(selectors, "selectors");
        if (selectors.length > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return p(t5, t6, selectors);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    private static final <T> int p(T t5, T t6, v3.l<? super T, ? extends Comparable<?>>[] lVarArr) {
        int l5;
        for (v3.l<? super T, ? extends Comparable<?>> lVar : lVarArr) {
            l5 = l(lVar.invoke(t5), lVar.invoke(t6));
            if (l5 != 0) {
                return l5;
            }
        }
        return 0;
    }

    @p4.l
    public static <T extends Comparable<? super T>> Comparator<T> q() {
        j jVar = j.f19219a;
        l0.n(jVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder> }");
        return jVar;
    }

    @kotlin.internal.f
    private static final <T extends Comparable<? super T>> Comparator<T> r() {
        Comparator q5;
        q5 = q();
        return s(q5);
    }

    @p4.l
    public static final <T> Comparator<T> s(@p4.l final Comparator<? super T> comparator) {
        l0.p(comparator, "comparator");
        return new Comparator() { // from class: kotlin.comparisons.e
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int t5;
                t5 = g.t(comparator, obj, obj2);
                return t5;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int t(Comparator comparator, Object obj, Object obj2) {
        l0.p(comparator, "$comparator");
        if (obj == obj2) {
            return 0;
        }
        if (obj == null) {
            return -1;
        }
        if (obj2 == null) {
            return 1;
        }
        return comparator.compare(obj, obj2);
    }

    @kotlin.internal.f
    private static final <T extends Comparable<? super T>> Comparator<T> u() {
        Comparator q5;
        q5 = q();
        return v(q5);
    }

    @p4.l
    public static final <T> Comparator<T> v(@p4.l final Comparator<? super T> comparator) {
        l0.p(comparator, "comparator");
        return new Comparator() { // from class: kotlin.comparisons.f
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int w4;
                w4 = g.w(comparator, obj, obj2);
                return w4;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int w(Comparator comparator, Object obj, Object obj2) {
        l0.p(comparator, "$comparator");
        if (obj == obj2) {
            return 0;
        }
        if (obj == null) {
            return 1;
        }
        if (obj2 == null) {
            return -1;
        }
        return comparator.compare(obj, obj2);
    }

    @p4.l
    public static <T extends Comparable<? super T>> Comparator<T> x() {
        k kVar = k.f19220a;
        l0.n(kVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reverseOrder>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reverseOrder> }");
        return kVar;
    }

    @p4.l
    public static final <T> Comparator<T> y(@p4.l Comparator<T> comparator) {
        l0.p(comparator, "<this>");
        if (comparator instanceof l) {
            return ((l) comparator).a();
        }
        Comparator<T> comparator2 = j.f19219a;
        if (l0.g(comparator, comparator2)) {
            k kVar = k.f19220a;
            l0.n(kVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed> }");
            return kVar;
        }
        if (l0.g(comparator, k.f19220a)) {
            l0.n(comparator2, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed> }");
        } else {
            comparator2 = new l<>(comparator);
        }
        return comparator2;
    }

    @p4.l
    public static final <T> Comparator<T> z(@p4.l final Comparator<T> comparator, @p4.l final Comparator<? super T> comparator2) {
        l0.p(comparator, "<this>");
        l0.p(comparator2, "comparator");
        return new Comparator() { // from class: kotlin.comparisons.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int A;
                A = g.A(comparator, comparator2, obj, obj2);
                return A;
            }
        };
    }
}
