package okio;

import com.bytedance.android.live.base.api.push.ILivePush;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Deflater;

@kotlin.i0(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\r\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b\u0010J\b\u0010\u0011\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0018\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u001b\u001a\u00020\u000fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u00020\t8G¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lokio/GzipSink;", "Lokio/Sink;", "sink", "(Lokio/Sink;)V", "closed", "", "crc", "Ljava/util/zip/CRC32;", "deflater", "Ljava/util/zip/Deflater;", "()Ljava/util/zip/Deflater;", "deflaterSink", "Lokio/DeflaterSink;", "Lokio/RealBufferedSink;", ILivePush.ClickType.CLOSE, "", "-deprecated_deflater", "flush", m0.a.Z, "Lokio/Timeout;", "updateCrc", "buffer", "Lokio/Buffer;", "byteCount", "", "write", "source", "writeFooter", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nGzipSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GzipSink.kt\nokio/GzipSink\n+ 2 RealBufferedSink.kt\nokio/RealBufferedSink\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,153:1\n51#2:154\n1#3:155\n86#4:156\n*S KotlinDebug\n*F\n+ 1 GzipSink.kt\nokio/GzipSink\n*L\n63#1:154\n131#1:156\n*E\n"})
/* loaded from: classes4.dex */
public final class z implements l1 {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final g1 f21059a;

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    private final Deflater f21060b;

    /* renamed from: c, reason: collision with root package name */
    @p4.l
    private final q f21061c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f21062d;

    /* renamed from: e, reason: collision with root package name */
    @p4.l
    private final CRC32 f21063e;

    public z(@p4.l l1 sink) {
        kotlin.jvm.internal.l0.p(sink, "sink");
        g1 g1Var = new g1(sink);
        this.f21059a = g1Var;
        Deflater deflater = new Deflater(-1, true);
        this.f21060b = deflater;
        this.f21061c = new q((m) g1Var, deflater);
        this.f21063e = new CRC32();
        l lVar = g1Var.f20915b;
        lVar.writeShort(8075);
        lVar.writeByte(8);
        lVar.writeByte(0);
        lVar.writeInt(0);
        lVar.writeByte(0);
        lVar.writeByte(0);
    }

    private final void c(l lVar, long j5) {
        i1 i1Var = lVar.f20987a;
        kotlin.jvm.internal.l0.m(i1Var);
        while (j5 > 0) {
            int min = (int) Math.min(j5, i1Var.f20930c - i1Var.f20929b);
            this.f21063e.update(i1Var.f20928a, i1Var.f20929b, min);
            j5 -= min;
            i1Var = i1Var.f20933f;
            kotlin.jvm.internal.l0.m(i1Var);
        }
    }

    private final void d() {
        this.f21059a.d0((int) this.f21063e.getValue());
        this.f21059a.d0((int) this.f21060b.getBytesRead());
    }

    @p4.l
    @u3.h(name = "-deprecated_deflater")
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @kotlin.b1(expression = "deflater", imports = {}))
    public final Deflater a() {
        return this.f21060b;
    }

    @p4.l
    @u3.h(name = "deflater")
    public final Deflater b() {
        return this.f21060b;
    }

    @Override // okio.l1, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f21062d) {
            return;
        }
        try {
            this.f21061c.b();
            d();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.f21060b.end();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            this.f21059a.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f21062d = true;
        if (th == null) {
        } else {
            throw th;
        }
    }

    @Override // okio.l1, java.io.Flushable
    public void flush() throws IOException {
        this.f21061c.flush();
    }

    @Override // okio.l1
    @p4.l
    public p1 timeout() {
        return this.f21059a.timeout();
    }

    @Override // okio.l1
    public void write(@p4.l l source, long j5) throws IOException {
        boolean z4;
        kotlin.jvm.internal.l0.p(source, "source");
        if (j5 >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (j5 == 0) {
                return;
            }
            c(source, j5);
            this.f21061c.write(source, j5);
            return;
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j5).toString());
    }
}
