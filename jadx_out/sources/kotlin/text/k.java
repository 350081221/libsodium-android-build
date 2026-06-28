package kotlin.text;

import kotlin.a1;
import kotlin.g1;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0004\u0011\u0012\u0013\u0014B\u001f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0015"}, d2 = {"Lkotlin/text/HexFormat;", "", "upperCase", "", "bytes", "Lkotlin/text/HexFormat$BytesHexFormat;", "number", "Lkotlin/text/HexFormat$NumberHexFormat;", "(ZLkotlin/text/HexFormat$BytesHexFormat;Lkotlin/text/HexFormat$NumberHexFormat;)V", "getBytes", "()Lkotlin/text/HexFormat$BytesHexFormat;", "getNumber", "()Lkotlin/text/HexFormat$NumberHexFormat;", "getUpperCase", "()Z", "toString", "", "Builder", "BytesHexFormat", "Companion", "NumberHexFormat", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.r
@g1(version = "1.9")
/* loaded from: classes4.dex */
public final class k {

    /* renamed from: d, reason: collision with root package name */
    @p4.l
    public static final c f19733d = new c(null);

    /* renamed from: e, reason: collision with root package name */
    @p4.l
    private static final k f19734e;

    /* renamed from: f, reason: collision with root package name */
    @p4.l
    private static final k f19735f;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f19736a;

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    private final b f19737b;

    /* renamed from: c, reason: collision with root package name */
    @p4.l
    private final d f19738c;

    @kotlin.i0(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0001¢\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0001J%\u0010\u0007\u001a\u00020\u00152\u0017\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00150\u0017¢\u0006\u0002\b\u0018H\u0087\bø\u0001\u0000J%\u0010\n\u001a\u00020\u00152\u0017\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00150\u0017¢\u0006\u0002\b\u0018H\u0087\bø\u0001\u0000R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0019"}, d2 = {"Lkotlin/text/HexFormat$Builder;", "", "()V", "_bytes", "Lkotlin/text/HexFormat$BytesHexFormat$Builder;", "_number", "Lkotlin/text/HexFormat$NumberHexFormat$Builder;", "bytes", "getBytes", "()Lkotlin/text/HexFormat$BytesHexFormat$Builder;", "number", "getNumber", "()Lkotlin/text/HexFormat$NumberHexFormat$Builder;", "upperCase", "", "getUpperCase", "()Z", "setUpperCase", "(Z)V", "build", "Lkotlin/text/HexFormat;", "", "builderAction", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f19739a = k.f19733d.a().e();

        /* renamed from: b, reason: collision with root package name */
        @p4.m
        private b.a f19740b;

        /* renamed from: c, reason: collision with root package name */
        @p4.m
        private d.a f19741c;

        @a1
        public a() {
        }

        @kotlin.internal.f
        private final void b(v3.l<? super b.a, r2> builderAction) {
            kotlin.jvm.internal.l0.p(builderAction, "builderAction");
            builderAction.invoke(c());
        }

        @kotlin.internal.f
        private final void f(v3.l<? super d.a, r2> builderAction) {
            kotlin.jvm.internal.l0.p(builderAction, "builderAction");
            builderAction.invoke(d());
        }

        @p4.l
        @a1
        public final k a() {
            b a5;
            d a6;
            boolean z4 = this.f19739a;
            b.a aVar = this.f19740b;
            if (aVar == null || (a5 = aVar.a()) == null) {
                a5 = b.f19742g.a();
            }
            d.a aVar2 = this.f19741c;
            if (aVar2 == null || (a6 = aVar2.a()) == null) {
                a6 = d.f19756d.a();
            }
            return new k(z4, a5, a6);
        }

        @p4.l
        public final b.a c() {
            if (this.f19740b == null) {
                this.f19740b = new b.a();
            }
            b.a aVar = this.f19740b;
            kotlin.jvm.internal.l0.m(aVar);
            return aVar;
        }

        @p4.l
        public final d.a d() {
            if (this.f19741c == null) {
                this.f19741c = new d.a();
            }
            d.a aVar = this.f19741c;
            kotlin.jvm.internal.l0.m(aVar);
            return aVar;
        }

        public final boolean e() {
            return this.f19739a;
        }

        public final void g(boolean z4) {
            this.f19739a = z4;
        }
    }

