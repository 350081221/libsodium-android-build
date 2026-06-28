package okio;

import com.bytedance.android.live.base.api.push.ILivePush;
import java.io.IOException;
import java.util.zip.Deflater;

@kotlin.i0(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\tH\u0002J\r\u0010\u000e\u001a\u00020\u000bH\u0000¢\u0006\u0002\b\u000fJ\b\u0010\u0010\u001a\u00020\u000bH\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lokio/DeflaterSink;", "Lokio/Sink;", "sink", "deflater", "Ljava/util/zip/Deflater;", "(Lokio/Sink;Ljava/util/zip/Deflater;)V", "Lokio/BufferedSink;", "(Lokio/BufferedSink;Ljava/util/zip/Deflater;)V", "closed", "", ILivePush.ClickType.CLOSE, "", "deflate", "syncFlush", "finishDeflate", "finishDeflate$okio", "flush", m0.a.Z, "Lokio/Timeout;", "toString", "", "write", "source", "Lokio/Buffer;", "byteCount", "", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nDeflaterSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeflaterSink.kt\nokio/DeflaterSink\n+ 2 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,163:1\n86#2:164\n*S KotlinDebug\n*F\n+ 1 DeflaterSink.kt\nokio/DeflaterSink\n*L\n58#1:164\n*E\n"})
/* loaded from: classes4.dex */
public final class q implements l1 {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final m f21018a;

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    private final Deflater f21019b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f21020c;

    public q(@p4.l m sink, @p4.l Deflater deflater) {
        kotlin.jvm.internal.l0.p(sink, "sink");
        kotlin.jvm.internal.l0.p(deflater, "deflater");
        this.f21018a = sink;
        this.f21019b = deflater;
    }

    private final void a(boolean z4) {
        i1 P0;
        int deflate;
        l g5 = this.f21018a.g();
        while (true) {
            P0 = g5.P0(1);
            if (z4) {
                try {
                    Deflater deflater = this.f21019b;
                    byte[] bArr = P0.f20928a;
                    int i5 = P0.f20930c;
                    deflate = deflater.deflate(bArr, i5, 8192 - i5, 2);
                } catch (NullPointerException e5) {
                    throw new IOException("Deflater already closed", e5);
                }
            } else {
                Deflater deflater2 = this.f21019b;
                byte[] bArr2 = P0.f20928a;
                int i6 = P0.f20930c;
                deflate = deflater2.deflate(bArr2, i6, 8192 - i6);
            }
            if (deflate > 0) {
                P0.f20930c += deflate;
                g5.I0(g5.M0() + deflate);
                this.f21018a.x();
            } else if (this.f21019b.needsInput()) {
                break;
            }
        }
        if (P0.f20929b == P0.f20930c) {
            g5.f20987a = P0.b();
            j1.d(P0);
        }
    }

    public final void b() {
        this.f21019b.finish();
        a(false);
    }

    @Override // okio.l1, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f21020c) {
            return;
        }
        try {
            b();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.f21019b.end();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            this.f21018a.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f21020c = true;
        if (th == null) {
        } else {
            throw th;
        }
    }

    @Override // okio.l1, java.io.Flushable
    public void flush() throws IOException {
        a(true);
        this.f21018a.flush();
    }

    @Override // okio.l1
    @p4.l
    public p1 timeout() {
        return this.f21018a.timeout();
    }

    @p4.l
    public String toString() {
        return "DeflaterSink(" + this.f21018a + ')';
    }

    @Override // okio.l1
    public void write(@p4.l l source, long j5) throws IOException {
        kotlin.jvm.internal.l0.p(source, "source");
        i.e(source.M0(), 0L, j5);
        while (j5 > 0) {
            i1 i1Var = source.f20987a;
            kotlin.jvm.internal.l0.m(i1Var);
            int min = (int) Math.min(j5, i1Var.f20930c - i1Var.f20929b);
            this.f21019b.setInput(i1Var.f20928a, i1Var.f20929b, min);
            a(false);
            long j6 = min;
            source.I0(source.M0() - j6);
            int i5 = i1Var.f20929b + min;
            i1Var.f20929b = i5;
            if (i5 == i1Var.f20930c) {
                source.f20987a = i1Var.b();
                j1.d(i1Var);
            }
            j5 -= j6;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q(@p4.l l1 sink, @p4.l Deflater deflater) {
        this(y0.d(sink), deflater);
        kotlin.jvm.internal.l0.p(sink, "sink");
        kotlin.jvm.internal.l0.p(deflater, "deflater");
    }
}
