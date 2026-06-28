package kotlin.text;

import com.swift.sandhook.annotation.MethodReflectParams;
import java.util.Locale;
import kotlin.a1;
import kotlin.b1;
import kotlin.g1;
import kotlin.v2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0001\u001a\u0018\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0000\u001a\r\u0010\u000e\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u0010\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u0011\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u0012\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u0013\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u0014\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u0015\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u0016\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u0017\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u0018\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u0019\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u001a\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u001b\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\n\u0010\u001c\u001a\u00020\u000f*\u00020\u0002\u001a\r\u0010\u001d\u001a\u00020\u001e*\u00020\u0002H\u0087\b\u001a\u0014\u0010\u001d\u001a\u00020\u001e*\u00020\u00022\u0006\u0010\u001f\u001a\u00020 H\u0007\u001a\r\u0010!\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\u0014\u0010\"\u001a\u00020\u001e*\u00020\u00022\u0006\u0010\u001f\u001a\u00020 H\u0007\u001a\r\u0010#\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\r\u0010$\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\r\u0010%\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\r\u0010&\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\r\u0010'\u001a\u00020\u001e*\u00020\u0002H\u0087\b\u001a\u0014\u0010'\u001a\u00020\u001e*\u00020\u00022\u0006\u0010\u001f\u001a\u00020 H\u0007\u001a\r\u0010(\u001a\u00020\u0002*\u00020\u0002H\u0087\b\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006)"}, d2 = {"category", "Lkotlin/text/CharCategory;", "", "getCategory", "(C)Lkotlin/text/CharCategory;", "directionality", "Lkotlin/text/CharDirectionality;", "getDirectionality", "(C)Lkotlin/text/CharDirectionality;", "checkRadix", "", "radix", "digitOf", MethodReflectParams.CHAR, "isDefined", "", "isDigit", "isHighSurrogate", "isISOControl", "isIdentifierIgnorable", "isJavaIdentifierPart", "isJavaIdentifierStart", "isLetter", "isLetterOrDigit", "isLowSurrogate", "isLowerCase", "isTitleCase", "isUpperCase", "isWhitespace", "lowercase", "", "locale", "Ljava/util/Locale;", "lowercaseChar", "titlecase", "titlecaseChar", "toLowerCase", "toTitleCase", "toUpperCase", "uppercase", "uppercaseChar", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/text/CharsKt")
/* loaded from: classes4.dex */
public class d {
    @g1(version = "1.5")
    @kotlin.internal.f
    @v2(markerClass = {kotlin.r.class})
    private static final String A(char c5) {
        String valueOf = String.valueOf(c5);
        kotlin.jvm.internal.l0.n(valueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = valueOf.toUpperCase(Locale.ROOT);
        kotlin.jvm.internal.l0.o(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase;
    }

    @p4.l
    @g1(version = "1.5")
    @v2(markerClass = {kotlin.r.class})
    public static final String B(char c5, @p4.l Locale locale) {
        kotlin.jvm.internal.l0.p(locale, "locale");
        String valueOf = String.valueOf(c5);
        kotlin.jvm.internal.l0.n(valueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = valueOf.toUpperCase(locale);
        kotlin.jvm.internal.l0.o(upperCase, "this as java.lang.String).toUpperCase(locale)");
        return upperCase;
    }

    @g1(version = "1.5")
    @kotlin.internal.f
    @v2(markerClass = {kotlin.r.class})
    private static final char C(char c5) {
        return Character.toUpperCase(c5);
    }

    @a1
    public static int a(int i5) {
        if (new kotlin.ranges.l(2, 36).l(i5)) {
            return i5;
        }
        throw new IllegalArgumentException("radix " + i5 + " was not in valid range " + new kotlin.ranges.l(2, 36));
    }

    public static final int b(char c5, int i5) {
        return Character.digit((int) c5, i5);
    }

    @p4.l
    public static final a c(char c5) {
        return a.Companion.a(Character.getType(c5));
    }

    @p4.l
    public static final b d(char c5) {
        return b.Companion.b(Character.getDirectionality(c5));
    }

    @kotlin.internal.f
    private static final boolean e(char c5) {
        return Character.isDefined(c5);
    }

    @kotlin.internal.f
    private static final boolean f(char c5) {
        return Character.isDigit(c5);
    }

    @kotlin.internal.f
    private static final boolean g(char c5) {
        return Character.isHighSurrogate(c5);
    }

    @kotlin.internal.f
    private static final boolean h(char c5) {
        return Character.isISOControl(c5);
    }

    @kotlin.internal.f
    private static final boolean i(char c5) {
        return Character.isIdentifierIgnorable(c5);
    }

    @kotlin.internal.f
    private static final boolean j(char c5) {
        return Character.isJavaIdentifierPart(c5);
    }

    @kotlin.internal.f
    private static final boolean k(char c5) {
        return Character.isJavaIdentifierStart(c5);
    }

    @kotlin.internal.f
    private static final boolean l(char c5) {
        return Character.isLetter(c5);
    }

    @kotlin.internal.f
    private static final boolean m(char c5) {
        return Character.isLetterOrDigit(c5);
    }

    @kotlin.internal.f
    private static final boolean n(char c5) {
        return Character.isLowSurrogate(c5);
    }

    @kotlin.internal.f
    private static final boolean o(char c5) {
        return Character.isLowerCase(c5);
    }

    @kotlin.internal.f
    private static final boolean p(char c5) {
        return Character.isTitleCase(c5);
    }

    @kotlin.internal.f
    private static final boolean q(char c5) {
        return Character.isUpperCase(c5);
    }

    public static final boolean r(char c5) {
        return Character.isWhitespace(c5) || Character.isSpaceChar(c5);
    }

    @g1(version = "1.5")
    @kotlin.internal.f
    @v2(markerClass = {kotlin.r.class})
    private static final String s(char c5) {
        String valueOf = String.valueOf(c5);
        kotlin.jvm.internal.l0.n(valueOf, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = valueOf.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.l0.o(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    @p4.l
    @g1(version = "1.5")
    @v2(markerClass = {kotlin.r.class})
    public static String t(char c5, @p4.l Locale locale) {
        kotlin.jvm.internal.l0.p(locale, "locale");
        String valueOf = String.valueOf(c5);
        kotlin.jvm.internal.l0.n(valueOf, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = valueOf.toLowerCase(locale);
        kotlin.jvm.internal.l0.o(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    @g1(version = "1.5")
    @kotlin.internal.f
    @v2(markerClass = {kotlin.r.class})
    private static final char u(char c5) {
        return Character.toLowerCase(c5);
    }

    @p4.l
    @g1(version = "1.5")
    @v2(markerClass = {kotlin.r.class})
    public static String v(char c5, @p4.l Locale locale) {
        kotlin.jvm.internal.l0.p(locale, "locale");
        String B = B(c5, locale);
        if (B.length() > 1) {
            if (c5 != 329) {
                char charAt = B.charAt(0);
                kotlin.jvm.internal.l0.n(B, "null cannot be cast to non-null type java.lang.String");
                String substring = B.substring(1);
                kotlin.jvm.internal.l0.o(substring, "this as java.lang.String).substring(startIndex)");
                kotlin.jvm.internal.l0.n(substring, "null cannot be cast to non-null type java.lang.String");
                String lowerCase = substring.toLowerCase(Locale.ROOT);
                kotlin.jvm.internal.l0.o(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                return charAt + lowerCase;
            }
            return B;
        }
        String valueOf = String.valueOf(c5);
        kotlin.jvm.internal.l0.n(valueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = valueOf.toUpperCase(Locale.ROOT);
        kotlin.jvm.internal.l0.o(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        if (!kotlin.jvm.internal.l0.g(B, upperCase)) {
            return B;
        }
        return String.valueOf(Character.toTitleCase(c5));
    }

    @g1(version = "1.5")
    @kotlin.internal.f
    @v2(markerClass = {kotlin.r.class})
    private static final char w(char c5) {
        return Character.toTitleCase(c5);
    }

    @kotlin.k(message = "Use lowercaseChar() instead.", replaceWith = @b1(expression = "lowercaseChar()", imports = {}))
    @kotlin.l(warningSince = "1.5")
    @kotlin.internal.f
    private static final char x(char c5) {
        return Character.toLowerCase(c5);
    }

    @kotlin.k(message = "Use titlecaseChar() instead.", replaceWith = @b1(expression = "titlecaseChar()", imports = {}))
    @kotlin.l(warningSince = "1.5")
    @kotlin.internal.f
    private static final char y(char c5) {
        return Character.toTitleCase(c5);
    }

    @kotlin.k(message = "Use uppercaseChar() instead.", replaceWith = @b1(expression = "uppercaseChar()", imports = {}))
    @kotlin.l(warningSince = "1.5")
    @kotlin.internal.f
    private static final char z(char c5) {
        return Character.toUpperCase(c5);
    }
}