    @kotlin.i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001a\u001bB7\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0002\u0010\nJ%\u0010\u0013\u001a\u00060\u0014j\u0002`\u00152\n\u0010\u0016\u001a\u00060\u0014j\u0002`\u00152\u0006\u0010\u0017\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u0018J\b\u0010\u0019\u001a\u00020\u0006H\u0016R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\u001c"}, d2 = {"Lkotlin/text/HexFormat$BytesHexFormat;", "", "bytesPerLine", "", "bytesPerGroup", "groupSeparator", "", "byteSeparator", "bytePrefix", "byteSuffix", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBytePrefix", "()Ljava/lang/String;", "getByteSeparator", "getByteSuffix", "getBytesPerGroup", "()I", "getBytesPerLine", "getGroupSeparator", "appendOptionsTo", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "sb", org.ccil.cowan.tagsoup.p.f21289y, "appendOptionsTo$kotlin_stdlib", "toString", "Builder", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: g, reason: collision with root package name */
        @p4.l
        public static final C0565b f19742g = new C0565b(null);

        /* renamed from: h, reason: collision with root package name */
        @p4.l
        private static final b f19743h = new b(Integer.MAX_VALUE, Integer.MAX_VALUE, "  ", "", "", "");

        /* renamed from: a, reason: collision with root package name */
        private final int f19744a;

        /* renamed from: b, reason: collision with root package name */
        private final int f19745b;

        /* renamed from: c, reason: collision with root package name */
        @p4.l
        private final String f19746c;

        /* renamed from: d, reason: collision with root package name */
        @p4.l
        private final String f19747d;

        /* renamed from: e, reason: collision with root package name */
        @p4.l
        private final String f19748e;

        /* renamed from: f, reason: collision with root package name */
        @p4.l
        private final String f19749f;

        @kotlin.i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0000¢\u0006\u0002\u0010\u0002J\r\u0010\u001c\u001a\u00020\u001dH\u0000¢\u0006\u0002\b\u001eR$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR$\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR$\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0010@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0010@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\u001a\u0010\u0019\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\t¨\u0006\u001f"}, d2 = {"Lkotlin/text/HexFormat$BytesHexFormat$Builder;", "", "()V", t0.b.f22420d, "", "bytePrefix", "getBytePrefix", "()Ljava/lang/String;", "setBytePrefix", "(Ljava/lang/String;)V", "byteSeparator", "getByteSeparator", "setByteSeparator", "byteSuffix", "getByteSuffix", "setByteSuffix", "", "bytesPerGroup", "getBytesPerGroup", "()I", "setBytesPerGroup", "(I)V", "bytesPerLine", "getBytesPerLine", "setBytesPerLine", "groupSeparator", "getGroupSeparator", "setGroupSeparator", "build", "Lkotlin/text/HexFormat$BytesHexFormat;", "build$kotlin_stdlib", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private int f19750a;

            /* renamed from: b, reason: collision with root package name */
            private int f19751b;

            /* renamed from: c, reason: collision with root package name */
            @p4.l
            private String f19752c;

            /* renamed from: d, reason: collision with root package name */
            @p4.l
            private String f19753d;

            /* renamed from: e, reason: collision with root package name */
            @p4.l
            private String f19754e;

            /* renamed from: f, reason: collision with root package name */
            @p4.l
            private String f19755f;

            public a() {
                C0565b c0565b = b.f19742g;
                this.f19750a = c0565b.a().g();
                this.f19751b = c0565b.a().f();
                this.f19752c = c0565b.a().h();
                this.f19753d = c0565b.a().d();
                this.f19754e = c0565b.a().c();
                this.f19755f = c0565b.a().e();
            }

            @p4.l
            public final b a() {
                return new b(this.f19750a, this.f19751b, this.f19752c, this.f19753d, this.f19754e, this.f19755f);
            }

            @p4.l
            public final String b() {
                return this.f19754e;
            }

            @p4.l
            public final String c() {
                return this.f19753d;
            }

            @p4.l
            public final String d() {
                return this.f19755f;
            }

