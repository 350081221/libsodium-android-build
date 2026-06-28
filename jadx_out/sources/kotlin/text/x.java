package kotlin.text;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import kotlin.jvm.internal.r1;

@kotlin.i0(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u000b\u001a!\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0002\b\u0004\u001a\u0011\u0010\u0005\u001a\u00020\u0006*\u00020\u0002H\u0002¢\u0006\u0002\b\u0007\u001a\u0014\u0010\b\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u001aJ\u0010\t\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001H\u0082\b¢\u0006\u0002\b\u000e\u001a\u0014\u0010\u000f\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u001a\u001e\u0010\u0011\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u001a\f\u0010\u0013\u001a\u00020\u0002*\u00020\u0002H\u0007\u001a\u0016\u0010\u0014\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0002H\u0007¨\u0006\u0015"}, d2 = {"getIndentFunction", "Lkotlin/Function1;", "", org.ccil.cowan.tagsoup.p.f21289y, "getIndentFunction$StringsKt__IndentKt", "indentWidth", "", "indentWidth$StringsKt__IndentKt", "prependIndent", "reindent", "", "resultSizeEstimate", "indentAddFunction", "indentCutFunction", "reindent$StringsKt__IndentKt", "replaceIndent", "newIndent", "replaceIndentByMargin", "marginPrefix", "trimIndent", "trimMargin", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/text/StringsKt")
@r1({"SMAP\nIndent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Indent.kt\nkotlin/text/StringsKt__IndentKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,123:1\n113#1,2:125\n115#1,4:140\n120#1,2:153\n113#1,2:162\n115#1,4:177\n120#1,2:184\n1#2:124\n1#2:150\n1#2:181\n1#2:205\n1569#3,11:127\n1864#3,2:138\n1866#3:151\n1580#3:152\n766#3:155\n857#3,2:156\n1549#3:158\n1620#3,3:159\n1569#3,11:164\n1864#3,2:175\n1866#3:182\n1580#3:183\n1569#3,11:192\n1864#3,2:203\n1866#3:206\n1580#3:207\n151#4,6:144\n151#4,6:186\n*S KotlinDebug\n*F\n+ 1 Indent.kt\nkotlin/text/StringsKt__IndentKt\n*L\n38#1:125,2\n38#1:140,4\n38#1:153,2\n78#1:162,2\n78#1:177,4\n78#1:184,2\n38#1:150\n78#1:181\n114#1:205\n38#1:127,11\n38#1:138,2\n38#1:151\n38#1:152\n74#1:155\n74#1:156,2\n75#1:158\n75#1:159,3\n78#1:164,11\n78#1:175,2\n78#1:182\n78#1:183\n114#1:192,11\n114#1:203,2\n114#1:206\n114#1:207\n39#1:144,6\n101#1:186,6\n*E\n"})
/* loaded from: classes4.dex */
public class x extends w {

    @kotlin.i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "line", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.jvm.internal.n0 implements v3.l<String, String> {
        public static final a INSTANCE = new a();

        a() {
            super(1);
        }

        @Override // v3.l
        @p4.l
        public final String invoke(@p4.l String line) {
            kotlin.jvm.internal.l0.p(line, "line");
            return line;
        }
    }

    @kotlin.i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "line", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.jvm.internal.n0 implements v3.l<String, String> {
        final /* synthetic */ String $indent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.$indent = str;
        }

