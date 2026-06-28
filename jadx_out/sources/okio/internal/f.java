package okio.internal;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.EOFException;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.text.k0;
import okio.BufferedSource;
import okio.b1;
import okio.e1;
import okio.h1;
import okio.l1;
import okio.n;
import okio.p1;
import okio.y0;

@i0(d1 = {"\u0000j\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0080\b\u001a\r\u0010\u0003\u001a\u00020\u0004*\u00020\u0002H\u0080\b\u001a%\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0080\b\u001a\u001d\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0006H\u0080\b\u001a\u001d\u0010\r\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0006H\u0080\b\u001a\r\u0010\u000f\u001a\u00020\u0010*\u00020\u0002H\u0080\b\u001a-\u0010\u0011\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0080\b\u001a%\u0010\u0016\u001a\u00020\u0014*\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0080\b\u001a\u001d\u0010\u0016\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u0006H\u0080\b\u001a\u0015\u0010\u001a\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u001bH\u0080\b\u001a\r\u0010\u001c\u001a\u00020\b*\u00020\u0002H\u0080\b\u001a\r\u0010\u001d\u001a\u00020\u0018*\u00020\u0002H\u0080\b\u001a\u0015\u0010\u001d\u001a\u00020\u0018*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0006H\u0080\b\u001a\r\u0010\u001e\u001a\u00020\f*\u00020\u0002H\u0080\b\u001a\u0015\u0010\u001e\u001a\u00020\f*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0006H\u0080\b\u001a\r\u0010\u001f\u001a\u00020\u0006*\u00020\u0002H\u0080\b\u001a\u0015\u0010 \u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0018H\u0080\b\u001a\u001d\u0010 \u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u0006H\u0080\b\u001a\r\u0010!\u001a\u00020\u0006*\u00020\u0002H\u0080\b\u001a\r\u0010\"\u001a\u00020\u0014*\u00020\u0002H\u0080\b\u001a\r\u0010#\u001a\u00020\u0014*\u00020\u0002H\u0080\b\u001a\r\u0010$\u001a\u00020\u0006*\u00020\u0002H\u0080\b\u001a\r\u0010%\u001a\u00020\u0006*\u00020\u0002H\u0080\b\u001a\r\u0010&\u001a\u00020'*\u00020\u0002H\u0080\b\u001a\r\u0010(\u001a\u00020'*\u00020\u0002H\u0080\b\u001a\r\u0010)\u001a\u00020**\u00020\u0002H\u0080\b\u001a\u0015\u0010)\u001a\u00020**\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0006H\u0080\b\u001a\r\u0010+\u001a\u00020\u0014*\u00020\u0002H\u0080\b\u001a\u000f\u0010,\u001a\u0004\u0018\u00010**\u00020\u0002H\u0080\b\u001a\u0015\u0010-\u001a\u00020**\u00020\u00022\u0006\u0010.\u001a\u00020\u0006H\u0080\b\u001a\u0015\u0010/\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0006H\u0080\b\u001a\u0015\u00100\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0006H\u0080\b\u001a\u0015\u00101\u001a\u00020\u0014*\u00020\u00022\u0006\u00102\u001a\u000203H\u0080\b\u001a\u0015\u00104\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0006H\u0080\b\u001a\r\u00105\u001a\u000206*\u00020\u0002H\u0080\b\u001a\r\u00107\u001a\u00020**\u00020\u0002H\u0080\b¨\u00068"}, d2 = {"commonClose", "", "Lokio/RealBufferedSource;", "commonExhausted", "", "commonIndexOf", "", "b", "", "fromIndex", "toIndex", "bytes", "Lokio/ByteString;", "commonIndexOfElement", "targetBytes", "commonPeek", "Lokio/BufferedSource;", "commonRangeEquals", TypedValues.CycleType.S_WAVE_OFFSET, "bytesOffset", "", "byteCount", "commonRead", "sink", "", "Lokio/Buffer;", "commonReadAll", "Lokio/Sink;", "commonReadByte", "commonReadByteArray", "commonReadByteString", "commonReadDecimalLong", "commonReadFully", "commonReadHexadecimalUnsignedLong", "commonReadInt", "commonReadIntLe", "commonReadLong", "commonReadLongLe", "commonReadShort", "", "commonReadShortLe", "commonReadUtf8", "", "commonReadUtf8CodePoint", "commonReadUtf8Line", "commonReadUtf8LineStrict", "limit", "commonRequest", "commonRequire", "commonSelect", "options", "Lokio/Options;", "commonSkip", "commonTimeout", "Lokio/Timeout;", "commonToString", "okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
@u3.h(name = "-RealBufferedSource")
@r1({"SMAP\nRealBufferedSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealBufferedSource.kt\nokio/internal/-RealBufferedSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 RealBufferedSource.kt\nokio/RealBufferedSource\n+ 4 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,402:1\n1#2:403\n62#3:404\n62#3:405\n62#3:406\n62#3:407\n62#3:408\n62#3:409\n62#3:410\n62#3:411\n62#3:412\n62#3:413\n62#3:414\n62#3:415\n62#3:416\n62#3:417\n62#3:418\n62#3:419\n62#3:420\n62#3:421\n62#3:422\n62#3:423\n62#3:424\n62#3:425\n62#3:426\n62#3:428\n62#3:429\n62#3:430\n62#3:431\n62#3:432\n62#3:433\n62#3:434\n62#3:435\n62#3:436\n62#3:437\n62#3:438\n62#3:439\n62#3:440\n62#3:441\n62#3:442\n62#3:443\n62#3:444\n62#3:445\n62#3:446\n62#3:447\n62#3:449\n62#3:450\n62#3:451\n62#3:452\n62#3:453\n62#3:454\n62#3:455\n62#3:456\n62#3:457\n62#3:458\n62#3:459\n62#3:460\n62#3:461\n62#3:462\n62#3:463\n62#3:464\n62#3:465\n62#3:466\n62#3:467\n62#3:468\n62#3:469\n62#3:470\n62#3:471\n62#3:472\n62#3:473\n62#3:474\n62#3:475\n89#4:427\n89#4:448\n*S KotlinDebug\n*F\n+ 1 RealBufferedSource.kt\nokio/internal/-RealBufferedSource\n*L\n41#1:404\n42#1:405\n46#1:406\n47#1:407\n52#1:408\n62#1:409\n63#1:410\n70#1:411\n74#1:412\n75#1:413\n80#1:414\n87#1:415\n94#1:416\n99#1:417\n107#1:418\n108#1:419\n113#1:420\n122#1:421\n123#1:422\n130#1:423\n136#1:424\n137#1:425\n141#1:426\n142#1:428\n150#1:429\n154#1:430\n159#1:431\n160#1:432\n163#1:433\n166#1:434\n167#1:435\n168#1:436\n174#1:437\n175#1:438\n180#1:439\n187#1:440\n188#1:441\n193#1:442\n201#1:443\n203#1:444\n204#1:445\n206#1:446\n209#1:447\n211#1:449\n219#1:450\n226#1:451\n231#1:452\n236#1:453\n241#1:454\n246#1:455\n251#1:456\n256#1:457\n264#1:458\n275#1:459\n283#1:460\n297#1:461\n304#1:462\n307#1:463\n308#1:464\n319#1:465\n324#1:466\n325#1:467\n338#1:468\n341#1:469\n342#1:470\n354#1:471\n357#1:472\n358#1:473\n383#1:474\n396#1:475\n141#1:427\n209#1:448\n*E\n"})
/* loaded from: classes4.dex */
public final class f {
    @p4.l
    public static final String A(@p4.l h1 h1Var, long j5) {
        l0.p(h1Var, "<this>");
        h1Var.U(j5);
        return h1Var.f20920b.X(j5);
    }

    public static final int B(@p4.l h1 h1Var) {
        l0.p(h1Var, "<this>");
        h1Var.U(1L);
        byte P = h1Var.f20920b.P(0L);
        if ((P & 224) == 192) {
            h1Var.U(2L);
        } else if ((P & 240) == 224) {
            h1Var.U(3L);
        } else if ((P & 248) == 240) {
            h1Var.U(4L);
        }
        return h1Var.f20920b.k0();
    }

    @p4.m
    public static final String C(@p4.l h1 h1Var) {
        l0.p(h1Var, "<this>");
        long W = h1Var.W((byte) 10);
        if (W == -1) {
            if (h1Var.f20920b.M0() != 0) {
                return h1Var.X(h1Var.f20920b.M0());
            }
            return null;
        }
        return a.j0(h1Var.f20920b, W);
    }

    @p4.l
    public static final String D(@p4.l h1 h1Var, long j5) {
        boolean z4;
        long j6;
        l0.p(h1Var, "<this>");
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
            long u4 = h1Var.u((byte) 10, 0L, j6);
            if (u4 != -1) {
                return a.j0(h1Var.f20920b, u4);
            }
            if (j6 < Long.MAX_VALUE && h1Var.request(j6) && h1Var.f20920b.P(j6 - 1) == 13 && h1Var.request(1 + j6) && h1Var.f20920b.P(j6) == 10) {
                return a.j0(h1Var.f20920b, j6);
            }
            okio.l lVar = new okio.l();
            okio.l lVar2 = h1Var.f20920b;
            lVar2.y(lVar, 0L, Math.min(32, lVar2.M0()));
            throw new EOFException("\\n not found: limit=" + Math.min(h1Var.f20920b.M0(), j5) + " content=" + lVar.m0().hex() + k0.F);
        }
        throw new IllegalArgumentException(("limit < 0: " + j5).toString());
    }

    public static final boolean E(@p4.l h1 h1Var, long j5) {
        boolean z4;
        l0.p(h1Var, "<this>");
        if (j5 >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (!(!h1Var.f20921c)) {
                throw new IllegalStateException("closed".toString());
            }
            while (h1Var.f20920b.M0() < j5) {
                if (h1Var.f20919a.read(h1Var.f20920b, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                    return false;
                }
            }
            return true;
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j5).toString());
    }

    public static final void F(@p4.l h1 h1Var, long j5) {
        l0.p(h1Var, "<this>");
        if (h1Var.request(j5)) {
        } else {
            throw new EOFException();
        }
    }

    public static final int G(@p4.l h1 h1Var, @p4.l b1 options) {
        l0.p(h1Var, "<this>");
        l0.p(options, "options");
        if (!(!h1Var.f20921c)) {
            throw new IllegalStateException("closed".toString());
        }
        do {
            int l02 = a.l0(h1Var.f20920b, options, true);
            if (l02 != -2) {
                if (l02 == -1) {
                    return -1;
                }
                h1Var.f20920b.skip(options.e()[l02].size());
                return l02;
            }
        } while (h1Var.f20919a.read(h1Var.f20920b, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1);
        return -1;
    }

    public static final void H(@p4.l h1 h1Var, long j5) {
        l0.p(h1Var, "<this>");
        if (!h1Var.f20921c) {
            while (j5 > 0) {
                if (h1Var.f20920b.M0() == 0 && h1Var.f20919a.read(h1Var.f20920b, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j5, h1Var.f20920b.M0());
                h1Var.f20920b.skip(min);
                j5 -= min;
            }
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @p4.l
    public static final p1 I(@p4.l h1 h1Var) {
        l0.p(h1Var, "<this>");
        return h1Var.f20919a.timeout();
    }

    @p4.l
    public static final String J(@p4.l h1 h1Var) {
        l0.p(h1Var, "<this>");
        return "buffer(" + h1Var.f20919a + ')';
    }

    public static final void a(@p4.l h1 h1Var) {
        l0.p(h1Var, "<this>");
        if (h1Var.f20921c) {
            return;
        }
        h1Var.f20921c = true;
        h1Var.f20919a.close();
        h1Var.f20920b.c();
    }

    public static final boolean b(@p4.l h1 h1Var) {
        l0.p(h1Var, "<this>");
        if (!h1Var.f20921c) {
            if (h1Var.f20920b.e0() && h1Var.f20919a.read(h1Var.f20920b, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return true;
            }
            return false;
        }
        throw new IllegalStateException("closed".toString());
    }

    public static final long c(@p4.l h1 h1Var, byte b5, long j5, long j6) {
        l0.p(h1Var, "<this>");
        boolean z4 = true;
        if (!h1Var.f20921c) {
            if (0 > j5 || j5 > j6) {
                z4 = false;
            }
            if (z4) {
                while (j5 < j6) {
                    long u4 = h1Var.f20920b.u(b5, j5, j6);
                    if (u4 != -1) {
                        return u4;
                    }
                    long M0 = h1Var.f20920b.M0();
                    if (M0 >= j6 || h1Var.f20919a.read(h1Var.f20920b, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                        break;
                    }
                    j5 = Math.max(j5, M0);
                }
                return -1L;
            }
            throw new IllegalArgumentException(("fromIndex=" + j5 + " toIndex=" + j6).toString());
        }
        throw new IllegalStateException("closed".toString());
    }

    public static final long d(@p4.l h1 h1Var, @p4.l n bytes, long j5) {
        l0.p(h1Var, "<this>");
        l0.p(bytes, "bytes");
        if (!(!h1Var.f20921c)) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            long i5 = h1Var.f20920b.i(bytes, j5);
            if (i5 != -1) {
                return i5;
            }
            long M0 = h1Var.f20920b.M0();
            if (h1Var.f20919a.read(h1Var.f20920b, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return -1L;
            }
            j5 = Math.max(j5, (M0 - bytes.size()) + 1);
        }
    }

    public static final long e(@p4.l h1 h1Var, @p4.l n targetBytes, long j5) {
        l0.p(h1Var, "<this>");
        l0.p(targetBytes, "targetBytes");
        if (!(!h1Var.f20921c)) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            long T = h1Var.f20920b.T(targetBytes, j5);
            if (T != -1) {
                return T;
            }
            long M0 = h1Var.f20920b.M0();
            if (h1Var.f20919a.read(h1Var.f20920b, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return -1L;
            }
            j5 = Math.max(j5, M0);
        }
    }

    @p4.l
    public static final BufferedSource f(@p4.l h1 h1Var) {
        l0.p(h1Var, "<this>");
        return y0.e(new e1(h1Var));
    }

    public static final boolean g(@p4.l h1 h1Var, long j5, @p4.l n bytes, int i5, int i6) {
        l0.p(h1Var, "<this>");
        l0.p(bytes, "bytes");
        if (!h1Var.f20921c) {
            if (j5 < 0 || i5 < 0 || i6 < 0 || bytes.size() - i5 < i6) {
                return false;
            }
            for (int i7 = 0; i7 < i6; i7++) {
                long j6 = i7 + j5;
                if (!h1Var.request(1 + j6) || h1Var.f20920b.P(j6) != bytes.getByte(i5 + i7)) {
                    return false;
                }
            }
            return true;
        }
        throw new IllegalStateException("closed".toString());
    }

    public static final int h(@p4.l h1 h1Var, @p4.l byte[] sink, int i5, int i6) {
        l0.p(h1Var, "<this>");
        l0.p(sink, "sink");
        long j5 = i6;
        okio.i.e(sink.length, i5, j5);
        if (h1Var.f20920b.M0() == 0 && h1Var.f20919a.read(h1Var.f20920b, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
            return -1;
        }
        return h1Var.f20920b.read(sink, i5, (int) Math.min(j5, h1Var.f20920b.M0()));
    }

    public static final long i(@p4.l h1 h1Var, @p4.l okio.l sink, long j5) {
        boolean z4;
        l0.p(h1Var, "<this>");
        l0.p(sink, "sink");
        if (j5 >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (!h1Var.f20921c) {
                if (h1Var.f20920b.M0() == 0 && h1Var.f20919a.read(h1Var.f20920b, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                    return -1L;
                }
                return h1Var.f20920b.read(sink, Math.min(j5, h1Var.f20920b.M0()));
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j5).toString());
    }

    public static final long j(@p4.l h1 h1Var, @p4.l l1 sink) {
        l0.p(h1Var, "<this>");
        l0.p(sink, "sink");
        long j5 = 0;
        while (h1Var.f20919a.read(h1Var.f20920b, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1) {
            long h5 = h1Var.f20920b.h();
            if (h5 > 0) {
                j5 += h5;
                sink.write(h1Var.f20920b, h5);
            }
        }
        if (h1Var.f20920b.M0() > 0) {
            long M0 = j5 + h1Var.f20920b.M0();
            okio.l lVar = h1Var.f20920b;
            sink.write(lVar, lVar.M0());
            return M0;
        }
        return j5;
    }

    public static final byte k(@p4.l h1 h1Var) {
        l0.p(h1Var, "<this>");
        h1Var.U(1L);
        return h1Var.f20920b.readByte();
    }

    @p4.l
    public static final byte[] l(@p4.l h1 h1Var) {
        l0.p(h1Var, "<this>");
        h1Var.f20920b.G(h1Var.f20919a);
        return h1Var.f20920b.c0();
    }

    @p4.l
    public static final byte[] m(@p4.l h1 h1Var, long j5) {
        l0.p(h1Var, "<this>");
        h1Var.U(j5);
        return h1Var.f20920b.N(j5);
    }

    @p4.l
    public static final n n(@p4.l h1 h1Var) {
        l0.p(h1Var, "<this>");
        h1Var.f20920b.G(h1Var.f20919a);
        return h1Var.f20920b.m0();
    }

    @p4.l
    public static final n o(@p4.l h1 h1Var, long j5) {
        l0.p(h1Var, "<this>");
        h1Var.U(j5);
        return h1Var.f20920b.Y(j5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
    
        if (r4 == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        r0 = new java.lang.StringBuilder();
        r0.append("Expected a digit or '-' but was 0x");
        r1 = kotlin.text.d.a(16);
        r1 = kotlin.text.d.a(r1);
        r1 = java.lang.Integer.toString(r8, r1);
        kotlin.jvm.internal.l0.o(r1, "toString(this, checkRadix(radix))");
        r0.append(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        throw new java.lang.NumberFormatException(r0.toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long p(@p4.l okio.h1 r10) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.l0.p(r10, r0)
            r0 = 1
            r10.U(r0)
            r2 = 0
            r4 = r2
        Ld:
            long r6 = r4 + r0
            boolean r8 = r10.request(r6)
            if (r8 == 0) goto L5b
            okio.l r8 = r10.f20920b
            byte r8 = r8.P(r4)
            r9 = 48
            if (r8 < r9) goto L23
            r9 = 57
            if (r8 <= r9) goto L2c
        L23:
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 != 0) goto L2e
            r5 = 45
            if (r8 == r5) goto L2c
            goto L2e
        L2c:
            r4 = r6
            goto Ld
        L2e:
            if (r4 == 0) goto L31
            goto L5b
        L31:
            java.lang.NumberFormatException r10 = new java.lang.NumberFormatException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Expected a digit or '-' but was 0x"
            r0.append(r1)
            r1 = 16
            int r1 = kotlin.text.c.a(r1)
            int r1 = kotlin.text.c.a(r1)
            java.lang.String r1 = java.lang.Integer.toString(r8, r1)
            java.lang.String r2 = "toString(this, checkRadix(radix))"
            kotlin.jvm.internal.l0.o(r1, r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        L5b:
            okio.l r10 = r10.f20920b
            long r0 = r10.g0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.f.p(okio.h1):long");
    }

    public static final void q(@p4.l h1 h1Var, @p4.l okio.l sink, long j5) {
        l0.p(h1Var, "<this>");
        l0.p(sink, "sink");
        try {
            h1Var.U(j5);
            h1Var.f20920b.t(sink, j5);
        } catch (EOFException e5) {
            sink.G(h1Var.f20920b);
            throw e5;
        }
    }

    public static final void r(@p4.l h1 h1Var, @p4.l byte[] sink) {
        l0.p(h1Var, "<this>");
        l0.p(sink, "sink");
        try {
            h1Var.U(sink.length);
            h1Var.f20920b.readFully(sink);
        } catch (EOFException e5) {
            int i5 = 0;
            while (h1Var.f20920b.M0() > 0) {
                okio.l lVar = h1Var.f20920b;
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

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0036, code lost:
    
        if (r0 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0039, code lost:
    
        r0 = new java.lang.StringBuilder();
        r0.append("Expected leading [0-9a-fA-F] character but was 0x");
        r1 = kotlin.text.d.a(16);
        r1 = kotlin.text.d.a(r1);
        r1 = java.lang.Integer.toString(r2, r1);
        kotlin.jvm.internal.l0.o(r1, "toString(this, checkRadix(radix))");
        r0.append(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        throw new java.lang.NumberFormatException(r0.toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long s(@p4.l okio.h1 r5) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.l0.p(r5, r0)
            r0 = 1
            r5.U(r0)
            r0 = 0
        Lb:
            int r1 = r0 + 1
            long r2 = (long) r1
            boolean r2 = r5.request(r2)
            if (r2 == 0) goto L63
            okio.l r2 = r5.f20920b
            long r3 = (long) r0
            byte r2 = r2.P(r3)
            r3 = 48
            if (r2 < r3) goto L23
            r3 = 57
            if (r2 <= r3) goto L34
        L23:
            r3 = 97
            if (r2 < r3) goto L2b
            r3 = 102(0x66, float:1.43E-43)
            if (r2 <= r3) goto L34
        L2b:
            r3 = 65
            if (r2 < r3) goto L36
            r3 = 70
            if (r2 <= r3) goto L34
            goto L36
        L34:
            r0 = r1
            goto Lb
        L36:
            if (r0 == 0) goto L39
            goto L63
        L39:
            java.lang.NumberFormatException r5 = new java.lang.NumberFormatException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            r0.append(r1)
            r1 = 16
            int r1 = kotlin.text.c.a(r1)
            int r1 = kotlin.text.c.a(r1)
            java.lang.String r1 = java.lang.Integer.toString(r2, r1)
            java.lang.String r2 = "toString(this, checkRadix(radix))"
            kotlin.jvm.internal.l0.o(r1, r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L63:
            okio.l r5 = r5.f20920b
            long r0 = r5.y0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.f.s(okio.h1):long");
    }

    public static final int t(@p4.l h1 h1Var) {
        l0.p(h1Var, "<this>");
        h1Var.U(4L);
        return h1Var.f20920b.readInt();
    }

    public static final int u(@p4.l h1 h1Var) {
        l0.p(h1Var, "<this>");
        h1Var.U(4L);
        return h1Var.f20920b.q0();
    }

    public static final long v(@p4.l h1 h1Var) {
        l0.p(h1Var, "<this>");
        h1Var.U(8L);
        return h1Var.f20920b.readLong();
    }

    public static final long w(@p4.l h1 h1Var) {
        l0.p(h1Var, "<this>");
        h1Var.U(8L);
        return h1Var.f20920b.R();
    }

    public static final short x(@p4.l h1 h1Var) {
        l0.p(h1Var, "<this>");
        h1Var.U(2L);
        return h1Var.f20920b.readShort();
    }

    public static final short y(@p4.l h1 h1Var) {
        l0.p(h1Var, "<this>");
        h1Var.U(2L);
        return h1Var.f20920b.Q();
    }

    @p4.l
    public static final String z(@p4.l h1 h1Var) {
        l0.p(h1Var, "<this>");
        h1Var.f20920b.G(h1Var.f20919a);
        return h1Var.f20920b.s0();
    }
}