            public final int e() {
                return this.f19751b;
            }

            public final int f() {
                return this.f19750a;
            }

            @p4.l
            public final String g() {
                return this.f19752c;
            }

            public final void h(@p4.l String value) {
                boolean S2;
                boolean S22;
                kotlin.jvm.internal.l0.p(value, "value");
                S2 = f0.S2(value, '\n', false, 2, null);
                if (!S2) {
                    S22 = f0.S2(value, external.org.apache.commons.lang3.c.f15956c, false, 2, null);
                    if (!S22) {
                        this.f19754e = value;
                        return;
                    }
                }
                throw new IllegalArgumentException("LF and CR characters are prohibited in bytePrefix, but was " + value);
            }

            public final void i(@p4.l String value) {
                boolean S2;
                boolean S22;
                kotlin.jvm.internal.l0.p(value, "value");
                S2 = f0.S2(value, '\n', false, 2, null);
                if (!S2) {
                    S22 = f0.S2(value, external.org.apache.commons.lang3.c.f15956c, false, 2, null);
                    if (!S22) {
                        this.f19753d = value;
                        return;
                    }
                }
                throw new IllegalArgumentException("LF and CR characters are prohibited in byteSeparator, but was " + value);
            }

            public final void j(@p4.l String value) {
                boolean S2;
                boolean S22;
                kotlin.jvm.internal.l0.p(value, "value");
                S2 = f0.S2(value, '\n', false, 2, null);
                if (!S2) {
                    S22 = f0.S2(value, external.org.apache.commons.lang3.c.f15956c, false, 2, null);
                    if (!S22) {
                        this.f19755f = value;
                        return;
                    }
                }
                throw new IllegalArgumentException("LF and CR characters are prohibited in byteSuffix, but was " + value);
            }

            public final void k(int i5) {
                if (i5 > 0) {
                    this.f19751b = i5;
                    return;
                }
                throw new IllegalArgumentException("Non-positive values are prohibited for bytesPerGroup, but was " + i5);
            }

            public final void l(int i5) {
                if (i5 > 0) {
                    this.f19750a = i5;
                    return;
                }
                throw new IllegalArgumentException("Non-positive values are prohibited for bytesPerLine, but was " + i5);
            }

