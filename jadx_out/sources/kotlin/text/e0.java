package kotlin.text;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tendcloud.tenddata.cq;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.b1;
import kotlin.collections.s0;
import kotlin.g1;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.t1;
import kotlin.v2;

@kotlin.i0(d1 = {"\u0000~\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\f\n\u0002\b\u0011\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a\u0011\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0087\b\u001a\u0011\u0010\u0007\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0087\b\u001a\u0011\u0010\u0007\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0087\b\u001a\u0019\u0010\u0007\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0087\b\u001a!\u0010\u0007\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0087\b\u001a)\u0010\u0007\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000fH\u0087\b\u001a\u0011\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0087\b\u001a!\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0087\b\u001a!\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0087\b\u001a\f\u0010\u0017\u001a\u00020\u0002*\u00020\u0002H\u0007\u001a\u0014\u0010\u0017\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0019H\u0007\u001a\u0015\u0010\u001a\u001a\u00020\u0011*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0011H\u0087\b\u001a\u0015\u0010\u001c\u001a\u00020\u0011*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0011H\u0087\b\u001a\u001d\u0010\u001d\u001a\u00020\u0011*\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u0011H\u0087\b\u001a\u001c\u0010 \u001a\u00020\u0011*\u00020\u00022\u0006\u0010!\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020#\u001a\f\u0010$\u001a\u00020\u0002*\u00020\u0014H\u0007\u001a \u0010$\u001a\u00020\u0002*\u00020\u00142\b\b\u0002\u0010%\u001a\u00020\u00112\b\b\u0002\u0010\u001f\u001a\u00020\u0011H\u0007\u001a\u0019\u0010&\u001a\u00020#*\u0004\u0018\u00010'2\b\u0010!\u001a\u0004\u0018\u00010'H\u0087\u0004\u001a \u0010&\u001a\u00020#*\u0004\u0018\u00010'2\b\u0010!\u001a\u0004\u0018\u00010'2\u0006\u0010\"\u001a\u00020#H\u0007\u001a\u0015\u0010&\u001a\u00020#*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0087\b\u001a\u0015\u0010&\u001a\u00020#*\u00020\u00022\u0006\u0010(\u001a\u00020'H\u0087\b\u001a\f\u0010)\u001a\u00020\u0002*\u00020\u0002H\u0007\u001a\u0014\u0010)\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0019H\u0007\u001a\f\u0010*\u001a\u00020\u0002*\u00020\rH\u0007\u001a*\u0010*\u001a\u00020\u0002*\u00020\r2\b\b\u0002\u0010%\u001a\u00020\u00112\b\b\u0002\u0010\u001f\u001a\u00020\u00112\b\b\u0002\u0010+\u001a\u00020#H\u0007\u001a\f\u0010,\u001a\u00020\r*\u00020\u0002H\u0007\u001a*\u0010,\u001a\u00020\r*\u00020\u00022\b\b\u0002\u0010%\u001a\u00020\u00112\b\b\u0002\u0010\u001f\u001a\u00020\u00112\b\b\u0002\u0010+\u001a\u00020#H\u0007\u001a\u001c\u0010-\u001a\u00020#*\u00020\u00022\u0006\u0010.\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020#\u001a \u0010/\u001a\u00020#*\u0004\u0018\u00010\u00022\b\u0010!\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\"\u001a\u00020#\u001a4\u00100\u001a\u00020\u0002*\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0016\u00101\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010302\"\u0004\u0018\u000103H\u0087\b¢\u0006\u0002\u00104\u001a*\u00100\u001a\u00020\u0002*\u00020\u00022\u0016\u00101\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010302\"\u0004\u0018\u000103H\u0087\b¢\u0006\u0002\u00105\u001a<\u00100\u001a\u00020\u0002*\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u00100\u001a\u00020\u00022\u0016\u00101\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010302\"\u0004\u0018\u000103H\u0087\b¢\u0006\u0002\u00106\u001a2\u00100\u001a\u00020\u0002*\u00020\u00042\u0006\u00100\u001a\u00020\u00022\u0016\u00101\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010302\"\u0004\u0018\u000103H\u0087\b¢\u0006\u0002\u00107\u001a\r\u00108\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\n\u00109\u001a\u00020#*\u00020'\u001a\r\u0010:\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\u0015\u0010:\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0019H\u0087\b\u001a\u001d\u0010;\u001a\u00020\u0011*\u00020\u00022\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020\u0011H\u0081\b\u001a\u001d\u0010;\u001a\u00020\u0011*\u00020\u00022\u0006\u0010?\u001a\u00020\u00022\u0006\u0010>\u001a\u00020\u0011H\u0081\b\u001a\u001d\u0010@\u001a\u00020\u0011*\u00020\u00022\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020\u0011H\u0081\b\u001a\u001d\u0010@\u001a\u00020\u0011*\u00020\u00022\u0006\u0010?\u001a\u00020\u00022\u0006\u0010>\u001a\u00020\u0011H\u0081\b\u001a\u001d\u0010A\u001a\u00020\u0011*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010B\u001a\u00020\u0011H\u0087\b\u001a4\u0010C\u001a\u00020#*\u00020'2\u0006\u0010D\u001a\u00020\u00112\u0006\u0010!\u001a\u00020'2\u0006\u0010E\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\"\u001a\u00020#\u001a4\u0010C\u001a\u00020#*\u00020\u00022\u0006\u0010D\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u00022\u0006\u0010E\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\"\u001a\u00020#\u001a\u0012\u0010F\u001a\u00020\u0002*\u00020'2\u0006\u0010G\u001a\u00020\u0011\u001a$\u0010H\u001a\u00020\u0002*\u00020\u00022\u0006\u0010I\u001a\u00020=2\u0006\u0010J\u001a\u00020=2\b\b\u0002\u0010\"\u001a\u00020#\u001a$\u0010H\u001a\u00020\u0002*\u00020\u00022\u0006\u0010K\u001a\u00020\u00022\u0006\u0010L\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020#\u001a$\u0010M\u001a\u00020\u0002*\u00020\u00022\u0006\u0010I\u001a\u00020=2\u0006\u0010J\u001a\u00020=2\b\b\u0002\u0010\"\u001a\u00020#\u001a$\u0010M\u001a\u00020\u0002*\u00020\u00022\u0006\u0010K\u001a\u00020\u00022\u0006\u0010L\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020#\u001a\"\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00020O*\u00020'2\u0006\u0010P\u001a\u00020Q2\b\b\u0002\u0010R\u001a\u00020\u0011\u001a\u001c\u0010S\u001a\u00020#*\u00020\u00022\u0006\u0010T\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020#\u001a$\u0010S\u001a\u00020#*\u00020\u00022\u0006\u0010T\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00112\b\b\u0002\u0010\"\u001a\u00020#\u001a\u0015\u0010U\u001a\u00020\u0002*\u00020\u00022\u0006\u0010%\u001a\u00020\u0011H\u0087\b\u001a\u001d\u0010U\u001a\u00020\u0002*\u00020\u00022\u0006\u0010%\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u0011H\u0087\b\u001a\u0017\u0010V\u001a\u00020\r*\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0087\b\u001a\r\u0010W\u001a\u00020\u0014*\u00020\u0002H\u0087\b\u001a3\u0010W\u001a\u00020\u0014*\u00020\u00022\u0006\u0010X\u001a\u00020\u00142\b\b\u0002\u0010Y\u001a\u00020\u00112\b\b\u0002\u0010%\u001a\u00020\u00112\b\b\u0002\u0010\u001f\u001a\u00020\u0011H\u0087\b\u001a \u0010W\u001a\u00020\u0014*\u00020\u00022\b\b\u0002\u0010%\u001a\u00020\u00112\b\b\u0002\u0010\u001f\u001a\u00020\u0011H\u0007\u001a\r\u0010Z\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\u0015\u0010Z\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0019H\u0087\b\u001a\u0017\u0010[\u001a\u00020Q*\u00020\u00022\b\b\u0002\u0010\\\u001a\u00020\u0011H\u0087\b\u001a\r\u0010]\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\u0015\u0010]\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0019H\u0087\b\u001a\r\u0010^\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\u0015\u0010^\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0019H\u0087\b\"%\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006_"}, d2 = {"CASE_INSENSITIVE_ORDER", "Ljava/util/Comparator;", "", "Lkotlin/Comparator;", "Lkotlin/String$Companion;", "getCASE_INSENSITIVE_ORDER", "(Lkotlin/jvm/internal/StringCompanionObject;)Ljava/util/Comparator;", "String", "stringBuffer", "Ljava/lang/StringBuffer;", "stringBuilder", "Ljava/lang/StringBuilder;", "bytes", "", "charset", "Ljava/nio/charset/Charset;", TypedValues.CycleType.S_WAVE_OFFSET, "", cq.a.LENGTH, "chars", "", "codePoints", "", "capitalize", "locale", "Ljava/util/Locale;", "codePointAt", "index", "codePointBefore", "codePointCount", "beginIndex", "endIndex", "compareTo", "other", "ignoreCase", "", "concatToString", "startIndex", "contentEquals", "", "charSequence", "decapitalize", "decodeToString", "throwOnInvalidSequence", "encodeToByteArray", "endsWith", "suffix", "equals", "format", "args", "", "", "(Ljava/lang/String;Ljava/util/Locale;[Ljava/lang/Object;)Ljava/lang/String;", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "(Lkotlin/jvm/internal/StringCompanionObject;Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "(Lkotlin/jvm/internal/StringCompanionObject;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "intern", "isBlank", "lowercase", "nativeIndexOf", "ch", "", "fromIndex", "str", "nativeLastIndexOf", "offsetByCodePoints", "codePointOffset", "regionMatches", "thisOffset", "otherOffset", "repeat", "n", "replace", "oldChar", "newChar", "oldValue", "newValue", "replaceFirst", "split", "", "regex", "Ljava/util/regex/Pattern;", "limit", "startsWith", "prefix", "substring", "toByteArray", "toCharArray", "destination", "destinationOffset", "toLowerCase", "toPattern", "flags", "toUpperCase", "uppercase", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/text/StringsKt")
@r1({"SMAP\nStringsJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringsJVM.kt\nkotlin/text/StringsKt__StringsJVMKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,805:1\n1174#2,2:806\n1#3:808\n1726#4,3:809\n*S KotlinDebug\n*F\n+ 1 StringsJVM.kt\nkotlin/text/StringsKt__StringsJVMKt\n*L\n73#1:806,2\n600#1:809,3\n*E\n"})
/* loaded from: classes4.dex */
public class e0 extends d0 {
    @p4.l
    @kotlin.k(message = "Use replaceFirstChar instead.", replaceWith = @b1(expression = "replaceFirstChar { it.lowercase(Locale.getDefault()) }", imports = {"java.util.Locale"}))
    @kotlin.l(warningSince = "1.5")
    public static final String A1(@p4.l String str) {
        boolean z4;
        kotlin.jvm.internal.l0.p(str, "<this>");
        if (str.length() > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4 && !Character.isLowerCase(str.charAt(0))) {
            StringBuilder sb = new StringBuilder();
            String substring = str.substring(0, 1);
            kotlin.jvm.internal.l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            kotlin.jvm.internal.l0.n(substring, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = substring.toLowerCase();
            kotlin.jvm.internal.l0.o(lowerCase, "this as java.lang.String).toLowerCase()");
            sb.append(lowerCase);
            String substring2 = str.substring(1);
            kotlin.jvm.internal.l0.o(substring2, "this as java.lang.String).substring(startIndex)");
            sb.append(substring2);
            return sb.toString();
        }
        return str;
    }

    public static /* synthetic */ char[] A2(String str, int i5, int i6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i5 = 0;
        }
        if ((i7 & 2) != 0) {
            i6 = str.length();
        }
        return y2(str, i5, i6);
    }

    @g1(version = "1.4")
    @kotlin.internal.h
    @kotlin.k(message = "Use replaceFirstChar instead.", replaceWith = @b1(expression = "replaceFirstChar { it.lowercase(locale) }", imports = {}))
    @kotlin.l(warningSince = "1.5")
    @v2(markerClass = {kotlin.r.class})
    @p4.l
    public static final String B1(@p4.l String str, @p4.l Locale locale) {
        boolean z4;
        kotlin.jvm.internal.l0.p(str, "<this>");
        kotlin.jvm.internal.l0.p(locale, "locale");
        if (str.length() > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4 && !Character.isLowerCase(str.charAt(0))) {
            StringBuilder sb = new StringBuilder();
            String substring = str.substring(0, 1);
            kotlin.jvm.internal.l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            kotlin.jvm.internal.l0.n(substring, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = substring.toLowerCase(locale);
            kotlin.jvm.internal.l0.o(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            sb.append(lowerCase);
            String substring2 = str.substring(1);
            kotlin.jvm.internal.l0.o(substring2, "this as java.lang.String).substring(startIndex)");
            sb.append(substring2);
            return sb.toString();
        }
        return str;
    }

    static /* synthetic */ char[] B2(String str, char[] destination, int i5, int i6, int i7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i5 = 0;
        }
        if ((i8 & 4) != 0) {
            i6 = 0;
        }
        if ((i8 & 8) != 0) {
            i7 = str.length();
        }
        kotlin.jvm.internal.l0.p(str, "<this>");
        kotlin.jvm.internal.l0.p(destination, "destination");
        str.getChars(i6, i7, destination, i5);
        return destination;
    }

    @p4.l
    @g1(version = "1.4")
    @v2(markerClass = {kotlin.r.class})
    public static final String C1(@p4.l byte[] bArr) {
        kotlin.jvm.internal.l0.p(bArr, "<this>");
        return new String(bArr, f.f19703b);
    }

    @kotlin.k(message = "Use lowercase() instead.", replaceWith = @b1(expression = "lowercase(Locale.getDefault())", imports = {"java.util.Locale"}))
    @kotlin.l(warningSince = "1.5")
    @kotlin.internal.f
    private static final String C2(String str) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        String lowerCase = str.toLowerCase();
        kotlin.jvm.internal.l0.o(lowerCase, "this as java.lang.String).toLowerCase()");
        return lowerCase;
    }

    @p4.l
    @g1(version = "1.4")
    @v2(markerClass = {kotlin.r.class})
    public static final String D1(@p4.l byte[] bArr, int i5, int i6, boolean z4) {
        kotlin.jvm.internal.l0.p(bArr, "<this>");
        kotlin.collections.c.Companion.a(i5, i6, bArr.length);
        if (!z4) {
            return new String(bArr, i5, i6 - i5, f.f19703b);
        }
        String charBuffer = f.f19703b.newDecoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT).decode(ByteBuffer.wrap(bArr, i5, i6 - i5)).toString();
        kotlin.jvm.internal.l0.o(charBuffer, "decoder.decode(ByteBuffe…- startIndex)).toString()");
        return charBuffer;
    }

    @kotlin.k(message = "Use lowercase() instead.", replaceWith = @b1(expression = "lowercase(locale)", imports = {}))
    @kotlin.l(warningSince = "1.5")
    @kotlin.internal.f
    private static final String D2(String str, Locale locale) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        kotlin.jvm.internal.l0.p(locale, "locale");
        String lowerCase = str.toLowerCase(locale);
        kotlin.jvm.internal.l0.o(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    public static /* synthetic */ String E1(byte[] bArr, int i5, int i6, boolean z4, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i5 = 0;
        }
        if ((i7 & 2) != 0) {
            i6 = bArr.length;
        }
        if ((i7 & 4) != 0) {
            z4 = false;
        }
        return D1(bArr, i5, i6, z4);
    }

    @kotlin.internal.f
    private static final Pattern E2(String str, int i5) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        Pattern compile = Pattern.compile(str, i5);
        kotlin.jvm.internal.l0.o(compile, "compile(this, flags)");
        return compile;
    }

    @p4.l
    @g1(version = "1.4")
    @v2(markerClass = {kotlin.r.class})
    public static final byte[] F1(@p4.l String str) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        byte[] bytes = str.getBytes(f.f19703b);
        kotlin.jvm.internal.l0.o(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    static /* synthetic */ Pattern F2(String str, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i5 = 0;
        }
        kotlin.jvm.internal.l0.p(str, "<this>");
        Pattern compile = Pattern.compile(str, i5);
        kotlin.jvm.internal.l0.o(compile, "compile(this, flags)");
        return compile;
    }

    @p4.l
    @g1(version = "1.4")
    @v2(markerClass = {kotlin.r.class})
    public static final byte[] G1(@p4.l String str, int i5, int i6, boolean z4) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        kotlin.collections.c.Companion.a(i5, i6, str.length());
        if (!z4) {
            String substring = str.substring(i5, i6);
            kotlin.jvm.internal.l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            Charset charset = f.f19703b;
            kotlin.jvm.internal.l0.n(substring, "null cannot be cast to non-null type java.lang.String");
            byte[] bytes = substring.getBytes(charset);
            kotlin.jvm.internal.l0.o(bytes, "this as java.lang.String).getBytes(charset)");
            return bytes;
        }
        ByteBuffer encode = f.f19703b.newEncoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT).encode(CharBuffer.wrap(str, i5, i6));
        if (encode.hasArray() && encode.arrayOffset() == 0) {
            int remaining = encode.remaining();
            byte[] array = encode.array();
            kotlin.jvm.internal.l0.m(array);
            if (remaining == array.length) {
                byte[] array2 = encode.array();
                kotlin.jvm.internal.l0.o(array2, "{\n        byteBuffer.array()\n    }");
                return array2;
            }
        }
        byte[] bArr = new byte[encode.remaining()];
        encode.get(bArr);
        return bArr;
    }

    @kotlin.k(message = "Use uppercase() instead.", replaceWith = @b1(expression = "uppercase(Locale.getDefault())", imports = {"java.util.Locale"}))
    @kotlin.l(warningSince = "1.5")
    @kotlin.internal.f
    private static final String G2(String str) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        String upperCase = str.toUpperCase();
        kotlin.jvm.internal.l0.o(upperCase, "this as java.lang.String).toUpperCase()");
        return upperCase;
    }

    public static /* synthetic */ byte[] H1(String str, int i5, int i6, boolean z4, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i5 = 0;
        }
        if ((i7 & 2) != 0) {
            i6 = str.length();
        }
        if ((i7 & 4) != 0) {
            z4 = false;
        }
        return G1(str, i5, i6, z4);
    }

    @kotlin.k(message = "Use uppercase() instead.", replaceWith = @b1(expression = "uppercase(locale)", imports = {}))
    @kotlin.l(warningSince = "1.5")
    @kotlin.internal.f
    private static final String H2(String str, Locale locale) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        kotlin.jvm.internal.l0.p(locale, "locale");
        String upperCase = str.toUpperCase(locale);
        kotlin.jvm.internal.l0.o(upperCase, "this as java.lang.String).toUpperCase(locale)");
        return upperCase;
    }

    public static boolean I1(@p4.l String str, @p4.l String suffix, boolean z4) {
        boolean b22;
        kotlin.jvm.internal.l0.p(str, "<this>");
        kotlin.jvm.internal.l0.p(suffix, "suffix");
        if (!z4) {
            return str.endsWith(suffix);
        }
        b22 = b2(str, str.length() - suffix.length(), suffix, 0, suffix.length(), true);
        return b22;
    }

    @g1(version = "1.5")
    @kotlin.internal.f
    @v2(markerClass = {kotlin.r.class})
    private static final String I2(String str) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        String upperCase = str.toUpperCase(Locale.ROOT);
        kotlin.jvm.internal.l0.o(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase;
    }

    public static /* synthetic */ boolean J1(String str, String str2, boolean z4, int i5, Object obj) {
        boolean I1;
        if ((i5 & 2) != 0) {
            z4 = false;
        }
        I1 = I1(str, str2, z4);
        return I1;
    }

    @g1(version = "1.5")
    @kotlin.internal.f
    @v2(markerClass = {kotlin.r.class})
    private static final String J2(String str, Locale locale) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        kotlin.jvm.internal.l0.p(locale, "locale");
        String upperCase = str.toUpperCase(locale);
        kotlin.jvm.internal.l0.o(upperCase, "this as java.lang.String).toUpperCase(locale)");
        return upperCase;
    }

    public static boolean K1(@p4.m String str, @p4.m String str2, boolean z4) {
        if (str == null) {
            if (str2 == null) {
                return true;
            }
            return false;
        }
        if (!z4) {
            return str.equals(str2);
        }
        return str.equalsIgnoreCase(str2);
    }

    public static /* synthetic */ boolean L1(String str, String str2, boolean z4, int i5, Object obj) {
        boolean K1;
        if ((i5 & 2) != 0) {
            z4 = false;
        }
        K1 = K1(str, str2, z4);
        return K1;
    }

    @g1(version = "1.4")
    @kotlin.internal.f
    private static final String M1(String str, Locale locale, Object... args) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        kotlin.jvm.internal.l0.p(args, "args");
        String format = String.format(locale, str, Arrays.copyOf(args, args.length));
        kotlin.jvm.internal.l0.o(format, "format(locale, this, *args)");
        return format;
    }

    @kotlin.internal.f
    private static final String N1(String str, Object... args) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        kotlin.jvm.internal.l0.p(args, "args");
        String format = String.format(str, Arrays.copyOf(args, args.length));
        kotlin.jvm.internal.l0.o(format, "format(this, *args)");
        return format;
    }

    @kotlin.internal.f
    private static final String O1(t1 t1Var, String format, Object... args) {
        kotlin.jvm.internal.l0.p(t1Var, "<this>");
        kotlin.jvm.internal.l0.p(format, "format");
        kotlin.jvm.internal.l0.p(args, "args");
        String format2 = String.format(format, Arrays.copyOf(args, args.length));
        kotlin.jvm.internal.l0.o(format2, "format(format, *args)");
        return format2;
    }

    @g1(version = "1.4")
    @kotlin.internal.f
    private static final String P1(t1 t1Var, Locale locale, String format, Object... args) {
        kotlin.jvm.internal.l0.p(t1Var, "<this>");
        kotlin.jvm.internal.l0.p(format, "format");
        kotlin.jvm.internal.l0.p(args, "args");
        String format2 = String.format(locale, format, Arrays.copyOf(args, args.length));
        kotlin.jvm.internal.l0.o(format2, "format(locale, format, *args)");
        return format2;
    }

    @p4.l
    public static Comparator<String> Q1(@p4.l t1 t1Var) {
        kotlin.jvm.internal.l0.p(t1Var, "<this>");
        Comparator<String> CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
        kotlin.jvm.internal.l0.o(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
        return CASE_INSENSITIVE_ORDER;
    }

    @kotlin.internal.f
    private static final String R1(String str) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        String intern = str.intern();
        kotlin.jvm.internal.l0.o(intern, "this as java.lang.String).intern()");
        return intern;
    }

    public static boolean S1(@p4.l CharSequence charSequence) {
        boolean z4;
        kotlin.jvm.internal.l0.p(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return true;
        }
        Iterable f32 = f0.f3(charSequence);
        if (!(f32 instanceof Collection) || !((Collection) f32).isEmpty()) {
            Iterator it = f32.iterator();
            while (it.hasNext()) {
                if (!d.r(charSequence.charAt(((s0) it).nextInt()))) {
                    z4 = false;
                    break;
                }
            }
        }
        z4 = true;
        if (z4) {
            return true;
        }
        return false;
    }

    @g1(version = "1.5")
    @kotlin.internal.f
    @v2(markerClass = {kotlin.r.class})
    private static final String T1(String str) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        String lowerCase = str.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.l0.o(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    @g1(version = "1.5")
    @kotlin.internal.f
    @v2(markerClass = {kotlin.r.class})
    private static final String U1(String str, Locale locale) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        kotlin.jvm.internal.l0.p(locale, "locale");
        String lowerCase = str.toLowerCase(locale);
        kotlin.jvm.internal.l0.o(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    @kotlin.internal.f
    private static final int V1(String str, char c5, int i5) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        return str.indexOf(c5, i5);
    }

    @kotlin.internal.f
    private static final int W1(String str, String str2, int i5) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        kotlin.jvm.internal.l0.p(str2, "str");
        return str.indexOf(str2, i5);
    }

    @kotlin.internal.f
    private static final int X1(String str, char c5, int i5) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        return str.lastIndexOf(c5, i5);
    }

    @kotlin.internal.f
    private static final int Y1(String str, String str2, int i5) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        kotlin.jvm.internal.l0.p(str2, "str");
        return str.lastIndexOf(str2, i5);
    }

    @kotlin.internal.f
    private static final int Z1(String str, int i5, int i6) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        return str.offsetByCodePoints(i5, i6);
    }

    public static final boolean a2(@p4.l CharSequence charSequence, int i5, @p4.l CharSequence other, int i6, int i7, boolean z4) {
        boolean b22;
        kotlin.jvm.internal.l0.p(charSequence, "<this>");
        kotlin.jvm.internal.l0.p(other, "other");
        if ((charSequence instanceof String) && (other instanceof String)) {
            b22 = b2((String) charSequence, i5, (String) other, i6, i7, z4);
            return b22;
        }
        return f0.Y3(charSequence, i5, other, i6, i7, z4);
    }

    public static boolean b2(@p4.l String str, int i5, @p4.l String other, int i6, int i7, boolean z4) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        kotlin.jvm.internal.l0.p(other, "other");
        if (!z4) {
            return str.regionMatches(i5, other, i6, i7);
        }
        return str.regionMatches(z4, i5, other, i6, i7);
    }

    public static /* synthetic */ boolean c2(CharSequence charSequence, int i5, CharSequence charSequence2, int i6, int i7, boolean z4, int i8, Object obj) {
        if ((i8 & 16) != 0) {
            z4 = false;
        }
        return a2(charSequence, i5, charSequence2, i6, i7, z4);
    }

    @kotlin.internal.f
    private static final String d1(StringBuffer stringBuffer) {
        kotlin.jvm.internal.l0.p(stringBuffer, "stringBuffer");
        return new String(stringBuffer);
    }

    public static /* synthetic */ boolean d2(String str, int i5, String str2, int i6, int i7, boolean z4, int i8, Object obj) {
        boolean b22;
        if ((i8 & 16) != 0) {
            z4 = false;
        }
        b22 = b2(str, i5, str2, i6, i7, z4);
        return b22;
    }

    @kotlin.internal.f
    private static final String e1(StringBuilder stringBuilder) {
        kotlin.jvm.internal.l0.p(stringBuilder, "stringBuilder");
        return new String(stringBuilder);
    }

    @p4.l
    public static String e2(@p4.l CharSequence charSequence, int i5) {
        boolean z4;
        kotlin.jvm.internal.l0.p(charSequence, "<this>");
        if (i5 >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (i5 == 0) {
                return "";
            }
            if (i5 != 1) {
                int length = charSequence.length();
                if (length == 0) {
                    return "";
                }
                if (length != 1) {
                    StringBuilder sb = new StringBuilder(charSequence.length() * i5);
                    s0 it = new kotlin.ranges.l(1, i5).iterator();
                    while (it.hasNext()) {
                        it.nextInt();
                        sb.append(charSequence);
                    }
                    String sb2 = sb.toString();
                    kotlin.jvm.internal.l0.o(sb2, "{\n                    va…tring()\n                }");
                    return sb2;
                }
                char charAt = charSequence.charAt(0);
                char[] cArr = new char[i5];
                for (int i6 = 0; i6 < i5; i6++) {
                    cArr[i6] = charAt;
                }
                return new String(cArr);
            }
            return charSequence.toString();
        }
        throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i5 + external.org.apache.commons.lang3.d.f15957a).toString());
    }

    @kotlin.internal.f
    private static final String f1(byte[] bytes) {
        kotlin.jvm.internal.l0.p(bytes, "bytes");
        return new String(bytes, f.f19703b);
    }

    @p4.l
    public static final String f2(@p4.l String str, char c5, char c6, boolean z4) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        if (!z4) {
            String replace = str.replace(c5, c6);
            kotlin.jvm.internal.l0.o(replace, "this as java.lang.String…replace(oldChar, newChar)");
            return replace;
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (int i5 = 0; i5 < str.length(); i5++) {
            char charAt = str.charAt(i5);
            if (e.J(charAt, c5, z4)) {
                charAt = c6;
            }
            sb.append(charAt);
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.l0.o(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @kotlin.internal.f
    private static final String g1(byte[] bytes, int i5, int i6) {
        kotlin.jvm.internal.l0.p(bytes, "bytes");
        return new String(bytes, i5, i6, f.f19703b);
    }

    @p4.l
    public static final String g2(@p4.l String str, @p4.l String oldValue, @p4.l String newValue, boolean z4) {
        int u4;
        kotlin.jvm.internal.l0.p(str, "<this>");
        kotlin.jvm.internal.l0.p(oldValue, "oldValue");
        kotlin.jvm.internal.l0.p(newValue, "newValue");
        int i5 = 0;
        int l32 = f0.l3(str, oldValue, 0, z4);
        if (l32 < 0) {
            return str;
        }
        int length = oldValue.length();
        u4 = kotlin.ranges.u.u(length, 1);
        int length2 = (str.length() - length) + newValue.length();
        if (length2 >= 0) {
            StringBuilder sb = new StringBuilder(length2);
            do {
                sb.append((CharSequence) str, i5, l32);
                sb.append(newValue);
                i5 = l32 + length;
                if (l32 >= str.length()) {
                    break;
                }
                l32 = f0.l3(str, oldValue, l32 + u4, z4);
            } while (l32 > 0);
            sb.append((CharSequence) str, i5, str.length());
            String sb2 = sb.toString();
            kotlin.jvm.internal.l0.o(sb2, "stringBuilder.append(this, i, length).toString()");
            return sb2;
        }
        throw new OutOfMemoryError();
    }

    @kotlin.internal.f
    private static final String h1(byte[] bytes, int i5, int i6, Charset charset) {
        kotlin.jvm.internal.l0.p(bytes, "bytes");
        kotlin.jvm.internal.l0.p(charset, "charset");
        return new String(bytes, i5, i6, charset);
    }

    public static /* synthetic */ String h2(String str, char c5, char c6, boolean z4, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            z4 = false;
        }
        return f2(str, c5, c6, z4);
    }

    @kotlin.internal.f
    private static final String i1(byte[] bytes, Charset charset) {
        kotlin.jvm.internal.l0.p(bytes, "bytes");
        kotlin.jvm.internal.l0.p(charset, "charset");
        return new String(bytes, charset);
    }

    public static /* synthetic */ String i2(String str, String str2, String str3, boolean z4, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            z4 = false;
        }
        return g2(str, str2, str3, z4);
    }

    @kotlin.internal.f
    private static final String j1(char[] chars) {
        kotlin.jvm.internal.l0.p(chars, "chars");
        return new String(chars);
    }

    @p4.l
    public static final String j2(@p4.l String str, char c5, char c6, boolean z4) {
        int o32;
        CharSequence G4;
        kotlin.jvm.internal.l0.p(str, "<this>");
        o32 = f0.o3(str, c5, 0, z4, 2, null);
        if (o32 >= 0) {
            G4 = f0.G4(str, o32, o32 + 1, String.valueOf(c6));
            return G4.toString();
        }
        return str;
    }

    @kotlin.internal.f
    private static final String k1(char[] chars, int i5, int i6) {
        kotlin.jvm.internal.l0.p(chars, "chars");
        return new String(chars, i5, i6);
    }

    @p4.l
    public static final String k2(@p4.l String str, @p4.l String oldValue, @p4.l String newValue, boolean z4) {
        int p32;
        CharSequence G4;
        kotlin.jvm.internal.l0.p(str, "<this>");
        kotlin.jvm.internal.l0.p(oldValue, "oldValue");
        kotlin.jvm.internal.l0.p(newValue, "newValue");
        p32 = f0.p3(str, oldValue, 0, z4, 2, null);
        if (p32 >= 0) {
            G4 = f0.G4(str, p32, oldValue.length() + p32, newValue);
            return G4.toString();
        }
        return str;
    }

    @kotlin.internal.f
    private static final String l1(int[] codePoints, int i5, int i6) {
        kotlin.jvm.internal.l0.p(codePoints, "codePoints");
        return new String(codePoints, i5, i6);
    }

    public static /* synthetic */ String l2(String str, char c5, char c6, boolean z4, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            z4 = false;
        }
        return j2(str, c5, c6, z4);
    }

    @p4.l
    @kotlin.k(message = "Use replaceFirstChar instead.", replaceWith = @b1(expression = "replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }", imports = {"java.util.Locale"}))
    @kotlin.l(warningSince = "1.5")
    public static final String m1(@p4.l String str) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        Locale locale = Locale.getDefault();
        kotlin.jvm.internal.l0.o(locale, "getDefault()");
        return n1(str, locale);
    }

    public static /* synthetic */ String m2(String str, String str2, String str3, boolean z4, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            z4 = false;
        }
        return k2(str, str2, str3, z4);
    }

    @g1(version = "1.4")
    @kotlin.internal.h
    @kotlin.k(message = "Use replaceFirstChar instead.", replaceWith = @b1(expression = "replaceFirstChar { if (it.isLowerCase()) it.titlecase(locale) else it.toString() }", imports = {}))
    @kotlin.l(warningSince = "1.5")
    @v2(markerClass = {kotlin.r.class})
    @p4.l
    public static final String n1(@p4.l String str, @p4.l Locale locale) {
        boolean z4;
        kotlin.jvm.internal.l0.p(str, "<this>");
        kotlin.jvm.internal.l0.p(locale, "locale");
        if (str.length() > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            char charAt = str.charAt(0);
            if (Character.isLowerCase(charAt)) {
                StringBuilder sb = new StringBuilder();
                char titleCase = Character.toTitleCase(charAt);
                if (titleCase != Character.toUpperCase(charAt)) {
                    sb.append(titleCase);
                } else {
                    String substring = str.substring(0, 1);
                    kotlin.jvm.internal.l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    kotlin.jvm.internal.l0.n(substring, "null cannot be cast to non-null type java.lang.String");
                    String upperCase = substring.toUpperCase(locale);
                    kotlin.jvm.internal.l0.o(upperCase, "this as java.lang.String).toUpperCase(locale)");
                    sb.append(upperCase);
                }
                String substring2 = str.substring(1);
                kotlin.jvm.internal.l0.o(substring2, "this as java.lang.String).substring(startIndex)");
                sb.append(substring2);
                String sb2 = sb.toString();
                kotlin.jvm.internal.l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
                return sb2;
            }
            return str;
        }
        return str;
    }

    @p4.l
    public static final List<String> n2(@p4.l CharSequence charSequence, @p4.l Pattern regex, int i5) {
        List<String> t5;
        kotlin.jvm.internal.l0.p(charSequence, "<this>");
        kotlin.jvm.internal.l0.p(regex, "regex");
        f0.K4(i5);
        if (i5 == 0) {
            i5 = -1;
        }
        String[] split = regex.split(charSequence, i5);
        kotlin.jvm.internal.l0.o(split, "regex.split(this, if (limit == 0) -1 else limit)");
        t5 = kotlin.collections.o.t(split);
        return t5;
    }

    @kotlin.internal.f
    private static final int o1(String str, int i5) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        return str.codePointAt(i5);
    }

    public static /* synthetic */ List o2(CharSequence charSequence, Pattern pattern, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i5 = 0;
        }
        return n2(charSequence, pattern, i5);
    }

    @kotlin.internal.f
    private static final int p1(String str, int i5) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        return str.codePointBefore(i5);
    }

    public static boolean p2(@p4.l String str, @p4.l String prefix, int i5, boolean z4) {
        boolean b22;
        kotlin.jvm.internal.l0.p(str, "<this>");
        kotlin.jvm.internal.l0.p(prefix, "prefix");
        if (!z4) {
            return str.startsWith(prefix, i5);
        }
        b22 = b2(str, i5, prefix, 0, prefix.length(), z4);
        return b22;
    }

    @kotlin.internal.f
    private static final int q1(String str, int i5, int i6) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        return str.codePointCount(i5, i6);
    }

    public static boolean q2(@p4.l String str, @p4.l String prefix, boolean z4) {
        boolean b22;
        kotlin.jvm.internal.l0.p(str, "<this>");
        kotlin.jvm.internal.l0.p(prefix, "prefix");
        if (!z4) {
            return str.startsWith(prefix);
        }
        b22 = b2(str, 0, prefix, 0, prefix.length(), z4);
        return b22;
    }

    public static final int r1(@p4.l String str, @p4.l String other, boolean z4) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        kotlin.jvm.internal.l0.p(other, "other");
        if (z4) {
            return str.compareToIgnoreCase(other);
        }
        return str.compareTo(other);
    }

    public static /* synthetic */ boolean r2(String str, String str2, int i5, boolean z4, int i6, Object obj) {
        boolean p22;
        if ((i6 & 4) != 0) {
            z4 = false;
        }
        p22 = p2(str, str2, i5, z4);
        return p22;
    }

    public static /* synthetic */ int s1(String str, String str2, boolean z4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z4 = false;
        }
        return r1(str, str2, z4);
    }

    public static /* synthetic */ boolean s2(String str, String str2, boolean z4, int i5, Object obj) {
        boolean q22;
        if ((i5 & 2) != 0) {
            z4 = false;
        }
        q22 = q2(str, str2, z4);
        return q22;
    }

    @p4.l
    @g1(version = "1.4")
    @v2(markerClass = {kotlin.r.class})
    public static String t1(@p4.l char[] cArr) {
        kotlin.jvm.internal.l0.p(cArr, "<this>");
        return new String(cArr);
    }

    @kotlin.internal.f
    private static final String t2(String str, int i5) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        String substring = str.substring(i5);
        kotlin.jvm.internal.l0.o(substring, "this as java.lang.String).substring(startIndex)");
        return substring;
    }

    @p4.l
    @g1(version = "1.4")
    @v2(markerClass = {kotlin.r.class})
    public static String u1(@p4.l char[] cArr, int i5, int i6) {
        kotlin.jvm.internal.l0.p(cArr, "<this>");
        kotlin.collections.c.Companion.a(i5, i6, cArr.length);
        return new String(cArr, i5, i6 - i5);
    }

    @kotlin.internal.f
    private static final String u2(String str, int i5, int i6) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        String substring = str.substring(i5, i6);
        kotlin.jvm.internal.l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String v1(char[] cArr, int i5, int i6, int i7, Object obj) {
        String u12;
        if ((i7 & 1) != 0) {
            i5 = 0;
        }
        if ((i7 & 2) != 0) {
            i6 = cArr.length;
        }
        u12 = u1(cArr, i5, i6);
        return u12;
    }

    @kotlin.internal.f
    private static final byte[] v2(String str, Charset charset) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        kotlin.jvm.internal.l0.p(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        kotlin.jvm.internal.l0.o(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @g1(version = "1.5")
    public static boolean w1(@p4.m CharSequence charSequence, @p4.m CharSequence charSequence2) {
        if ((charSequence instanceof String) && charSequence2 != null) {
            return ((String) charSequence).contentEquals(charSequence2);
        }
        return f0.V2(charSequence, charSequence2);
    }

    static /* synthetic */ byte[] w2(String str, Charset charset, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            charset = f.f19703b;
        }
        kotlin.jvm.internal.l0.p(str, "<this>");
        kotlin.jvm.internal.l0.p(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        kotlin.jvm.internal.l0.o(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @g1(version = "1.5")
    public static final boolean x1(@p4.m CharSequence charSequence, @p4.m CharSequence charSequence2, boolean z4) {
        boolean w12;
        if (z4) {
            return f0.U2(charSequence, charSequence2);
        }
        w12 = w1(charSequence, charSequence2);
        return w12;
    }

    @kotlin.internal.f
    private static final char[] x2(String str) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        char[] charArray = str.toCharArray();
        kotlin.jvm.internal.l0.o(charArray, "this as java.lang.String).toCharArray()");
        return charArray;
    }

    @kotlin.internal.f
    private static final boolean y1(String str, CharSequence charSequence) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        kotlin.jvm.internal.l0.p(charSequence, "charSequence");
        return str.contentEquals(charSequence);
    }

    @p4.l
    @g1(version = "1.4")
    @v2(markerClass = {kotlin.r.class})
    public static final char[] y2(@p4.l String str, int i5, int i6) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        kotlin.collections.c.Companion.a(i5, i6, str.length());
        char[] cArr = new char[i6 - i5];
        str.getChars(i5, i6, cArr, 0);
        return cArr;
    }

    @kotlin.internal.f
    private static final boolean z1(String str, StringBuffer stringBuilder) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        kotlin.jvm.internal.l0.p(stringBuilder, "stringBuilder");
        return str.contentEquals(stringBuilder);
    }

    @kotlin.internal.f
    private static final char[] z2(String str, char[] destination, int i5, int i6, int i7) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        kotlin.jvm.internal.l0.p(destination, "destination");
        str.getChars(i6, i7, destination, i5);
        return destination;
    }
}
