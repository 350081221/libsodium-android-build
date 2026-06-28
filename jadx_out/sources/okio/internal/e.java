package okio.internal;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.umeng.analytics.pro.bi;
import java.io.EOFException;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import okio.g1;
import okio.l1;
import okio.n;
import okio.n1;
import okio.p1;

@i0(d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0080\b\u001a\r\u0010\u0003\u001a\u00020\u0004*\u00020\u0002H\u0080\b\u001a\r\u0010\u0005\u001a\u00020\u0004*\u00020\u0002H\u0080\b\u001a\r\u0010\u0006\u001a\u00020\u0001*\u00020\u0002H\u0080\b\u001a\r\u0010\u0007\u001a\u00020\b*\u00020\u0002H\u0080\b\u001a\r\u0010\t\u001a\u00020\n*\u00020\u0002H\u0080\b\u001a\u0015\u0010\u000b\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0080\b\u001a%\u0010\u000b\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0080\b\u001a\u001d\u0010\u000b\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\f\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0012H\u0080\b\u001a\u0015\u0010\u000b\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0080\b\u001a%\u0010\u000b\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0080\b\u001a\u001d\u0010\u000b\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\f\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u0012H\u0080\b\u001a\u0015\u0010\u0016\u001a\u00020\u0012*\u00020\u00022\u0006\u0010\f\u001a\u00020\u0015H\u0080\b\u001a\u0015\u0010\u0017\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u000fH\u0080\b\u001a\u0015\u0010\u0019\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0012H\u0080\b\u001a\u0015\u0010\u001b\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0012H\u0080\b\u001a\u0015\u0010\u001c\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u000fH\u0080\b\u001a\u0015\u0010\u001e\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u000fH\u0080\b\u001a\u0015\u0010\u001f\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0012H\u0080\b\u001a\u0015\u0010 \u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0012H\u0080\b\u001a\u0015\u0010!\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\"\u001a\u00020\u000fH\u0080\b\u001a\u0015\u0010#\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\"\u001a\u00020\u000fH\u0080\b\u001a\u0015\u0010$\u001a\u00020\u0004*\u00020\u00022\u0006\u0010%\u001a\u00020\nH\u0080\b\u001a%\u0010$\u001a\u00020\u0004*\u00020\u00022\u0006\u0010%\u001a\u00020\n2\u0006\u0010&\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\u000fH\u0080\b\u001a\u0015\u0010(\u001a\u00020\u0004*\u00020\u00022\u0006\u0010)\u001a\u00020\u000fH\u0080\b¨\u0006*"}, d2 = {"commonClose", "", "Lokio/RealBufferedSink;", "commonEmit", "Lokio/BufferedSink;", "commonEmitCompleteSegments", "commonFlush", "commonTimeout", "Lokio/Timeout;", "commonToString", "", "commonWrite", "source", "", TypedValues.CycleType.S_WAVE_OFFSET, "", "byteCount", "Lokio/Buffer;", "", "byteString", "Lokio/ByteString;", "Lokio/Source;", "commonWriteAll", "commonWriteByte", "b", "commonWriteDecimalLong", "v", "commonWriteHexadecimalUnsignedLong", "commonWriteInt", "i", "commonWriteIntLe", "commonWriteLong", "commonWriteLongLe", "commonWriteShort", bi.aE, "commonWriteShortLe", "commonWriteUtf8", TypedValues.Custom.S_STRING, "beginIndex", "endIndex", "commonWriteUtf8CodePoint", "codePoint", "okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
@u3.h(name = "-RealBufferedSink")
@r1({"SMAP\nRealBufferedSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealBufferedSink.kt\nokio/internal/-RealBufferedSink\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 RealBufferedSink.kt\nokio/RealBufferedSink\n*L\n1#1,219:1\n1#2:220\n51#3:221\n51#3:222\n51#3:223\n51#3:224\n51#3:225\n51#3:226\n51#3:227\n51#3:228\n51#3:229\n51#3:230\n51#3:231\n51#3:232\n51#3:233\n51#3:234\n51#3:235\n51#3:236\n51#3:237\n51#3:238\n51#3:239\n51#3:240\n51#3:241\n51#3:242\n51#3:243\n51#3:244\n51#3:245\n51#3:246\n51#3:247\n*S KotlinDebug\n*F\n+ 1 RealBufferedSink.kt\nokio/internal/-RealBufferedSink\n*L\n35#1:221\n41#1:222\n51#1:223\n57#1:224\n67#1:225\n73#1:226\n79#1:227\n89#1:228\n96#1:229\n107#1:230\n117#1:231\n123#1:232\n129#1:233\n135#1:234\n141#1:235\n147#1:236\n153#1:237\n159#1:238\n165#1:239\n171#1:240\n172#1:241\n178#1:242\n179#1:243\n185#1:244\n186#1:245\n198#1:246\n199#1:247\n*E\n"})
/* loaded from: classes4.dex */
public final class e {
    public static final void a(@p4.l g1 g1Var) {
        l0.p(g1Var, "<this>");
        if (g1Var.f20916c) {
            return;
        }
        try {
            if (g1Var.f20915b.M0() > 0) {
                l1 l1Var = g1Var.f20914a;
                okio.l lVar = g1Var.f20915b;
                l1Var.write(lVar, lVar.M0());
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            g1Var.f20914a.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        g1Var.f20916c = true;
        if (th == null) {
        } else {
            throw th;
        }
    }

    @p4.l
    public static final okio.m b(@p4.l g1 g1Var) {
        l0.p(g1Var, "<this>");
        if (!g1Var.f20916c) {
            long M0 = g1Var.f20915b.M0();
            if (M0 > 0) {
                g1Var.f20914a.write(g1Var.f20915b, M0);
            }
            return g1Var;
        }
        throw new IllegalStateException("closed".toString());
    }

    @p4.l
    public static final okio.m c(@p4.l g1 g1Var) {
        l0.p(g1Var, "<this>");
        if (!g1Var.f20916c) {
            long h5 = g1Var.f20915b.h();
            if (h5 > 0) {
                g1Var.f20914a.write(g1Var.f20915b, h5);
            }
            return g1Var;
        }
        throw new IllegalStateException("closed".toString());
    }

    public static final void d(@p4.l g1 g1Var) {
        l0.p(g1Var, "<this>");
        if (!g1Var.f20916c) {
            if (g1Var.f20915b.M0() > 0) {
                l1 l1Var = g1Var.f20914a;
                okio.l lVar = g1Var.f20915b;
                l1Var.write(lVar, lVar.M0());
            }
            g1Var.f20914a.flush();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @p4.l
    public static final p1 e(@p4.l g1 g1Var) {
        l0.p(g1Var, "<this>");
        return g1Var.f20914a.timeout();
    }

    @p4.l
    public static final String f(@p4.l g1 g1Var) {
        l0.p(g1Var, "<this>");
        return "buffer(" + g1Var.f20914a + ')';
    }

    @p4.l
    public static final okio.m g(@p4.l g1 g1Var, @p4.l n byteString) {
        l0.p(g1Var, "<this>");
        l0.p(byteString, "byteString");
        if (!g1Var.f20916c) {
            g1Var.f20915b.v0(byteString);
            return g1Var.x();
        }
        throw new IllegalStateException("closed".toString());
    }

    @p4.l
    public static final okio.m h(@p4.l g1 g1Var, @p4.l n byteString, int i5, int i6) {
        l0.p(g1Var, "<this>");
        l0.p(byteString, "byteString");
        if (!g1Var.f20916c) {
            g1Var.f20915b.Z(byteString, i5, i6);
            return g1Var.x();
        }
        throw new IllegalStateException("closed".toString());
    }

    @p4.l
    public static final okio.m i(@p4.l g1 g1Var, @p4.l n1 source, long j5) {
        l0.p(g1Var, "<this>");
        l0.p(source, "source");
        while (j5 > 0) {
            long read = source.read(g1Var.f20915b, j5);
            if (read != -1) {
                j5 -= read;
                g1Var.x();
            } else {
                throw new EOFException();
            }
        }
        return g1Var;
    }

    @p4.l
    public static final okio.m j(@p4.l g1 g1Var, @p4.l byte[] source) {
        l0.p(g1Var, "<this>");
        l0.p(source, "source");
        if (!g1Var.f20916c) {
            g1Var.f20915b.write(source);
            return g1Var.x();
        }
        throw new IllegalStateException("closed".toString());
    }

    @p4.l
    public static final okio.m k(@p4.l g1 g1Var, @p4.l byte[] source, int i5, int i6) {
        l0.p(g1Var, "<this>");
        l0.p(source, "source");
        if (!g1Var.f20916c) {
            g1Var.f20915b.write(source, i5, i6);
            return g1Var.x();
        }
        throw new IllegalStateException("closed".toString());
    }

    public static final void l(@p4.l g1 g1Var, @p4.l okio.l source, long j5) {
        l0.p(g1Var, "<this>");
        l0.p(source, "source");
        if (!g1Var.f20916c) {
            g1Var.f20915b.write(source, j5);
            g1Var.x();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    public static final long m(@p4.l g1 g1Var, @p4.l n1 source) {
        l0.p(g1Var, "<this>");
        l0.p(source, "source");
        long j5 = 0;
        while (true) {
            long read = source.read(g1Var.f20915b, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
            if (read != -1) {
                j5 += read;
                g1Var.x();
            } else {
                return j5;
            }
        }
    }

    @p4.l
    public static final okio.m n(@p4.l g1 g1Var, int i5) {
        l0.p(g1Var, "<this>");
        if (!g1Var.f20916c) {
            g1Var.f20915b.writeByte(i5);
            return g1Var.x();
        }
        throw new IllegalStateException("closed".toString());
    }

    @p4.l
    public static final okio.m o(@p4.l g1 g1Var, long j5) {
        l0.p(g1Var, "<this>");
        if (!g1Var.f20916c) {
            g1Var.f20915b.V(j5);
            return g1Var.x();
        }
        throw new IllegalStateException("closed".toString());
    }

    @p4.l
    public static final okio.m p(@p4.l g1 g1Var, long j5) {
        l0.p(g1Var, "<this>");
        if (!g1Var.f20916c) {
            g1Var.f20915b.l0(j5);
            return g1Var.x();
        }
        throw new IllegalStateException("closed".toString());
    }

    @p4.l
    public static final okio.m q(@p4.l g1 g1Var, int i5) {
        l0.p(g1Var, "<this>");
        if (!g1Var.f20916c) {
            g1Var.f20915b.writeInt(i5);
            return g1Var.x();
        }
        throw new IllegalStateException("closed".toString());
    }

    @p4.l
    public static final okio.m r(@p4.l g1 g1Var, int i5) {
        l0.p(g1Var, "<this>");
        if (!g1Var.f20916c) {
            g1Var.f20915b.d0(i5);
            return g1Var.x();
        }
        throw new IllegalStateException("closed".toString());
    }

    @p4.l
    public static final okio.m s(@p4.l g1 g1Var, long j5) {
        l0.p(g1Var, "<this>");
        if (!g1Var.f20916c) {
            g1Var.f20915b.writeLong(j5);
            return g1Var.x();
        }
        throw new IllegalStateException("closed".toString());
    }

    @p4.l
    public static final okio.m t(@p4.l g1 g1Var, long j5) {
        l0.p(g1Var, "<this>");
        if (!g1Var.f20916c) {
            g1Var.f20915b.n(j5);
            return g1Var.x();
        }
        throw new IllegalStateException("closed".toString());
    }

    @p4.l
    public static final okio.m u(@p4.l g1 g1Var, int i5) {
        l0.p(g1Var, "<this>");
        if (!g1Var.f20916c) {
            g1Var.f20915b.writeShort(i5);
            return g1Var.x();
        }
        throw new IllegalStateException("closed".toString());
    }

    @p4.l
    public static final okio.m v(@p4.l g1 g1Var, int i5) {
        l0.p(g1Var, "<this>");
        if (!g1Var.f20916c) {
            g1Var.f20915b.h0(i5);
            return g1Var.x();
        }
        throw new IllegalStateException("closed".toString());
    }

    @p4.l
    public static final okio.m w(@p4.l g1 g1Var, @p4.l String string) {
        l0.p(g1Var, "<this>");
        l0.p(string, "string");
        if (!g1Var.f20916c) {
            g1Var.f20915b.C(string);
            return g1Var.x();
        }
        throw new IllegalStateException("closed".toString());
    }

    @p4.l
    public static final okio.m x(@p4.l g1 g1Var, @p4.l String string, int i5, int i6) {
        l0.p(g1Var, "<this>");
        l0.p(string, "string");
        if (!g1Var.f20916c) {
            g1Var.f20915b.F(string, i5, i6);
            return g1Var.x();
        }
        throw new IllegalStateException("closed".toString());
    }

    @p4.l
    public static final okio.m y(@p4.l g1 g1Var, int i5) {
        l0.p(g1Var, "<this>");
        if (!g1Var.f20916c) {
            g1Var.f20915b.l(i5);
            return g1Var.x();
        }
        throw new IllegalStateException("closed".toString());
    }
}