        @Override // v3.l
        @p4.l
        public final String invoke(@p4.l String line) {
            kotlin.jvm.internal.l0.p(line, "line");
            return this.$indent + line;
        }
    }

    @kotlin.i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "it", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.jvm.internal.n0 implements v3.l<String, String> {
        final /* synthetic */ String $indent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str) {
            super(1);
            this.$indent = str;
        }

        @Override // v3.l
        @p4.l
        public final String invoke(@p4.l String it) {
            boolean S1;
            kotlin.jvm.internal.l0.p(it, "it");
            S1 = e0.S1(it);
            if (S1) {
                return it.length() < this.$indent.length() ? this.$indent : it;
            }
            return this.$indent + it;
        }
    }

    private static final v3.l<String, String> g(String str) {
        boolean z4;
        if (str.length() == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return a.INSTANCE;
        }
        return new b(str);
    }

    private static final int h(String str) {
        int length = str.length();
        int i5 = 0;
        while (true) {
            if (i5 < length) {
                if (!d.r(str.charAt(i5))) {
                    break;
                }
                i5++;
            } else {
                i5 = -1;
                break;
            }
        }
        if (i5 == -1) {
            return str.length();
        }
        return i5;
    }

    @p4.l
    public static final String i(@p4.l String str, @p4.l String indent) {
        kotlin.sequences.m k12;
        String e12;
        kotlin.jvm.internal.l0.p(str, "<this>");
        kotlin.jvm.internal.l0.p(indent, "indent");
        k12 = kotlin.sequences.u.k1(f0.I3(str), new c(indent));
        e12 = kotlin.sequences.u.e1(k12, "\n", null, null, 0, null, null, 62, null);
        return e12;
    }

    public static /* synthetic */ String j(String str, String str2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str2 = "    ";
        }
        return i(str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0046 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final java.lang.String k(java.util.List<java.lang.String> r11, int r12, v3.l<? super java.lang.String, java.lang.String> r13, v3.l<? super java.lang.String, java.lang.String> r14) {
        /*
            int r0 = kotlin.collections.u.G(r11)
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r11 = r11.iterator()
            r2 = 0
        L10:
            boolean r3 = r11.hasNext()
            if (r3 == 0) goto L48
            java.lang.Object r3 = r11.next()
            int r4 = r2 + 1
            if (r2 >= 0) goto L21
            kotlin.collections.u.W()
        L21:
            java.lang.String r3 = (java.lang.String) r3
            if (r2 == 0) goto L27
            if (r2 != r0) goto L2f
        L27:
            boolean r2 = kotlin.text.v.S1(r3)
            if (r2 == 0) goto L2f
            r3 = 0
            goto L41
        L2f:
            java.lang.Object r2 = r14.invoke(r3)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L41
            java.lang.Object r2 = r13.invoke(r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L40
            goto L41
        L40:
            r3 = r2
        L41:
            if (r3 == 0) goto L46
            r1.add(r3)
        L46:
            r2 = r4
            goto L10
        L48:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r12)
            java.lang.String r3 = "\n"
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 124(0x7c, float:1.74E-43)
            r10 = 0
            java.lang.Appendable r11 = kotlin.collections.u.h3(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.StringBuilder r11 = (java.lang.StringBuilder) r11
            java.lang.String r11 = r11.toString()
            java.lang.String r12 = "mapIndexedNotNull { inde…\"\\n\")\n        .toString()"
            kotlin.jvm.internal.l0.o(r11, r12)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.x.k(java.util.List, int, v3.l, v3.l):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00be A[SYNTHETIC] */
    @p4.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String l(@p4.l java.lang.String r14, @p4.l java.lang.String r15) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.l0.p(r14, r0)
            java.lang.String r0 = "newIndent"
            kotlin.jvm.internal.l0.p(r15, r0)
            java.util.List r0 = kotlin.text.f0.J3(r14)
            r1 = r0
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L1a:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L33
            java.lang.Object r3 = r1.next()
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = kotlin.text.v.S1(r4)
            r4 = r4 ^ 1
            if (r4 == 0) goto L1a
            r2.add(r3)
            goto L1a
        L33:
            java.util.ArrayList r1 = new java.util.ArrayList
            r3 = 10
            int r3 = kotlin.collections.u.Y(r2, r3)
            r1.<init>(r3)
            java.util.Iterator r2 = r2.iterator()
        L42:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L5a
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            int r3 = h(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.add(r3)
            goto L42
        L5a:
            java.lang.Comparable r1 = kotlin.collections.u.e4(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r2 = 0
            if (r1 == 0) goto L68
            int r1 = r1.intValue()
            goto L69
        L68:
            r1 = r2
        L69:
            int r14 = r14.length()
            int r3 = r15.length()
            int r4 = r0.size()
            int r3 = r3 * r4
            int r14 = r14 + r3
            v3.l r15 = g(r15)
            int r3 = kotlin.collections.u.G(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r0 = r0.iterator()
        L8a:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto Lc0
            java.lang.Object r5 = r0.next()
            int r6 = r2 + 1
            if (r2 >= 0) goto L9b
            kotlin.collections.u.W()
        L9b:
            java.lang.String r5 = (java.lang.String) r5
            if (r2 == 0) goto La1
            if (r2 != r3) goto La9
        La1:
            boolean r2 = kotlin.text.v.S1(r5)
            if (r2 == 0) goto La9
            r5 = 0
            goto Lb9
        La9:
            java.lang.String r2 = kotlin.text.v.y6(r5, r1)
            if (r2 == 0) goto Lb9
            java.lang.Object r2 = r15.invoke(r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto Lb8
            goto Lb9
        Lb8:
            r5 = r2
        Lb9:
            if (r5 == 0) goto Lbe
            r4.add(r5)
        Lbe:
            r2 = r6
            goto L8a
        Lc0:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r14)
            java.lang.String r6 = "\n"
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 124(0x7c, float:1.74E-43)
            r13 = 0
            java.lang.Appendable r14 = kotlin.collections.u.h3(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.StringBuilder r14 = (java.lang.StringBuilder) r14
            java.lang.String r14 = r14.toString()
            java.lang.String r15 = "mapIndexedNotNull { inde…\"\\n\")\n        .toString()"
            kotlin.jvm.internal.l0.o(r14, r15)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.x.l(java.lang.String, java.lang.String):java.lang.String");
    }

    public static /* synthetic */ String m(String str, String str2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str2 = "";
        }
        return l(str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ba A[SYNTHETIC] */
    @p4.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String n(@p4.l java.lang.String r21, @p4.l java.lang.String r22, @p4.l java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.x.n(java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    public static /* synthetic */ String o(String str, String str2, String str3, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str2 = "";
        }
        if ((i5 & 2) != 0) {
            str3 = HiAnalyticsConstant.REPORT_VAL_SEPARATOR;
        }
        return n(str, str2, str3);
    }

    @p4.l
    @kotlin.internal.g
    public static String p(@p4.l String str) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        return l(str, "");
    }

    @p4.l
    @kotlin.internal.g
    public static final String q(@p4.l String str, @p4.l String marginPrefix) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        kotlin.jvm.internal.l0.p(marginPrefix, "marginPrefix");
        return n(str, "", marginPrefix);
    }

    public static /* synthetic */ String r(String str, String str2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str2 = HiAnalyticsConstant.REPORT_VAL_SEPARATOR;
        }
        return q(str, str2);
    }
}
