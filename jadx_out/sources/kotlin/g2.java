package kotlin;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import okhttp3.internal.ws.WebSocketProtocol;

@g1(version = "1.5")
@u3.f
@v2(markerClass = {t.class})
@i0(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087@\u0018\u0000 ~2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001~B\u0014\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\fø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u000eH\u0087\nø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0011H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0000H\u0097\nø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0016H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\u00020\u0000H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0005J\u001b\u0010\u001b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000eH\u0087\nø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010\u001b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0011H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010\u001b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b \u0010\u000bJ\u001b\u0010\u001b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0016H\u0087\nø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u001a\u0010#\u001a\u00020$2\b\u0010\t\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b&\u0010'J\u001b\u0010(\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000eH\u0087\bø\u0001\u0000¢\u0006\u0004\b)\u0010\u001dJ\u001b\u0010(\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0011H\u0087\bø\u0001\u0000¢\u0006\u0004\b*\u0010\u001fJ\u001b\u0010(\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b+\u0010\u000bJ\u001b\u0010(\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0016H\u0087\bø\u0001\u0000¢\u0006\u0004\b,\u0010\"J\u0010\u0010-\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b.\u0010/J\u0016\u00100\u001a\u00020\u0000H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b1\u0010\u0005J\u0016\u00102\u001a\u00020\u0000H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b3\u0010\u0005J\u001b\u00104\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000eH\u0087\nø\u0001\u0000¢\u0006\u0004\b5\u0010\u001dJ\u001b\u00104\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0011H\u0087\nø\u0001\u0000¢\u0006\u0004\b6\u0010\u001fJ\u001b\u00104\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b7\u0010\u000bJ\u001b\u00104\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0016H\u0087\nø\u0001\u0000¢\u0006\u0004\b8\u0010\"J\u001b\u00109\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000eH\u0087\bø\u0001\u0000¢\u0006\u0004\b:\u0010;J\u001b\u00109\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\bø\u0001\u0000¢\u0006\u0004\b<\u0010\u0013J\u001b\u00109\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b=\u0010\u000bJ\u001b\u00109\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\u0016H\u0087\bø\u0001\u0000¢\u0006\u0004\b>\u0010?J\u001b\u0010@\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\fø\u0001\u0000¢\u0006\u0004\bA\u0010\u000bJ\u001b\u0010B\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000eH\u0087\nø\u0001\u0000¢\u0006\u0004\bC\u0010\u001dJ\u001b\u0010B\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0011H\u0087\nø\u0001\u0000¢\u0006\u0004\bD\u0010\u001fJ\u001b\u0010B\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\bE\u0010\u000bJ\u001b\u0010B\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0016H\u0087\nø\u0001\u0000¢\u0006\u0004\bF\u0010\"J\u001b\u0010G\u001a\u00020H2\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\bI\u0010JJ\u001b\u0010K\u001a\u00020H2\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\bL\u0010JJ\u001b\u0010M\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000eH\u0087\nø\u0001\u0000¢\u0006\u0004\bN\u0010\u001dJ\u001b\u0010M\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0011H\u0087\nø\u0001\u0000¢\u0006\u0004\bO\u0010\u001fJ\u001b\u0010M\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\bP\u0010\u000bJ\u001b\u0010M\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0016H\u0087\nø\u0001\u0000¢\u0006\u0004\bQ\u0010\"J\u001e\u0010R\u001a\u00020\u00002\u0006\u0010S\u001a\u00020\rH\u0087\fø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bT\u0010\u001fJ\u001e\u0010U\u001a\u00020\u00002\u0006\u0010S\u001a\u00020\rH\u0087\fø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bV\u0010\u001fJ\u001b\u0010W\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000eH\u0087\nø\u0001\u0000¢\u0006\u0004\bX\u0010\u001dJ\u001b\u0010W\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0011H\u0087\nø\u0001\u0000¢\u0006\u0004\bY\u0010\u001fJ\u001b\u0010W\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\bZ\u0010\u000bJ\u001b\u0010W\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0016H\u0087\nø\u0001\u0000¢\u0006\u0004\b[\u0010\"J\u0010\u0010\\\u001a\u00020]H\u0087\b¢\u0006\u0004\b^\u0010_J\u0010\u0010`\u001a\u00020aH\u0087\b¢\u0006\u0004\bb\u0010cJ\u0010\u0010d\u001a\u00020eH\u0087\b¢\u0006\u0004\bf\u0010gJ\u0010\u0010h\u001a\u00020\rH\u0087\b¢\u0006\u0004\bi\u0010/J\u0010\u0010j\u001a\u00020\u0003H\u0087\b¢\u0006\u0004\bk\u0010\u0005J\u0010\u0010l\u001a\u00020mH\u0087\b¢\u0006\u0004\bn\u0010oJ\u000f\u0010p\u001a\u00020qH\u0016¢\u0006\u0004\br\u0010sJ\u0016\u0010t\u001a\u00020\u000eH\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bu\u0010_J\u0016\u0010v\u001a\u00020\u0011H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bw\u0010/J\u0016\u0010x\u001a\u00020\u0000H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\by\u0010\u0005J\u0016\u0010z\u001a\u00020\u0016H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b{\u0010oJ\u001b\u0010|\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\fø\u0001\u0000¢\u0006\u0004\b}\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\u007f"}, d2 = {"Lkotlin/ULong;", "", "data", "", "constructor-impl", "(J)J", "getData$annotations", "()V", "and", "other", "and-VKZWuLQ", "(JJ)J", "compareTo", "", "Lkotlin/UByte;", "compareTo-7apg3OU", "(JB)I", "Lkotlin/UInt;", "compareTo-WZ4Q5Ns", "(JI)I", "compareTo-VKZWuLQ", "(JJ)I", "Lkotlin/UShort;", "compareTo-xj2QHRw", "(JS)I", "dec", "dec-s-VKNKU", "div", "div-7apg3OU", "(JB)J", "div-WZ4Q5Ns", "(JI)J", "div-VKZWuLQ", "div-xj2QHRw", "(JS)J", "equals", "", "", "equals-impl", "(JLjava/lang/Object;)Z", "floorDiv", "floorDiv-7apg3OU", "floorDiv-WZ4Q5Ns", "floorDiv-VKZWuLQ", "floorDiv-xj2QHRw", TTDownloadField.TT_HASHCODE, "hashCode-impl", "(J)I", "inc", "inc-s-VKNKU", "inv", "inv-s-VKNKU", "minus", "minus-7apg3OU", "minus-WZ4Q5Ns", "minus-VKZWuLQ", "minus-xj2QHRw", "mod", "mod-7apg3OU", "(JB)B", "mod-WZ4Q5Ns", "mod-VKZWuLQ", "mod-xj2QHRw", "(JS)S", "or", "or-VKZWuLQ", "plus", "plus-7apg3OU", "plus-WZ4Q5Ns", "plus-VKZWuLQ", "plus-xj2QHRw", "rangeTo", "Lkotlin/ranges/ULongRange;", "rangeTo-VKZWuLQ", "(JJ)Lkotlin/ranges/ULongRange;", "rangeUntil", "rangeUntil-VKZWuLQ", "rem", "rem-7apg3OU", "rem-WZ4Q5Ns", "rem-VKZWuLQ", "rem-xj2QHRw", "shl", "bitCount", "shl-s-VKNKU", "shr", "shr-s-VKNKU", "times", "times-7apg3OU", "times-WZ4Q5Ns", "times-VKZWuLQ", "times-xj2QHRw", "toByte", "", "toByte-impl", "(J)B", "toDouble", "", "toDouble-impl", "(J)D", "toFloat", "", "toFloat-impl", "(J)F", "toInt", "toInt-impl", "toLong", "toLong-impl", "toShort", "", "toShort-impl", "(J)S", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "toUByte", "toUByte-w2LRezQ", "toUInt", "toUInt-pVg5ArA", "toULong", "toULong-s-VKNKU", "toUShort", "toUShort-Mh2AYeg", "xor", "xor-VKZWuLQ", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g2 implements Comparable<g2> {

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    public static final a f19247b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final long f19248c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final long f19249d = -1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f19250e = 8;

    /* renamed from: f, reason: collision with root package name */
    public static final int f19251f = 64;

    /* renamed from: a, reason: collision with root package name */
    private final long f19252a;

    @i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u0004X\u0086Tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\u0006\u001a\u00020\u0004X\u0086Tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\n"}, d2 = {"Lkotlin/ULong$Companion;", "", "()V", "MAX_VALUE", "Lkotlin/ULong;", "J", "MIN_VALUE", "SIZE_BITS", "", "SIZE_BYTES", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
    private /* synthetic */ g2(long j5) {
        this.f19252a = j5;
    }

    @kotlin.internal.f
    private static final long A(long j5) {
        return l(~j5);
    }

    @kotlin.internal.f
    private static final long B(long j5, byte b5) {
        return l(j5 - l(b5 & 255));
    }

    @kotlin.internal.f
    private static final long C(long j5, long j6) {
        return l(j5 - j6);
    }

    @kotlin.internal.f
    private static final long D(long j5, int i5) {
        return l(j5 - l(i5 & 4294967295L));
    }

    @kotlin.internal.f
    private static final long E(long j5, short s5) {
        return l(j5 - l(s5 & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    @kotlin.internal.f
    private static final byte F(long j5, byte b5) {
        return y1.l((byte) w1.a(j5, l(b5 & 255)));
    }

    @kotlin.internal.f
    private static final long G(long j5, long j6) {
        return w1.a(j5, j6);
    }

    @kotlin.internal.f
    private static final int H(long j5, int i5) {
        return c2.l((int) w1.a(j5, l(i5 & 4294967295L)));
    }

    @kotlin.internal.f
    private static final short I(long j5, short s5) {
        return m2.l((short) w1.a(j5, l(s5 & WebSocketProtocol.PAYLOAD_SHORT_MAX)));
    }

    @kotlin.internal.f
    private static final long J(long j5, long j6) {
        return l(j5 | j6);
    }

    @kotlin.internal.f
    private static final long K(long j5, byte b5) {
        return l(j5 + l(b5 & 255));
    }

    @kotlin.internal.f
    private static final long L(long j5, long j6) {
        return l(j5 + j6);
    }

    @kotlin.internal.f
    private static final long M(long j5, int i5) {
        return l(j5 + l(i5 & 4294967295L));
    }

    @kotlin.internal.f
    private static final long N(long j5, short s5) {
        return l(j5 + l(s5 & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    @kotlin.internal.f
    private static final kotlin.ranges.a0 O(long j5, long j6) {
        return new kotlin.ranges.a0(j5, j6, null);
    }

    @g1(version = "1.9")
    @kotlin.internal.f
    @v2(markerClass = {r.class})
    private static final kotlin.ranges.a0 P(long j5, long j6) {
        return kotlin.ranges.b0.X(j5, j6);
    }

    @kotlin.internal.f
    private static final long Q(long j5, byte b5) {
        return w1.a(j5, l(b5 & 255));
    }

    @kotlin.internal.f
    private static final long R(long j5, long j6) {
        return u2.i(j5, j6);
    }

    @kotlin.internal.f
    private static final long S(long j5, int i5) {
        return w1.a(j5, l(i5 & 4294967295L));
    }

    @kotlin.internal.f
    private static final long T(long j5, short s5) {
        return w1.a(j5, l(s5 & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    @kotlin.internal.f
    private static final long U(long j5, int i5) {
        return l(j5 << i5);
    }

    @kotlin.internal.f
    private static final long V(long j5, int i5) {
        return l(j5 >>> i5);
    }

    @kotlin.internal.f
    private static final long W(long j5, byte b5) {
        return l(j5 * l(b5 & 255));
    }

    @kotlin.internal.f
    private static final long X(long j5, long j6) {
        return l(j5 * j6);
    }

    @kotlin.internal.f
    private static final long Y(long j5, int i5) {
        return l(j5 * l(i5 & 4294967295L));
    }

    @kotlin.internal.f
    private static final long Z(long j5, short s5) {
        return l(j5 * l(s5 & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    @kotlin.internal.f
    private static final byte a0(long j5) {
        return (byte) j5;
    }

    @kotlin.internal.f
    private static final double b0(long j5) {
        return u2.j(j5);
    }

    @kotlin.internal.f
    private static final long c(long j5, long j6) {
        return l(j5 & j6);
    }

    @kotlin.internal.f
    private static final float c0(long j5) {
        return (float) u2.j(j5);
    }

    @kotlin.internal.f
    private static final int d0(long j5) {
        return (int) j5;
    }

    public static final /* synthetic */ g2 e(long j5) {
        return new g2(j5);
    }

    @kotlin.internal.f
    private static final long e0(long j5) {
        return j5;
    }

    @kotlin.internal.f
    private static final int f(long j5, byte b5) {
        int compare;
        compare = Long.compare(j5 ^ Long.MIN_VALUE, l(b5 & 255) ^ Long.MIN_VALUE);
        return compare;
    }

    @kotlin.internal.f
    private static final short f0(long j5) {
        return (short) j5;
    }

    @p4.l
    public static String g0(long j5) {
        return u2.k(j5);
    }

    @kotlin.internal.f
    private int h(long j5) {
        return u2.g(l0(), j5);
    }

    @kotlin.internal.f
    private static final byte h0(long j5) {
        return y1.l((byte) j5);
    }

    @kotlin.internal.f
    private static int i(long j5, long j6) {
        return u2.g(j5, j6);
    }

    @kotlin.internal.f
    private static final int i0(long j5) {
        return c2.l((int) j5);
    }

    @kotlin.internal.f
    private static final int j(long j5, int i5) {
        int compare;
        compare = Long.compare(j5 ^ Long.MIN_VALUE, l(i5 & 4294967295L) ^ Long.MIN_VALUE);
        return compare;
    }

    @kotlin.internal.f
    private static final long j0(long j5) {
        return j5;
    }

    @kotlin.internal.f
    private static final int k(long j5, short s5) {
        int compare;
        compare = Long.compare(j5 ^ Long.MIN_VALUE, l(s5 & WebSocketProtocol.PAYLOAD_SHORT_MAX) ^ Long.MIN_VALUE);
        return compare;
    }

    @kotlin.internal.f
    private static final short k0(long j5) {
        return m2.l((short) j5);
    }

    @kotlin.internal.g
    @a1
    public static long l(long j5) {
        return j5;
    }

    @kotlin.internal.f
    private static final long m(long j5) {
        return l(j5 - 1);
    }

    @kotlin.internal.f
    private static final long m0(long j5, long j6) {
        return l(j5 ^ j6);
    }

    @kotlin.internal.f
    private static final long n(long j5, byte b5) {
        return x1.a(j5, l(b5 & 255));
    }

    @kotlin.internal.f
    private static final long o(long j5, long j6) {
        return u2.h(j5, j6);
    }

    @kotlin.internal.f
    private static final long p(long j5, int i5) {
        return x1.a(j5, l(i5 & 4294967295L));
    }

    @kotlin.internal.f
    private static final long q(long j5, short s5) {
        return x1.a(j5, l(s5 & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    public static boolean r(long j5, Object obj) {
        return (obj instanceof g2) && j5 == ((g2) obj).l0();
    }

    public static final boolean s(long j5, long j6) {
        return j5 == j6;
    }

    @kotlin.internal.f
    private static final long t(long j5, byte b5) {
        return x1.a(j5, l(b5 & 255));
    }

    @kotlin.internal.f
    private static final long u(long j5, long j6) {
        return x1.a(j5, j6);
    }

    @kotlin.internal.f
    private static final long v(long j5, int i5) {
        return x1.a(j5, l(i5 & 4294967295L));
    }

    @kotlin.internal.f
    private static final long w(long j5, short s5) {
        return x1.a(j5, l(s5 & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    @a1
    public static /* synthetic */ void x() {
    }

    public static int y(long j5) {
        return Long.hashCode(j5);
    }

    @kotlin.internal.f
    private static final long z(long j5) {
        return l(j5 + 1);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(g2 g2Var) {
        return u2.g(l0(), g2Var.l0());
    }

    public boolean equals(Object obj) {
        return r(this.f19252a, obj);
    }

    public int hashCode() {
        return y(this.f19252a);
    }

    public final /* synthetic */ long l0() {
        return this.f19252a;
    }

    @p4.l
    public String toString() {
        return g0(this.f19252a);
    }
}
