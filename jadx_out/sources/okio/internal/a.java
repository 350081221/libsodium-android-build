package okio.internal;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.compose.animation.core.AnimationKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.android.dx.io.Opcodes;
import com.umeng.analytics.pro.bi;
import com.umeng.analytics.pro.cx;
import java.io.EOFException;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.r1;
import kotlin.text.k0;
import kotlin.y1;
import okhttp3.internal.connection.RealConnection;
import okio.b1;
import okio.i1;
import okio.j1;
import okio.k1;
import okio.l;
import okio.l1;
import okio.n;
import okio.n1;
import okio.q1;
import okio.s1;
import v3.p;

@i0(d1 = {"\u0000\u0080\u0001\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a0\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\nH\u0000\u001a\r\u0010\u0013\u001a\u00020\u0014*\u00020\u0015H\u0080\b\u001a\r\u0010\u0016\u001a\u00020\u0014*\u00020\u0017H\u0080\b\u001a\r\u0010\u0018\u001a\u00020\u0007*\u00020\u0015H\u0080\b\u001a\r\u0010\u0019\u001a\u00020\u0015*\u00020\u0015H\u0080\b\u001a%\u0010\u001a\u001a\u00020\u0015*\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0007H\u0080\b\u001a\u0017\u0010\u001e\u001a\u00020\f*\u00020\u00152\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0080\b\u001a\u0015\u0010!\u001a\u00020\u0007*\u00020\u00172\u0006\u0010\"\u001a\u00020\nH\u0080\b\u001a\u0015\u0010#\u001a\u00020$*\u00020\u00152\u0006\u0010%\u001a\u00020\u0007H\u0080\b\u001a\r\u0010&\u001a\u00020\n*\u00020\u0015H\u0080\b\u001a%\u0010'\u001a\u00020\u0007*\u00020\u00152\u0006\u0010(\u001a\u00020$2\u0006\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u0007H\u0080\b\u001a\u001d\u0010'\u001a\u00020\u0007*\u00020\u00152\u0006\u0010\u0010\u001a\u00020+2\u0006\u0010)\u001a\u00020\u0007H\u0080\b\u001a\u001d\u0010,\u001a\u00020\u0007*\u00020\u00152\u0006\u0010-\u001a\u00020+2\u0006\u0010)\u001a\u00020\u0007H\u0080\b\u001a\r\u0010.\u001a\u00020\n*\u00020\u0017H\u0080\b\u001a-\u0010/\u001a\u00020\f*\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020+2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\nH\u0080\b\u001a\u0015\u00100\u001a\u00020\n*\u00020\u00152\u0006\u00101\u001a\u00020\u0001H\u0080\b\u001a%\u00100\u001a\u00020\n*\u00020\u00152\u0006\u00101\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\nH\u0080\b\u001a\u001d\u00100\u001a\u00020\u0007*\u00020\u00152\u0006\u00101\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0007H\u0080\b\u001a\u0015\u00102\u001a\u00020\u0007*\u00020\u00152\u0006\u00101\u001a\u000203H\u0080\b\u001a\u0014\u00104\u001a\u00020\u0017*\u00020\u00152\u0006\u00105\u001a\u00020\u0017H\u0000\u001a\r\u00106\u001a\u00020$*\u00020\u0015H\u0080\b\u001a\r\u00107\u001a\u00020\u0001*\u00020\u0015H\u0080\b\u001a\u0015\u00107\u001a\u00020\u0001*\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0007H\u0080\b\u001a\r\u00108\u001a\u00020+*\u00020\u0015H\u0080\b\u001a\u0015\u00108\u001a\u00020+*\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0007H\u0080\b\u001a\r\u00109\u001a\u00020\u0007*\u00020\u0015H\u0080\b\u001a\u0015\u0010:\u001a\u00020\u0014*\u00020\u00152\u0006\u00101\u001a\u00020\u0001H\u0080\b\u001a\u001d\u0010:\u001a\u00020\u0014*\u00020\u00152\u0006\u00101\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0007H\u0080\b\u001a\r\u0010;\u001a\u00020\u0007*\u00020\u0015H\u0080\b\u001a\r\u0010<\u001a\u00020\n*\u00020\u0015H\u0080\b\u001a\r\u0010=\u001a\u00020\u0007*\u00020\u0015H\u0080\b\u001a\r\u0010>\u001a\u00020?*\u00020\u0015H\u0080\b\u001a\u0014\u0010@\u001a\u00020\u0017*\u00020\u00152\u0006\u00105\u001a\u00020\u0017H\u0000\u001a\u0015\u0010A\u001a\u00020B*\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0007H\u0080\b\u001a\r\u0010C\u001a\u00020\n*\u00020\u0015H\u0080\b\u001a\u000f\u0010D\u001a\u0004\u0018\u00010B*\u00020\u0015H\u0080\b\u001a\u0015\u0010E\u001a\u00020B*\u00020\u00152\u0006\u0010F\u001a\u00020\u0007H\u0080\b\u001a\u0015\u0010G\u001a\u00020\u0007*\u00020\u00172\u0006\u0010H\u001a\u00020\u0007H\u0080\b\u001a\u0015\u0010I\u001a\u00020\n*\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u0007H\u0080\b\u001a\u0015\u0010J\u001a\u00020\n*\u00020\u00152\u0006\u0010K\u001a\u00020LH\u0080\b\u001a\u0015\u0010M\u001a\u00020\u0014*\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0007H\u0080\b\u001a\r\u0010N\u001a\u00020+*\u00020\u0015H\u0080\b\u001a\u0015\u0010N\u001a\u00020+*\u00020\u00152\u0006\u0010\u001d\u001a\u00020\nH\u0080\b\u001a\u0015\u0010O\u001a\u00020\u000e*\u00020\u00152\u0006\u0010P\u001a\u00020\nH\u0080\b\u001a\u0015\u0010Q\u001a\u00020\u0015*\u00020\u00152\u0006\u0010R\u001a\u00020\u0001H\u0080\b\u001a%\u0010Q\u001a\u00020\u0015*\u00020\u00152\u0006\u0010R\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\nH\u0080\b\u001a\u001d\u0010Q\u001a\u00020\u0014*\u00020\u00152\u0006\u0010R\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0007H\u0080\b\u001a)\u0010Q\u001a\u00020\u0015*\u00020\u00152\u0006\u0010S\u001a\u00020+2\b\b\u0002\u0010\u001c\u001a\u00020\n2\b\b\u0002\u0010\u001d\u001a\u00020\nH\u0080\b\u001a\u001d\u0010Q\u001a\u00020\u0015*\u00020\u00152\u0006\u0010R\u001a\u00020T2\u0006\u0010\u001d\u001a\u00020\u0007H\u0080\b\u001a\u0015\u0010U\u001a\u00020\u0007*\u00020\u00152\u0006\u0010R\u001a\u00020TH\u0080\b\u001a\u0015\u0010V\u001a\u00020\u0015*\u00020\u00152\u0006\u0010(\u001a\u00020\nH\u0080\b\u001a\u0015\u0010W\u001a\u00020\u0015*\u00020\u00152\u0006\u0010X\u001a\u00020\u0007H\u0080\b\u001a\u0015\u0010Y\u001a\u00020\u0015*\u00020\u00152\u0006\u0010X\u001a\u00020\u0007H\u0080\b\u001a\u0015\u0010Z\u001a\u00020\u0015*\u00020\u00152\u0006\u0010[\u001a\u00020\nH\u0080\b\u001a\u0015\u0010\\\u001a\u00020\u0015*\u00020\u00152\u0006\u0010X\u001a\u00020\u0007H\u0080\b\u001a\u0015\u0010]\u001a\u00020\u0015*\u00020\u00152\u0006\u0010^\u001a\u00020\nH\u0080\b\u001a%\u0010_\u001a\u00020\u0015*\u00020\u00152\u0006\u0010`\u001a\u00020B2\u0006\u0010a\u001a\u00020\n2\u0006\u0010b\u001a\u00020\nH\u0080\b\u001a\u0015\u0010c\u001a\u00020\u0015*\u00020\u00152\u0006\u0010d\u001a\u00020\nH\u0080\b\u001a\u0014\u0010e\u001a\u00020B*\u00020\u00152\u0006\u0010f\u001a\u00020\u0007H\u0000\u001a?\u0010g\u001a\u0002Hh\"\u0004\b\u0000\u0010h*\u00020\u00152\u0006\u0010)\u001a\u00020\u00072\u001a\u0010i\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002Hh0jH\u0080\bø\u0001\u0000¢\u0006\u0002\u0010k\u001a\u001e\u0010l\u001a\u00020\n*\u00020\u00152\u0006\u0010K\u001a\u00020L2\b\b\u0002\u0010m\u001a\u00020\fH\u0000\"\u001c\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\nX\u0080T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006n"}, d2 = {"HEX_DIGIT_BYTES", "", "getHEX_DIGIT_BYTES$annotations", "()V", "getHEX_DIGIT_BYTES", "()[B", "OVERFLOW_DIGIT_START", "", "OVERFLOW_ZONE", "SEGMENTING_THRESHOLD", "", "rangeEquals", "", "segment", "Lokio/Segment;", "segmentPos", "bytes", "bytesOffset", "bytesLimit", "commonClear", "", "Lokio/Buffer;", "commonClose", "Lokio/Buffer$UnsafeCursor;", "commonCompleteSegmentByteCount", "commonCopy", "commonCopyTo", "out", TypedValues.CycleType.S_WAVE_OFFSET, "byteCount", "commonEquals", "other", "", "commonExpandBuffer", "minByteCount", "commonGet", "", "pos", "commonHashCode", "commonIndexOf", "b", "fromIndex", "toIndex", "Lokio/ByteString;", "commonIndexOfElement", "targetBytes", "commonNext", "commonRangeEquals", "commonRead", "sink", "commonReadAll", "Lokio/Sink;", "commonReadAndWriteUnsafe", "unsafeCursor", "commonReadByte", "commonReadByteArray", "commonReadByteString", "commonReadDecimalLong", "commonReadFully", "commonReadHexadecimalUnsignedLong", "commonReadInt", "commonReadLong", "commonReadShort", "", "commonReadUnsafe", "commonReadUtf8", "", "commonReadUtf8CodePoint", "commonReadUtf8Line", "commonReadUtf8LineStrict", "limit", "commonResizeBuffer", "newSize", "commonSeek", "commonSelect", "options", "Lokio/Options;", "commonSkip", "commonSnapshot", "commonWritableSegment", "minimumCapacity", "commonWrite", "source", "byteString", "Lokio/Source;", "commonWriteAll", "commonWriteByte", "commonWriteDecimalLong", "v", "commonWriteHexadecimalUnsignedLong", "commonWriteInt", "i", "commonWriteLong", "commonWriteShort", bi.aE, "commonWriteUtf8", TypedValues.Custom.S_STRING, "beginIndex", "endIndex", "commonWriteUtf8CodePoint", "codePoint", "readUtf8Line", "newline", "seek", "T", "lambda", "Lkotlin/Function2;", "(Lokio/Buffer;JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "selectPrefix", "selectTruncated", "okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
@u3.h(name = "-Buffer")
@r1({"SMAP\nBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Buffer.kt\nokio/internal/-Buffer\n+ 2 Util.kt\nokio/-SegmentedByteString\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1730:1\n112#1,20:1753\n112#1,20:1786\n112#1:1806\n114#1,18:1808\n112#1,20:1826\n74#2:1731\n74#2:1732\n74#2:1733\n74#2:1734\n74#2:1735\n74#2:1736\n74#2:1737\n74#2:1738\n74#2:1739\n74#2:1740\n74#2:1741\n74#2:1742\n83#2:1743\n83#2:1744\n77#2:1745\n77#2:1746\n77#2:1747\n77#2:1748\n77#2:1749\n77#2:1750\n77#2:1751\n77#2:1752\n86#2:1773\n89#2:1775\n74#2:1776\n74#2:1777\n74#2:1778\n74#2:1779\n74#2:1780\n74#2:1781\n74#2:1782\n74#2:1783\n74#2:1784\n74#2:1785\n89#2:1807\n86#2:1846\n1#3:1774\n*S KotlinDebug\n*F\n+ 1 Buffer.kt\nokio/internal/-Buffer\n*L\n415#1:1753,20\n1292#1:1786,20\n1323#1:1806\n1323#1:1808,18\n1357#1:1826,20\n178#1:1731\n202#1:1732\n321#1:1733\n326#1:1734\n349#1:1735\n350#1:1736\n351#1:1737\n352#1:1738\n358#1:1739\n359#1:1740\n360#1:1741\n361#1:1742\n385#1:1743\n386#1:1744\n392#1:1745\n393#1:1746\n394#1:1747\n395#1:1748\n396#1:1749\n397#1:1750\n398#1:1751\n399#1:1752\n427#1:1773\n888#1:1775\n906#1:1776\n908#1:1777\n912#1:1778\n914#1:1779\n918#1:1780\n920#1:1781\n924#1:1782\n926#1:1783\n946#1:1784\n949#1:1785\n1336#1:1807\n1676#1:1846\n*E\n"})
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a */
    @p4.l
    private static final byte[] f20935a = s1.a("0123456789abcdef");

    /* renamed from: b */
    public static final int f20936b = 4096;

    /* renamed from: c */
    public static final long f20937c = -922337203685477580L;

    /* renamed from: d */
    public static final long f20938d = -7;

    public static final void A(@p4.l okio.l lVar, @p4.l byte[] sink) {
        l0.p(lVar, "<this>");
        l0.p(sink, "sink");
        int i5 = 0;
        while (i5 < sink.length) {
            int read = lVar.read(sink, i5, sink.length - i5);
            if (read != -1) {
                i5 += read;
            } else {
                throw new EOFException();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00af A[EDGE_INSN: B:41:0x00af->B:38:0x00af BREAK  A[LOOP:0: B:4:0x0012->B:40:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long B(@p4.l okio.l r14) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.l0.p(r14, r0)
            long r0 = r14.M0()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb9
            r0 = 0
            r1 = r0
            r4 = r2
        L12:
            okio.i1 r6 = r14.f20987a
            kotlin.jvm.internal.l0.m(r6)
            byte[] r7 = r6.f20928a
            int r8 = r6.f20929b
            int r9 = r6.f20930c
        L1d:
            if (r8 >= r9) goto L9b
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L2c
            r11 = 57
            if (r10 > r11) goto L2c
            int r11 = r10 + (-48)
            goto L44
        L2c:
            r11 = 97
            if (r10 < r11) goto L39
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L39
            int r11 = r10 + (-97)
        L36:
            int r11 = r11 + 10
            goto L44
        L39:
            r11 = 65
            if (r10 < r11) goto L7c
            r11 = 70
            if (r10 > r11) goto L7c
            int r11 = r10 + (-65)
            goto L36
        L44:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L54
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L1d
        L54:
            okio.l r14 = new okio.l
            r14.<init>()
            okio.l r14 = r14.l0(r4)
            okio.l r14 = r14.writeByte(r10)
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Number too large: "
            r1.append(r2)
            java.lang.String r14 = r14.s0()
            r1.append(r14)
            java.lang.String r14 = r1.toString()
            r0.<init>(r14)
            throw r0
        L7c:
            if (r0 == 0) goto L80
            r1 = 1
            goto L9b
        L80:
            java.lang.NumberFormatException r14 = new java.lang.NumberFormatException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            r0.append(r1)
            java.lang.String r1 = okio.i.u(r10)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r14.<init>(r0)
            throw r14
        L9b:
            if (r8 != r9) goto La7
            okio.i1 r7 = r6.b()
            r14.f20987a = r7
            okio.j1.d(r6)
            goto La9
        La7:
            r6.f20929b = r8
        La9:
            if (r1 != 0) goto Laf
            okio.i1 r6 = r14.f20987a
            if (r6 != 0) goto L12
        Laf:
            long r1 = r14.M0()
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.I0(r1)
            return r4
        Lb9:
            java.io.EOFException r14 = new java.io.EOFException
            r14.<init>()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.a.B(okio.l):long");
    }

    public static final int C(@p4.l okio.l lVar) {
        l0.p(lVar, "<this>");
        if (lVar.M0() >= 4) {
            i1 i1Var = lVar.f20987a;
            l0.m(i1Var);
            int i5 = i1Var.f20929b;
            int i6 = i1Var.f20930c;
            if (i6 - i5 < 4) {
                return (lVar.readByte() & y1.f19838d) | ((lVar.readByte() & y1.f19838d) << 24) | ((lVar.readByte() & y1.f19838d) << 16) | ((lVar.readByte() & y1.f19838d) << 8);
            }
            byte[] bArr = i1Var.f20928a;
            int i7 = i5 + 1;
            int i8 = i7 + 1;
            int i9 = ((bArr[i5] & y1.f19838d) << 24) | ((bArr[i7] & y1.f19838d) << 16);
            int i10 = i8 + 1;
            int i11 = i9 | ((bArr[i8] & y1.f19838d) << 8);
            int i12 = i10 + 1;
            int i13 = i11 | (bArr[i10] & y1.f19838d);
            lVar.I0(lVar.M0() - 4);
            if (i12 == i6) {
                lVar.f20987a = i1Var.b();
                j1.d(i1Var);
            } else {
                i1Var.f20929b = i12;
            }
            return i13;
        }
        throw new EOFException();
    }

    public static final long D(@p4.l okio.l lVar) {
        l0.p(lVar, "<this>");
        if (lVar.M0() >= 8) {
            i1 i1Var = lVar.f20987a;
            l0.m(i1Var);
            int i5 = i1Var.f20929b;
            int i6 = i1Var.f20930c;
            if (i6 - i5 < 8) {
                return ((lVar.readInt() & 4294967295L) << 32) | (4294967295L & lVar.readInt());
            }
            byte[] bArr = i1Var.f20928a;
            long j5 = (bArr[i5] & 255) << 56;
            int i7 = i5 + 1 + 1 + 1;
            long j6 = j5 | ((bArr[r7] & 255) << 48) | ((bArr[r1] & 255) << 40);
            long j7 = j6 | ((bArr[i7] & 255) << 32) | ((bArr[r1] & 255) << 24);
            long j8 = j7 | ((bArr[r8] & 255) << 16);
            long j9 = j8 | ((bArr[r1] & 255) << 8);
            int i8 = i7 + 1 + 1 + 1 + 1 + 1;
            long j10 = j9 | (bArr[r8] & 255);
            lVar.I0(lVar.M0() - 8);
            if (i8 == i6) {
                lVar.f20987a = i1Var.b();
                j1.d(i1Var);
            } else {
                i1Var.f20929b = i8;
            }
            return j10;
        }
        throw new EOFException();
    }

    public static final short E(@p4.l okio.l lVar) {
        l0.p(lVar, "<this>");
        if (lVar.M0() >= 2) {
            i1 i1Var = lVar.f20987a;
            l0.m(i1Var);
            int i5 = i1Var.f20929b;
            int i6 = i1Var.f20930c;
            if (i6 - i5 < 2) {
                return (short) ((lVar.readByte() & y1.f19838d) | ((lVar.readByte() & y1.f19838d) << 8));
            }
            byte[] bArr = i1Var.f20928a;
            int i7 = i5 + 1;
            int i8 = i7 + 1;
            int i9 = ((bArr[i5] & y1.f19838d) << 8) | (bArr[i7] & y1.f19838d);
            lVar.I0(lVar.M0() - 2);
            if (i8 == i6) {
                lVar.f20987a = i1Var.b();
                j1.d(i1Var);
            } else {
                i1Var.f20929b = i8;
            }
            return (short) i9;
        }
        throw new EOFException();
    }

    @p4.l
    public static final l.a F(@p4.l okio.l lVar, @p4.l l.a unsafeCursor) {
        boolean z4;
        l0.p(lVar, "<this>");
        l0.p(unsafeCursor, "unsafeCursor");
        l.a n5 = okio.i.n(unsafeCursor);
        if (n5.f20989a == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            n5.f20989a = lVar;
            n5.f20990b = false;
            return n5;
        }
        throw new IllegalStateException("already attached to a buffer".toString());
    }

    @p4.l
    public static final String G(@p4.l okio.l lVar, long j5) {
        boolean z4;
        l0.p(lVar, "<this>");
        if (j5 >= 0 && j5 <= 2147483647L) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (lVar.M0() >= j5) {
                if (j5 == 0) {
                    return "";
                }
                i1 i1Var = lVar.f20987a;
                l0.m(i1Var);
                int i5 = i1Var.f20929b;
                if (i5 + j5 > i1Var.f20930c) {
                    return m.c(lVar.N(j5), 0, 0, 3, null);
                }
                int i6 = (int) j5;
                String b5 = m.b(i1Var.f20928a, i5, i5 + i6);
                i1Var.f20929b += i6;
                lVar.I0(lVar.M0() - j5);
                if (i1Var.f20929b == i1Var.f20930c) {
                    lVar.f20987a = i1Var.b();
                    j1.d(i1Var);
                }
                return b5;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(("byteCount: " + j5).toString());
    }

    public static final int H(@p4.l okio.l lVar) {
        int i5;
        int i6;
        int i7;
        l0.p(lVar, "<this>");
        if (lVar.M0() != 0) {
            byte P = lVar.P(0L);
            boolean z4 = false;
            if ((P & o.f19427b) == 0) {
                i5 = P & o.f19428c;
                i7 = 0;
                i6 = 1;
            } else if ((P & 224) == 192) {
                i5 = P & 31;
                i6 = 2;
                i7 = 128;
            } else if ((P & 240) == 224) {
                i5 = P & cx.f12477m;
                i6 = 3;
                i7 = 2048;
            } else if ((P & 248) == 240) {
                i5 = P & 7;
                i6 = 4;
                i7 = 65536;
            } else {
                lVar.skip(1L);
                return q1.f21023c;
            }
            long j5 = i6;
            if (lVar.M0() >= j5) {
                for (int i8 = 1; i8 < i6; i8++) {
                    long j6 = i8;
                    byte P2 = lVar.P(j6);
                    if ((P2 & 192) == 128) {
                        i5 = (i5 << 6) | (P2 & q1.f21021a);
                    } else {
                        lVar.skip(j6);
                        return q1.f21023c;
                    }
                }
                lVar.skip(j5);
                if (i5 > 1114111) {
                    return q1.f21023c;
                }
                if (55296 <= i5 && i5 < 57344) {
                    z4 = true;
                }
                if (z4 || i5 < i7) {
                    return q1.f21023c;
                }
                return i5;
            }
            throw new EOFException("size < " + i6 + ": " + lVar.M0() + " (to read code point prefixed 0x" + okio.i.u(P) + ')');
        }
        throw new EOFException();
    }

    @p4.m
    public static final String I(@p4.l okio.l lVar) {
        l0.p(lVar, "<this>");
        long W = lVar.W((byte) 10);
        if (W != -1) {
            return j0(lVar, W);
        }
        if (lVar.M0() != 0) {
            return lVar.X(lVar.M0());
        }
        return null;
    }

    @p4.l
    public static final String J(@p4.l okio.l lVar, long j5) {
        boolean z4;
        l0.p(lVar, "<this>");
        if (j5 >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            long j6 = Long.MAX_VALUE;
            if (j5 != Long.MAX_VALUE) {
                j6 = j5 + 1;
            }
            long u4 = lVar.u((byte) 10, 0L, j6);
            if (u4 != -1) {
                return j0(lVar, u4);
            }
            if (j6 < lVar.M0() && lVar.P(j6 - 1) == 13 && lVar.P(j6) == 10) {
                return j0(lVar, j6);
            }
            okio.l lVar2 = new okio.l();
            lVar.y(lVar2, 0L, Math.min(32, lVar.M0()));
            throw new EOFException("\\n not found: limit=" + Math.min(lVar.M0(), j5) + " content=" + lVar2.m0().hex() + k0.F);
        }
        throw new IllegalArgumentException(("limit < 0: " + j5).toString());
    }

    public static final long K(@p4.l l.a aVar, long j5) {
        boolean z4;
        l0.p(aVar, "<this>");
        okio.l lVar = aVar.f20989a;
        if (lVar != null) {
            if (aVar.f20990b) {
                long M0 = lVar.M0();
                int i5 = 1;
                if (j5 <= M0) {
                    if (j5 >= 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        long j6 = M0 - j5;
                        while (true) {
                            if (j6 <= 0) {
                                break;
                            }
                            i1 i1Var = lVar.f20987a;
                            l0.m(i1Var);
                            i1 i1Var2 = i1Var.f20934g;
                            l0.m(i1Var2);
                            int i6 = i1Var2.f20930c;
                            long j7 = i6 - i1Var2.f20929b;
                            if (j7 <= j6) {
                                lVar.f20987a = i1Var2.b();
                                j1.d(i1Var2);
                                j6 -= j7;
                            } else {
                                i1Var2.f20930c = i6 - ((int) j6);
                                break;
                            }
                        }
                        aVar.j(null);
                        aVar.f20992d = j5;
                        aVar.f20993e = null;
                        aVar.f20994f = -1;
                        aVar.f20995g = -1;
                    } else {
                        throw new IllegalArgumentException(("newSize < 0: " + j5).toString());
                    }
                } else if (j5 > M0) {
                    long j8 = j5 - M0;
                    boolean z5 = true;
                    while (j8 > 0) {
                        i1 P0 = lVar.P0(i5);
                        int min = (int) Math.min(j8, 8192 - P0.f20930c);
                        P0.f20930c += min;
                        j8 -= min;
                        if (z5) {
                            aVar.j(P0);
                            aVar.f20992d = M0;
                            aVar.f20993e = P0.f20928a;
                            int i7 = P0.f20930c;
                            aVar.f20994f = i7 - min;
                            aVar.f20995g = i7;
                            z5 = false;
                        }
                        i5 = 1;
                    }
                }
                lVar.I0(j5);
                return M0;
            }
            throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers".toString());
        }
        throw new IllegalStateException("not attached to a buffer".toString());
    }

    public static final int L(@p4.l l.a aVar, long j5) {
        i1 i1Var;
        l0.p(aVar, "<this>");
        okio.l lVar = aVar.f20989a;
        if (lVar != null) {
            if (j5 >= -1 && j5 <= lVar.M0()) {
                if (j5 != -1 && j5 != lVar.M0()) {
                    long M0 = lVar.M0();
                    i1 i1Var2 = lVar.f20987a;
                    long j6 = 0;
                    if (aVar.b() != null) {
                        long j7 = aVar.f20992d;
                        int i5 = aVar.f20994f;
                        l0.m(aVar.b());
                        long j8 = j7 - (i5 - r9.f20929b);
                        if (j8 > j5) {
                            i1Var = i1Var2;
                            i1Var2 = aVar.b();
                            M0 = j8;
                        } else {
                            i1Var = aVar.b();
                            j6 = j8;
                        }
                    } else {
                        i1Var = i1Var2;
                    }
                    if (M0 - j5 > j5 - j6) {
                        while (true) {
                            l0.m(i1Var);
                            int i6 = i1Var.f20930c;
                            int i7 = i1Var.f20929b;
                            if (j5 < (i6 - i7) + j6) {
                                break;
                            }
                            j6 += i6 - i7;
                            i1Var = i1Var.f20933f;
                        }
                    } else {
                        while (M0 > j5) {
                            l0.m(i1Var2);
                            i1Var2 = i1Var2.f20934g;
                            l0.m(i1Var2);
                            M0 -= i1Var2.f20930c - i1Var2.f20929b;
                        }
                        j6 = M0;
                        i1Var = i1Var2;
                    }
                    if (aVar.f20990b) {
                        l0.m(i1Var);
                        if (i1Var.f20931d) {
                            i1 f5 = i1Var.f();
                            if (lVar.f20987a == i1Var) {
                                lVar.f20987a = f5;
                            }
                            i1Var = i1Var.c(f5);
                            i1 i1Var3 = i1Var.f20934g;
                            l0.m(i1Var3);
                            i1Var3.b();
                        }
                    }
                    aVar.j(i1Var);
                    aVar.f20992d = j5;
                    l0.m(i1Var);
                    aVar.f20993e = i1Var.f20928a;
                    int i8 = i1Var.f20929b + ((int) (j5 - j6));
                    aVar.f20994f = i8;
                    int i9 = i1Var.f20930c;
                    aVar.f20995g = i9;
                    return i9 - i8;
                }
                aVar.j(null);
                aVar.f20992d = j5;
                aVar.f20993e = null;
                aVar.f20994f = -1;
                aVar.f20995g = -1;
                return -1;
            }
            throw new ArrayIndexOutOfBoundsException("offset=" + j5 + " > size=" + lVar.M0());
        }
        throw new IllegalStateException("not attached to a buffer".toString());
    }

    public static final int M(@p4.l okio.l lVar, @p4.l b1 options) {
        l0.p(lVar, "<this>");
        l0.p(options, "options");
        int m02 = m0(lVar, options, false, 2, null);
        if (m02 == -1) {
            return -1;
        }
        lVar.skip(options.e()[m02].size());
        return m02;
    }

    public static final void N(@p4.l okio.l lVar, long j5) {
        l0.p(lVar, "<this>");
        while (j5 > 0) {
            i1 i1Var = lVar.f20987a;
            if (i1Var != null) {
                int min = (int) Math.min(j5, i1Var.f20930c - i1Var.f20929b);
                long j6 = min;
                lVar.I0(lVar.M0() - j6);
                j5 -= j6;
                int i5 = i1Var.f20929b + min;
                i1Var.f20929b = i5;
                if (i5 == i1Var.f20930c) {
                    lVar.f20987a = i1Var.b();
                    j1.d(i1Var);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    @p4.l
    public static final n O(@p4.l okio.l lVar) {
        boolean z4;
        l0.p(lVar, "<this>");
        if (lVar.M0() <= 2147483647L) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return lVar.O0((int) lVar.M0());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + lVar.M0()).toString());
    }

    @p4.l
    public static final n P(@p4.l okio.l lVar, int i5) {
        l0.p(lVar, "<this>");
        if (i5 == 0) {
            return n.EMPTY;
        }
        okio.i.e(lVar.M0(), 0L, i5);
        i1 i1Var = lVar.f20987a;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i7 < i5) {
            l0.m(i1Var);
            int i9 = i1Var.f20930c;
            int i10 = i1Var.f20929b;
            if (i9 != i10) {
                i7 += i9 - i10;
                i8++;
                i1Var = i1Var.f20933f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i8];
        int[] iArr = new int[i8 * 2];
        i1 i1Var2 = lVar.f20987a;
        int i11 = 0;
        while (i6 < i5) {
            l0.m(i1Var2);
            bArr[i11] = i1Var2.f20928a;
            i6 += i1Var2.f20930c - i1Var2.f20929b;
            iArr[i11] = Math.min(i6, i5);
            iArr[i11 + i8] = i1Var2.f20929b;
            i1Var2.f20931d = true;
            i11++;
            i1Var2 = i1Var2.f20933f;
        }
        return new k1(bArr, iArr);
    }

    @p4.l
    public static final i1 Q(@p4.l okio.l lVar, int i5) {
        l0.p(lVar, "<this>");
        boolean z4 = true;
        if (i5 < 1 || i5 > 8192) {
            z4 = false;
        }
        if (z4) {
            i1 i1Var = lVar.f20987a;
            if (i1Var == null) {
                i1 e5 = j1.e();
                lVar.f20987a = e5;
                e5.f20934g = e5;
                e5.f20933f = e5;
                return e5;
            }
            l0.m(i1Var);
            i1 i1Var2 = i1Var.f20934g;
            l0.m(i1Var2);
            if (i1Var2.f20930c + i5 > 8192 || !i1Var2.f20932e) {
                return i1Var2.c(j1.e());
            }
            return i1Var2;
        }
        throw new IllegalArgumentException("unexpected capacity".toString());
    }

    @p4.l
    public static final okio.l R(@p4.l okio.l lVar, @p4.l n byteString, int i5, int i6) {
        l0.p(lVar, "<this>");
        l0.p(byteString, "byteString");
        byteString.write$okio(lVar, i5, i6);
        return lVar;
    }

    @p4.l
    public static final okio.l S(@p4.l okio.l lVar, @p4.l n1 source, long j5) {
        l0.p(lVar, "<this>");
        l0.p(source, "source");
        while (j5 > 0) {
            long read = source.read(lVar, j5);
            if (read != -1) {
                j5 -= read;
            } else {
                throw new EOFException();
            }
        }
        return lVar;
    }

    @p4.l
    public static final okio.l T(@p4.l okio.l lVar, @p4.l byte[] source) {
        l0.p(lVar, "<this>");
        l0.p(source, "source");
        return lVar.write(source, 0, source.length);
    }

    @p4.l
    public static final okio.l U(@p4.l okio.l lVar, @p4.l byte[] source, int i5, int i6) {
        l0.p(lVar, "<this>");
        l0.p(source, "source");
        long j5 = i6;
        okio.i.e(source.length, i5, j5);
        int i7 = i6 + i5;
        while (i5 < i7) {
            i1 P0 = lVar.P0(1);
            int min = Math.min(i7 - i5, 8192 - P0.f20930c);
            int i8 = i5 + min;
            kotlin.collections.o.v0(source, P0.f20928a, P0.f20930c, i5, i8);
            P0.f20930c += min;
            i5 = i8;
        }
        lVar.I0(lVar.M0() + j5);
        return lVar;
    }

    public static final void V(@p4.l okio.l lVar, @p4.l okio.l source, long j5) {
        boolean z4;
        i1 i1Var;
        int i5;
        l0.p(lVar, "<this>");
        l0.p(source, "source");
        if (source != lVar) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            okio.i.e(source.M0(), 0L, j5);
            while (j5 > 0) {
                i1 i1Var2 = source.f20987a;
                l0.m(i1Var2);
                int i6 = i1Var2.f20930c;
                l0.m(source.f20987a);
                if (j5 < i6 - r2.f20929b) {
                    i1 i1Var3 = lVar.f20987a;
                    if (i1Var3 != null) {
                        l0.m(i1Var3);
                        i1Var = i1Var3.f20934g;
                    } else {
                        i1Var = null;
                    }
                    if (i1Var != null && i1Var.f20932e) {
                        long j6 = i1Var.f20930c + j5;
                        if (i1Var.f20931d) {
                            i5 = 0;
                        } else {
                            i5 = i1Var.f20929b;
                        }
                        if (j6 - i5 <= PlaybackStateCompat.ACTION_PLAY_FROM_URI) {
                            i1 i1Var4 = source.f20987a;
                            l0.m(i1Var4);
                            i1Var4.g(i1Var, (int) j5);
                            source.I0(source.M0() - j5);
                            lVar.I0(lVar.M0() + j5);
                            return;
                        }
                    }
                    i1 i1Var5 = source.f20987a;
                    l0.m(i1Var5);
                    source.f20987a = i1Var5.e((int) j5);
                }
                i1 i1Var6 = source.f20987a;
                l0.m(i1Var6);
                long j7 = i1Var6.f20930c - i1Var6.f20929b;
                source.f20987a = i1Var6.b();
                i1 i1Var7 = lVar.f20987a;
                if (i1Var7 == null) {
                    lVar.f20987a = i1Var6;
                    i1Var6.f20934g = i1Var6;
                    i1Var6.f20933f = i1Var6;
                } else {
                    l0.m(i1Var7);
                    i1 i1Var8 = i1Var7.f20934g;
                    l0.m(i1Var8);
                    i1Var8.c(i1Var6).a();
                }
                source.I0(source.M0() - j7);
                lVar.I0(lVar.M0() + j7);
                j5 -= j7;
            }
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }

    public static /* synthetic */ okio.l W(okio.l lVar, n byteString, int i5, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i5 = 0;
        }
        if ((i7 & 4) != 0) {
            i6 = byteString.size();
        }
        l0.p(lVar, "<this>");
        l0.p(byteString, "byteString");
        byteString.write$okio(lVar, i5, i6);
        return lVar;
    }

    public static final long X(@p4.l okio.l lVar, @p4.l n1 source) {
        l0.p(lVar, "<this>");
        l0.p(source, "source");
        long j5 = 0;
        while (true) {
            long read = source.read(lVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
            if (read != -1) {
                j5 += read;
            } else {
                return j5;
            }
        }
    }

    @p4.l
    public static final okio.l Y(@p4.l okio.l lVar, int i5) {
        l0.p(lVar, "<this>");
        i1 P0 = lVar.P0(1);
        byte[] bArr = P0.f20928a;
        int i6 = P0.f20930c;
        P0.f20930c = i6 + 1;
        bArr[i6] = (byte) i5;
        lVar.I0(lVar.M0() + 1);
        return lVar;
    }

    @p4.l
    public static final okio.l Z(@p4.l okio.l lVar, long j5) {
        boolean z4;
        l0.p(lVar, "<this>");
        if (j5 == 0) {
            return lVar.writeByte(48);
        }
        int i5 = 1;
        if (j5 < 0) {
            j5 = -j5;
            if (j5 < 0) {
                return lVar.C("-9223372036854775808");
            }
            z4 = true;
        } else {
            z4 = false;
        }
        if (j5 < 100000000) {
            if (j5 < 10000) {
                if (j5 < 100) {
                    if (j5 >= 10) {
                        i5 = 2;
                    }
                } else if (j5 < 1000) {
                    i5 = 3;
                } else {
                    i5 = 4;
                }
            } else if (j5 < AnimationKt.MillisToNanos) {
                if (j5 < 100000) {
                    i5 = 5;
                } else {
                    i5 = 6;
                }
            } else if (j5 < 10000000) {
                i5 = 7;
            } else {
                i5 = 8;
            }
        } else if (j5 < 1000000000000L) {
            if (j5 < RealConnection.IDLE_CONNECTION_HEALTHY_NS) {
                if (j5 < 1000000000) {
                    i5 = 9;
                } else {
                    i5 = 10;
                }
            } else if (j5 < 100000000000L) {
                i5 = 11;
            } else {
                i5 = 12;
            }
        } else if (j5 < 1000000000000000L) {
            if (j5 < 10000000000000L) {
                i5 = 13;
            } else if (j5 < 100000000000000L) {
                i5 = 14;
            } else {
                i5 = 15;
            }
        } else if (j5 < 100000000000000000L) {
            if (j5 < 10000000000000000L) {
                i5 = 16;
            } else {
                i5 = 17;
            }
        } else if (j5 < 1000000000000000000L) {
            i5 = 18;
        } else {
            i5 = 19;
        }
        if (z4) {
            i5++;
        }
        i1 P0 = lVar.P0(i5);
        byte[] bArr = P0.f20928a;
        int i6 = P0.f20930c + i5;
        while (j5 != 0) {
            long j6 = 10;
            i6--;
            bArr[i6] = g0()[(int) (j5 % j6)];
            j5 /= j6;
        }
        if (z4) {
            bArr[i6 - 1] = 45;
        }
        P0.f20930c += i5;
        lVar.I0(lVar.M0() + i5);
        return lVar;
    }

    public static final void a(@p4.l okio.l lVar) {
        l0.p(lVar, "<this>");
        lVar.skip(lVar.M0());
    }

    @p4.l
    public static final okio.l a0(@p4.l okio.l lVar, long j5) {
        l0.p(lVar, "<this>");
        if (j5 == 0) {
            return lVar.writeByte(48);
        }
        long j6 = (j5 >>> 1) | j5;
        long j7 = j6 | (j6 >>> 2);
        long j8 = j7 | (j7 >>> 4);
        long j9 = j8 | (j8 >>> 8);
        long j10 = j9 | (j9 >>> 16);
        long j11 = j10 | (j10 >>> 32);
        long j12 = j11 - ((j11 >>> 1) & 6148914691236517205L);
        long j13 = ((j12 >>> 2) & 3689348814741910323L) + (j12 & 3689348814741910323L);
        long j14 = ((j13 >>> 4) + j13) & 1085102592571150095L;
        long j15 = j14 + (j14 >>> 8);
        long j16 = j15 + (j15 >>> 16);
        int i5 = (int) ((((j16 & 63) + ((j16 >>> 32) & 63)) + 3) / 4);
        i1 P0 = lVar.P0(i5);
        byte[] bArr = P0.f20928a;
        int i6 = P0.f20930c;
        for (int i7 = (i6 + i5) - 1; i7 >= i6; i7--) {
            bArr[i7] = g0()[(int) (15 & j5)];
            j5 >>>= 4;
        }
        P0.f20930c += i5;
        lVar.I0(lVar.M0() + i5);
        return lVar;
    }

    public static final void b(@p4.l l.a aVar) {
        boolean z4;
        l0.p(aVar, "<this>");
        if (aVar.f20989a != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            aVar.f20989a = null;
            aVar.j(null);
            aVar.f20992d = -1L;
            aVar.f20993e = null;
            aVar.f20994f = -1;
            aVar.f20995g = -1;
            return;
        }
        throw new IllegalStateException("not attached to a buffer".toString());
    }

    @p4.l
    public static final okio.l b0(@p4.l okio.l lVar, int i5) {
        l0.p(lVar, "<this>");
        i1 P0 = lVar.P0(4);
        byte[] bArr = P0.f20928a;
        int i6 = P0.f20930c;
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((i5 >>> 24) & 255);
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((i5 >>> 16) & 255);
        int i9 = i8 + 1;
        bArr[i8] = (byte) ((i5 >>> 8) & 255);
        bArr[i9] = (byte) (i5 & 255);
        P0.f20930c = i9 + 1;
        lVar.I0(lVar.M0() + 4);
        return lVar;
    }

    public static final long c(@p4.l okio.l lVar) {
        l0.p(lVar, "<this>");
        long M0 = lVar.M0();
        if (M0 == 0) {
            return 0L;
        }
        i1 i1Var = lVar.f20987a;
        l0.m(i1Var);
        i1 i1Var2 = i1Var.f20934g;
        l0.m(i1Var2);
        if (i1Var2.f20930c < 8192 && i1Var2.f20932e) {
            return M0 - (r2 - i1Var2.f20929b);
        }
        return M0;
    }

    @p4.l
    public static final okio.l c0(@p4.l okio.l lVar, long j5) {
        l0.p(lVar, "<this>");
        i1 P0 = lVar.P0(8);
        byte[] bArr = P0.f20928a;
        int i5 = P0.f20930c;
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((j5 >>> 56) & 255);
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((j5 >>> 48) & 255);
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((j5 >>> 40) & 255);
        int i9 = i8 + 1;
        bArr[i8] = (byte) ((j5 >>> 32) & 255);
        int i10 = i9 + 1;
        bArr[i9] = (byte) ((j5 >>> 24) & 255);
        int i11 = i10 + 1;
        bArr[i10] = (byte) ((j5 >>> 16) & 255);
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((j5 >>> 8) & 255);
        bArr[i12] = (byte) (j5 & 255);
        P0.f20930c = i12 + 1;
        lVar.I0(lVar.M0() + 8);
        return lVar;
    }

    @p4.l
    public static final okio.l d(@p4.l okio.l lVar) {
        l0.p(lVar, "<this>");
        okio.l lVar2 = new okio.l();
        if (lVar.M0() == 0) {
            return lVar2;
        }
        i1 i1Var = lVar.f20987a;
        l0.m(i1Var);
        i1 d5 = i1Var.d();
        lVar2.f20987a = d5;
        d5.f20934g = d5;
        d5.f20933f = d5;
        for (i1 i1Var2 = i1Var.f20933f; i1Var2 != i1Var; i1Var2 = i1Var2.f20933f) {
            i1 i1Var3 = d5.f20934g;
            l0.m(i1Var3);
            l0.m(i1Var2);
            i1Var3.c(i1Var2.d());
        }
        lVar2.I0(lVar.M0());
        return lVar2;
    }

    @p4.l
    public static final okio.l d0(@p4.l okio.l lVar, int i5) {
        l0.p(lVar, "<this>");
        i1 P0 = lVar.P0(2);
        byte[] bArr = P0.f20928a;
        int i6 = P0.f20930c;
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((i5 >>> 8) & 255);
        bArr[i7] = (byte) (i5 & 255);
        P0.f20930c = i7 + 1;
        lVar.I0(lVar.M0() + 2);
        return lVar;
    }

    @p4.l
    public static final okio.l e(@p4.l okio.l lVar, @p4.l okio.l out, long j5, long j6) {
        l0.p(lVar, "<this>");
        l0.p(out, "out");
        okio.i.e(lVar.M0(), j5, j6);
        if (j6 == 0) {
            return lVar;
        }
        out.I0(out.M0() + j6);
        i1 i1Var = lVar.f20987a;
        while (true) {
            l0.m(i1Var);
            int i5 = i1Var.f20930c;
            int i6 = i1Var.f20929b;
            if (j5 < i5 - i6) {
                break;
            }
            j5 -= i5 - i6;
            i1Var = i1Var.f20933f;
        }
        while (j6 > 0) {
            l0.m(i1Var);
            i1 d5 = i1Var.d();
            int i7 = d5.f20929b + ((int) j5);
            d5.f20929b = i7;
            d5.f20930c = Math.min(i7 + ((int) j6), d5.f20930c);
            i1 i1Var2 = out.f20987a;
            if (i1Var2 == null) {
                d5.f20934g = d5;
                d5.f20933f = d5;
                out.f20987a = d5;
            } else {
                l0.m(i1Var2);
                i1 i1Var3 = i1Var2.f20934g;
                l0.m(i1Var3);
                i1Var3.c(d5);
            }
            j6 -= d5.f20930c - d5.f20929b;
            i1Var = i1Var.f20933f;
            j5 = 0;
        }
        return lVar;
    }

    @p4.l
    public static final okio.l e0(@p4.l okio.l lVar, @p4.l String string, int i5, int i6) {
        boolean z4;
        boolean z5;
        boolean z6;
        char charAt;
        char c5;
        boolean z7;
        l0.p(lVar, "<this>");
        l0.p(string, "string");
        if (i5 >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (i6 >= i5) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                if (i6 <= string.length()) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (z6) {
                    while (i5 < i6) {
                        char charAt2 = string.charAt(i5);
                        if (charAt2 < 128) {
                            i1 P0 = lVar.P0(1);
                            byte[] bArr = P0.f20928a;
                            int i7 = P0.f20930c - i5;
                            int min = Math.min(i6, 8192 - i7);
                            int i8 = i5 + 1;
                            bArr[i5 + i7] = (byte) charAt2;
                            while (true) {
                                i5 = i8;
                                if (i5 >= min || (charAt = string.charAt(i5)) >= 128) {
                                    break;
                                }
                                i8 = i5 + 1;
                                bArr[i5 + i7] = (byte) charAt;
                            }
                            int i9 = P0.f20930c;
                            int i10 = (i7 + i5) - i9;
                            P0.f20930c = i9 + i10;
                            lVar.I0(lVar.M0() + i10);
                        } else {
                            if (charAt2 < 2048) {
                                i1 P02 = lVar.P0(2);
                                byte[] bArr2 = P02.f20928a;
                                int i11 = P02.f20930c;
                                bArr2[i11] = (byte) ((charAt2 >> 6) | 192);
                                bArr2[i11 + 1] = (byte) ((charAt2 & '?') | 128);
                                P02.f20930c = i11 + 2;
                                lVar.I0(lVar.M0() + 2);
                            } else if (charAt2 >= 55296 && charAt2 <= 57343) {
                                int i12 = i5 + 1;
                                if (i12 < i6) {
                                    c5 = string.charAt(i12);
                                } else {
                                    c5 = 0;
                                }
                                if (charAt2 <= 56319) {
                                    if (56320 <= c5 && c5 < 57344) {
                                        z7 = true;
                                    } else {
                                        z7 = false;
                                    }
                                    if (z7) {
                                        int i13 = (((charAt2 & 1023) << 10) | (c5 & 1023)) + 65536;
                                        i1 P03 = lVar.P0(4);
                                        byte[] bArr3 = P03.f20928a;
                                        int i14 = P03.f20930c;
                                        bArr3[i14] = (byte) ((i13 >> 18) | 240);
                                        bArr3[i14 + 1] = (byte) (((i13 >> 12) & 63) | 128);
                                        bArr3[i14 + 2] = (byte) (((i13 >> 6) & 63) | 128);
                                        bArr3[i14 + 3] = (byte) ((i13 & 63) | 128);
                                        P03.f20930c = i14 + 4;
                                        lVar.I0(lVar.M0() + 4);
                                        i5 += 2;
                                    }
                                }
                                lVar.writeByte(63);
                                i5 = i12;
                            } else {
                                i1 P04 = lVar.P0(3);
                                byte[] bArr4 = P04.f20928a;
                                int i15 = P04.f20930c;
                                bArr4[i15] = (byte) ((charAt2 >> '\f') | Opcodes.SHL_INT_LIT8);
                                bArr4[i15 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                                bArr4[i15 + 2] = (byte) ((charAt2 & '?') | 128);
                                P04.f20930c = i15 + 3;
                                lVar.I0(lVar.M0() + 3);
                            }
                            i5++;
                        }
                    }
                    return lVar;
                }
                throw new IllegalArgumentException(("endIndex > string.length: " + i6 + " > " + string.length()).toString());
            }
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i6 + " < " + i5).toString());
        }
        throw new IllegalArgumentException(("beginIndex < 0: " + i5).toString());
    }

    public static final boolean f(@p4.l okio.l lVar, @p4.m Object obj) {
        l0.p(lVar, "<this>");
        if (lVar == obj) {
            return true;
        }
        if (!(obj instanceof okio.l)) {
            return false;
        }
        okio.l lVar2 = (okio.l) obj;
        if (lVar.M0() != lVar2.M0()) {
            return false;
        }
        if (lVar.M0() == 0) {
            return true;
        }
        i1 i1Var = lVar.f20987a;
        l0.m(i1Var);
        i1 i1Var2 = lVar2.f20987a;
        l0.m(i1Var2);
        int i5 = i1Var.f20929b;
        int i6 = i1Var2.f20929b;
        long j5 = 0;
        while (j5 < lVar.M0()) {
            long min = Math.min(i1Var.f20930c - i5, i1Var2.f20930c - i6);
            long j6 = 0;
            while (j6 < min) {
                int i7 = i5 + 1;
                int i8 = i6 + 1;
                if (i1Var.f20928a[i5] != i1Var2.f20928a[i6]) {
                    return false;
                }
                j6++;
                i5 = i7;
                i6 = i8;
            }
            if (i5 == i1Var.f20930c) {
                i1Var = i1Var.f20933f;
                l0.m(i1Var);
                i5 = i1Var.f20929b;
            }
            if (i6 == i1Var2.f20930c) {
                i1Var2 = i1Var2.f20933f;
                l0.m(i1Var2);
                i6 = i1Var2.f20929b;
            }
            j5 += min;
        }
        return true;
    }

    @p4.l
    public static final okio.l f0(@p4.l okio.l lVar, int i5) {
        l0.p(lVar, "<this>");
        if (i5 < 128) {
            lVar.writeByte(i5);
        } else if (i5 < 2048) {
            i1 P0 = lVar.P0(2);
            byte[] bArr = P0.f20928a;
            int i6 = P0.f20930c;
            bArr[i6] = (byte) ((i5 >> 6) | 192);
            bArr[i6 + 1] = (byte) ((i5 & 63) | 128);
            P0.f20930c = i6 + 2;
            lVar.I0(lVar.M0() + 2);
        } else {
            boolean z4 = false;
            if (55296 <= i5 && i5 < 57344) {
                z4 = true;
            }
            if (z4) {
                lVar.writeByte(63);
            } else if (i5 < 65536) {
                i1 P02 = lVar.P0(3);
                byte[] bArr2 = P02.f20928a;
                int i7 = P02.f20930c;
                bArr2[i7] = (byte) ((i5 >> 12) | Opcodes.SHL_INT_LIT8);
                bArr2[i7 + 1] = (byte) (((i5 >> 6) & 63) | 128);
                bArr2[i7 + 2] = (byte) ((i5 & 63) | 128);
                P02.f20930c = i7 + 3;
                lVar.I0(lVar.M0() + 3);
            } else if (i5 <= 1114111) {
                i1 P03 = lVar.P0(4);
                byte[] bArr3 = P03.f20928a;
                int i8 = P03.f20930c;
                bArr3[i8] = (byte) ((i5 >> 18) | 240);
                bArr3[i8 + 1] = (byte) (((i5 >> 12) & 63) | 128);
                bArr3[i8 + 2] = (byte) (((i5 >> 6) & 63) | 128);
                bArr3[i8 + 3] = (byte) ((i5 & 63) | 128);
                P03.f20930c = i8 + 4;
                lVar.I0(lVar.M0() + 4);
            } else {
                throw new IllegalArgumentException("Unexpected code point: 0x" + okio.i.v(i5));
            }
        }
        return lVar;
    }

    public static final long g(@p4.l l.a aVar, int i5) {
        boolean z4;
        l0.p(aVar, "<this>");
        boolean z5 = true;
        if (i5 > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (i5 > 8192) {
                z5 = false;
            }
            if (z5) {
                okio.l lVar = aVar.f20989a;
                if (lVar != null) {
                    if (aVar.f20990b) {
                        long M0 = lVar.M0();
                        i1 P0 = lVar.P0(i5);
                        int i6 = 8192 - P0.f20930c;
                        P0.f20930c = 8192;
                        long j5 = i6;
                        lVar.I0(M0 + j5);
                        aVar.j(P0);
                        aVar.f20992d = M0;
                        aVar.f20993e = P0.f20928a;
                        aVar.f20994f = 8192 - i6;
                        aVar.f20995g = 8192;
                        return j5;
                    }
                    throw new IllegalStateException("expandBuffer() only permitted for read/write buffers".toString());
                }
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            throw new IllegalArgumentException(("minByteCount > Segment.SIZE: " + i5).toString());
        }
        throw new IllegalArgumentException(("minByteCount <= 0: " + i5).toString());
    }

    @p4.l
    public static final byte[] g0() {
        return f20935a;
    }

    public static final byte h(@p4.l okio.l lVar, long j5) {
        l0.p(lVar, "<this>");
        okio.i.e(lVar.M0(), j5, 1L);
        i1 i1Var = lVar.f20987a;
        if (i1Var != null) {
            if (lVar.M0() - j5 < j5) {
                long M0 = lVar.M0();
                while (M0 > j5) {
                    i1Var = i1Var.f20934g;
                    l0.m(i1Var);
                    M0 -= i1Var.f20930c - i1Var.f20929b;
                }
                l0.m(i1Var);
                return i1Var.f20928a[(int) ((i1Var.f20929b + j5) - M0)];
            }
            long j6 = 0;
            while (true) {
                long j7 = (i1Var.f20930c - i1Var.f20929b) + j6;
                if (j7 <= j5) {
                    i1Var = i1Var.f20933f;
                    l0.m(i1Var);
                    j6 = j7;
                } else {
                    l0.m(i1Var);
                    return i1Var.f20928a[(int) ((i1Var.f20929b + j5) - j6)];
                }
            }
        } else {
            l0.m(null);
            throw null;
        }
    }

    public static /* synthetic */ void h0() {
    }

    public static final int i(@p4.l okio.l lVar) {
        l0.p(lVar, "<this>");
        i1 i1Var = lVar.f20987a;
        if (i1Var == null) {
            return 0;
        }
        int i5 = 1;
        do {
            int i6 = i1Var.f20930c;
            for (int i7 = i1Var.f20929b; i7 < i6; i7++) {
                i5 = (i5 * 31) + i1Var.f20928a[i7];
            }
            i1Var = i1Var.f20933f;
            l0.m(i1Var);
        } while (i1Var != lVar.f20987a);
        return i5;
    }

    public static final boolean i0(@p4.l i1 segment, int i5, @p4.l byte[] bytes, int i6, int i7) {
        l0.p(segment, "segment");
        l0.p(bytes, "bytes");
        int i8 = segment.f20930c;
        byte[] bArr = segment.f20928a;
        while (i6 < i7) {
            if (i5 == i8) {
                segment = segment.f20933f;
                l0.m(segment);
                byte[] bArr2 = segment.f20928a;
                bArr = bArr2;
                i5 = segment.f20929b;
                i8 = segment.f20930c;
            }
            if (bArr[i5] != bytes[i6]) {
                return false;
            }
            i5++;
            i6++;
        }
        return true;
    }

    public static final long j(@p4.l okio.l lVar, byte b5, long j5, long j6) {
        i1 i1Var;
        int i5;
        l0.p(lVar, "<this>");
        long j7 = 0;
        boolean z4 = false;
        if (0 <= j5 && j5 <= j6) {
            z4 = true;
        }
        if (z4) {
            if (j6 > lVar.M0()) {
                j6 = lVar.M0();
            }
            if (j5 == j6 || (i1Var = lVar.f20987a) == null) {
                return -1L;
            }
            if (lVar.M0() - j5 < j5) {
                j7 = lVar.M0();
                while (j7 > j5) {
                    i1Var = i1Var.f20934g;
                    l0.m(i1Var);
                    j7 -= i1Var.f20930c - i1Var.f20929b;
                }
                while (j7 < j6) {
                    byte[] bArr = i1Var.f20928a;
                    int min = (int) Math.min(i1Var.f20930c, (i1Var.f20929b + j6) - j7);
                    i5 = (int) ((i1Var.f20929b + j5) - j7);
                    while (i5 < min) {
                        if (bArr[i5] != b5) {
                            i5++;
                        }
                    }
                    j7 += i1Var.f20930c - i1Var.f20929b;
                    i1Var = i1Var.f20933f;
                    l0.m(i1Var);
                    j5 = j7;
                }
                return -1L;
            }
            while (true) {
                long j8 = (i1Var.f20930c - i1Var.f20929b) + j7;
                if (j8 > j5) {
                    break;
                }
                i1Var = i1Var.f20933f;
                l0.m(i1Var);
                j7 = j8;
            }
            while (j7 < j6) {
                byte[] bArr2 = i1Var.f20928a;
                int min2 = (int) Math.min(i1Var.f20930c, (i1Var.f20929b + j6) - j7);
                i5 = (int) ((i1Var.f20929b + j5) - j7);
                while (i5 < min2) {
                    if (bArr2[i5] != b5) {
                        i5++;
                    }
                }
                j7 += i1Var.f20930c - i1Var.f20929b;
                i1Var = i1Var.f20933f;
                l0.m(i1Var);
                j5 = j7;
            }
            return -1L;
            return (i5 - i1Var.f20929b) + j7;
        }
        throw new IllegalArgumentException(("size=" + lVar.M0() + " fromIndex=" + j5 + " toIndex=" + j6).toString());
    }

    @p4.l
    public static final String j0(@p4.l okio.l lVar, long j5) {
        l0.p(lVar, "<this>");
        if (j5 > 0) {
            long j6 = j5 - 1;
            if (lVar.P(j6) == 13) {
                String X = lVar.X(j6);
                lVar.skip(2L);
                return X;
            }
        }
        String X2 = lVar.X(j5);
        lVar.skip(1L);
        return X2;
    }

    public static final long k(@p4.l okio.l lVar, @p4.l n bytes, long j5) {
        boolean z4;
        boolean z5;
        long j6 = j5;
        l0.p(lVar, "<this>");
        l0.p(bytes, "bytes");
        if (bytes.size() > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            long j7 = 0;
            if (j6 >= 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                i1 i1Var = lVar.f20987a;
                if (i1Var == null) {
                    return -1L;
                }
                if (lVar.M0() - j6 < j6) {
                    long M0 = lVar.M0();
                    while (M0 > j6) {
                        i1Var = i1Var.f20934g;
                        l0.m(i1Var);
                        M0 -= i1Var.f20930c - i1Var.f20929b;
                    }
                    byte[] internalArray$okio = bytes.internalArray$okio();
                    byte b5 = internalArray$okio[0];
                    int size = bytes.size();
                    long M02 = (lVar.M0() - size) + 1;
                    while (M0 < M02) {
                        byte[] bArr = i1Var.f20928a;
                        int min = (int) Math.min(i1Var.f20930c, (i1Var.f20929b + M02) - M0);
                        for (int i5 = (int) ((i1Var.f20929b + j6) - M0); i5 < min; i5++) {
                            if (bArr[i5] == b5 && i0(i1Var, i5 + 1, internalArray$okio, 1, size)) {
                                return (i5 - i1Var.f20929b) + M0;
                            }
                        }
                        M0 += i1Var.f20930c - i1Var.f20929b;
                        i1Var = i1Var.f20933f;
                        l0.m(i1Var);
                        j6 = M0;
                    }
                    return -1L;
                }
                while (true) {
                    long j8 = (i1Var.f20930c - i1Var.f20929b) + j7;
                    if (j8 > j6) {
                        break;
                    }
                    i1Var = i1Var.f20933f;
                    l0.m(i1Var);
                    j7 = j8;
                }
                byte[] internalArray$okio2 = bytes.internalArray$okio();
                byte b6 = internalArray$okio2[0];
                int size2 = bytes.size();
                long M03 = (lVar.M0() - size2) + 1;
                while (j7 < M03) {
                    byte[] bArr2 = i1Var.f20928a;
                    long j9 = j7;
                    int min2 = (int) Math.min(i1Var.f20930c, (i1Var.f20929b + M03) - j7);
                    for (int i6 = (int) ((i1Var.f20929b + j6) - j9); i6 < min2; i6++) {
                        if (bArr2[i6] == b6 && i0(i1Var, i6 + 1, internalArray$okio2, 1, size2)) {
                            return (i6 - i1Var.f20929b) + j9;
                        }
                    }
                    j7 = j9 + (i1Var.f20930c - i1Var.f20929b);
                    i1Var = i1Var.f20933f;
                    l0.m(i1Var);
                    j6 = j7;
                }
                return -1L;
            }
            throw new IllegalArgumentException(("fromIndex < 0: " + j6).toString());
        }
        throw new IllegalArgumentException("bytes is empty".toString());
    }

    public static final <T> T k0(@p4.l okio.l lVar, long j5, @p4.l p<? super i1, ? super Long, ? extends T> lambda) {
        l0.p(lVar, "<this>");
        l0.p(lambda, "lambda");
        i1 i1Var = lVar.f20987a;
        if (i1Var == null) {
            return lambda.invoke(null, -1L);
        }
        if (lVar.M0() - j5 < j5) {
            long M0 = lVar.M0();
            while (M0 > j5) {
                i1Var = i1Var.f20934g;
                l0.m(i1Var);
                M0 -= i1Var.f20930c - i1Var.f20929b;
            }
            return lambda.invoke(i1Var, Long.valueOf(M0));
        }
        long j6 = 0;
        while (true) {
            long j7 = (i1Var.f20930c - i1Var.f20929b) + j6;
            if (j7 <= j5) {
                i1Var = i1Var.f20933f;
                l0.m(i1Var);
                j6 = j7;
            } else {
                return lambda.invoke(i1Var, Long.valueOf(j6));
            }
        }
    }

    public static final long l(@p4.l okio.l lVar, @p4.l n targetBytes, long j5) {
        boolean z4;
        int i5;
        int i6;
        l0.p(lVar, "<this>");
        l0.p(targetBytes, "targetBytes");
        long j6 = 0;
        if (j5 >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            i1 i1Var = lVar.f20987a;
            if (i1Var == null) {
                return -1L;
            }
            if (lVar.M0() - j5 < j5) {
                j6 = lVar.M0();
                while (j6 > j5) {
                    i1Var = i1Var.f20934g;
                    l0.m(i1Var);
                    j6 -= i1Var.f20930c - i1Var.f20929b;
                }
                if (targetBytes.size() == 2) {
                    byte b5 = targetBytes.getByte(0);
                    byte b6 = targetBytes.getByte(1);
                    while (j6 < lVar.M0()) {
                        byte[] bArr = i1Var.f20928a;
                        i5 = (int) ((i1Var.f20929b + j5) - j6);
                        int i7 = i1Var.f20930c;
                        while (i5 < i7) {
                            byte b7 = bArr[i5];
                            if (b7 != b5 && b7 != b6) {
                                i5++;
                            }
                            i6 = i1Var.f20929b;
                        }
                        j6 += i1Var.f20930c - i1Var.f20929b;
                        i1Var = i1Var.f20933f;
                        l0.m(i1Var);
                        j5 = j6;
                    }
                } else {
                    byte[] internalArray$okio = targetBytes.internalArray$okio();
                    while (j6 < lVar.M0()) {
                        byte[] bArr2 = i1Var.f20928a;
                        i5 = (int) ((i1Var.f20929b + j5) - j6);
                        int i8 = i1Var.f20930c;
                        while (i5 < i8) {
                            byte b8 = bArr2[i5];
                            for (byte b9 : internalArray$okio) {
                                if (b8 == b9) {
                                    i6 = i1Var.f20929b;
                                }
                            }
                            i5++;
                        }
                        j6 += i1Var.f20930c - i1Var.f20929b;
                        i1Var = i1Var.f20933f;
                        l0.m(i1Var);
                        j5 = j6;
                    }
                }
                return -1L;
            }
            while (true) {
                long j7 = (i1Var.f20930c - i1Var.f20929b) + j6;
                if (j7 > j5) {
                    break;
                }
                i1Var = i1Var.f20933f;
                l0.m(i1Var);
                j6 = j7;
            }
            if (targetBytes.size() == 2) {
                byte b10 = targetBytes.getByte(0);
                byte b11 = targetBytes.getByte(1);
                while (j6 < lVar.M0()) {
                    byte[] bArr3 = i1Var.f20928a;
                    i5 = (int) ((i1Var.f20929b + j5) - j6);
                    int i9 = i1Var.f20930c;
                    while (i5 < i9) {
                        byte b12 = bArr3[i5];
                        if (b12 != b10 && b12 != b11) {
                            i5++;
                        }
                        i6 = i1Var.f20929b;
                    }
                    j6 += i1Var.f20930c - i1Var.f20929b;
                    i1Var = i1Var.f20933f;
                    l0.m(i1Var);
                    j5 = j6;
                }
            } else {
                byte[] internalArray$okio2 = targetBytes.internalArray$okio();
                while (j6 < lVar.M0()) {
                    byte[] bArr4 = i1Var.f20928a;
                    i5 = (int) ((i1Var.f20929b + j5) - j6);
                    int i10 = i1Var.f20930c;
                    while (i5 < i10) {
                        byte b13 = bArr4[i5];
                        for (byte b14 : internalArray$okio2) {
                            if (b13 == b14) {
                                i6 = i1Var.f20929b;
                            }
                        }
                        i5++;
                    }
                    j6 += i1Var.f20930c - i1Var.f20929b;
                    i1Var = i1Var.f20933f;
                    l0.m(i1Var);
                    j5 = j6;
                }
            }
            return -1L;
            return (i5 - i6) + j6;
        }
        throw new IllegalArgumentException(("fromIndex < 0: " + j5).toString());
    }

    public static final int l0(@p4.l okio.l lVar, @p4.l b1 options, boolean z4) {
        int i5;
        int i6;
        boolean z5;
        int i7;
        int i8;
        i1 i1Var;
        l0.p(lVar, "<this>");
        l0.p(options, "options");
        i1 i1Var2 = lVar.f20987a;
        if (i1Var2 == null) {
            if (z4) {
                return -2;
            }
            return -1;
        }
        byte[] bArr = i1Var2.f20928a;
        int i9 = i1Var2.f20929b;
        int i10 = i1Var2.f20930c;
        int[] g5 = options.g();
        i1 i1Var3 = i1Var2;
        int i11 = -1;
        int i12 = 0;
        loop0: while (true) {
            int i13 = i12 + 1;
            int i14 = g5[i12];
            int i15 = i13 + 1;
            int i16 = g5[i13];
            if (i16 != -1) {
                i11 = i16;
            }
            if (i1Var3 == null) {
                break;
            }
            if (i14 < 0) {
                int i17 = i15 + (i14 * (-1));
                while (true) {
                    int i18 = i9 + 1;
                    int i19 = i15 + 1;
                    if ((bArr[i9] & y1.f19838d) != g5[i15]) {
                        return i11;
                    }
                    if (i19 == i17) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (i18 == i10) {
                        l0.m(i1Var3);
                        i1 i1Var4 = i1Var3.f20933f;
                        l0.m(i1Var4);
                        i8 = i1Var4.f20929b;
                        byte[] bArr2 = i1Var4.f20928a;
                        i7 = i1Var4.f20930c;
                        if (i1Var4 == i1Var2) {
                            if (!z5) {
                                break loop0;
                            }
                            bArr = bArr2;
                            i1Var = null;
                        } else {
                            i1Var = i1Var4;
                            bArr = bArr2;
                        }
                    } else {
                        i1 i1Var5 = i1Var3;
                        i7 = i10;
                        i8 = i18;
                        i1Var = i1Var5;
                    }
                    if (z5) {
                        i6 = g5[i19];
                        i5 = i8;
                        i10 = i7;
                        i1Var3 = i1Var;
                        break;
                    }
                    i9 = i8;
                    i10 = i7;
                    i15 = i19;
                    i1Var3 = i1Var;
                }
            } else {
                i5 = i9 + 1;
                int i20 = bArr[i9] & y1.f19838d;
                int i21 = i15 + i14;
                while (i15 != i21) {
                    if (i20 == g5[i15]) {
                        i6 = g5[i15 + i14];
                        if (i5 == i10) {
                            i1Var3 = i1Var3.f20933f;
                            l0.m(i1Var3);
                            i5 = i1Var3.f20929b;
                            bArr = i1Var3.f20928a;
                            i10 = i1Var3.f20930c;
                            if (i1Var3 == i1Var2) {
                                i1Var3 = null;
                            }
                        }
                    } else {
                        i15++;
                    }
                }
                return i11;
            }
            if (i6 >= 0) {
                return i6;
            }
            i12 = -i6;
            i9 = i5;
        }
        if (z4) {
            return -2;
        }
        return i11;
    }

    public static final int m(@p4.l l.a aVar) {
        boolean z4;
        long j5;
        l0.p(aVar, "<this>");
        long j6 = aVar.f20992d;
        okio.l lVar = aVar.f20989a;
        l0.m(lVar);
        if (j6 != lVar.M0()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            long j7 = aVar.f20992d;
            if (j7 == -1) {
                j5 = 0;
            } else {
                j5 = j7 + (aVar.f20995g - aVar.f20994f);
            }
            return aVar.h(j5);
        }
        throw new IllegalStateException("no more bytes".toString());
    }

    public static /* synthetic */ int m0(okio.l lVar, b1 b1Var, boolean z4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z4 = false;
        }
        return l0(lVar, b1Var, z4);
    }

    public static final boolean n(@p4.l okio.l lVar, long j5, @p4.l n bytes, int i5, int i6) {
        l0.p(lVar, "<this>");
        l0.p(bytes, "bytes");
        if (j5 < 0 || i5 < 0 || i6 < 0 || lVar.M0() - j5 < i6 || bytes.size() - i5 < i6) {
            return false;
        }
        for (int i7 = 0; i7 < i6; i7++) {
            if (lVar.P(i7 + j5) != bytes.getByte(i5 + i7)) {
                return false;
            }
        }
        return true;
    }

    public static final int o(@p4.l okio.l lVar, @p4.l byte[] sink) {
        l0.p(lVar, "<this>");
        l0.p(sink, "sink");
        return lVar.read(sink, 0, sink.length);
    }

    public static final int p(@p4.l okio.l lVar, @p4.l byte[] sink, int i5, int i6) {
        l0.p(lVar, "<this>");
        l0.p(sink, "sink");
        okio.i.e(sink.length, i5, i6);
        i1 i1Var = lVar.f20987a;
        if (i1Var == null) {
            return -1;
        }
        int min = Math.min(i6, i1Var.f20930c - i1Var.f20929b);
        byte[] bArr = i1Var.f20928a;
        int i7 = i1Var.f20929b;
        kotlin.collections.o.v0(bArr, sink, i5, i7, i7 + min);
        i1Var.f20929b += min;
        lVar.I0(lVar.M0() - min);
        if (i1Var.f20929b == i1Var.f20930c) {
            lVar.f20987a = i1Var.b();
            j1.d(i1Var);
        }
        return min;
    }

    public static final long q(@p4.l okio.l lVar, @p4.l okio.l sink, long j5) {
        boolean z4;
        l0.p(lVar, "<this>");
        l0.p(sink, "sink");
        if (j5 >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (lVar.M0() == 0) {
                return -1L;
            }
            if (j5 > lVar.M0()) {
                j5 = lVar.M0();
            }
            sink.write(lVar, j5);
            return j5;
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j5).toString());
    }

    public static final long r(@p4.l okio.l lVar, @p4.l l1 sink) {
        l0.p(lVar, "<this>");
        l0.p(sink, "sink");
        long M0 = lVar.M0();
        if (M0 > 0) {
            sink.write(lVar, M0);
        }
        return M0;
    }

    @p4.l
    public static final l.a s(@p4.l okio.l lVar, @p4.l l.a unsafeCursor) {
        boolean z4;
        l0.p(lVar, "<this>");
        l0.p(unsafeCursor, "unsafeCursor");
        l.a n5 = okio.i.n(unsafeCursor);
        if (n5.f20989a == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            n5.f20989a = lVar;
            n5.f20990b = true;
            return n5;
        }
        throw new IllegalStateException("already attached to a buffer".toString());
    }

    public static final byte t(@p4.l okio.l lVar) {
        l0.p(lVar, "<this>");
        if (lVar.M0() != 0) {
            i1 i1Var = lVar.f20987a;
            l0.m(i1Var);
            int i5 = i1Var.f20929b;
            int i6 = i1Var.f20930c;
            int i7 = i5 + 1;
            byte b5 = i1Var.f20928a[i5];
            lVar.I0(lVar.M0() - 1);
            if (i7 == i6) {
                lVar.f20987a = i1Var.b();
                j1.d(i1Var);
            } else {
                i1Var.f20929b = i7;
            }
            return b5;
        }
        throw new EOFException();
    }

    @p4.l
    public static final byte[] u(@p4.l okio.l lVar) {
        l0.p(lVar, "<this>");
        return lVar.N(lVar.M0());
    }

    @p4.l
    public static final byte[] v(@p4.l okio.l lVar, long j5) {
        boolean z4;
        l0.p(lVar, "<this>");
        if (j5 >= 0 && j5 <= 2147483647L) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (lVar.M0() >= j5) {
                byte[] bArr = new byte[(int) j5];
                lVar.readFully(bArr);
                return bArr;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(("byteCount: " + j5).toString());
    }

    @p4.l
    public static final n w(@p4.l okio.l lVar) {
        l0.p(lVar, "<this>");
        return lVar.Y(lVar.M0());
    }

    @p4.l
    public static final n x(@p4.l okio.l lVar, long j5) {
        boolean z4;
        l0.p(lVar, "<this>");
        if (j5 >= 0 && j5 <= 2147483647L) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (lVar.M0() >= j5) {
                if (j5 >= 4096) {
                    n O0 = lVar.O0((int) j5);
                    lVar.skip(j5);
                    return O0;
                }
                return new n(lVar.N(j5));
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(("byteCount: " + j5).toString());
    }

    public static final long y(@p4.l okio.l lVar) {
        int i5;
        String str;
        l0.p(lVar, "<this>");
        if (lVar.M0() != 0) {
            int i6 = 0;
            boolean z4 = false;
            long j5 = 0;
            long j6 = -7;
            boolean z5 = false;
            do {
                i1 i1Var = lVar.f20987a;
                l0.m(i1Var);
                byte[] bArr = i1Var.f20928a;
                int i7 = i1Var.f20929b;
                int i8 = i1Var.f20930c;
                while (i7 < i8) {
                    byte b5 = bArr[i7];
                    if (b5 >= 48 && b5 <= 57) {
                        int i9 = 48 - b5;
                        if (j5 >= f20937c && (j5 != f20937c || i9 >= j6)) {
                            j5 = (j5 * 10) + i9;
                        } else {
                            okio.l writeByte = new okio.l().V(j5).writeByte(b5);
                            if (!z4) {
                                writeByte.readByte();
                            }
                            throw new NumberFormatException("Number too large: " + writeByte.s0());
                        }
                    } else if (b5 == 45 && i6 == 0) {
                        j6--;
                        z4 = true;
                    } else {
                        z5 = true;
                        break;
                    }
                    i7++;
                    i6++;
                }
                if (i7 == i8) {
                    lVar.f20987a = i1Var.b();
                    j1.d(i1Var);
                } else {
                    i1Var.f20929b = i7;
                }
                if (z5) {
                    break;
                }
            } while (lVar.f20987a != null);
            lVar.I0(lVar.M0() - i6);
            if (z4) {
                i5 = 2;
            } else {
                i5 = 1;
            }
            if (i6 < i5) {
                if (lVar.M0() != 0) {
                    if (z4) {
                        str = "Expected a digit";
                    } else {
                        str = "Expected a digit or '-'";
                    }
                    throw new NumberFormatException(str + " but was 0x" + okio.i.u(lVar.P(0L)));
                }
                throw new EOFException();
            }
            if (!z4) {
                return -j5;
            }
            return j5;
        }
        throw new EOFException();
    }

    public static final void z(@p4.l okio.l lVar, @p4.l okio.l sink, long j5) {
        l0.p(lVar, "<this>");
        l0.p(sink, "sink");
        if (lVar.M0() >= j5) {
            sink.write(lVar, j5);
        } else {
            sink.write(lVar, lVar.M0());
            throw new EOFException();
        }
    }
}
