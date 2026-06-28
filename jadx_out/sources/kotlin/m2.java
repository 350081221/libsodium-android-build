package kotlin;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import okhttp3.internal.ws.WebSocketProtocol;

@g1(version = "1.5")
@u3.f
@v2(markerClass = {t.class})
@i0(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\n\n\u0002\b\t\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087@\u0018\u0000 v2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001vB\u0014\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\fø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u000eH\u0087\nø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0011H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0014H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0000H\u0097\nø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\u00020\u0000H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0005J\u001b\u0010\u001b\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u000eH\u0087\nø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u0010J\u001b\u0010\u001b\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u0013J\u001b\u0010\u001b\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010\u001b\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b \u0010\u0018J\u001a\u0010!\u001a\u00020\"2\b\u0010\t\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b$\u0010%J\u001b\u0010&\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u000eH\u0087\bø\u0001\u0000¢\u0006\u0004\b'\u0010\u0010J\u001b\u0010&\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\bø\u0001\u0000¢\u0006\u0004\b(\u0010\u0013J\u001b\u0010&\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\u0087\bø\u0001\u0000¢\u0006\u0004\b)\u0010\u001fJ\u001b\u0010&\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b*\u0010\u0018J\u0010\u0010+\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b,\u0010-J\u0016\u0010.\u001a\u00020\u0000H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b/\u0010\u0005J\u0016\u00100\u001a\u00020\u0000H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b1\u0010\u0005J\u001b\u00102\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u000eH\u0087\nø\u0001\u0000¢\u0006\u0004\b3\u0010\u0010J\u001b\u00102\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\nø\u0001\u0000¢\u0006\u0004\b4\u0010\u0013J\u001b\u00102\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\u0087\nø\u0001\u0000¢\u0006\u0004\b5\u0010\u001fJ\u001b\u00102\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b6\u0010\u0018J\u001b\u00107\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000eH\u0087\bø\u0001\u0000¢\u0006\u0004\b8\u00109J\u001b\u00107\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\bø\u0001\u0000¢\u0006\u0004\b:\u0010\u0013J\u001b\u00107\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\u0087\bø\u0001\u0000¢\u0006\u0004\b;\u0010\u001fJ\u001b\u00107\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b<\u0010\u000bJ\u001b\u0010=\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\fø\u0001\u0000¢\u0006\u0004\b>\u0010\u000bJ\u001b\u0010?\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u000eH\u0087\nø\u0001\u0000¢\u0006\u0004\b@\u0010\u0010J\u001b\u0010?\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\nø\u0001\u0000¢\u0006\u0004\bA\u0010\u0013J\u001b\u0010?\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\u0087\nø\u0001\u0000¢\u0006\u0004\bB\u0010\u001fJ\u001b\u0010?\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\bC\u0010\u0018J\u001b\u0010D\u001a\u00020E2\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\bF\u0010GJ\u001b\u0010H\u001a\u00020E2\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\bI\u0010GJ\u001b\u0010J\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u000eH\u0087\nø\u0001\u0000¢\u0006\u0004\bK\u0010\u0010J\u001b\u0010J\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\nø\u0001\u0000¢\u0006\u0004\bL\u0010\u0013J\u001b\u0010J\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\u0087\nø\u0001\u0000¢\u0006\u0004\bM\u0010\u001fJ\u001b\u0010J\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\bN\u0010\u0018J\u001b\u0010O\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u000eH\u0087\nø\u0001\u0000¢\u0006\u0004\bP\u0010\u0010J\u001b\u0010O\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\nø\u0001\u0000¢\u0006\u0004\bQ\u0010\u0013J\u001b\u0010O\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\u0087\nø\u0001\u0000¢\u0006\u0004\bR\u0010\u001fJ\u001b\u0010O\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\bS\u0010\u0018J\u0010\u0010T\u001a\u00020UH\u0087\b¢\u0006\u0004\bV\u0010WJ\u0010\u0010X\u001a\u00020YH\u0087\b¢\u0006\u0004\bZ\u0010[J\u0010\u0010\\\u001a\u00020]H\u0087\b¢\u0006\u0004\b^\u0010_J\u0010\u0010`\u001a\u00020\rH\u0087\b¢\u0006\u0004\ba\u0010-J\u0010\u0010b\u001a\u00020cH\u0087\b¢\u0006\u0004\bd\u0010eJ\u0010\u0010f\u001a\u00020\u0003H\u0087\b¢\u0006\u0004\bg\u0010\u0005J\u000f\u0010h\u001a\u00020iH\u0016¢\u0006\u0004\bj\u0010kJ\u0016\u0010l\u001a\u00020\u000eH\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bm\u0010WJ\u0016\u0010n\u001a\u00020\u0011H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bo\u0010-J\u0016\u0010p\u001a\u00020\u0014H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bq\u0010eJ\u0016\u0010r\u001a\u00020\u0000H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bs\u0010\u0005J\u001b\u0010t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\fø\u0001\u0000¢\u0006\u0004\bu\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006w"}, d2 = {"Lkotlin/UShort;", "", "data", "", "constructor-impl", "(S)S", "getData$annotations", "()V", "and", "other", "and-xj2QHRw", "(SS)S", "compareTo", "", "Lkotlin/UByte;", "compareTo-7apg3OU", "(SB)I", "Lkotlin/UInt;", "compareTo-WZ4Q5Ns", "(SI)I", "Lkotlin/ULong;", "compareTo-VKZWuLQ", "(SJ)I", "compareTo-xj2QHRw", "(SS)I", "dec", "dec-Mh2AYeg", "div", "div-7apg3OU", "div-WZ4Q5Ns", "div-VKZWuLQ", "(SJ)J", "div-xj2QHRw", "equals", "", "", "equals-impl", "(SLjava/lang/Object;)Z", "floorDiv", "floorDiv-7apg3OU", "floorDiv-WZ4Q5Ns", "floorDiv-VKZWuLQ", "floorDiv-xj2QHRw", TTDownloadField.TT_HASHCODE, "hashCode-impl", "(S)I", "inc", "inc-Mh2AYeg", "inv", "inv-Mh2AYeg", "minus", "minus-7apg3OU", "minus-WZ4Q5Ns", "minus-VKZWuLQ", "minus-xj2QHRw", "mod", "mod-7apg3OU", "(SB)B", "mod-WZ4Q5Ns", "mod-VKZWuLQ", "mod-xj2QHRw", "or", "or-xj2QHRw", "plus", "plus-7apg3OU", "plus-WZ4Q5Ns", "plus-VKZWuLQ", "plus-xj2QHRw", "rangeTo", "Lkotlin/ranges/UIntRange;", "rangeTo-xj2QHRw", "(SS)Lkotlin/ranges/UIntRange;", "rangeUntil", "rangeUntil-xj2QHRw", "rem", "rem-7apg3OU", "rem-WZ4Q5Ns", "rem-VKZWuLQ", "rem-xj2QHRw", "times", "times-7apg3OU", "times-WZ4Q5Ns", "times-VKZWuLQ", "times-xj2QHRw", "toByte", "", "toByte-impl", "(S)B", "toDouble", "", "toDouble-impl", "(S)D", "toFloat", "", "toFloat-impl", "(S)F", "toInt", "toInt-impl", "toLong", "", "toLong-impl", "(S)J", "toShort", "toShort-impl", "toString", "", "toString-impl", "(S)Ljava/lang/String;", "toUByte", "toUByte-w2LRezQ", "toUInt", "toUInt-pVg5ArA", "toULong", "toULong-s-VKNKU", "toUShort", "toUShort-Mh2AYeg", "xor", "xor-xj2QHRw", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class m2 implements Comparable<m2> {

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    public static final a f19494b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final short f19495c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final short f19496d = -1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f19497e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final int f19498f = 16;

    /* renamed from: a, reason: collision with root package name */
    private final short f19499a;

    @i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u0004X\u0086Tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\u0006\u001a\u00020\u0004X\u0086Tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\n"}, d2 = {"Lkotlin/UShort$Companion;", "", "()V", "MAX_VALUE", "Lkotlin/UShort;", "S", "MIN_VALUE", "SIZE_BITS", "", "SIZE_BYTES", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.w wVar) {
            this();
        }
    }

    @kotlin.internal.g
    @a1
    private /* synthetic */ m2(short s5) {
        this.f19499a = s5;
    }

    @kotlin.internal.f
    private static final short A(short s5) {
        return l((short) (~s5));
    }

    @kotlin.internal.f
    private static final int B(short s5, byte b5) {
        return c2.l(c2.l(s5 & f19496d) - c2.l(b5 & y1.f19838d));
    }

    @kotlin.internal.f
    private static final long C(short s5, long j5) {
        return g2.l(g2.l(s5 & WebSocketProtocol.PAYLOAD_SHORT_MAX) - j5);
    }

    @kotlin.internal.f
    private static final int D(short s5, int i5) {
        return c2.l(c2.l(s5 & f19496d) - i5);
    }

    @kotlin.internal.f
    private static final int E(short s5, short s6) {
        return c2.l(c2.l(s5 & f19496d) - c2.l(s6 & f19496d));
    }

    @kotlin.internal.f
    private static final byte F(short s5, byte b5) {
        return y1.l((byte) t1.a(c2.l(s5 & f19496d), c2.l(b5 & y1.f19838d)));
    }

    @kotlin.internal.f
    private static final long G(short s5, long j5) {
        return w1.a(g2.l(s5 & WebSocketProtocol.PAYLOAD_SHORT_MAX), j5);
    }

    @kotlin.internal.f
    private static final int H(short s5, int i5) {
        return t1.a(c2.l(s5 & f19496d), i5);
    }

    @kotlin.internal.f
    private static final short I(short s5, short s6) {
        return l((short) t1.a(c2.l(s5 & f19496d), c2.l(s6 & f19496d)));
    }

    @kotlin.internal.f
    private static final short J(short s5, short s6) {
        return l((short) (s5 | s6));
    }

    @kotlin.internal.f
    private static final int K(short s5, byte b5) {
        return c2.l(c2.l(s5 & f19496d) + c2.l(b5 & y1.f19838d));
    }

    @kotlin.internal.f
    private static final long L(short s5, long j5) {
        return g2.l(g2.l(s5 & WebSocketProtocol.PAYLOAD_SHORT_MAX) + j5);
    }

    @kotlin.internal.f
    private static final int M(short s5, int i5) {
        return c2.l(c2.l(s5 & f19496d) + i5);
    }

    @kotlin.internal.f
    private static final int N(short s5, short s6) {
        return c2.l(c2.l(s5 & f19496d) + c2.l(s6 & f19496d));
    }

    @kotlin.internal.f
    private static final kotlin.ranges.x O(short s5, short s6) {
        return new kotlin.ranges.x(c2.l(s5 & f19496d), c2.l(s6 & f19496d), null);
    }

    @g1(version = "1.9")
    @kotlin.internal.f
    @v2(markerClass = {r.class})
    private static final kotlin.ranges.x P(short s5, short s6) {
        return kotlin.ranges.b0.V(c2.l(s5 & f19496d), c2.l(s6 & f19496d));
    }

    @kotlin.internal.f
    private static final int Q(short s5, byte b5) {
        return t1.a(c2.l(s5 & f19496d), c2.l(b5 & y1.f19838d));
    }

    @kotlin.internal.f
    private static final long R(short s5, long j5) {
        return w1.a(g2.l(s5 & WebSocketProtocol.PAYLOAD_SHORT_MAX), j5);
    }

    @kotlin.internal.f
    private static final int S(short s5, int i5) {
        return t1.a(c2.l(s5 & f19496d), i5);
    }

    @kotlin.internal.f
    private static final int T(short s5, short s6) {
        return t1.a(c2.l(s5 & f19496d), c2.l(s6 & f19496d));
    }

    @kotlin.internal.f
    private static final int U(short s5, byte b5) {
        return c2.l(c2.l(s5 & f19496d) * c2.l(b5 & y1.f19838d));
    }

    @kotlin.internal.f
    private static final long V(short s5, long j5) {
        return g2.l(g2.l(s5 & WebSocketProtocol.PAYLOAD_SHORT_MAX) * j5);
    }

    @kotlin.internal.f
    private static final int W(short s5, int i5) {
        return c2.l(c2.l(s5 & f19496d) * i5);
    }

    @kotlin.internal.f
    private static final int X(short s5, short s6) {
        return c2.l(c2.l(s5 & f19496d) * c2.l(s6 & f19496d));
    }

    @kotlin.internal.f
    private static final byte Y(short s5) {
        return (byte) s5;
    }

    @kotlin.internal.f
    private static final double Z(short s5) {
        return s5 & f19496d;
    }

    @kotlin.internal.f
    private static final float a0(short s5) {
        return s5 & f19496d;
    }

    @kotlin.internal.f
    private static final int b0(short s5) {
        return s5 & f19496d;
    }

    @kotlin.internal.f
    private static final short c(short s5, short s6) {
        return l((short) (s5 & s6));
    }

    @kotlin.internal.f
    private static final long c0(short s5) {
        return s5 & WebSocketProtocol.PAYLOAD_SHORT_MAX;
    }

    @kotlin.internal.f
    private static final short d0(short s5) {
        return s5;
    }

    public static final /* synthetic */ m2 e(short s5) {
        return new m2(s5);
    }

    @p4.l
    public static String e0(short s5) {
        return String.valueOf(s5 & f19496d);
    }

    @kotlin.internal.f
    private static final int f(short s5, byte b5) {
        return kotlin.jvm.internal.l0.t(s5 & f19496d, b5 & y1.f19838d);
    }

    @kotlin.internal.f
    private static final byte f0(short s5) {
        return y1.l((byte) s5);
    }

    @kotlin.internal.f
    private static final int g0(short s5) {
        return c2.l(s5 & f19496d);
    }

    @kotlin.internal.f
    private static final int h(short s5, long j5) {
        int compare;
        compare = Long.compare(g2.l(s5 & WebSocketProtocol.PAYLOAD_SHORT_MAX) ^ Long.MIN_VALUE, j5 ^ Long.MIN_VALUE);
        return compare;
    }

    @kotlin.internal.f
    private static final long h0(short s5) {
        return g2.l(s5 & WebSocketProtocol.PAYLOAD_SHORT_MAX);
    }

    @kotlin.internal.f
    private static final int i(short s5, int i5) {
        int compare;
        compare = Integer.compare(c2.l(s5 & f19496d) ^ Integer.MIN_VALUE, i5 ^ Integer.MIN_VALUE);
        return compare;
    }

    @kotlin.internal.f
    private static final short i0(short s5) {
        return s5;
    }

    @kotlin.internal.f
    private int j(short s5) {
        return kotlin.jvm.internal.l0.t(j0() & f19496d, s5 & f19496d);
    }

    @kotlin.internal.f
    private static int k(short s5, short s6) {
        return kotlin.jvm.internal.l0.t(s5 & f19496d, s6 & f19496d);
    }

    @kotlin.internal.f
    private static final short k0(short s5, short s6) {
        return l((short) (s5 ^ s6));
    }

    @kotlin.internal.g
    @a1
    public static short l(short s5) {
        return s5;
    }

    @kotlin.internal.f
    private static final short m(short s5) {
        return l((short) (s5 - 1));
    }

    @kotlin.internal.f
    private static final int n(short s5, byte b5) {
        return u1.a(c2.l(s5 & f19496d), c2.l(b5 & y1.f19838d));
    }

    @kotlin.internal.f
    private static final long o(short s5, long j5) {
        return x1.a(g2.l(s5 & WebSocketProtocol.PAYLOAD_SHORT_MAX), j5);
    }

    @kotlin.internal.f
    private static final int p(short s5, int i5) {
        return u1.a(c2.l(s5 & f19496d), i5);
    }

    @kotlin.internal.f
    private static final int q(short s5, short s6) {
        return u1.a(c2.l(s5 & f19496d), c2.l(s6 & f19496d));
    }

    public static boolean r(short s5, Object obj) {
        return (obj instanceof m2) && s5 == ((m2) obj).j0();
    }

    public static final boolean s(short s5, short s6) {
        return s5 == s6;
    }

    @kotlin.internal.f
    private static final int t(short s5, byte b5) {
        return u1.a(c2.l(s5 & f19496d), c2.l(b5 & y1.f19838d));
    }

    @kotlin.internal.f
    private static final long u(short s5, long j5) {
        return x1.a(g2.l(s5 & WebSocketProtocol.PAYLOAD_SHORT_MAX), j5);
    }

    @kotlin.internal.f
    private static final int v(short s5, int i5) {
        return u1.a(c2.l(s5 & f19496d), i5);
    }

    @kotlin.internal.f
    private static final int w(short s5, short s6) {
        return u1.a(c2.l(s5 & f19496d), c2.l(s6 & f19496d));
    }

    @a1
    public static /* synthetic */ void x() {
    }

    public static int y(short s5) {
        return Short.hashCode(s5);
    }

    @kotlin.internal.f
    private static final short z(short s5) {
        return l((short) (s5 + 1));
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(m2 m2Var) {
        return kotlin.jvm.internal.l0.t(j0() & f19496d, m2Var.j0() & f19496d);
    }

    public boolean equals(Object obj) {
        return r(this.f19499a, obj);
    }

    public int hashCode() {
        return y(this.f19499a);
    }

    public final /* synthetic */ short j0() {
        return this.f19499a;
    }

    @p4.l
    public String toString() {
        return e0(this.f19499a);
    }
}
