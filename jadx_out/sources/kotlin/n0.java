package kotlin;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;

@i0(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\f\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0001H\u0087\n\u001a\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\n\u001a\r\u0010\u0005\u001a\u00020\u0001*\u00020\u0001H\u0087\n\u001a\r\u0010\u0006\u001a\u00020\u0001*\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0007\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\n\u001a\u0015\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\f\u001a\u0015\u0010\t\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\n\u001a\u0015\u0010\n\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\n\u001a\u0015\u0010\u000b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\f\u001a\u00020\rH\u0087\f\u001a\u0015\u0010\u000e\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\f\u001a\u00020\rH\u0087\f\u001a\u0015\u0010\u000f\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\n\u001a\r\u0010\u0010\u001a\u00020\u0011*\u00020\u0001H\u0087\b\u001a!\u0010\u0010\u001a\u00020\u0011*\u00020\u00012\b\b\u0002\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0087\b\u001a\r\u0010\u0015\u001a\u00020\u0001*\u00020\rH\u0087\b\u001a\r\u0010\u0015\u001a\u00020\u0001*\u00020\u0016H\u0087\b\u001a\r\u0010\u0017\u001a\u00020\u0001*\u00020\u0001H\u0087\n\u001a\u0015\u0010\u0018\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\f¨\u0006\u0019"}, d2 = {"and", "Ljava/math/BigInteger;", "other", "dec", "div", "inc", "inv", "minus", "or", "plus", "rem", "shl", "n", "", "shr", "times", "toBigDecimal", "Ljava/math/BigDecimal;", "scale", "mathContext", "Ljava/math/MathContext;", "toBigInteger", "", "unaryMinus", "xor", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/NumbersKt")
/* loaded from: classes3.dex */
class n0 extends m0 {
    @g1(version = "1.2")
    @kotlin.internal.f
    private static final BigInteger A(BigInteger bigInteger, int i5) {
        kotlin.jvm.internal.l0.p(bigInteger, "<this>");
        BigInteger shiftRight = bigInteger.shiftRight(i5);
        kotlin.jvm.internal.l0.o(shiftRight, "this.shiftRight(n)");
        return shiftRight;
    }

    @kotlin.internal.f
    private static final BigInteger B(BigInteger bigInteger, BigInteger other) {
        kotlin.jvm.internal.l0.p(bigInteger, "<this>");
        kotlin.jvm.internal.l0.p(other, "other");
        BigInteger multiply = bigInteger.multiply(other);
        kotlin.jvm.internal.l0.o(multiply, "this.multiply(other)");
        return multiply;
    }

    @g1(version = "1.2")
    @kotlin.internal.f
    private static final BigDecimal C(BigInteger bigInteger) {
        kotlin.jvm.internal.l0.p(bigInteger, "<this>");
        return new BigDecimal(bigInteger);
    }

    @g1(version = "1.2")
    @kotlin.internal.f
    private static final BigDecimal D(BigInteger bigInteger, int i5, MathContext mathContext) {
        kotlin.jvm.internal.l0.p(bigInteger, "<this>");
        kotlin.jvm.internal.l0.p(mathContext, "mathContext");
        return new BigDecimal(bigInteger, i5, mathContext);
    }

