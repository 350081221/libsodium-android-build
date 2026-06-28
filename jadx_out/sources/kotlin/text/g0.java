package kotlin.text;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.b1;
import kotlin.collections.s0;
import kotlin.g1;
import kotlin.jvm.internal.r1;
import kotlin.t0;

@kotlin.i0(d1 = {"\u0000B\n\u0000\n\u0002\u0010\f\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0007¢\u0006\u0002\u0010\u0006\u001a;\u0010\u0007\u001a\u0004\u0018\u00010\u0001\"\u000e\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\t*\u00020\u00022\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u0002H\b0\u000bH\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\f\u001a/\u0010\r\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u001a\u0010\u000e\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00010\u000fj\n\u0012\u0006\b\u0000\u0012\u00020\u0001`\u0010H\u0007¢\u0006\u0002\u0010\u0011\u001a\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0007¢\u0006\u0002\u0010\u0006\u001a;\u0010\u0013\u001a\u0004\u0018\u00010\u0001\"\u000e\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\t*\u00020\u00022\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u0002H\b0\u000bH\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\f\u001a/\u0010\u0014\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u001a\u0010\u000e\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00010\u000fj\n\u0012\u0006\b\u0000\u0012\u00020\u0001`\u0010H\u0007¢\u0006\u0002\u0010\u0011\u001a)\u0010\u0015\u001a\u00020\u0016*\u00020\u00022\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00160\u000bH\u0087\bø\u0001\u0000¢\u0006\u0002\b\u0017\u001a)\u0010\u0015\u001a\u00020\u0018*\u00020\u00022\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00180\u000bH\u0087\bø\u0001\u0000¢\u0006\u0002\b\u0019\u001a\u0010\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u001b*\u00020\u0002\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001c"}, d2 = {"elementAt", "", "", "index", "", "max", "(Ljava/lang/CharSequence;)Ljava/lang/Character;", "maxBy", "R", "", "selector", "Lkotlin/Function1;", "(Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/Character;", "maxWith", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "(Ljava/lang/CharSequence;Ljava/util/Comparator;)Ljava/lang/Character;", "min", "minBy", "minWith", "sumOf", "Ljava/math/BigDecimal;", "sumOfBigDecimal", "Ljava/math/BigInteger;", "sumOfBigInteger", "toSortedSet", "Ljava/util/SortedSet;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/text/StringsKt")
@r1({"SMAP\n_StringsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _StringsJvm.kt\nkotlin/text/StringsKt___StringsJvmKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,108:1\n1239#2,14:109\n1521#2,14:123\n*S KotlinDebug\n*F\n+ 1 _StringsJvm.kt\nkotlin/text/StringsKt___StringsJvmKt\n*L\n45#1:109,14\n66#1:123,14\n*E\n"})
/* loaded from: classes4.dex */
class g0 extends f0 {
    @kotlin.internal.f
    private static final char U5(CharSequence charSequence, int i5) {
        kotlin.jvm.internal.l0.p(charSequence, "<this>");
        return charSequence.charAt(i5);
    }

    @kotlin.k(message = "Use maxOrNull instead.", replaceWith = @b1(expression = "this.maxOrNull()", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Character V5(CharSequence charSequence) {
        kotlin.jvm.internal.l0.p(charSequence, "<this>");
        return h0.N7(charSequence);
    }

    @kotlin.k(message = "Use maxByOrNull instead.", replaceWith = @b1(expression = "this.maxByOrNull(selector)", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Character W5(CharSequence charSequence, v3.l<? super Character, ? extends R> selector) {
        boolean z4;
        int g32;
        kotlin.jvm.internal.l0.p(charSequence, "<this>");
        kotlin.jvm.internal.l0.p(selector, "selector");
        if (charSequence.length() == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        g32 = f0.g3(charSequence);
        if (g32 == 0) {
            return Character.valueOf(charAt);
        }
        R invoke = selector.invoke(Character.valueOf(charAt));
        s0 it = new kotlin.ranges.l(1, g32).iterator();
        while (it.hasNext()) {
            char charAt2 = charSequence.charAt(it.nextInt());
            R invoke2 = selector.invoke(Character.valueOf(charAt2));
            if (invoke.compareTo(invoke2) < 0) {
                charAt = charAt2;
                invoke = invoke2;
            }
        }
        return Character.valueOf(charAt);
    }

    @kotlin.k(message = "Use maxWithOrNull instead.", replaceWith = @b1(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Character X5(CharSequence charSequence, Comparator comparator) {
        kotlin.jvm.internal.l0.p(charSequence, "<this>");
        kotlin.jvm.internal.l0.p(comparator, "comparator");
        return h0.P7(charSequence, comparator);
    }

    @kotlin.k(message = "Use minOrNull instead.", replaceWith = @b1(expression = "this.minOrNull()", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Character Y5(CharSequence charSequence) {
        kotlin.jvm.internal.l0.p(charSequence, "<this>");
        return h0.b8(charSequence);
    }

    @kotlin.k(message = "Use minByOrNull instead.", replaceWith = @b1(expression = "this.minByOrNull(selector)", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Character Z5(CharSequence charSequence, v3.l<? super Character, ? extends R> selector) {
        boolean z4;
        int g32;
        kotlin.jvm.internal.l0.p(charSequence, "<this>");
        kotlin.jvm.internal.l0.p(selector, "selector");
        if (charSequence.length() == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        g32 = f0.g3(charSequence);
        if (g32 == 0) {
            return Character.valueOf(charAt);
        }
        R invoke = selector.invoke(Character.valueOf(charAt));
        s0 it = new kotlin.ranges.l(1, g32).iterator();
        while (it.hasNext()) {
            char charAt2 = charSequence.charAt(it.nextInt());
            R invoke2 = selector.invoke(Character.valueOf(charAt2));
            if (invoke.compareTo(invoke2) > 0) {
                charAt = charAt2;
                invoke = invoke2;
            }
        }
        return Character.valueOf(charAt);
    }

    @kotlin.k(message = "Use minWithOrNull instead.", replaceWith = @b1(expression = "this.minWithOrNull(comparator)", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Character a6(CharSequence charSequence, Comparator comparator) {
        kotlin.jvm.internal.l0.p(charSequence, "<this>");
        kotlin.jvm.internal.l0.p(comparator, "comparator");
        return h0.d8(charSequence, comparator);
    }

    @u3.h(name = "sumOfBigDecimal")
    @g1(version = "1.4")
    @t0
    @kotlin.internal.f
    private static final BigDecimal b6(CharSequence charSequence, v3.l<? super Character, ? extends BigDecimal> selector) {
        kotlin.jvm.internal.l0.p(charSequence, "<this>");
        kotlin.jvm.internal.l0.p(selector, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        kotlin.jvm.internal.l0.o(valueOf, "valueOf(this.toLong())");
        for (int i5 = 0; i5 < charSequence.length(); i5++) {
            valueOf = valueOf.add(selector.invoke(Character.valueOf(charSequence.charAt(i5))));
            kotlin.jvm.internal.l0.o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @u3.h(name = "sumOfBigInteger")
    @g1(version = "1.4")
    @t0
    @kotlin.internal.f
    private static final BigInteger c6(CharSequence charSequence, v3.l<? super Character, ? extends BigInteger> selector) {
        kotlin.jvm.internal.l0.p(charSequence, "<this>");
        kotlin.jvm.internal.l0.p(selector, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        kotlin.jvm.internal.l0.o(valueOf, "valueOf(this.toLong())");
        for (int i5 = 0; i5 < charSequence.length(); i5++) {
            valueOf = valueOf.add(selector.invoke(Character.valueOf(charSequence.charAt(i5))));
            kotlin.jvm.internal.l0.o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @p4.l
    public static final SortedSet<Character> d6(@p4.l CharSequence charSequence) {
        Collection c9;
        kotlin.jvm.internal.l0.p(charSequence, "<this>");
        c9 = h0.c9(charSequence, new TreeSet());
        return (SortedSet) c9;
    }
}
