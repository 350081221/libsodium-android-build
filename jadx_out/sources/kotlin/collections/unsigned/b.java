package kotlin.collections.unsigned;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import kotlin.b1;
import kotlin.c2;
import kotlin.collections.p;
import kotlin.collections.s0;
import kotlin.d2;
import kotlin.g1;
import kotlin.g2;
import kotlin.h2;
import kotlin.i0;
import kotlin.internal.f;
import kotlin.jvm.internal.l0;
import kotlin.k;
import kotlin.l;
import kotlin.m2;
import kotlin.n2;
import kotlin.t;
import kotlin.t0;
import kotlin.u2;
import kotlin.y1;
import kotlin.z1;
import u3.h;

@i0(d1 = {"\u0000h\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b \n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001*\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\n0\u0001*\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0001*\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a2\u0010\u0012\u001a\u00020\u0013*\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0013H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a2\u0010\u0012\u001a\u00020\u0013*\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0013H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a2\u0010\u0012\u001a\u00020\u0013*\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\n2\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0013H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a2\u0010\u0012\u001a\u00020\u0013*\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000e2\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0013H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001f\u0010\u001f\u001a\u00020\u0002*\u00020\u00032\u0006\u0010 \u001a\u00020\u0013H\u0087\bø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001a\u001f\u0010\u001f\u001a\u00020\u0006*\u00020\u00072\u0006\u0010 \u001a\u00020\u0013H\u0087\bø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a\u001f\u0010\u001f\u001a\u00020\n*\u00020\u000b2\u0006\u0010 \u001a\u00020\u0013H\u0087\bø\u0001\u0000¢\u0006\u0004\b%\u0010&\u001a\u001f\u0010\u001f\u001a\u00020\u000e*\u00020\u000f2\u0006\u0010 \u001a\u00020\u0013H\u0087\bø\u0001\u0000¢\u0006\u0004\b'\u0010(\u001a\u0018\u0010)\u001a\u0004\u0018\u00010\u0002*\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b*\u0010+\u001a\u0018\u0010)\u001a\u0004\u0018\u00010\u0006*\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b,\u0010-\u001a\u0018\u0010)\u001a\u0004\u0018\u00010\n*\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b.\u0010/\u001a\u0018\u0010)\u001a\u0004\u0018\u00010\u000e*\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b0\u00101\u001a@\u00102\u001a\u0004\u0018\u00010\u0002\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u0002H304*\u00020\u00032\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H306H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b7\u00108\u001a@\u00102\u001a\u0004\u0018\u00010\u0006\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u0002H304*\u00020\u00072\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H306H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b9\u0010:\u001a@\u00102\u001a\u0004\u0018\u00010\n\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u0002H304*\u00020\u000b2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u0002H306H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b;\u0010<\u001a@\u00102\u001a\u0004\u0018\u00010\u000e\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u0002H304*\u00020\u000f2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u0002H306H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b=\u0010>\u001a4\u0010?\u001a\u0004\u0018\u00010\u0002*\u00020\u00032\u001a\u0010@\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00020Aj\n\u0012\u0006\b\u0000\u0012\u00020\u0002`BH\u0007ø\u0001\u0000¢\u0006\u0004\bC\u0010D\u001a4\u0010?\u001a\u0004\u0018\u00010\u0006*\u00020\u00072\u001a\u0010@\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00060Aj\n\u0012\u0006\b\u0000\u0012\u00020\u0006`BH\u0007ø\u0001\u0000¢\u0006\u0004\bE\u0010F\u001a4\u0010?\u001a\u0004\u0018\u00010\n*\u00020\u000b2\u001a\u0010@\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\n0Aj\n\u0012\u0006\b\u0000\u0012\u00020\n`BH\u0007ø\u0001\u0000¢\u0006\u0004\bG\u0010H\u001a4\u0010?\u001a\u0004\u0018\u00010\u000e*\u00020\u000f2\u001a\u0010@\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u000e0Aj\n\u0012\u0006\b\u0000\u0012\u00020\u000e`BH\u0007ø\u0001\u0000¢\u0006\u0004\bI\u0010J\u001a\u0018\u0010K\u001a\u0004\u0018\u00010\u0002*\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\bL\u0010+\u001a\u0018\u0010K\u001a\u0004\u0018\u00010\u0006*\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\bM\u0010-\u001a\u0018\u0010K\u001a\u0004\u0018\u00010\n*\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\bN\u0010/\u001a\u0018\u0010K\u001a\u0004\u0018\u00010\u000e*\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\bO\u00101\u001a@\u0010P\u001a\u0004\u0018\u00010\u0002\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u0002H304*\u00020\u00032\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H306H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bQ\u00108\u001a@\u0010P\u001a\u0004\u0018\u00010\u0006\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u0002H304*\u00020\u00072\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H306H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bR\u0010:\u001a@\u0010P\u001a\u0004\u0018\u00010\n\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u0002H304*\u00020\u000b2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u0002H306H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bS\u0010<\u001a@\u0010P\u001a\u0004\u0018\u00010\u000e\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u0002H304*\u00020\u000f2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u0002H306H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bT\u0010>\u001a4\u0010U\u001a\u0004\u0018\u00010\u0002*\u00020\u00032\u001a\u0010@\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00020Aj\n\u0012\u0006\b\u0000\u0012\u00020\u0002`BH\u0007ø\u0001\u0000¢\u0006\u0004\bV\u0010D\u001a4\u0010U\u001a\u0004\u0018\u00010\u0006*\u00020\u00072\u001a\u0010@\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00060Aj\n\u0012\u0006\b\u0000\u0012\u00020\u0006`BH\u0007ø\u0001\u0000¢\u0006\u0004\bW\u0010F\u001a4\u0010U\u001a\u0004\u0018\u00010\n*\u00020\u000b2\u001a\u0010@\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\n0Aj\n\u0012\u0006\b\u0000\u0012\u00020\n`BH\u0007ø\u0001\u0000¢\u0006\u0004\bX\u0010H\u001a4\u0010U\u001a\u0004\u0018\u00010\u000e*\u00020\u000f2\u001a\u0010@\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u000e0Aj\n\u0012\u0006\b\u0000\u0012\u00020\u000e`BH\u0007ø\u0001\u0000¢\u0006\u0004\bY\u0010J\u001a.\u0010Z\u001a\u00020[*\u00020\u00032\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020[06H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\\\u0010]\u001a.\u0010Z\u001a\u00020^*\u00020\u00032\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020^06H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b_\u0010`\u001a.\u0010Z\u001a\u00020[*\u00020\u00072\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020[06H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\\\u0010a\u001a.\u0010Z\u001a\u00020^*\u00020\u00072\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020^06H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b_\u0010b\u001a.\u0010Z\u001a\u00020[*\u00020\u000b2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020[06H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\\\u0010c\u001a.\u0010Z\u001a\u00020^*\u00020\u000b2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020^06H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b_\u0010d\u001a.\u0010Z\u001a\u00020[*\u00020\u000f2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020[06H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\\\u0010e\u001a.\u0010Z\u001a\u00020^*\u00020\u000f2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020^06H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b_\u0010f\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b\u009920\u0001¨\u0006g"}, d2 = {"asList", "", "Lkotlin/UByte;", "Lkotlin/UByteArray;", "asList-GBYM_sE", "([B)Ljava/util/List;", "Lkotlin/UInt;", "Lkotlin/UIntArray;", "asList--ajY-9A", "([I)Ljava/util/List;", "Lkotlin/ULong;", "Lkotlin/ULongArray;", "asList-QwZRm1k", "([J)Ljava/util/List;", "Lkotlin/UShort;", "Lkotlin/UShortArray;", "asList-rL5Bavg", "([S)Ljava/util/List;", "binarySearch", "", "element", "fromIndex", "toIndex", "binarySearch-WpHrYlw", "([BBII)I", "binarySearch-2fe2U9s", "([IIII)I", "binarySearch-K6DWlUc", "([JJII)I", "binarySearch-EtDCXyQ", "([SSII)I", "elementAt", "index", "elementAt-PpDY95g", "([BI)B", "elementAt-qFRl0hI", "([II)I", "elementAt-r7IrZao", "([JI)J", "elementAt-nggk6HY", "([SI)S", "max", "max-GBYM_sE", "([B)Lkotlin/UByte;", "max--ajY-9A", "([I)Lkotlin/UInt;", "max-QwZRm1k", "([J)Lkotlin/ULong;", "max-rL5Bavg", "([S)Lkotlin/UShort;", "maxBy", "R", "", "selector", "Lkotlin/Function1;", "maxBy-JOV_ifY", "([BLkotlin/jvm/functions/Function1;)Lkotlin/UByte;", "maxBy-jgv0xPQ", "([ILkotlin/jvm/functions/Function1;)Lkotlin/UInt;", "maxBy-MShoTSo", "([JLkotlin/jvm/functions/Function1;)Lkotlin/ULong;", "maxBy-xTcfx_M", "([SLkotlin/jvm/functions/Function1;)Lkotlin/UShort;", "maxWith", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "maxWith-XMRcp5o", "([BLjava/util/Comparator;)Lkotlin/UByte;", "maxWith-YmdZ_VM", "([ILjava/util/Comparator;)Lkotlin/UInt;", "maxWith-zrEWJaI", "([JLjava/util/Comparator;)Lkotlin/ULong;", "maxWith-eOHTfZs", "([SLjava/util/Comparator;)Lkotlin/UShort;", "min", "min-GBYM_sE", "min--ajY-9A", "min-QwZRm1k", "min-rL5Bavg", "minBy", "minBy-JOV_ifY", "minBy-jgv0xPQ", "minBy-MShoTSo", "minBy-xTcfx_M", "minWith", "minWith-XMRcp5o", "minWith-YmdZ_VM", "minWith-zrEWJaI", "minWith-eOHTfZs", "sumOf", "Ljava/math/BigDecimal;", "sumOfBigDecimal", "([BLkotlin/jvm/functions/Function1;)Ljava/math/BigDecimal;", "Ljava/math/BigInteger;", "sumOfBigInteger", "([BLkotlin/jvm/functions/Function1;)Ljava/math/BigInteger;", "([ILkotlin/jvm/functions/Function1;)Ljava/math/BigDecimal;", "([ILkotlin/jvm/functions/Function1;)Ljava/math/BigInteger;", "([JLkotlin/jvm/functions/Function1;)Ljava/math/BigDecimal;", "([JLkotlin/jvm/functions/Function1;)Ljava/math/BigInteger;", "([SLkotlin/jvm/functions/Function1;)Ljava/math/BigDecimal;", "([SLkotlin/jvm/functions/Function1;)Ljava/math/BigInteger;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, pn = "kotlin.collections", xi = 49, xs = "kotlin/collections/unsigned/UArraysKt")
/* loaded from: classes3.dex */
class b {

    @i0(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004J\u001b\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0006H\u0096\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0011J\b\u0010\u0014\u001a\u00020\nH\u0016J\u001a\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0017"}, d2 = {"kotlin/collections/unsigned/UArraysKt___UArraysJvmKt$asList$1", "Lkotlin/collections/AbstractList;", "Lkotlin/UInt;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "size", "", "getSize", "()I", "contains", "", "element", "contains-WZ4Q5Ns", "(I)Z", "get", "index", "get-pVg5ArA", "(I)I", "indexOf", "indexOf-WZ4Q5Ns", "isEmpty", "lastIndexOf", "lastIndexOf-WZ4Q5Ns", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a extends kotlin.collections.c<c2> implements RandomAccess {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int[] f19185a;

        a(int[] iArr) {
            this.f19185a = iArr;
        }

        public boolean a(int i5) {
            return d2.j(this.f19185a, i5);
        }

        public int c(int i5) {
            return d2.n(this.f19185a, i5);
        }

        @Override // kotlin.collections.a, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof c2) {
                return a(((c2) obj).l0());
            }
            return false;
        }

        public int e(int i5) {
            int Gf;
            Gf = p.Gf(this.f19185a, i5);
            return Gf;
        }

        public int g(int i5) {
            int Kh;
            Kh = p.Kh(this.f19185a, i5);
            return Kh;
        }

        @Override // kotlin.collections.c, java.util.List
        public /* bridge */ /* synthetic */ Object get(int i5) {
            return c2.e(c(i5));
        }

        @Override // kotlin.collections.c, kotlin.collections.a
        public int getSize() {
            return d2.p(this.f19185a);
        }

        @Override // kotlin.collections.c, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof c2) {
                return e(((c2) obj).l0());
            }
            return -1;
        }

        @Override // kotlin.collections.a, java.util.Collection
        public boolean isEmpty() {
            return d2.s(this.f19185a);
        }

        @Override // kotlin.collections.c, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof c2) {
                return g(((c2) obj).l0());
            }
            return -1;
        }
    }

    @i0(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004J\u001b\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0006H\u0096\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0015\u001a\u00020\nH\u0016J\u001a\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0018"}, d2 = {"kotlin/collections/unsigned/UArraysKt___UArraysJvmKt$asList$2", "Lkotlin/collections/AbstractList;", "Lkotlin/ULong;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "size", "", "getSize", "()I", "contains", "", "element", "contains-VKZWuLQ", "(J)Z", "get", "index", "get-s-VKNKU", "(I)J", "indexOf", "indexOf-VKZWuLQ", "(J)I", "isEmpty", "lastIndexOf", "lastIndexOf-VKZWuLQ", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.collections.unsigned.b$b, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0547b extends kotlin.collections.c<g2> implements RandomAccess {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long[] f19186a;

        C0547b(long[] jArr) {
            this.f19186a = jArr;
        }

        public boolean a(long j5) {
            return h2.j(this.f19186a, j5);
        }

        public long c(int i5) {
            return h2.n(this.f19186a, i5);
        }

        @Override // kotlin.collections.a, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof g2) {
                return a(((g2) obj).l0());
            }
            return false;
        }

        public int e(long j5) {
            int Hf;
            Hf = p.Hf(this.f19186a, j5);
            return Hf;
        }

        public int g(long j5) {
            int Lh;
            Lh = p.Lh(this.f19186a, j5);
            return Lh;
        }

        @Override // kotlin.collections.c, java.util.List
        public /* bridge */ /* synthetic */ Object get(int i5) {
            return g2.e(c(i5));
        }

        @Override // kotlin.collections.c, kotlin.collections.a
        public int getSize() {
            return h2.p(this.f19186a);
        }

        @Override // kotlin.collections.c, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof g2) {
                return e(((g2) obj).l0());
            }
            return -1;
        }

        @Override // kotlin.collections.a, java.util.Collection
        public boolean isEmpty() {
            return h2.s(this.f19186a);
        }

        @Override // kotlin.collections.c, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof g2) {
                return g(((g2) obj).l0());
            }
            return -1;
        }
    }

    @i0(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004J\u001b\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0006H\u0096\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0015\u001a\u00020\nH\u0016J\u001a\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0018"}, d2 = {"kotlin/collections/unsigned/UArraysKt___UArraysJvmKt$asList$3", "Lkotlin/collections/AbstractList;", "Lkotlin/UByte;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "size", "", "getSize", "()I", "contains", "", "element", "contains-7apg3OU", "(B)Z", "get", "index", "get-w2LRezQ", "(I)B", "indexOf", "indexOf-7apg3OU", "(B)I", "isEmpty", "lastIndexOf", "lastIndexOf-7apg3OU", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c extends kotlin.collections.c<y1> implements RandomAccess {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte[] f19187a;

        c(byte[] bArr) {
            this.f19187a = bArr;
        }

        public boolean a(byte b5) {
            return z1.j(this.f19187a, b5);
        }

        public byte c(int i5) {
            return z1.n(this.f19187a, i5);
        }

        @Override // kotlin.collections.a, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof y1) {
                return a(((y1) obj).j0());
            }
            return false;
        }

        public int e(byte b5) {
            int Cf;
            Cf = p.Cf(this.f19187a, b5);
            return Cf;
        }

        public int g(byte b5) {
            int Gh;
            Gh = p.Gh(this.f19187a, b5);
            return Gh;
        }

        @Override // kotlin.collections.c, java.util.List
        public /* bridge */ /* synthetic */ Object get(int i5) {
            return y1.e(c(i5));
        }

        @Override // kotlin.collections.c, kotlin.collections.a
        public int getSize() {
            return z1.p(this.f19187a);
        }

        @Override // kotlin.collections.c, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof y1) {
                return e(((y1) obj).j0());
            }
            return -1;
        }

        @Override // kotlin.collections.a, java.util.Collection
        public boolean isEmpty() {
            return z1.s(this.f19187a);
        }

        @Override // kotlin.collections.c, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof y1) {
                return g(((y1) obj).j0());
            }
            return -1;
        }
    }

    @i0(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004J\u001b\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0006H\u0096\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0015\u001a\u00020\nH\u0016J\u001a\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0018"}, d2 = {"kotlin/collections/unsigned/UArraysKt___UArraysJvmKt$asList$4", "Lkotlin/collections/AbstractList;", "Lkotlin/UShort;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "size", "", "getSize", "()I", "contains", "", "element", "contains-xj2QHRw", "(S)Z", "get", "index", "get-Mh2AYeg", "(I)S", "indexOf", "indexOf-xj2QHRw", "(S)I", "isEmpty", "lastIndexOf", "lastIndexOf-xj2QHRw", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class d extends kotlin.collections.c<m2> implements RandomAccess {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ short[] f19188a;

        d(short[] sArr) {
            this.f19188a = sArr;
        }

        public boolean a(short s5) {
            return n2.j(this.f19188a, s5);
        }

        public short c(int i5) {
            return n2.n(this.f19188a, i5);
        }

        @Override // kotlin.collections.a, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof m2) {
                return a(((m2) obj).j0());
            }
            return false;
        }

        public int e(short s5) {
            int Jf;
            Jf = p.Jf(this.f19188a, s5);
            return Jf;
        }

        public int g(short s5) {
            int Nh;
            Nh = p.Nh(this.f19188a, s5);
            return Nh;
        }

        @Override // kotlin.collections.c, java.util.List
        public /* bridge */ /* synthetic */ Object get(int i5) {
            return m2.e(c(i5));
        }

        @Override // kotlin.collections.c, kotlin.collections.a
        public int getSize() {
            return n2.p(this.f19188a);
        }

        @Override // kotlin.collections.c, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof m2) {
                return e(((m2) obj).j0());
            }
            return -1;
        }

        @Override // kotlin.collections.a, java.util.Collection
        public boolean isEmpty() {
            return n2.s(this.f19188a);
        }

        @Override // kotlin.collections.c, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof m2) {
                return g(((m2) obj).j0());
            }
            return -1;
        }
    }

    @g1(version = "1.3")
    @k(message = "Use maxWithOrNull instead.", replaceWith = @b1(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    public static final /* synthetic */ m2 A(short[] maxWith, Comparator comparator) {
        l0.p(maxWith, "$this$maxWith");
        l0.p(comparator, "comparator");
        return kotlin.collections.unsigned.c.A6(maxWith, comparator);
    }

    @g1(version = "1.3")
    @k(message = "Use maxWithOrNull instead.", replaceWith = @b1(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    public static final /* synthetic */ g2 B(long[] maxWith, Comparator comparator) {
        l0.p(maxWith, "$this$maxWith");
        l0.p(comparator, "comparator");
        return kotlin.collections.unsigned.c.B6(maxWith, comparator);
    }

    @g1(version = "1.3")
    @k(message = "Use minOrNull instead.", replaceWith = @b1(expression = "this.minOrNull()", imports = {}))
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    public static final /* synthetic */ c2 C(int[] min) {
        l0.p(min, "$this$min");
        return kotlin.collections.unsigned.c.u7(min);
    }

    @g1(version = "1.3")
    @k(message = "Use minOrNull instead.", replaceWith = @b1(expression = "this.minOrNull()", imports = {}))
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    public static final /* synthetic */ y1 D(byte[] min) {
        l0.p(min, "$this$min");
        return kotlin.collections.unsigned.c.v7(min);
    }

    @g1(version = "1.3")
    @k(message = "Use minOrNull instead.", replaceWith = @b1(expression = "this.minOrNull()", imports = {}))
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    public static final /* synthetic */ g2 E(long[] min) {
        l0.p(min, "$this$min");
        return kotlin.collections.unsigned.c.w7(min);
    }

    @g1(version = "1.3")
    @k(message = "Use minOrNull instead.", replaceWith = @b1(expression = "this.minOrNull()", imports = {}))
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    public static final /* synthetic */ m2 F(short[] min) {
        l0.p(min, "$this$min");
        return kotlin.collections.unsigned.c.x7(min);
    }

    @g1(version = "1.3")
    @k(message = "Use minByOrNull instead.", replaceWith = @b1(expression = "this.minByOrNull(selector)", imports = {}))
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    @f
    private static final /* synthetic */ <R extends Comparable<? super R>> y1 G(byte[] minBy, v3.l<? super y1, ? extends R> selector) {
        int qe;
        l0.p(minBy, "$this$minBy");
        l0.p(selector, "selector");
        if (z1.s(minBy)) {
            return null;
        }
        byte n5 = z1.n(minBy, 0);
        qe = p.qe(minBy);
        if (qe != 0) {
            R invoke = selector.invoke(y1.e(n5));
            s0 it = new kotlin.ranges.l(1, qe).iterator();
            while (it.hasNext()) {
                byte n6 = z1.n(minBy, it.nextInt());
                R invoke2 = selector.invoke(y1.e(n6));
                if (invoke.compareTo(invoke2) > 0) {
                    n5 = n6;
                    invoke = invoke2;
                }
            }
        }
        return y1.e(n5);
    }

    @g1(version = "1.3")
    @k(message = "Use minByOrNull instead.", replaceWith = @b1(expression = "this.minByOrNull(selector)", imports = {}))
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    @f
    private static final /* synthetic */ <R extends Comparable<? super R>> g2 H(long[] minBy, v3.l<? super g2, ? extends R> selector) {
        int ve;
        l0.p(minBy, "$this$minBy");
        l0.p(selector, "selector");
        if (h2.s(minBy)) {
            return null;
        }
        long n5 = h2.n(minBy, 0);
        ve = p.ve(minBy);
        if (ve != 0) {
            R invoke = selector.invoke(g2.e(n5));
            s0 it = new kotlin.ranges.l(1, ve).iterator();
            while (it.hasNext()) {
                long n6 = h2.n(minBy, it.nextInt());
                R invoke2 = selector.invoke(g2.e(n6));
                if (invoke.compareTo(invoke2) > 0) {
                    n5 = n6;
                    invoke = invoke2;
                }
            }
        }
        return g2.e(n5);
    }

    @g1(version = "1.3")
    @k(message = "Use minByOrNull instead.", replaceWith = @b1(expression = "this.minByOrNull(selector)", imports = {}))
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    @f
    private static final /* synthetic */ <R extends Comparable<? super R>> c2 I(int[] minBy, v3.l<? super c2, ? extends R> selector) {
        int ue;
        l0.p(minBy, "$this$minBy");
        l0.p(selector, "selector");
        if (d2.s(minBy)) {
            return null;
        }
        int n5 = d2.n(minBy, 0);
        ue = p.ue(minBy);
        if (ue != 0) {
            R invoke = selector.invoke(c2.e(n5));
            s0 it = new kotlin.ranges.l(1, ue).iterator();
            while (it.hasNext()) {
                int n6 = d2.n(minBy, it.nextInt());
                R invoke2 = selector.invoke(c2.e(n6));
                if (invoke.compareTo(invoke2) > 0) {
                    n5 = n6;
                    invoke = invoke2;
                }
            }
        }
        return c2.e(n5);
    }

    @g1(version = "1.3")
    @k(message = "Use minByOrNull instead.", replaceWith = @b1(expression = "this.minByOrNull(selector)", imports = {}))
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    @f
    private static final /* synthetic */ <R extends Comparable<? super R>> m2 J(short[] minBy, v3.l<? super m2, ? extends R> selector) {
        int xe;
        l0.p(minBy, "$this$minBy");
        l0.p(selector, "selector");
        if (n2.s(minBy)) {
            return null;
        }
        short n5 = n2.n(minBy, 0);
        xe = p.xe(minBy);
        if (xe != 0) {
            R invoke = selector.invoke(m2.e(n5));
            s0 it = new kotlin.ranges.l(1, xe).iterator();
            while (it.hasNext()) {
                short n6 = n2.n(minBy, it.nextInt());
                R invoke2 = selector.invoke(m2.e(n6));
                if (invoke.compareTo(invoke2) > 0) {
                    n5 = n6;
                    invoke = invoke2;
                }
            }
        }
        return m2.e(n5);
    }

    @g1(version = "1.3")
    @k(message = "Use minWithOrNull instead.", replaceWith = @b1(expression = "this.minWithOrNull(comparator)", imports = {}))
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    public static final /* synthetic */ y1 K(byte[] minWith, Comparator comparator) {
        l0.p(minWith, "$this$minWith");
        l0.p(comparator, "comparator");
        return kotlin.collections.unsigned.c.C7(minWith, comparator);
    }

    @g1(version = "1.3")
    @k(message = "Use minWithOrNull instead.", replaceWith = @b1(expression = "this.minWithOrNull(comparator)", imports = {}))
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    public static final /* synthetic */ c2 L(int[] minWith, Comparator comparator) {
        l0.p(minWith, "$this$minWith");
        l0.p(comparator, "comparator");
        return kotlin.collections.unsigned.c.D7(minWith, comparator);
    }

    @g1(version = "1.3")
    @k(message = "Use minWithOrNull instead.", replaceWith = @b1(expression = "this.minWithOrNull(comparator)", imports = {}))
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    public static final /* synthetic */ m2 M(short[] minWith, Comparator comparator) {
        l0.p(minWith, "$this$minWith");
        l0.p(comparator, "comparator");
        return kotlin.collections.unsigned.c.E7(minWith, comparator);
    }

    @g1(version = "1.3")
    @k(message = "Use minWithOrNull instead.", replaceWith = @b1(expression = "this.minWithOrNull(comparator)", imports = {}))
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    public static final /* synthetic */ g2 N(long[] minWith, Comparator comparator) {
        l0.p(minWith, "$this$minWith");
        l0.p(comparator, "comparator");
        return kotlin.collections.unsigned.c.F7(minWith, comparator);
    }

    @h(name = "sumOfBigDecimal")
    @g1(version = "1.4")
    @t
    @t0
    @f
    private static final BigDecimal O(byte[] sumOf, v3.l<? super y1, ? extends BigDecimal> selector) {
        l0.p(sumOf, "$this$sumOf");
        l0.p(selector, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        l0.o(valueOf, "valueOf(this.toLong())");
        int p5 = z1.p(sumOf);
        for (int i5 = 0; i5 < p5; i5++) {
            valueOf = valueOf.add(selector.invoke(y1.e(z1.n(sumOf, i5))));
            l0.o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @h(name = "sumOfBigDecimal")
    @g1(version = "1.4")
    @t
    @t0
    @f
    private static final BigDecimal P(int[] sumOf, v3.l<? super c2, ? extends BigDecimal> selector) {
        l0.p(sumOf, "$this$sumOf");
        l0.p(selector, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        l0.o(valueOf, "valueOf(this.toLong())");
        int p5 = d2.p(sumOf);
        for (int i5 = 0; i5 < p5; i5++) {
            valueOf = valueOf.add(selector.invoke(c2.e(d2.n(sumOf, i5))));
            l0.o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @h(name = "sumOfBigDecimal")
    @g1(version = "1.4")
    @t
    @t0
    @f
    private static final BigDecimal Q(long[] sumOf, v3.l<? super g2, ? extends BigDecimal> selector) {
        l0.p(sumOf, "$this$sumOf");
        l0.p(selector, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        l0.o(valueOf, "valueOf(this.toLong())");
        int p5 = h2.p(sumOf);
        for (int i5 = 0; i5 < p5; i5++) {
            valueOf = valueOf.add(selector.invoke(g2.e(h2.n(sumOf, i5))));
            l0.o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @h(name = "sumOfBigDecimal")
    @g1(version = "1.4")
    @t
    @t0
    @f
    private static final BigDecimal R(short[] sumOf, v3.l<? super m2, ? extends BigDecimal> selector) {
        l0.p(sumOf, "$this$sumOf");
        l0.p(selector, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        l0.o(valueOf, "valueOf(this.toLong())");
        int p5 = n2.p(sumOf);
        for (int i5 = 0; i5 < p5; i5++) {
            valueOf = valueOf.add(selector.invoke(m2.e(n2.n(sumOf, i5))));
            l0.o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @h(name = "sumOfBigInteger")
    @g1(version = "1.4")
    @t
    @t0
    @f
    private static final BigInteger S(byte[] sumOf, v3.l<? super y1, ? extends BigInteger> selector) {
        l0.p(sumOf, "$this$sumOf");
        l0.p(selector, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        l0.o(valueOf, "valueOf(this.toLong())");
        int p5 = z1.p(sumOf);
        for (int i5 = 0; i5 < p5; i5++) {
            valueOf = valueOf.add(selector.invoke(y1.e(z1.n(sumOf, i5))));
            l0.o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @h(name = "sumOfBigInteger")
    @g1(version = "1.4")
    @t
    @t0
    @f
    private static final BigInteger T(int[] sumOf, v3.l<? super c2, ? extends BigInteger> selector) {
        l0.p(sumOf, "$this$sumOf");
        l0.p(selector, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        l0.o(valueOf, "valueOf(this.toLong())");
        int p5 = d2.p(sumOf);
        for (int i5 = 0; i5 < p5; i5++) {
            valueOf = valueOf.add(selector.invoke(c2.e(d2.n(sumOf, i5))));
            l0.o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @h(name = "sumOfBigInteger")
    @g1(version = "1.4")
    @t
    @t0
    @f
    private static final BigInteger U(long[] sumOf, v3.l<? super g2, ? extends BigInteger> selector) {
        l0.p(sumOf, "$this$sumOf");
        l0.p(selector, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        l0.o(valueOf, "valueOf(this.toLong())");
        int p5 = h2.p(sumOf);
        for (int i5 = 0; i5 < p5; i5++) {
            valueOf = valueOf.add(selector.invoke(g2.e(h2.n(sumOf, i5))));
            l0.o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @h(name = "sumOfBigInteger")
    @g1(version = "1.4")
    @t
    @t0
    @f
    private static final BigInteger V(short[] sumOf, v3.l<? super m2, ? extends BigInteger> selector) {
        l0.p(sumOf, "$this$sumOf");
        l0.p(selector, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        l0.o(valueOf, "valueOf(this.toLong())");
        int p5 = n2.p(sumOf);
        for (int i5 = 0; i5 < p5; i5++) {
            valueOf = valueOf.add(selector.invoke(m2.e(n2.n(sumOf, i5))));
            l0.o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @p4.l
    @g1(version = "1.3")
    @t
    public static final List<c2> a(@p4.l int[] asList) {
        l0.p(asList, "$this$asList");
        return new a(asList);
    }

    @p4.l
    @g1(version = "1.3")
    @t
    public static final List<y1> b(@p4.l byte[] asList) {
        l0.p(asList, "$this$asList");
        return new c(asList);
    }

    @p4.l
    @g1(version = "1.3")
    @t
    public static final List<g2> c(@p4.l long[] asList) {
        l0.p(asList, "$this$asList");
        return new C0547b(asList);
    }

    @p4.l
    @g1(version = "1.3")
    @t
    public static final List<m2> d(@p4.l short[] asList) {
        l0.p(asList, "$this$asList");
        return new d(asList);
    }

    @g1(version = "1.3")
    @t
    public static final int e(@p4.l int[] binarySearch, int i5, int i6, int i7) {
        l0.p(binarySearch, "$this$binarySearch");
        kotlin.collections.c.Companion.d(i6, i7, d2.p(binarySearch));
        int i8 = i7 - 1;
        while (i6 <= i8) {
            int i9 = (i6 + i8) >>> 1;
            int c5 = u2.c(binarySearch[i9], i5);
            if (c5 < 0) {
                i6 = i9 + 1;
            } else if (c5 > 0) {
                i8 = i9 - 1;
            } else {
                return i9;
            }
        }
        return -(i6 + 1);
    }

    public static /* synthetic */ int f(int[] iArr, int i5, int i6, int i7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i6 = 0;
        }
        if ((i8 & 4) != 0) {
            i7 = d2.p(iArr);
        }
        return e(iArr, i5, i6, i7);
    }

    @g1(version = "1.3")
    @t
    public static final int g(@p4.l short[] binarySearch, short s5, int i5, int i6) {
        l0.p(binarySearch, "$this$binarySearch");
        kotlin.collections.c.Companion.d(i5, i6, n2.p(binarySearch));
        int i7 = s5 & m2.f19496d;
        int i8 = i6 - 1;
        while (i5 <= i8) {
            int i9 = (i5 + i8) >>> 1;
            int c5 = u2.c(binarySearch[i9], i7);
            if (c5 < 0) {
                i5 = i9 + 1;
            } else if (c5 > 0) {
                i8 = i9 - 1;
            } else {
                return i9;
            }
        }
        return -(i5 + 1);
    }

    public static /* synthetic */ int h(short[] sArr, short s5, int i5, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i5 = 0;
        }
        if ((i7 & 4) != 0) {
            i6 = n2.p(sArr);
        }
        return g(sArr, s5, i5, i6);
    }

    @g1(version = "1.3")
    @t
    public static final int i(@p4.l long[] binarySearch, long j5, int i5, int i6) {
        l0.p(binarySearch, "$this$binarySearch");
        kotlin.collections.c.Companion.d(i5, i6, h2.p(binarySearch));
        int i7 = i6 - 1;
        while (i5 <= i7) {
            int i8 = (i5 + i7) >>> 1;
            int g5 = u2.g(binarySearch[i8], j5);
            if (g5 < 0) {
                i5 = i8 + 1;
            } else if (g5 > 0) {
                i7 = i8 - 1;
            } else {
                return i8;
            }
        }
        return -(i5 + 1);
    }

    public static /* synthetic */ int j(long[] jArr, long j5, int i5, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i5 = 0;
        }
        if ((i7 & 4) != 0) {
            i6 = h2.p(jArr);
        }
        return i(jArr, j5, i5, i6);
    }

    @g1(version = "1.3")
    @t
    public static final int k(@p4.l byte[] binarySearch, byte b5, int i5, int i6) {
        l0.p(binarySearch, "$this$binarySearch");
        kotlin.collections.c.Companion.d(i5, i6, z1.p(binarySearch));
        int i7 = b5 & y1.f19838d;
        int i8 = i6 - 1;
        while (i5 <= i8) {
            int i9 = (i5 + i8) >>> 1;
            int c5 = u2.c(binarySearch[i9], i7);
            if (c5 < 0) {
                i5 = i9 + 1;
            } else if (c5 > 0) {
                i8 = i9 - 1;
            } else {
                return i9;
            }
        }
        return -(i5 + 1);
    }

    public static /* synthetic */ int l(byte[] bArr, byte b5, int i5, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i5 = 0;
        }
        if ((i7 & 4) != 0) {
            i6 = z1.p(bArr);
        }
        return k(bArr, b5, i5, i6);
    }

    @g1(version = "1.3")
    @t
    @f
    private static final byte m(byte[] elementAt, int i5) {
        l0.p(elementAt, "$this$elementAt");
        return z1.n(elementAt, i5);
    }

    @g1(version = "1.3")
    @t
    @f
    private static final short n(short[] elementAt, int i5) {
        l0.p(elementAt, "$this$elementAt");
        return n2.n(elementAt, i5);
    }

    @g1(version = "1.3")
    @t
    @f
    private static final int o(int[] elementAt, int i5) {
        l0.p(elementAt, "$this$elementAt");
        return d2.n(elementAt, i5);
    }

    @g1(version = "1.3")
    @t
    @f
    private static final long p(long[] elementAt, int i5) {
        l0.p(elementAt, "$this$elementAt");
        return h2.n(elementAt, i5);
    }

    @g1(version = "1.3")
    @k(message = "Use maxOrNull instead.", replaceWith = @b1(expression = "this.maxOrNull()", imports = {}))
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    public static final /* synthetic */ c2 q(int[] max) {
        l0.p(max, "$this$max");
        return kotlin.collections.unsigned.c.q6(max);
    }

    @g1(version = "1.3")
    @k(message = "Use maxOrNull instead.", replaceWith = @b1(expression = "this.maxOrNull()", imports = {}))
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    public static final /* synthetic */ y1 r(byte[] max) {
        l0.p(max, "$this$max");
        return kotlin.collections.unsigned.c.r6(max);
    }

    @g1(version = "1.3")
    @k(message = "Use maxOrNull instead.", replaceWith = @b1(expression = "this.maxOrNull()", imports = {}))
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    public static final /* synthetic */ g2 s(long[] max) {
        l0.p(max, "$this$max");
        return kotlin.collections.unsigned.c.s6(max);
    }

    @g1(version = "1.3")
    @k(message = "Use maxOrNull instead.", replaceWith = @b1(expression = "this.maxOrNull()", imports = {}))
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    public static final /* synthetic */ m2 t(short[] max) {
        l0.p(max, "$this$max");
        return kotlin.collections.unsigned.c.t6(max);
    }

    @g1(version = "1.3")
    @k(message = "Use maxByOrNull instead.", replaceWith = @b1(expression = "this.maxByOrNull(selector)", imports = {}))
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    @f
    private static final /* synthetic */ <R extends Comparable<? super R>> y1 u(byte[] maxBy, v3.l<? super y1, ? extends R> selector) {
        int qe;
        l0.p(maxBy, "$this$maxBy");
        l0.p(selector, "selector");
        if (z1.s(maxBy)) {
            return null;
        }
        byte n5 = z1.n(maxBy, 0);
        qe = p.qe(maxBy);
        if (qe != 0) {
            R invoke = selector.invoke(y1.e(n5));
            s0 it = new kotlin.ranges.l(1, qe).iterator();
            while (it.hasNext()) {
                byte n6 = z1.n(maxBy, it.nextInt());
                R invoke2 = selector.invoke(y1.e(n6));
                if (invoke.compareTo(invoke2) < 0) {
                    n5 = n6;
                    invoke = invoke2;
                }
            }
        }
        return y1.e(n5);
    }

    @g1(version = "1.3")
    @k(message = "Use maxByOrNull instead.", replaceWith = @b1(expression = "this.maxByOrNull(selector)", imports = {}))
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    @f
    private static final /* synthetic */ <R extends Comparable<? super R>> g2 v(long[] maxBy, v3.l<? super g2, ? extends R> selector) {
        int ve;
        l0.p(maxBy, "$this$maxBy");
        l0.p(selector, "selector");
        if (h2.s(maxBy)) {
            return null;
        }
        long n5 = h2.n(maxBy, 0);
        ve = p.ve(maxBy);
        if (ve != 0) {
            R invoke = selector.invoke(g2.e(n5));
            s0 it = new kotlin.ranges.l(1, ve).iterator();
            while (it.hasNext()) {
                long n6 = h2.n(maxBy, it.nextInt());
                R invoke2 = selector.invoke(g2.e(n6));
                if (invoke.compareTo(invoke2) < 0) {
                    n5 = n6;
                    invoke = invoke2;
                }
            }
        }
        return g2.e(n5);
    }

    @g1(version = "1.3")
    @k(message = "Use maxByOrNull instead.", replaceWith = @b1(expression = "this.maxByOrNull(selector)", imports = {}))
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    @f
    private static final /* synthetic */ <R extends Comparable<? super R>> c2 w(int[] maxBy, v3.l<? super c2, ? extends R> selector) {
        int ue;
        l0.p(maxBy, "$this$maxBy");
        l0.p(selector, "selector");
        if (d2.s(maxBy)) {
            return null;
        }
        int n5 = d2.n(maxBy, 0);
        ue = p.ue(maxBy);
        if (ue != 0) {
            R invoke = selector.invoke(c2.e(n5));
            s0 it = new kotlin.ranges.l(1, ue).iterator();
            while (it.hasNext()) {
                int n6 = d2.n(maxBy, it.nextInt());
                R invoke2 = selector.invoke(c2.e(n6));
                if (invoke.compareTo(invoke2) < 0) {
                    n5 = n6;
                    invoke = invoke2;
                }
            }
        }
        return c2.e(n5);
    }

    @g1(version = "1.3")
    @k(message = "Use maxByOrNull instead.", replaceWith = @b1(expression = "this.maxByOrNull(selector)", imports = {}))
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    @f
    private static final /* synthetic */ <R extends Comparable<? super R>> m2 x(short[] maxBy, v3.l<? super m2, ? extends R> selector) {
        int xe;
        l0.p(maxBy, "$this$maxBy");
        l0.p(selector, "selector");
        if (n2.s(maxBy)) {
            return null;
        }
        short n5 = n2.n(maxBy, 0);
        xe = p.xe(maxBy);
        if (xe != 0) {
            R invoke = selector.invoke(m2.e(n5));
            s0 it = new kotlin.ranges.l(1, xe).iterator();
            while (it.hasNext()) {
                short n6 = n2.n(maxBy, it.nextInt());
                R invoke2 = selector.invoke(m2.e(n6));
                if (invoke.compareTo(invoke2) < 0) {
                    n5 = n6;
                    invoke = invoke2;
                }
            }
        }
        return m2.e(n5);
    }

    @g1(version = "1.3")
    @k(message = "Use maxWithOrNull instead.", replaceWith = @b1(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    public static final /* synthetic */ y1 y(byte[] maxWith, Comparator comparator) {
        l0.p(maxWith, "$this$maxWith");
        l0.p(comparator, "comparator");
        return kotlin.collections.unsigned.c.y6(maxWith, comparator);
    }

    @g1(version = "1.3")
    @k(message = "Use maxWithOrNull instead.", replaceWith = @b1(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    public static final /* synthetic */ c2 z(int[] maxWith, Comparator comparator) {
        l0.p(maxWith, "$this$maxWith");
        l0.p(comparator, "comparator");
        return kotlin.collections.unsigned.c.z6(maxWith, comparator);
    }
}