    static /* synthetic */ BigDecimal E(BigInteger bigInteger, int i5, MathContext mathContext, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i5 = 0;
        }
        if ((i6 & 2) != 0) {
            mathContext = MathContext.UNLIMITED;
            kotlin.jvm.internal.l0.o(mathContext, "UNLIMITED");
        }
        kotlin.jvm.internal.l0.p(bigInteger, "<this>");
        kotlin.jvm.internal.l0.p(mathContext, "mathContext");
        return new BigDecimal(bigInteger, i5, mathContext);
    }

    @g1(version = "1.2")
    @kotlin.internal.f
    private static final BigInteger F(int i5) {
        BigInteger valueOf = BigInteger.valueOf(i5);
        kotlin.jvm.internal.l0.o(valueOf, "valueOf(this.toLong())");
        return valueOf;
    }

    @g1(version = "1.2")
    @kotlin.internal.f
    private static final BigInteger G(long j5) {
        BigInteger valueOf = BigInteger.valueOf(j5);
        kotlin.jvm.internal.l0.o(valueOf, "valueOf(this)");
        return valueOf;
    }

    @kotlin.internal.f
    private static final BigInteger H(BigInteger bigInteger) {
        kotlin.jvm.internal.l0.p(bigInteger, "<this>");
        BigInteger negate = bigInteger.negate();
        kotlin.jvm.internal.l0.o(negate, "this.negate()");
        return negate;
    }

    @g1(version = "1.2")
    @kotlin.internal.f
    private static final BigInteger I(BigInteger bigInteger, BigInteger other) {
        kotlin.jvm.internal.l0.p(bigInteger, "<this>");
        kotlin.jvm.internal.l0.p(other, "other");
        BigInteger xor = bigInteger.xor(other);
        kotlin.jvm.internal.l0.o(xor, "this.xor(other)");
        return xor;
    }

    @g1(version = "1.2")
    @kotlin.internal.f
    private static final BigInteger q(BigInteger bigInteger, BigInteger other) {
        kotlin.jvm.internal.l0.p(bigInteger, "<this>");
        kotlin.jvm.internal.l0.p(other, "other");
        BigInteger and = bigInteger.and(other);
        kotlin.jvm.internal.l0.o(and, "this.and(other)");
        return and;
    }

    @g1(version = "1.2")
    @kotlin.internal.f
    private static final BigInteger r(BigInteger bigInteger) {
        kotlin.jvm.internal.l0.p(bigInteger, "<this>");
        BigInteger subtract = bigInteger.subtract(BigInteger.ONE);
        kotlin.jvm.internal.l0.o(subtract, "this.subtract(BigInteger.ONE)");
        return subtract;
    }

    @kotlin.internal.f
    private static final BigInteger s(BigInteger bigInteger, BigInteger other) {
        kotlin.jvm.internal.l0.p(bigInteger, "<this>");
        kotlin.jvm.internal.l0.p(other, "other");
        BigInteger divide = bigInteger.divide(other);
        kotlin.jvm.internal.l0.o(divide, "this.divide(other)");
        return divide;
    }

    @g1(version = "1.2")
    @kotlin.internal.f
    private static final BigInteger t(BigInteger bigInteger) {
        kotlin.jvm.internal.l0.p(bigInteger, "<this>");
        BigInteger add = bigInteger.add(BigInteger.ONE);
        kotlin.jvm.internal.l0.o(add, "this.add(BigInteger.ONE)");
        return add;
    }

    @g1(version = "1.2")
    @kotlin.internal.f
    private static final BigInteger u(BigInteger bigInteger) {
        kotlin.jvm.internal.l0.p(bigInteger, "<this>");
        BigInteger not = bigInteger.not();
        kotlin.jvm.internal.l0.o(not, "this.not()");
        return not;
    }

    @kotlin.internal.f
    private static final BigInteger v(BigInteger bigInteger, BigInteger other) {
        kotlin.jvm.internal.l0.p(bigInteger, "<this>");
        kotlin.jvm.internal.l0.p(other, "other");
        BigInteger subtract = bigInteger.subtract(other);
        kotlin.jvm.internal.l0.o(subtract, "this.subtract(other)");
        return subtract;
    }

    @g1(version = "1.2")
    @kotlin.internal.f
    private static final BigInteger w(BigInteger bigInteger, BigInteger other) {
        kotlin.jvm.internal.l0.p(bigInteger, "<this>");
        kotlin.jvm.internal.l0.p(other, "other");
        BigInteger or = bigInteger.or(other);
        kotlin.jvm.internal.l0.o(or, "this.or(other)");
        return or;
    }

    @kotlin.internal.f
    private static final BigInteger x(BigInteger bigInteger, BigInteger other) {
        kotlin.jvm.internal.l0.p(bigInteger, "<this>");
        kotlin.jvm.internal.l0.p(other, "other");
        BigInteger add = bigInteger.add(other);
        kotlin.jvm.internal.l0.o(add, "this.add(other)");
        return add;
    }

    @g1(version = "1.1")
    @kotlin.internal.f
    private static final BigInteger y(BigInteger bigInteger, BigInteger other) {
        kotlin.jvm.internal.l0.p(bigInteger, "<this>");
        kotlin.jvm.internal.l0.p(other, "other");
        BigInteger remainder = bigInteger.remainder(other);
        kotlin.jvm.internal.l0.o(remainder, "this.remainder(other)");
        return remainder;
    }

    @g1(version = "1.2")
    @kotlin.internal.f
    private static final BigInteger z(BigInteger bigInteger, int i5) {
        kotlin.jvm.internal.l0.p(bigInteger, "<this>");
        BigInteger shiftLeft = bigInteger.shiftLeft(i5);
        kotlin.jvm.internal.l0.o(shiftLeft, "this.shiftLeft(n)");
        return shiftLeft;
    }
}
