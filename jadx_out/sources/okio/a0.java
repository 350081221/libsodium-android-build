package okio;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.android.live.base.api.push.ILivePush;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.m2;

@kotlin.i0(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\b\u0010\u0014\u001a\u00020\u000eH\u0016J\b\u0010\u0015\u001a\u00020\u000eH\u0002J\b\u0010\u0016\u001a\u00020\u000eH\u0002J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0018H\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016J \u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0018H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lokio/GzipSource;", "Lokio/Source;", "source", "(Lokio/Source;)V", "crc", "Ljava/util/zip/CRC32;", "inflater", "Ljava/util/zip/Inflater;", "inflaterSource", "Lokio/InflaterSource;", "section", "", "Lokio/RealBufferedSource;", "checkEqual", "", "name", "", "expected", "", "actual", ILivePush.ClickType.CLOSE, "consumeHeader", "consumeTrailer", "read", "", "sink", "Lokio/Buffer;", "byteCount", m0.a.Z, "Lokio/Timeout;", "updateCrc", "buffer", TypedValues.CycleType.S_WAVE_OFFSET, "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nGzipSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GzipSource.kt\nokio/GzipSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 RealBufferedSource.kt\nokio/RealBufferedSource\n+ 4 GzipSource.kt\nokio/-GzipSourceExtensions\n+ 5 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,220:1\n1#2:221\n62#3:222\n62#3:224\n62#3:226\n62#3:227\n62#3:228\n62#3:230\n62#3:232\n202#4:223\n202#4:225\n202#4:229\n202#4:231\n89#5:233\n*S KotlinDebug\n*F\n+ 1 GzipSource.kt\nokio/GzipSource\n*L\n105#1:222\n107#1:224\n119#1:226\n120#1:227\n122#1:228\n133#1:230\n144#1:232\n106#1:223\n117#1:225\n130#1:229\n141#1:231\n187#1:233\n*E\n"})
/* loaded from: classes4.dex */
public final class a0 implements n1 {

    /* renamed from: a, reason: collision with root package name */
    private byte f20856a;

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    private final h1 f20857b;

    /* renamed from: c, reason: collision with root package name */
    @p4.l
    private final Inflater f20858c;

    /* renamed from: d, reason: collision with root package name */
    @p4.l
    private final d0 f20859d;

    /* renamed from: e, reason: collision with root package name */
    @p4.l
    private final CRC32 f20860e;

    public a0(@p4.l n1 source) {
        kotlin.jvm.internal.l0.p(source, "source");
        h1 h1Var = new h1(source);
        this.f20857b = h1Var;
        Inflater inflater = new Inflater(true);
        this.f20858c = inflater;
        this.f20859d = new d0((BufferedSource) h1Var, inflater);
        this.f20860e = new CRC32();
    }

    private final void a(String str, int i5, int i6) {
        if (i6 == i5) {
            return;
        }
        String format = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i6), Integer.valueOf(i5)}, 3));
        kotlin.jvm.internal.l0.o(format, "format(this, *args)");
        throw new IOException(format);
    }

    private final void b() throws IOException {
        boolean z4;
        boolean z5;
        boolean z6;
        this.f20857b.U(10L);
        byte P = this.f20857b.f20920b.P(3L);
        boolean z7 = true;
        if (((P >> 1) & 1) == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            d(this.f20857b.f20920b, 0L, 10L);
        }
        a("ID1ID2", 8075, this.f20857b.readShort());
        this.f20857b.skip(8L);
        if (((P >> 2) & 1) == 1) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            this.f20857b.U(2L);
            if (z4) {
                d(this.f20857b.f20920b, 0L, 2L);
            }
            long Q = this.f20857b.f20920b.Q() & m2.f19496d;
            this.f20857b.U(Q);
            if (z4) {
                d(this.f20857b.f20920b, 0L, Q);
            }
            this.f20857b.skip(Q);
        }
        if (((P >> 3) & 1) == 1) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z6) {
            long W = this.f20857b.W((byte) 0);
            if (W != -1) {
                if (z4) {
                    d(this.f20857b.f20920b, 0L, W + 1);
                }
                this.f20857b.skip(W + 1);
            } else {
                throw new EOFException();
            }
        }
        if (((P >> 4) & 1) != 1) {
            z7 = false;
        }
        if (z7) {
            long W2 = this.f20857b.W((byte) 0);
            if (W2 != -1) {
                if (z4) {
                    d(this.f20857b.f20920b, 0L, W2 + 1);
                }
                this.f20857b.skip(W2 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (z4) {
            a("FHCRC", this.f20857b.Q(), (short) this.f20860e.getValue());
            this.f20860e.reset();
        }
    }

    private final void c() throws IOException {
        a("CRC", this.f20857b.q0(), (int) this.f20860e.getValue());
        a("ISIZE", this.f20857b.q0(), (int) this.f20858c.getBytesWritten());
    }

    private final void d(l lVar, long j5, long j6) {
        i1 i1Var = lVar.f20987a;
        kotlin.jvm.internal.l0.m(i1Var);
        while (true) {
            int i5 = i1Var.f20930c;
            int i6 = i1Var.f20929b;
            if (j5 < i5 - i6) {
                break;
            }
            j5 -= i5 - i6;
            i1Var = i1Var.f20933f;
            kotlin.jvm.internal.l0.m(i1Var);
        }
        while (j6 > 0) {
            int min = (int) Math.min(i1Var.f20930c - r6, j6);
            this.f20860e.update(i1Var.f20928a, (int) (i1Var.f20929b + j5), min);
            j6 -= min;
            i1Var = i1Var.f20933f;
            kotlin.jvm.internal.l0.m(i1Var);
            j5 = 0;
        }
    }

    @Override // okio.n1, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f20859d.close();
    }

    @Override // okio.n1
    public long read(@p4.l l sink, long j5) throws IOException {
        boolean z4;
        kotlin.jvm.internal.l0.p(sink, "sink");
        if (j5 >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (j5 == 0) {
                return 0L;
            }
            if (this.f20856a == 0) {
                b();
                this.f20856a = (byte) 1;
            }
            if (this.f20856a == 1) {
                long M0 = sink.M0();
                long read = this.f20859d.read(sink, j5);
                if (read != -1) {
                    d(sink, M0, read);
                    return read;
                }
                this.f20856a = (byte) 2;
            }
            if (this.f20856a == 2) {
                c();
                this.f20856a = (byte) 3;
                if (!this.f20857b.e0()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1L;
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j5).toString());
    }

    @Override // okio.n1
    @p4.l
    public p1 timeout() {
        return this.f20857b.timeout();
    }
}
