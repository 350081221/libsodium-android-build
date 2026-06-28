package kotlin.text;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.a1;
import kotlin.g1;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlin.v2;

@kotlin.i0(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 02\u00060\u0001j\u0002`\u0002:\u000201B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\u001d\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\n¢\u0006\u0002\u0010\u000bB\u000f\b\u0001\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u001bJ\u001e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u001d2\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u001bJ\u001a\u0010\u001e\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u001bH\u0007J\u0010\u0010 \u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0016\u001a\u00020\u0017J\u0011\u0010!\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0086\u0004J\u0018\u0010\"\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u001bH\u0007J\"\u0010#\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00172\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00170%J\u0016\u0010#\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u0004J\u0016\u0010'\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u0004J\u001e\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00040)2\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010*\u001a\u00020\u001bJ \u0010+\u001a\b\u0012\u0004\u0012\u00020\u00040\u001d2\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010*\u001a\u00020\u001bH\u0007J\u0006\u0010,\u001a\u00020\rJ\b\u0010-\u001a\u00020\u0004H\u0016J\b\u0010.\u001a\u00020/H\u0002R\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\n8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u00062"}, d2 = {"Lkotlin/text/Regex;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "pattern", "", "(Ljava/lang/String;)V", "option", "Lkotlin/text/RegexOption;", "(Ljava/lang/String;Lkotlin/text/RegexOption;)V", "options", "", "(Ljava/lang/String;Ljava/util/Set;)V", "nativePattern", "Ljava/util/regex/Pattern;", "(Ljava/util/regex/Pattern;)V", "_options", "getOptions", "()Ljava/util/Set;", "getPattern", "()Ljava/lang/String;", "containsMatchIn", "", "input", "", "find", "Lkotlin/text/MatchResult;", "startIndex", "", "findAll", "Lkotlin/sequences/Sequence;", "matchAt", "index", "matchEntire", "matches", "matchesAt", "replace", "transform", "Lkotlin/Function1;", "replacement", "replaceFirst", "split", "", "limit", "splitToSequence", "toPattern", "toString", "writeReplace", "", "Companion", "Serialized", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nRegex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Regex.kt\nkotlin/text/Regex\n+ 2 Regex.kt\nkotlin/text/RegexKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,396:1\n22#2,3:397\n1#3:400\n*S KotlinDebug\n*F\n+ 1 Regex.kt\nkotlin/text/Regex\n*L\n102#1:397,3\n*E\n"})
/* loaded from: classes4.dex */
public final class r implements Serializable {

    @p4.l
    public static final a Companion = new a(null);

    @p4.m
    private Set<? extends t> _options;

    @p4.l
    private final Pattern nativePattern;

    @kotlin.i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007¨\u0006\f"}, d2 = {"Lkotlin/text/Regex$Companion;", "", "()V", "ensureUnicodeCase", "", "flags", "escape", "", "literal", "escapeReplacement", "fromLiteral", "Lkotlin/text/Regex;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.w wVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int b(int i5) {
            return (i5 & 2) != 0 ? i5 | 64 : i5;
        }

        @p4.l
        public final String c(@p4.l String literal) {
            kotlin.jvm.internal.l0.p(literal, "literal");
            String quote = Pattern.quote(literal);
            kotlin.jvm.internal.l0.o(quote, "quote(literal)");
            return quote;
        }

        @p4.l
        public final String d(@p4.l String literal) {
            kotlin.jvm.internal.l0.p(literal, "literal");
            String quoteReplacement = Matcher.quoteReplacement(literal);
            kotlin.jvm.internal.l0.o(quoteReplacement, "quoteReplacement(literal)");
            return quoteReplacement;
        }

        @p4.l
        public final r e(@p4.l String literal) {
            kotlin.jvm.internal.l0.p(literal, "literal");
            return new r(literal, t.LITERAL);
        }
    }

    @kotlin.i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u0000 \u000e2\u00060\u0001j\u0002`\u0002:\u0001\u000eB\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0002R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lkotlin/text/Regex$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "pattern", "", "flags", "", "(Ljava/lang/String;I)V", "getFlags", "()I", "getPattern", "()Ljava/lang/String;", "readResolve", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    private static final class b implements Serializable {

        @p4.l
        public static final a Companion = new a(null);
        private static final long serialVersionUID = 0;
        private final int flags;

        @p4.l
        private final String pattern;

        @kotlin.i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lkotlin/text/Regex$Serialized$Companion;", "", "()V", "serialVersionUID", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(kotlin.jvm.internal.w wVar) {
                this();
            }
        }

        public b(@p4.l String pattern, int i5) {
            kotlin.jvm.internal.l0.p(pattern, "pattern");
            this.pattern = pattern;
            this.flags = i5;
        }

        private final Object readResolve() {
            Pattern compile = Pattern.compile(this.pattern, this.flags);
            kotlin.jvm.internal.l0.o(compile, "compile(pattern, flags)");
            return new r(compile);
        }

        public final int getFlags() {
            return this.flags;
        }

        @p4.l
        public final String getPattern() {
            return this.pattern;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lkotlin/text/MatchResult;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.jvm.internal.n0 implements v3.a<p> {
        final /* synthetic */ CharSequence $input;
        final /* synthetic */ int $startIndex;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(CharSequence charSequence, int i5) {
            super(0);
            this.$input = charSequence;
            this.$startIndex = i5;
        }

        @Override // v3.a
        @p4.m
        public final p invoke() {
            return r.this.find(this.$input, this.$startIndex);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class d extends kotlin.jvm.internal.h0 implements v3.l<p, p> {
        public static final d INSTANCE = new d();

        d() {
            super(1, p.class, "next", "next()Lkotlin/text/MatchResult;", 0);
        }

        @Override // v3.l
        @p4.m
        public final p invoke(@p4.l p p02) {
            kotlin.jvm.internal.l0.p(p02, "p0");
            return p02.next();
        }
    }

    @kotlin.i0(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0014\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u000e\u0010\u0005\u001a\n \u0006*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"<anonymous>", "", "T", "Lkotlin/text/FlagEnum;", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Enum;)Ljava/lang/Boolean;", "kotlin/text/RegexKt$fromInt$1$1"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nRegex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Regex.kt\nkotlin/text/RegexKt$fromInt$1$1\n*L\n1#1,396:1\n*E\n"})
    /* loaded from: classes4.dex */
    static final class e extends kotlin.jvm.internal.n0 implements v3.l<t, Boolean> {
        final /* synthetic */ int $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int i5) {
            super(1);
            this.$value = i5;
        }

        @Override // v3.l
        @p4.l
        public final Boolean invoke(t tVar) {
            t tVar2 = tVar;
            return Boolean.valueOf((this.$value & tVar2.getMask()) == tVar2.getValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "kotlin.text.Regex$splitToSequence$1", f = "Regex.kt", i = {1, 1, 1}, l = {274, 282, 286}, m = "invokeSuspend", n = {"$this$sequence", "matcher", "splitCount"}, s = {"L$0", "L$1", "I$0"})
    @kotlin.i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.k implements v3.p<kotlin.sequences.o<? super String>, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ CharSequence $input;
        final /* synthetic */ int $limit;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(CharSequence charSequence, int i5, kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
            this.$input = charSequence;
            this.$limit = i5;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            f fVar = new f(this.$input, this.$limit, dVar);
            fVar.L$0 = obj;
            return fVar;
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l kotlin.sequences.o<? super String> oVar, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((f) create(oVar, dVar)).invokeSuspend(r2.f19517a);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x007d  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0072 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x009e A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0070 -> B:13:0x0073). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@p4.l java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r10.label
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L33
                if (r1 == r4) goto L2e
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                kotlin.e1.n(r11)
                goto L9f
            L16:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1e:
                int r1 = r10.I$0
                java.lang.Object r5 = r10.L$1
                java.util.regex.Matcher r5 = (java.util.regex.Matcher) r5
                java.lang.Object r6 = r10.L$0
                kotlin.sequences.o r6 = (kotlin.sequences.o) r6
                kotlin.e1.n(r11)
                r7 = r10
                r11 = r5
                goto L73
            L2e:
                kotlin.e1.n(r11)
                goto Lb1
            L33:
                kotlin.e1.n(r11)
                java.lang.Object r11 = r10.L$0
                kotlin.sequences.o r11 = (kotlin.sequences.o) r11
                kotlin.text.r r1 = kotlin.text.r.this
                java.util.regex.Pattern r1 = kotlin.text.r.access$getNativePattern$p(r1)
                java.lang.CharSequence r5 = r10.$input
                java.util.regex.Matcher r1 = r1.matcher(r5)
                int r5 = r10.$limit
                if (r5 == r4) goto La2
                boolean r5 = r1.find()
                if (r5 != 0) goto L51
                goto La2
            L51:
                r5 = 0
                r7 = r10
                r6 = r11
                r11 = r1
                r1 = r5
            L56:
                java.lang.CharSequence r8 = r7.$input
                int r9 = r11.start()
                java.lang.CharSequence r5 = r8.subSequence(r5, r9)
                java.lang.String r5 = r5.toString()
                r7.L$0 = r6
                r7.L$1 = r11
                r7.I$0 = r1
                r7.label = r3
                java.lang.Object r5 = r6.b(r5, r7)
                if (r5 != r0) goto L73
                return r0
            L73:
                int r5 = r11.end()
                int r1 = r1 + r4
                int r8 = r7.$limit
                int r8 = r8 - r4
                if (r1 == r8) goto L83
                boolean r8 = r11.find()
                if (r8 != 0) goto L56
            L83:
                java.lang.CharSequence r11 = r7.$input
                int r1 = r11.length()
                java.lang.CharSequence r11 = r11.subSequence(r5, r1)
                java.lang.String r11 = r11.toString()
                r1 = 0
                r7.L$0 = r1
                r7.L$1 = r1
                r7.label = r2
                java.lang.Object r11 = r6.b(r11, r7)
                if (r11 != r0) goto L9f
                return r0
            L9f:
                kotlin.r2 r11 = kotlin.r2.f19517a
                return r11
            La2:
                java.lang.CharSequence r1 = r10.$input
                java.lang.String r1 = r1.toString()
                r10.label = r4
                java.lang.Object r11 = r11.b(r1, r10)
                if (r11 != r0) goto Lb1
                return r0
            Lb1:
                kotlin.r2 r11 = kotlin.r2.f19517a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.text.r.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @a1
    public r(@p4.l Pattern nativePattern) {
        kotlin.jvm.internal.l0.p(nativePattern, "nativePattern");
        this.nativePattern = nativePattern;
    }

    public static /* synthetic */ p find$default(r rVar, CharSequence charSequence, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i5 = 0;
        }
        return rVar.find(charSequence, i5);
    }

    public static /* synthetic */ kotlin.sequences.m findAll$default(r rVar, CharSequence charSequence, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i5 = 0;
        }
        return rVar.findAll(charSequence, i5);
    }

    public static /* synthetic */ List split$default(r rVar, CharSequence charSequence, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i5 = 0;
        }
        return rVar.split(charSequence, i5);
    }

    public static /* synthetic */ kotlin.sequences.m splitToSequence$default(r rVar, CharSequence charSequence, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i5 = 0;
        }
        return rVar.splitToSequence(charSequence, i5);
    }

    private final Object writeReplace() {
        String pattern = this.nativePattern.pattern();
        kotlin.jvm.internal.l0.o(pattern, "nativePattern.pattern()");
        return new b(pattern, this.nativePattern.flags());
    }

    public final boolean containsMatchIn(@p4.l CharSequence input) {
        kotlin.jvm.internal.l0.p(input, "input");
        return this.nativePattern.matcher(input).find();
    }

    @p4.m
    public final p find(@p4.l CharSequence input, int i5) {
        kotlin.jvm.internal.l0.p(input, "input");
        Matcher matcher = this.nativePattern.matcher(input);
        kotlin.jvm.internal.l0.o(matcher, "nativePattern.matcher(input)");
        return s.a(matcher, i5, input);
    }

    @p4.l
    public final kotlin.sequences.m<p> findAll(@p4.l CharSequence input, int i5) {
        kotlin.jvm.internal.l0.p(input, "input");
        if (i5 >= 0 && i5 <= input.length()) {
            return kotlin.sequences.p.n(new c(input, i5), d.INSTANCE);
        }
        throw new IndexOutOfBoundsException("Start index out of bounds: " + i5 + ", input length: " + input.length());
    }

    @p4.l
    public final Set<t> getOptions() {
        Set set = this._options;
        if (set == null) {
            int flags = this.nativePattern.flags();
            EnumSet fromInt$lambda$1 = EnumSet.allOf(t.class);
            kotlin.jvm.internal.l0.o(fromInt$lambda$1, "fromInt$lambda$1");
            kotlin.collections.b0.N0(fromInt$lambda$1, new e(flags));
            Set<t> unmodifiableSet = Collections.unmodifiableSet(fromInt$lambda$1);
            kotlin.jvm.internal.l0.o(unmodifiableSet, "unmodifiableSet(EnumSet.…mask == it.value }\n    })");
            this._options = unmodifiableSet;
            return unmodifiableSet;
        }
        return set;
    }

    @p4.l
    public final String getPattern() {
        String pattern = this.nativePattern.pattern();
        kotlin.jvm.internal.l0.o(pattern, "nativePattern.pattern()");
        return pattern;
    }

    @g1(version = "1.7")
    @v2(markerClass = {kotlin.r.class})
    @p4.m
    public final p matchAt(@p4.l CharSequence input, int i5) {
        kotlin.jvm.internal.l0.p(input, "input");
        Matcher region = this.nativePattern.matcher(input).useAnchoringBounds(false).useTransparentBounds(true).region(i5, input.length());
        if (region.lookingAt()) {
            kotlin.jvm.internal.l0.o(region, "this");
            return new q(region, input);
        }
        return null;
    }

    @p4.m
    public final p matchEntire(@p4.l CharSequence input) {
        kotlin.jvm.internal.l0.p(input, "input");
        Matcher matcher = this.nativePattern.matcher(input);
        kotlin.jvm.internal.l0.o(matcher, "nativePattern.matcher(input)");
        return s.b(matcher, input);
    }

    public final boolean matches(@p4.l CharSequence input) {
        kotlin.jvm.internal.l0.p(input, "input");
        return this.nativePattern.matcher(input).matches();
    }

    @g1(version = "1.7")
    @v2(markerClass = {kotlin.r.class})
    public final boolean matchesAt(@p4.l CharSequence input, int i5) {
        kotlin.jvm.internal.l0.p(input, "input");
        return this.nativePattern.matcher(input).useAnchoringBounds(false).useTransparentBounds(true).region(i5, input.length()).lookingAt();
    }

    @p4.l
    public final String replace(@p4.l CharSequence input, @p4.l String replacement) {
        kotlin.jvm.internal.l0.p(input, "input");
        kotlin.jvm.internal.l0.p(replacement, "replacement");
        String replaceAll = this.nativePattern.matcher(input).replaceAll(replacement);
        kotlin.jvm.internal.l0.o(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        return replaceAll;
    }

    @p4.l
    public final String replaceFirst(@p4.l CharSequence input, @p4.l String replacement) {
        kotlin.jvm.internal.l0.p(input, "input");
        kotlin.jvm.internal.l0.p(replacement, "replacement");
        String replaceFirst = this.nativePattern.matcher(input).replaceFirst(replacement);
        kotlin.jvm.internal.l0.o(replaceFirst, "nativePattern.matcher(in…replaceFirst(replacement)");
        return replaceFirst;
    }

    @p4.l
    public final List<String> split(@p4.l CharSequence input, int i5) {
        List<String> k5;
        kotlin.jvm.internal.l0.p(input, "input");
        f0.K4(i5);
        Matcher matcher = this.nativePattern.matcher(input);
        if (i5 != 1 && matcher.find()) {
            int i6 = 10;
            if (i5 > 0) {
                i6 = kotlin.ranges.u.B(i5, 10);
            }
            ArrayList arrayList = new ArrayList(i6);
            int i7 = i5 - 1;
            int i8 = 0;
            do {
                arrayList.add(input.subSequence(i8, matcher.start()).toString());
                i8 = matcher.end();
                if (i7 >= 0 && arrayList.size() == i7) {
                    break;
                }
            } while (matcher.find());
            arrayList.add(input.subSequence(i8, input.length()).toString());
            return arrayList;
        }
        k5 = kotlin.collections.v.k(input.toString());
        return k5;
    }

    @p4.l
    @g1(version = "1.6")
    @v2(markerClass = {kotlin.r.class})
    public final kotlin.sequences.m<String> splitToSequence(@p4.l CharSequence input, int i5) {
        kotlin.jvm.internal.l0.p(input, "input");
        f0.K4(i5);
        return kotlin.sequences.p.b(new f(input, i5, null));
    }

    @p4.l
    public final Pattern toPattern() {
        return this.nativePattern;
    }

    @p4.l
    public String toString() {
        String pattern = this.nativePattern.toString();
        kotlin.jvm.internal.l0.o(pattern, "nativePattern.toString()");
        return pattern;
    }

    @p4.l
    public final String replace(@p4.l CharSequence input, @p4.l v3.l<? super p, ? extends CharSequence> transform) {
        kotlin.jvm.internal.l0.p(input, "input");
        kotlin.jvm.internal.l0.p(transform, "transform");
        int i5 = 0;
        p find$default = find$default(this, input, 0, 2, null);
        if (find$default == null) {
            return input.toString();
        }
        int length = input.length();
        StringBuilder sb = new StringBuilder(length);
        do {
            sb.append(input, i5, find$default.c().getStart().intValue());
            sb.append(transform.invoke(find$default));
            i5 = find$default.c().getEndInclusive().intValue() + 1;
            find$default = find$default.next();
            if (i5 >= length) {
                break;
            }
        } while (find$default != null);
        if (i5 < length) {
            sb.append(input, i5, length);
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.l0.o(sb2, "sb.toString()");
        return sb2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public r(@p4.l java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            kotlin.jvm.internal.l0.p(r2, r0)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.lang.String r0 = "compile(pattern)"
            kotlin.jvm.internal.l0.o(r2, r0)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.r.<init>(java.lang.String):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public r(@p4.l java.lang.String r2, @p4.l kotlin.text.t r3) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            kotlin.jvm.internal.l0.p(r2, r0)
            java.lang.String r0 = "option"
            kotlin.jvm.internal.l0.p(r3, r0)
            kotlin.text.r$a r0 = kotlin.text.r.Companion
            int r3 = r3.getValue()
            int r3 = kotlin.text.r.a.a(r0, r3)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2, r3)
            java.lang.String r3 = "compile(pattern, ensureUnicodeCase(option.value))"
            kotlin.jvm.internal.l0.o(r2, r3)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.r.<init>(java.lang.String, kotlin.text.t):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public r(@p4.l java.lang.String r2, @p4.l java.util.Set<? extends kotlin.text.t> r3) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            kotlin.jvm.internal.l0.p(r2, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.l0.p(r3, r0)
            kotlin.text.r$a r0 = kotlin.text.r.Companion
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            int r3 = kotlin.text.s.e(r3)
            int r3 = kotlin.text.r.a.a(r0, r3)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2, r3)
            java.lang.String r3 = "compile(pattern, ensureU…odeCase(options.toInt()))"
            kotlin.jvm.internal.l0.o(r2, r3)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.r.<init>(java.lang.String, java.util.Set):void");
    }
}
