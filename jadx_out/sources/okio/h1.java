package okio;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.android.live.base.api.push.ILivePush;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.y1;

@kotlin.i0(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\rH\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0012H\u0016J \u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0012H\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0012H\u0016J\u0010\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0018H\u0016J\u0018\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0012H\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\rH\u0016J\b\u0010\u001e\u001a\u00020\u0001H\u0016J\u0018\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J(\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"H\u0016J\u0010\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020&H\u0016J\u0010\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020'H\u0016J \u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020'2\u0006\u0010 \u001a\u00020\"2\u0006\u0010#\u001a\u00020\"H\u0016J\u0018\u0010$\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0012H\u0016J\u0010\u0010(\u001a\u00020\u00122\u0006\u0010%\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020\u0014H\u0016J\b\u0010+\u001a\u00020'H\u0016J\u0010\u0010+\u001a\u00020'2\u0006\u0010#\u001a\u00020\u0012H\u0016J\b\u0010,\u001a\u00020\u0018H\u0016J\u0010\u0010,\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u0012H\u0016J\b\u0010-\u001a\u00020\u0012H\u0016J\u0010\u0010.\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020'H\u0016J\u0018\u0010.\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0012H\u0016J\b\u0010/\u001a\u00020\u0012H\u0016J\b\u00100\u001a\u00020\"H\u0016J\b\u00101\u001a\u00020\"H\u0016J\b\u00102\u001a\u00020\u0012H\u0016J\b\u00103\u001a\u00020\u0012H\u0016J\b\u00104\u001a\u000205H\u0016J\b\u00106\u001a\u000205H\u0016J\u0010\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:H\u0016J\u0018\u00107\u001a\u0002082\u0006\u0010#\u001a\u00020\u00122\u0006\u00109\u001a\u00020:H\u0016J\b\u0010;\u001a\u000208H\u0016J\u0010\u0010;\u001a\u0002082\u0006\u0010#\u001a\u00020\u0012H\u0016J\b\u0010<\u001a\u00020\"H\u0016J\n\u0010=\u001a\u0004\u0018\u000108H\u0016J\b\u0010>\u001a\u000208H\u0016J\u0010\u0010>\u001a\u0002082\u0006\u0010?\u001a\u00020\u0012H\u0016J\u0010\u0010@\u001a\u00020\r2\u0006\u0010#\u001a\u00020\u0012H\u0016J\u0010\u0010A\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u0012H\u0016J\u0010\u0010B\u001a\u00020\"2\u0006\u0010C\u001a\u00020DH\u0016J\u0010\u0010E\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u0012H\u0016J\b\u0010F\u001a\u00020GH\u0016J\b\u0010H\u001a\u000208H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068Ö\u0002X\u0096\u0004¢\u0006\f\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006I"}, d2 = {"Lokio/RealBufferedSource;", "Lokio/BufferedSource;", "source", "Lokio/Source;", "(Lokio/Source;)V", "buffer", "Lokio/Buffer;", "getBuffer$annotations", "()V", "getBuffer", "()Lokio/Buffer;", "bufferField", "closed", "", ILivePush.ClickType.CLOSE, "", "exhausted", "indexOf", "", "b", "", "fromIndex", "toIndex", "bytes", "Lokio/ByteString;", "indexOfElement", "targetBytes", "inputStream", "Ljava/io/InputStream;", "isOpen", "peek", "rangeEquals", TypedValues.CycleType.S_WAVE_OFFSET, "bytesOffset", "", "byteCount", "read", "sink", "Ljava/nio/ByteBuffer;", "", "readAll", "Lokio/Sink;", "readByte", "readByteArray", "readByteString", "readDecimalLong", "readFully", "readHexadecimalUnsignedLong", "readInt", "readIntLe", "readLong", "readLongLe", "readShort", "", "readShortLe", "readString", "", "charset", "Ljava/nio/charset/Charset;", "readUtf8", "readUtf8CodePoint", "readUtf8Line", "readUtf8LineStrict", "limit", "request", "require", "select", "options", "Lokio/Options;", "skip", m0.a.Z, "Lokio/Timeout;", "toString", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nRealBufferedSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealBufferedSource.kt\nokio/RealBufferedSource\n+ 2 RealBufferedSource.kt\nokio/internal/-RealBufferedSource\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,185:1\n62#1:191\n62#1:201\n62#1:208\n62#1:214\n62#1:216\n62#1:220\n62#1:225\n62#1:240\n62#1:244\n62#1:251\n62#1:264\n62#1:272\n62#1:273\n62#1:274\n62#1:280\n62#1:288\n62#1:301\n62#1:305\n62#1:306\n62#1:307\n62#1:308\n62#1:313\n62#1:325\n62#1:341\n62#1:351\n62#1:354\n62#1:357\n62#1:360\n62#1:363\n62#1:366\n62#1:372\n62#1:389\n62#1:409\n62#1:424\n62#1:441\n62#1:454\n62#1:475\n62#1:482\n38#2:186\n39#2,3:188\n42#2,6:192\n51#2:198\n52#2:200\n56#2,2:202\n60#2:204\n61#2,2:206\n63#2,3:209\n69#2,2:212\n74#2:215\n75#2:217\n79#2,2:218\n84#2:221\n86#2,2:223\n88#2,13:226\n107#2:239\n108#2:241\n112#2,2:242\n117#2,6:245\n123#2,9:252\n134#2,3:261\n137#2,5:265\n142#2:271\n146#2,5:275\n151#2,5:281\n158#2,2:286\n160#2,11:289\n174#2:300\n175#2:302\n179#2,2:303\n184#2,4:309\n188#2,6:314\n198#2:320\n199#2,3:322\n202#2,8:326\n210#2,3:335\n217#2,3:338\n220#2,7:342\n230#2,2:349\n235#2,2:352\n240#2,2:355\n245#2,2:358\n250#2,2:361\n255#2,2:364\n260#2,5:367\n265#2,11:373\n279#2,5:384\n284#2,14:390\n301#2,2:404\n303#2,2:407\n305#2,7:410\n314#2,2:417\n316#2,4:420\n320#2,11:425\n334#2,2:436\n337#2,2:439\n339#2,7:442\n350#2,2:449\n353#2,2:452\n355#2,7:455\n371#2:462\n373#2,11:464\n385#2:476\n389#2:477\n393#2,4:478\n397#2:483\n399#2:484\n401#2:485\n1#3:187\n1#3:199\n1#3:205\n1#3:222\n1#3:321\n1#3:406\n1#3:419\n1#3:438\n1#3:451\n1#3:463\n89#4:270\n89#4:334\n*S KotlinDebug\n*F\n+ 1 RealBufferedSource.kt\nokio/RealBufferedSource\n*L\n66#1:191\n67#1:201\n69#1:208\n70#1:214\n71#1:216\n72#1:220\n73#1:225\n74#1:240\n75#1:244\n77#1:251\n79#1:264\n82#1:272\n83#1:273\n87#1:274\n90#1:280\n91#1:288\n92#1:301\n93#1:305\n96#1:306\n97#1:307\n102#1:308\n105#1:313\n107#1:325\n108#1:341\n109#1:351\n110#1:354\n111#1:357\n112#1:360\n113#1:363\n114#1:366\n115#1:372\n116#1:389\n117#1:409\n121#1:424\n124#1:441\n127#1:454\n141#1:475\n181#1:482\n66#1:186\n66#1:188,3\n66#1:192,6\n67#1:198\n67#1:200\n68#1:202,2\n69#1:204\n69#1:206,2\n69#1:209,3\n70#1:212,2\n71#1:215\n71#1:217\n72#1:218,2\n73#1:221\n73#1:223,2\n73#1:226,13\n74#1:239\n74#1:241\n75#1:242,2\n77#1:245,6\n77#1:252,9\n79#1:261,3\n79#1:265,5\n79#1:271\n90#1:275,5\n90#1:281,5\n91#1:286,2\n91#1:289,11\n92#1:300\n92#1:302\n93#1:303,2\n105#1:309,4\n105#1:314,6\n107#1:320\n107#1:322,3\n107#1:326,8\n107#1:335,3\n108#1:338,3\n108#1:342,7\n109#1:349,2\n110#1:352,2\n111#1:355,2\n112#1:358,2\n113#1:361,2\n114#1:364,2\n115#1:367,5\n115#1:373,11\n116#1:384,5\n116#1:390,14\n117#1:404,2\n117#1:407,2\n117#1:410,7\n121#1:417,2\n121#1:420,4\n121#1:425,11\n124#1:436,2\n124#1:439,2\n124#1:442,7\n127#1:449,2\n127#1:452,2\n127#1:455,7\n141#1:462\n141#1:464,11\n141#1:476\n143#1:477\n181#1:478,4\n181#1:483\n182#1:484\n183#1:485\n66#1:187\n67#1:199\n69#1:205\n73#1:222\n107#1:321\n117#1:406\n121#1:419\n124#1:438\n127#1:451\n141#1:463\n79#1:270\n107#1:334\n*E\n"})
/* loaded from: classes4.dex */
public final class h1 implements BufferedSource {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    @u3.e
    public final n1 f20919a;

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    @u3.e
    public final l f20920b;

    /* renamed from: c, reason: collision with root package name */
    @u3.e
    public boolean f20921c;

    public h1(@p4.l n1 source) {
        kotlin.jvm.internal.l0.p(source, "source");
        this.f20919a = source;
        this.f20920b = new l();
    }

    public static /* synthetic */ void a() {
    }

    @Override // okio.BufferedSource
    public int B0(@p4.l b1 options) {
        kotlin.jvm.internal.l0.p(options, "options");
        if (!(!this.f20921c)) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            int l02 = okio.internal.a.l0(this.f20920b, options, true);
            if (l02 != -2) {
                if (l02 != -1) {
                    this.f20920b.skip(options.e()[l02].size());
                    return l02;
                }
            } else if (this.f20919a.read(this.f20920b, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                break;
            }
        }
        return -1;
    }

    @Override // okio.BufferedSource
    public boolean D(long j5, @p4.l n bytes) {
        kotlin.jvm.internal.l0.p(bytes, "bytes");
        return L(j5, bytes, 0, bytes.size());
    }

    @Override // okio.BufferedSource
    @p4.l
    public String K() {
        return z(Long.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    public boolean L(long j5, @p4.l n bytes, int i5, int i6) {
        kotlin.jvm.internal.l0.p(bytes, "bytes");
        if (!this.f20921c) {
            if (j5 >= 0 && i5 >= 0 && i6 >= 0 && bytes.size() - i5 >= i6) {
                for (int i7 = 0; i7 < i6; i7++) {
                    long j6 = i7 + j5;
                    if (request(1 + j6) && this.f20920b.P(j6) == bytes.getByte(i5 + i7)) {
                    }
                }
                return true;
            }
            return false;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.BufferedSource
    @p4.l
    public byte[] N(long j5) {
        U(j5);
        return this.f20920b.N(j5);
    }

    @Override // okio.BufferedSource
    public short Q() {
        U(2L);
        return this.f20920b.Q();
    }

    @Override // okio.BufferedSource
    public long R() {
        U(8L);
        return this.f20920b.R();
    }

    @Override // okio.BufferedSource
    public long T(@p4.l n targetBytes, long j5) {
        kotlin.jvm.internal.l0.p(targetBytes, "targetBytes");
        if (!(!this.f20921c)) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            long T = this.f20920b.T(targetBytes, j5);
            if (T == -1) {
                long M0 = this.f20920b.M0();
                if (this.f20919a.read(this.f20920b, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                    return -1L;
                }
                j5 = Math.max(j5, M0);
            } else {
                return T;
            }
        }
    }

    @Override // okio.BufferedSource
    public void U(long j5) {
        if (!request(j5)) {
            throw new EOFException();
        }
    }

    @Override // okio.BufferedSource
    public long W(byte b5) {
        return u(b5, 0L, Long.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    @p4.l
    public String X(long j5) {
        U(j5);
        return this.f20920b.X(j5);
    }

    @Override // okio.BufferedSource
    @p4.l
    public n Y(long j5) {
        U(j5);
        return this.f20920b.Y(j5);
    }

    @Override // okio.BufferedSource
    @p4.l
    public byte[] c0() {
        this.f20920b.G(this.f20919a);
        return this.f20920b.c0();
    }

    @Override // okio.n1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.f20921c) {
            this.f20921c = true;
            this.f20919a.close();
            this.f20920b.c();
        }
    }

    @Override // okio.BufferedSource
    public boolean e0() {
        if (!this.f20921c) {
            if (this.f20920b.e0() && this.f20919a.read(this.f20920b, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return true;
            }
            return false;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.BufferedSource
    @p4.l
    public l f() {
        return this.f20920b;
    }

    @Override // okio.BufferedSource
    @p4.l
    public l g() {
        return this.f20920b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
    
        if (r4 == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        r1 = new java.lang.StringBuilder();
        r1.append("Expected a digit or '-' but was 0x");
        r2 = kotlin.text.d.a(16);
        r2 = kotlin.text.d.a(r2);
        r2 = java.lang.Integer.toString(r8, r2);
        kotlin.jvm.internal.l0.o(r2, "toString(this, checkRadix(radix))");
        r1.append(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
    
        throw new java.lang.NumberFormatException(r1.toString());
     */
    @Override // okio.BufferedSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long g0() {
        /*
            r10 = this;
            r0 = 1
            r10.U(r0)
            r2 = 0
            r4 = r2
        L8:
            long r6 = r4 + r0
            boolean r8 = r10.request(r6)
            if (r8 == 0) goto L56
            okio.l r8 = r10.f20920b
            byte r8 = r8.P(r4)
            r9 = 48
            if (r8 < r9) goto L1e
            r9 = 57
            if (r8 <= r9) goto L27
        L1e:
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 != 0) goto L29
            r5 = 45
            if (r8 == r5) goto L27
            goto L29
        L27:
            r4 = r6
            goto L8
        L29:
            if (r4 == 0) goto L2c
            goto L56
        L2c:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected a digit or '-' but was 0x"
            r1.append(r2)
            r2 = 16
            int r2 = kotlin.text.c.a(r2)
            int r2 = kotlin.text.c.a(r2)
            java.lang.String r2 = java.lang.Integer.toString(r8, r2)
            java.lang.String r3 = "toString(this, checkRadix(radix))"
            kotlin.jvm.internal.l0.o(r2, r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L56:
            okio.l r0 = r10.f20920b
            long r0 = r0.g0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.h1.g0():long");
    }

    @Override // okio.BufferedSource
    public long i(@p4.l n bytes, long j5) {
        kotlin.jvm.internal.l0.p(bytes, "bytes");
        if (!(!this.f20921c)) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            long i5 = this.f20920b.i(bytes, j5);
            if (i5 == -1) {
                long M0 = this.f20920b.M0();
                if (this.f20919a.read(this.f20920b, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                    return -1L;
                }
                j5 = Math.max(j5, (M0 - bytes.size()) + 1);
            } else {
                return i5;
            }
        }
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f20921c;
    }

    @Override // okio.BufferedSource
    @p4.l
    public String j0(@p4.l Charset charset) {
        kotlin.jvm.internal.l0.p(charset, "charset");
        this.f20920b.G(this.f20919a);
        return this.f20920b.j0(charset);
    }

    @Override // okio.BufferedSource
    public int k0() {
        U(1L);
        byte P = this.f20920b.P(0L);
        if ((P & 224) == 192) {
            U(2L);
        } else if ((P & 240) == 224) {
            U(3L);
        } else if ((P & 248) == 240) {
            U(4L);
        }
        return this.f20920b.k0();
    }

    @Override // okio.BufferedSource
    @p4.l
    public n m0() {
        this.f20920b.G(this.f20919a);
        return this.f20920b.m0();
    }

    @Override // okio.BufferedSource
    @p4.l
    public BufferedSource peek() {
        return y0.e(new e1(this));
    }

    @Override // okio.BufferedSource
    public int q0() {
        U(4L);
        return this.f20920b.q0();
    }

    @Override // okio.BufferedSource
    public long r(@p4.l n bytes) {
        kotlin.jvm.internal.l0.p(bytes, "bytes");
        return i(bytes, 0L);
    }

    @Override // okio.BufferedSource
    public int read(@p4.l byte[] sink) {
        kotlin.jvm.internal.l0.p(sink, "sink");
        return read(sink, 0, sink.length);
    }

    @Override // okio.BufferedSource
    public byte readByte() {
        U(1L);
        return this.f20920b.readByte();
    }

    @Override // okio.BufferedSource
    public void readFully(@p4.l byte[] sink) {
        kotlin.jvm.internal.l0.p(sink, "sink");
        try {
            U(sink.length);
            this.f20920b.readFully(sink);
        } catch (EOFException e5) {
            int i5 = 0;
            while (this.f20920b.M0() > 0) {
                l lVar = this.f20920b;
                int read = lVar.read(sink, i5, (int) lVar.M0());
                if (read != -1) {
                    i5 += read;
                } else {
                    throw new AssertionError();
                }
            }
            throw e5;
        }
    }

    @Override // okio.BufferedSource
    public int readInt() {
        U(4L);
        return this.f20920b.readInt();
    }

    @Override // okio.BufferedSource
    public long readLong() {
        U(8L);
        return this.f20920b.readLong();
    }

    @Override // okio.BufferedSource
    public short readShort() {
        U(2L);
        return this.f20920b.readShort();
    }

    @Override // okio.BufferedSource
    public boolean request(long j5) {
        boolean z4;
        if (j5 >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (!(!this.f20921c)) {
                throw new IllegalStateException("closed".toString());
            }
            while (this.f20920b.M0() < j5) {
                if (this.f20919a.read(this.f20920b, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                    return false;
                }
            }
            return true;
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j5).toString());
    }

    @Override // okio.BufferedSource
    public long s(byte b5, long j5) {
        return u(b5, j5, Long.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    @p4.l
    public String s0() {
        this.f20920b.G(this.f20919a);
        return this.f20920b.s0();
    }

    @Override // okio.BufferedSource
    public void skip(long j5) {
        if (!this.f20921c) {
            while (j5 > 0) {
                if (this.f20920b.M0() == 0 && this.f20919a.read(this.f20920b, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j5, this.f20920b.M0());
                this.f20920b.skip(min);
                j5 -= min;
            }
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.BufferedSource
    public void t(@p4.l l sink, long j5) {
        kotlin.jvm.internal.l0.p(sink, "sink");
        try {
            U(j5);
            this.f20920b.t(sink, j5);
        } catch (EOFException e5) {
            sink.G(this.f20920b);
            throw e5;
        }
    }

    @Override // okio.n1
    @p4.l
    public p1 timeout() {
        return this.f20919a.timeout();
    }

    @p4.l
    public String toString() {
        return "buffer(" + this.f20919a + ')';
    }

    @Override // okio.BufferedSource
    public long u(byte b5, long j5, long j6) {
        boolean z4 = true;
        if (!this.f20921c) {
            if (0 > j5 || j5 > j6) {
                z4 = false;
            }
            if (z4) {
                while (j5 < j6) {
                    long u4 = this.f20920b.u(b5, j5, j6);
                    if (u4 != -1) {
                        return u4;
                    }
                    long M0 = this.f20920b.M0();
                    if (M0 >= j6 || this.f20919a.read(this.f20920b, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                        return -1L;
                    }
                    j5 = Math.max(j5, M0);
                }
                return -1L;
            }
            throw new IllegalArgumentException(("fromIndex=" + j5 + " toIndex=" + j6).toString());
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.BufferedSource
    @p4.l
    public String u0(long j5, @p4.l Charset charset) {
        kotlin.jvm.internal.l0.p(charset, "charset");
        U(j5);
        return this.f20920b.u0(j5, charset);
    }

    @Override // okio.BufferedSource
    public long v(@p4.l n targetBytes) {
        kotlin.jvm.internal.l0.p(targetBytes, "targetBytes");
        return T(targetBytes, 0L);
    }

    @Override // okio.BufferedSource
    @p4.m
    public String w() {
        long W = W((byte) 10);
        if (W == -1) {
            if (this.f20920b.M0() != 0) {
                return X(this.f20920b.M0());
            }
            return null;
        }
        return okio.internal.a.j0(this.f20920b, W);
    }

    @Override // okio.BufferedSource
    public long w0(@p4.l l1 sink) {
        kotlin.jvm.internal.l0.p(sink, "sink");
        long j5 = 0;
        while (this.f20919a.read(this.f20920b, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1) {
            long h5 = this.f20920b.h();
            if (h5 > 0) {
                j5 += h5;
                sink.write(this.f20920b, h5);
            }
        }
        if (this.f20920b.M0() > 0) {
            long M0 = j5 + this.f20920b.M0();
            l lVar = this.f20920b;
            sink.write(lVar, lVar.M0());
            return M0;
        }
        return j5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        if (r0 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
    
        r1 = new java.lang.StringBuilder();
        r1.append("Expected leading [0-9a-fA-F] character but was 0x");
        r3 = kotlin.text.d.a(16);
        r3 = kotlin.text.d.a(r3);
        r2 = java.lang.Integer.toString(r2, r3);
        kotlin.jvm.internal.l0.o(r2, "toString(this, checkRadix(radix))");
        r1.append(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        throw new java.lang.NumberFormatException(r1.toString());
     */
    @Override // okio.BufferedSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long y0() {
        /*
            r5 = this;
            r0 = 1
            r5.U(r0)
            r0 = 0
        L6:
            int r1 = r0 + 1
            long r2 = (long) r1
            boolean r2 = r5.request(r2)
            if (r2 == 0) goto L5e
            okio.l r2 = r5.f20920b
            long r3 = (long) r0
            byte r2 = r2.P(r3)
            r3 = 48
            if (r2 < r3) goto L1e
            r3 = 57
            if (r2 <= r3) goto L2f
        L1e:
            r3 = 97
            if (r2 < r3) goto L26
            r3 = 102(0x66, float:1.43E-43)
            if (r2 <= r3) goto L2f
        L26:
            r3 = 65
            if (r2 < r3) goto L31
            r3 = 70
            if (r2 <= r3) goto L2f
            goto L31
        L2f:
            r0 = r1
            goto L6
        L31:
            if (r0 == 0) goto L34
            goto L5e
        L34:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r3)
            r3 = 16
            int r3 = kotlin.text.c.a(r3)
            int r3 = kotlin.text.c.a(r3)
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            java.lang.String r3 = "toString(this, checkRadix(radix))"
            kotlin.jvm.internal.l0.o(r2, r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L5e:
            okio.l r0 = r5.f20920b
            long r0 = r0.y0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.h1.y0():long");
    }

    @Override // okio.BufferedSource
    @p4.l
    public String z(long j5) {
        boolean z4;
        long j6;
        if (j5 >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (j5 == Long.MAX_VALUE) {
                j6 = Long.MAX_VALUE;
            } else {
                j6 = j5 + 1;
            }
            long u4 = u((byte) 10, 0L, j6);
            if (u4 != -1) {
                return okio.internal.a.j0(this.f20920b, u4);
            }
            if (j6 < Long.MAX_VALUE && request(j6) && this.f20920b.P(j6 - 1) == 13 && request(1 + j6) && this.f20920b.P(j6) == 10) {
                return okio.internal.a.j0(this.f20920b, j6);
            }
            l lVar = new l();
            l lVar2 = this.f20920b;
            lVar2.y(lVar, 0L, Math.min(32, lVar2.M0()));
            throw new EOFException("\\n not found: limit=" + Math.min(this.f20920b.M0(), j5) + " content=" + lVar.m0().hex() + kotlin.text.k0.F);
        }
        throw new IllegalArgumentException(("limit < 0: " + j5).toString());
    }

    @Override // okio.BufferedSource
    @p4.l
    public InputStream z0() {
        return new a();
    }

    @Override // okio.n1
    public long read(@p4.l l sink, long j5) {
        kotlin.jvm.internal.l0.p(sink, "sink");
        if (j5 >= 0) {
            if (!(!this.f20921c)) {
                throw new IllegalStateException("closed".toString());
            }
            if (this.f20920b.M0() == 0 && this.f20919a.read(this.f20920b, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return -1L;
            }
            return this.f20920b.read(sink, Math.min(j5, this.f20920b.M0()));
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j5).toString());
    }

    @kotlin.i0(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"okio/RealBufferedSource$inputStream$1", "Ljava/io/InputStream;", "available", "", ILivePush.ClickType.CLOSE, "", "read", "data", "", TypedValues.CycleType.S_WAVE_OFFSET, "byteCount", "toString", "", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nRealBufferedSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealBufferedSource.kt\nokio/RealBufferedSource$inputStream$1\n+ 2 RealBufferedSource.kt\nokio/RealBufferedSource\n+ 3 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,185:1\n62#2:186\n62#2:187\n62#2:188\n62#2:190\n62#2:191\n62#2:192\n62#2:193\n74#3:189\n86#3:194\n*S KotlinDebug\n*F\n+ 1 RealBufferedSource.kt\nokio/RealBufferedSource$inputStream$1\n*L\n149#1:186\n150#1:187\n153#1:188\n160#1:190\n161#1:191\n165#1:192\n170#1:193\n153#1:189\n170#1:194\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class a extends InputStream {
        a() {
        }

        @Override // java.io.InputStream
        public int available() {
            h1 h1Var = h1.this;
            if (!h1Var.f20921c) {
                return (int) Math.min(h1Var.f20920b.M0(), Integer.MAX_VALUE);
            }
            throw new IOException("closed");
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            h1.this.close();
        }

        @Override // java.io.InputStream
        public int read() {
            h1 h1Var = h1.this;
            if (!h1Var.f20921c) {
                if (h1Var.f20920b.M0() == 0) {
                    h1 h1Var2 = h1.this;
                    if (h1Var2.f20919a.read(h1Var2.f20920b, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                        return -1;
                    }
                }
                return h1.this.f20920b.readByte() & y1.f19838d;
            }
            throw new IOException("closed");
        }

        @p4.l
        public String toString() {
            return h1.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(@p4.l byte[] data, int i5, int i6) {
            kotlin.jvm.internal.l0.p(data, "data");
            if (!h1.this.f20921c) {
                i.e(data.length, i5, i6);
                if (h1.this.f20920b.M0() == 0) {
                    h1 h1Var = h1.this;
                    if (h1Var.f20919a.read(h1Var.f20920b, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                        return -1;
                    }
                }
                return h1.this.f20920b.read(data, i5, i6);
            }
            throw new IOException("closed");
        }
    }

    @Override // okio.BufferedSource
    public int read(@p4.l byte[] sink, int i5, int i6) {
        kotlin.jvm.internal.l0.p(sink, "sink");
        long j5 = i6;
        i.e(sink.length, i5, j5);
        if (this.f20920b.M0() == 0 && this.f20919a.read(this.f20920b, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
            return -1;
        }
        return this.f20920b.read(sink, i5, (int) Math.min(j5, this.f20920b.M0()));
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(@p4.l ByteBuffer sink) {
        kotlin.jvm.internal.l0.p(sink, "sink");
        if (this.f20920b.M0() == 0 && this.f20919a.read(this.f20920b, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
            return -1;
        }
        return this.f20920b.read(sink);
    }
}
