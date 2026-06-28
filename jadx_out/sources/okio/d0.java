package okio;

import com.bytedance.android.live.base.api.push.ILivePush;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

@kotlin.i0(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000fH\u0016J\u0016\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000fJ\u0006\u0010\u0014\u001a\u00020\u000bJ\b\u0010\u0015\u001a\u00020\rH\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lokio/InflaterSource;", "Lokio/Source;", "source", "inflater", "Ljava/util/zip/Inflater;", "(Lokio/Source;Ljava/util/zip/Inflater;)V", "Lokio/BufferedSource;", "(Lokio/BufferedSource;Ljava/util/zip/Inflater;)V", "bufferBytesHeldByInflater", "", "closed", "", ILivePush.ClickType.CLOSE, "", "read", "", "sink", "Lokio/Buffer;", "byteCount", "readOrInflate", "refill", "releaseBytesAfterInflate", m0.a.Z, "Lokio/Timeout;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nInflaterSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InflaterSource.kt\nokio/InflaterSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,147:1\n1#2:148\n86#3:149\n*S KotlinDebug\n*F\n+ 1 InflaterSource.kt\nokio/InflaterSource\n*L\n73#1:149\n*E\n"})
/* loaded from: classes4.dex */
public final class d0 implements n1 {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final BufferedSource f20875a;

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    private final Inflater f20876b;

    /* renamed from: c, reason: collision with root package name */
    private int f20877c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f20878d;

    public d0(@p4.l BufferedSource source, @p4.l Inflater inflater) {
        kotlin.jvm.internal.l0.p(source, "source");
        kotlin.jvm.internal.l0.p(inflater, "inflater");
        this.f20875a = source;
        this.f20876b = inflater;
    }

    private final void c() {
        int i5 = this.f20877c;
        if (i5 == 0) {
            return;
        }
        int remaining = i5 - this.f20876b.getRemaining();
        this.f20877c -= remaining;
        this.f20875a.skip(remaining);
    }

    public final long a(@p4.l l sink, long j5) throws IOException {
        boolean z4;
        kotlin.jvm.internal.l0.p(sink, "sink");
        if (j5 >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (!this.f20878d) {
                if (j5 == 0) {
                    return 0L;
                }
                try {
                    i1 P0 = sink.P0(1);
                    int min = (int) Math.min(j5, 8192 - P0.f20930c);
                    b();
                    int inflate = this.f20876b.inflate(P0.f20928a, P0.f20930c, min);
                    c();
                    if (inflate > 0) {
                        P0.f20930c += inflate;
                        long j6 = inflate;
                        sink.I0(sink.M0() + j6);
                        return j6;
                    }
                    if (P0.f20929b == P0.f20930c) {
                        sink.f20987a = P0.b();
                        j1.d(P0);
                    }
                    return 0L;
                } catch (DataFormatException e5) {
                    throw new IOException(e5);
                }
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j5).toString());
    }

    public final boolean b() throws IOException {
        if (!this.f20876b.needsInput()) {
            return false;
        }
        if (this.f20875a.e0()) {
            return true;
        }
        i1 i1Var = this.f20875a.g().f20987a;
        kotlin.jvm.internal.l0.m(i1Var);
        int i5 = i1Var.f20930c;
        int i6 = i1Var.f20929b;
        int i7 = i5 - i6;
        this.f20877c = i7;
        this.f20876b.setInput(i1Var.f20928a, i6, i7);
        return false;
    }

    @Override // okio.n1, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f20878d) {
            return;
        }
        this.f20876b.end();
        this.f20878d = true;
        this.f20875a.close();
    }

    @Override // okio.n1
    public long read(@p4.l l sink, long j5) throws IOException {
        kotlin.jvm.internal.l0.p(sink, "sink");
        do {
            long a5 = a(sink, j5);
            if (a5 > 0) {
                return a5;
            }
            if (this.f20876b.finished() || this.f20876b.needsDictionary()) {
                return -1L;
            }
        } while (!this.f20875a.e0());
        throw new EOFException("source exhausted prematurely");
    }

    @Override // okio.n1
    @p4.l
    public p1 timeout() {
        return this.f20875a.timeout();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d0(@p4.l n1 source, @p4.l Inflater inflater) {
        this(y0.e(source), inflater);
        kotlin.jvm.internal.l0.p(source, "source");
        kotlin.jvm.internal.l0.p(inflater, "inflater");
    }
}