            public final void m(@p4.l String str) {
                kotlin.jvm.internal.l0.p(str, "<set-?>");
                this.f19752c = str;
            }
        }

        @kotlin.i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/text/HexFormat$BytesHexFormat$Companion;", "", "()V", "Default", "Lkotlin/text/HexFormat$BytesHexFormat;", "getDefault$kotlin_stdlib", "()Lkotlin/text/HexFormat$BytesHexFormat;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: kotlin.text.k$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0565b {
            private C0565b() {
            }

            public /* synthetic */ C0565b(kotlin.jvm.internal.w wVar) {
                this();
            }

            @p4.l
            public final b a() {
                return b.f19743h;
            }
        }

        public b(int i5, int i6, @p4.l String groupSeparator, @p4.l String byteSeparator, @p4.l String bytePrefix, @p4.l String byteSuffix) {
            kotlin.jvm.internal.l0.p(groupSeparator, "groupSeparator");
            kotlin.jvm.internal.l0.p(byteSeparator, "byteSeparator");
            kotlin.jvm.internal.l0.p(bytePrefix, "bytePrefix");
            kotlin.jvm.internal.l0.p(byteSuffix, "byteSuffix");
            this.f19744a = i5;
            this.f19745b = i6;
            this.f19746c = groupSeparator;
            this.f19747d = byteSeparator;
            this.f19748e = bytePrefix;
            this.f19749f = byteSuffix;
        }

        @p4.l
        public final StringBuilder b(@p4.l StringBuilder sb, @p4.l String indent) {
            kotlin.jvm.internal.l0.p(sb, "sb");
            kotlin.jvm.internal.l0.p(indent, "indent");
            sb.append(indent);
            sb.append("bytesPerLine = ");
            sb.append(this.f19744a);
            kotlin.jvm.internal.l0.o(sb, "sb.append(indent).append…= \").append(bytesPerLine)");
            sb.append(",");
            kotlin.jvm.internal.l0.o(sb, "append(value)");
            sb.append('\n');
            kotlin.jvm.internal.l0.o(sb, "append('\\n')");
            sb.append(indent);
            sb.append("bytesPerGroup = ");
            sb.append(this.f19745b);
            kotlin.jvm.internal.l0.o(sb, "sb.append(indent).append… \").append(bytesPerGroup)");
            sb.append(",");
            kotlin.jvm.internal.l0.o(sb, "append(value)");
            sb.append('\n');
            kotlin.jvm.internal.l0.o(sb, "append('\\n')");
            sb.append(indent);
            sb.append("groupSeparator = \"");
            sb.append(this.f19746c);
            kotlin.jvm.internal.l0.o(sb, "sb.append(indent).append…\").append(groupSeparator)");
            sb.append("\",");
            kotlin.jvm.internal.l0.o(sb, "append(value)");
            sb.append('\n');
            kotlin.jvm.internal.l0.o(sb, "append('\\n')");
            sb.append(indent);
            sb.append("byteSeparator = \"");
            sb.append(this.f19747d);
            kotlin.jvm.internal.l0.o(sb, "sb.append(indent).append…\"\").append(byteSeparator)");
            sb.append("\",");
            kotlin.jvm.internal.l0.o(sb, "append(value)");
            sb.append('\n');
            kotlin.jvm.internal.l0.o(sb, "append('\\n')");
            sb.append(indent);
            sb.append("bytePrefix = \"");
            sb.append(this.f19748e);
            kotlin.jvm.internal.l0.o(sb, "sb.append(indent).append…= \\\"\").append(bytePrefix)");
            sb.append("\",");
            kotlin.jvm.internal.l0.o(sb, "append(value)");
            sb.append('\n');
            kotlin.jvm.internal.l0.o(sb, "append('\\n')");
            sb.append(indent);
            sb.append("byteSuffix = \"");
            sb.append(this.f19749f);
            sb.append("\"");
            return sb;
        }

        @p4.l
        public final String c() {
            return this.f19748e;
        }

        @p4.l
        public final String d() {
            return this.f19747d;
        }

        @p4.l
        public final String e() {
            return this.f19749f;
        }

        public final int f() {
            return this.f19745b;
        }

        public final int g() {
            return this.f19744a;
        }

        @p4.l
        public final String h() {
            return this.f19746c;
        }

        @p4.l
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("BytesHexFormat(");
            kotlin.jvm.internal.l0.o(sb, "append(\"BytesHexFormat(\")");
            sb.append('\n');
            kotlin.jvm.internal.l0.o(sb, "append('\\n')");
            StringBuilder b5 = b(sb, "    ");
            b5.append('\n');
            kotlin.jvm.internal.l0.o(b5, "append('\\n')");
            sb.append(")");
            String sb2 = sb.toString();
            kotlin.jvm.internal.l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }
    }

    @kotlin.i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lkotlin/text/HexFormat$Companion;", "", "()V", "Default", "Lkotlin/text/HexFormat;", "getDefault", "()Lkotlin/text/HexFormat;", "UpperCase", "getUpperCase", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(kotlin.jvm.internal.w wVar) {
            this();
        }

        @p4.l
        public final k a() {
            return k.f19734e;
        }

        @p4.l
        public final k b() {
            return k.f19735f;
        }
    }

    @kotlin.i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0002\u0014\u0015B\u001f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J%\u0010\r\u001a\u00060\u000ej\u0002`\u000f2\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f2\u0006\u0010\u0011\u001a\u00020\u0003H\u0000¢\u0006\u0002\b\u0012J\b\u0010\u0013\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0016"}, d2 = {"Lkotlin/text/HexFormat$NumberHexFormat;", "", "prefix", "", "suffix", "removeLeadingZeros", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getPrefix", "()Ljava/lang/String;", "getRemoveLeadingZeros", "()Z", "getSuffix", "appendOptionsTo", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "sb", org.ccil.cowan.tagsoup.p.f21289y, "appendOptionsTo$kotlin_stdlib", "toString", "Builder", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class d {

        /* renamed from: d, reason: collision with root package name */
        @p4.l
        public static final b f19756d = new b(null);

        /* renamed from: e, reason: collision with root package name */
        @p4.l
        private static final d f19757e = new d("", "", false);

        /* renamed from: a, reason: collision with root package name */
        @p4.l
        private final String f19758a;

        /* renamed from: b, reason: collision with root package name */
        @p4.l
        private final String f19759b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f19760c;

        @kotlin.i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0000¢\u0006\u0002\u0010\u0002J\r\u0010\u0013\u001a\u00020\u0014H\u0000¢\u0006\u0002\b\u0015R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\t¨\u0006\u0016"}, d2 = {"Lkotlin/text/HexFormat$NumberHexFormat$Builder;", "", "()V", t0.b.f22420d, "", "prefix", "getPrefix", "()Ljava/lang/String;", "setPrefix", "(Ljava/lang/String;)V", "removeLeadingZeros", "", "getRemoveLeadingZeros", "()Z", "setRemoveLeadingZeros", "(Z)V", "suffix", "getSuffix", "setSuffix", "build", "Lkotlin/text/HexFormat$NumberHexFormat;", "build$kotlin_stdlib", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            @p4.l
            private String f19761a;

            /* renamed from: b, reason: collision with root package name */
            @p4.l
            private String f19762b;

            /* renamed from: c, reason: collision with root package name */
            private boolean f19763c;

            public a() {
                b bVar = d.f19756d;
                this.f19761a = bVar.a().c();
                this.f19762b = bVar.a().e();
                this.f19763c = bVar.a().d();
            }

            @p4.l
            public final d a() {
                return new d(this.f19761a, this.f19762b, this.f19763c);
            }

            @p4.l
            public final String b() {
                return this.f19761a;
            }

            public final boolean c() {
                return this.f19763c;
            }

            @p4.l
            public final String d() {
                return this.f19762b;
            }

            public final void e(@p4.l String value) {
                boolean S2;
                boolean S22;
                kotlin.jvm.internal.l0.p(value, "value");
                S2 = f0.S2(value, '\n', false, 2, null);
                if (!S2) {
                    S22 = f0.S2(value, external.org.apache.commons.lang3.c.f15956c, false, 2, null);
                    if (!S22) {
                        this.f19761a = value;
                        return;
                    }
                }
                throw new IllegalArgumentException("LF and CR characters are prohibited in prefix, but was " + value);
            }

            public final void f(boolean z4) {
                this.f19763c = z4;
            }

            public final void g(@p4.l String value) {
                boolean S2;
                boolean S22;
                kotlin.jvm.internal.l0.p(value, "value");
                S2 = f0.S2(value, '\n', false, 2, null);
                if (!S2) {
                    S22 = f0.S2(value, external.org.apache.commons.lang3.c.f15956c, false, 2, null);
                    if (!S22) {
                        this.f19762b = value;
                        return;
                    }
                }
                throw new IllegalArgumentException("LF and CR characters are prohibited in suffix, but was " + value);
            }
        }

        @kotlin.i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/text/HexFormat$NumberHexFormat$Companion;", "", "()V", "Default", "Lkotlin/text/HexFormat$NumberHexFormat;", "getDefault$kotlin_stdlib", "()Lkotlin/text/HexFormat$NumberHexFormat;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class b {
            private b() {
            }

            public /* synthetic */ b(kotlin.jvm.internal.w wVar) {
                this();
            }

            @p4.l
            public final d a() {
                return d.f19757e;
            }
        }

        public d(@p4.l String prefix, @p4.l String suffix, boolean z4) {
            kotlin.jvm.internal.l0.p(prefix, "prefix");
            kotlin.jvm.internal.l0.p(suffix, "suffix");
            this.f19758a = prefix;
            this.f19759b = suffix;
            this.f19760c = z4;
        }

        @p4.l
        public final StringBuilder b(@p4.l StringBuilder sb, @p4.l String indent) {
            kotlin.jvm.internal.l0.p(sb, "sb");
            kotlin.jvm.internal.l0.p(indent, "indent");
            sb.append(indent);
            sb.append("prefix = \"");
            sb.append(this.f19758a);
            kotlin.jvm.internal.l0.o(sb, "sb.append(indent).append…fix = \\\"\").append(prefix)");
            sb.append("\",");
            kotlin.jvm.internal.l0.o(sb, "append(value)");
            sb.append('\n');
            kotlin.jvm.internal.l0.o(sb, "append('\\n')");
            sb.append(indent);
            sb.append("suffix = \"");
            sb.append(this.f19759b);
            kotlin.jvm.internal.l0.o(sb, "sb.append(indent).append…fix = \\\"\").append(suffix)");
            sb.append("\",");
            kotlin.jvm.internal.l0.o(sb, "append(value)");
            sb.append('\n');
            kotlin.jvm.internal.l0.o(sb, "append('\\n')");
            sb.append(indent);
            sb.append("removeLeadingZeros = ");
            sb.append(this.f19760c);
            return sb;
        }

        @p4.l
        public final String c() {
            return this.f19758a;
        }

        public final boolean d() {
            return this.f19760c;
        }

        @p4.l
        public final String e() {
            return this.f19759b;
        }

        @p4.l
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("NumberHexFormat(");
            kotlin.jvm.internal.l0.o(sb, "append(\"NumberHexFormat(\")");
            sb.append('\n');
            kotlin.jvm.internal.l0.o(sb, "append('\\n')");
            StringBuilder b5 = b(sb, "    ");
            b5.append('\n');
            kotlin.jvm.internal.l0.o(b5, "append('\\n')");
            sb.append(")");
            String sb2 = sb.toString();
            kotlin.jvm.internal.l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }
    }

    static {
        b.C0565b c0565b = b.f19742g;
        b a5 = c0565b.a();
        d.b bVar = d.f19756d;
        f19734e = new k(false, a5, bVar.a());
        f19735f = new k(true, c0565b.a(), bVar.a());
    }

    public k(boolean z4, @p4.l b bytes, @p4.l d number) {
        kotlin.jvm.internal.l0.p(bytes, "bytes");
        kotlin.jvm.internal.l0.p(number, "number");
        this.f19736a = z4;
        this.f19737b = bytes;
        this.f19738c = number;
    }

    @p4.l
    public final b c() {
        return this.f19737b;
    }

    @p4.l
    public final d d() {
        return this.f19738c;
    }

    public final boolean e() {
        return this.f19736a;
    }

    @p4.l
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HexFormat(");
        kotlin.jvm.internal.l0.o(sb, "append(\"HexFormat(\")");
        sb.append('\n');
        kotlin.jvm.internal.l0.o(sb, "append('\\n')");
        sb.append("    upperCase = ");
        sb.append(this.f19736a);
        kotlin.jvm.internal.l0.o(sb, "append(\"    upperCase = \").append(upperCase)");
        sb.append(",");
        kotlin.jvm.internal.l0.o(sb, "append(value)");
        sb.append('\n');
        kotlin.jvm.internal.l0.o(sb, "append('\\n')");
        sb.append("    bytes = BytesHexFormat(");
        kotlin.jvm.internal.l0.o(sb, "append(\"    bytes = BytesHexFormat(\")");
        sb.append('\n');
        kotlin.jvm.internal.l0.o(sb, "append('\\n')");
        StringBuilder b5 = this.f19737b.b(sb, "        ");
        b5.append('\n');
        kotlin.jvm.internal.l0.o(b5, "append('\\n')");
        sb.append("    ),");
        kotlin.jvm.internal.l0.o(sb, "append(\"    ),\")");
        sb.append('\n');
        kotlin.jvm.internal.l0.o(sb, "append('\\n')");
        sb.append("    number = NumberHexFormat(");
        kotlin.jvm.internal.l0.o(sb, "append(\"    number = NumberHexFormat(\")");
        sb.append('\n');
        kotlin.jvm.internal.l0.o(sb, "append('\\n')");
        StringBuilder b6 = this.f19738c.b(sb, "        ");
        b6.append('\n');
        kotlin.jvm.internal.l0.o(b6, "append('\\n')");
        sb.append("    )");
        kotlin.jvm.internal.l0.o(sb, "append(\"    )\")");
        sb.append('\n');
        kotlin.jvm.internal.l0.o(sb, "append('\\n')");
        sb.append(")");
        String sb2 = sb.toString();
        kotlin.jvm.internal.l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
