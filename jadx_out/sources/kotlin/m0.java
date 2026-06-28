package kotlin;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

@i0(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\b\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u0087\n\u001a\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\n\u001a\r\u0010\u0004\u001a\u00020\u0001*\u00020\u0001H\u0087\n\u001a\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\n\u001a\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\n\u001a\u0015\u0010\u0007\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\n\u001a\u0015\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\n\u001a\r\u0010\t\u001a\u00020\u0001*\u00020\nH\u0087\b\u001a\u0015\u0010\t\u001a\u00020\u0001*\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0087\b\u001a\r\u0010\t\u001a\u00020\u0001*\u00020\rH\u0087\b\u001a\u0015\u0010\t\u001a\u00020\u0001*\u00020\r2\u0006\u0010\u000b\u001a\u00020\fH\u0087\b\u001a\r\u0010\t\u001a\u00020\u0001*\u00020\u000eH\u0087\b\u001a\u0015\u0010\t\u001a\u00020\u0001*\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fH\u0087\b\u001a\r\u0010\t\u001a\u00020\u0001*\u00020\u000fH\u0087\b\u001a\u0015\u0010\t\u001a\u00020\u0001*\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\fH\u0087\b\u001a\r\u0010\u0010\u001a\u00020\u0001*\u00020\u0001H\u0087\n¨\u0006\u0011"}, d2 = {"dec", "Ljava/math/BigDecimal;", "div", "other", "inc", "minus", "plus", "rem", "times", "toBigDecimal", "", "mathContext", "Ljava/math/MathContext;", "", "", "", "unaryMinus", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/NumbersKt")
/* loaded from: classes3.dex */
class m0 {
    @g1(version = "1.2")
    @kotlin.internal.f
    private static final BigDecimal a(BigDecimal bigDecimal) {
        kotlin.jvm.internal.l0.p(bigDecimal, "<this>");
        BigDecimal subtract = bigDecimal.subtract(BigDecimal.ONE);
        kotlin.jvm.internal.l0.o(subtract, "this.subtract(BigDecimal.ONE)");
        return subtract;
    }

    @kotlin.internal.f
    private static final BigDecimal b(BigDecimal bigDecimal, BigDecimal other) {
        kotlin.jvm.internal.l0.p(bigDecimal, "<this>");
        kotlin.jvm.internal.l0.p(other, "other");
        BigDecimal divide = bigDecimal.divide(other, RoundingMode.HALF_EVEN);
        kotlin.jvm.internal.l0.o(divide, "this.divide(other, RoundingMode.HALF_EVEN)");
        return divide;
    }

    @g1(version = "1.2")
    @kotlin.internal.f
    private static final BigDecimal c(BigDecimal bigDecimal) {
        kotlin.jvm.internal.l0.p(bigDecimal, "<this>");
        BigDecimal add = bigDecimal.add(BigDecimal.ONE);
        kotlin.jvm.internal.l0.o(add, "this.add(BigDecimal.ONE)");
        return add;
    }

    @kotlin.internal.f
    private static final BigDecimal d(BigDecimal bigDecimal, BigDecimal other) {
        kotlin.jvm.internal.l0.p(bigDecimal, "<this>");
        kotlin.jvm.internal.l0.p(other, "other");
        BigDecimal subtract = bigDecimal.subtract(other);
        kotlin.jvm.internal.l0.o(subtract, "this.subtract(other)");
        return subtract;
    }

    @kotlin.internal.f
    private static final BigDecimal e(BigDecimal bigDecimal, BigDecimal other) {
        kotlin.jvm.internal.l0.p(bigDecimal, "<this>");
        kotlin.jvm.internal.l0.p(other, "other");
        BigDecimal add = bigDecimal.add(other);
        kotlin.jvm.internal.l0.o(add, "this.add(other)");
        return add;
    }

    @kotlin.internal.f
    private static final BigDecimal f(BigDecimal bigDecimal, BigDecimal other) {
        kotlin.jvm.internal.l0.p(bigDecimal, "<this>");
        kotlin.jvm.internal.l0.p(other, "other");
        BigDecimal remainder = bigDecimal.remainder(other);
        kotlin.jvm.internal.l0.o(remainder, "this.remainder(other)");
        return remainder;
    }

    @kotlin.internal.f
    private static final BigDecimal g(BigDecimal bigDecimal, BigDecimal other) {
        kotlin.jvm.internal.l0.p(bigDecimal, "<this>");
        kotlin.jvm.internal.l0.p(other, "other");
        BigDecimal multiply = bigDecimal.multiply(other);
        kotlin.jvm.internal.l0.o(multiply, "this.multiply(other)");
        return multiply;
    }

    @g1(version = "1.2")
    @kotlin.internal.f
    private static final BigDecimal h(double d5) {
        return new BigDecimal(String.valueOf(d5));
    }

    @g1(version = "1.2")
    @kotlin.internal.f
    private static final BigDecimal i(double d5, MathContext mathContext) {
        kotlin.jvm.internal.l0.p(mathContext, "mathContext");
        return new BigDecimal(String.valueOf(d5), mathContext);
    }

    @g1(version = "1.2")
    @kotlin.internal.f
    private static final BigDecimal j(float f5) {
        return new BigDecimal(String.valueOf(f5));
    }

    @g1(version = "1.2")
    @kotlin.internal.f
    private static final BigDecimal k(float f5, MathContext mathContext) {
        kotlin.jvm.internal.l0.p(mathContext, "mathContext");
        return new BigDecimal(String.valueOf(f5), mathContext);
    }

    @g1(version = "1.2")
    @kotlin.internal.f
    private static final BigDecimal l(int i5) {
        BigDecimal valueOf = BigDecimal.valueOf(i5);
        kotlin.jvm.internal.l0.o(valueOf, "valueOf(this.toLong())");
        return valueOf;
    }

    @g1(version = "1.2")
    @kotlin.internal.f
    private static final BigDecimal m(int i5, MathContext mathContext) {
        kotlin.jvm.internal.l0.p(mathContext, "mathContext");
        return new BigDecimal(i5, mathContext);
    }

    @g1(version = "1.2")
    @kotlin.internal.f
    private static final BigDecimal n(long j5) {
        BigDecimal valueOf = BigDecimal.valueOf(j5);
        kotlin.jvm.internal.l0.o(valueOf, "valueOf(this)");
        return valueOf;
    }

    @g1(version = "1.2")
    @kotlin.internal.f
    private static final BigDecimal o(long j5, MathContext mathContext) {
        kotlin.jvm.internal.l0.p(mathContext, "mathContext");
        return new BigDecimal(j5, mathContext);
    }

    @kotlin.internal.f
    private static final BigDecimal p(BigDecimal bigDecimal) {
        kotlin.jvm.internal.l0.p(bigDecimal, "<this>");
        BigDecimal negate = bigDecimal.negate();
        kotlin.jvm.internal.l0.o(negate, "this.negate()");
        return negate;
    }
}
