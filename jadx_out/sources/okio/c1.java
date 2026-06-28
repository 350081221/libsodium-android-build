package okio;

import com.bytedance.android.live.base.api.push.ILivePush;
import java.io.OutputStream;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lokio/OutputStreamSink;", "Lokio/Sink;", "out", "Ljava/io/OutputStream;", m0.a.Z, "Lokio/Timeout;", "(Ljava/io/OutputStream;Lokio/Timeout;)V", ILivePush.ClickType.CLOSE, "", "flush", "toString", "", "write", "source", "Lokio/Buffer;", "byteCount", "", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nJvmOkio.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmOkio.kt\nokio/OutputStreamSink\n+ 2 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,239:1\n86#2:240\n*S KotlinDebug\n*F\n+ 1 JvmOkio.kt\nokio/OutputStreamSink\n*L\n55#1:240\n*E\n"})
/* loaded from: classes4.dex */
public final class c1 implements l1 {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final OutputStream f20871a;

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    private final p1 f20872b;

    public c1(@p4.l OutputStream out, @p4.l p1 timeout) {
        kotlin.jvm.internal.l0.p(out, "out");
        kotlin.jvm.internal.l0.p(timeout, "timeout");
        this.f20871a = out;
        this.f20872b = timeout;
    }

    @Override // okio.l1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f20871a.close();
    }

    @Override // okio.l1, java.io.Flushable
    public void flush() {
        this.f20871a.flush();
    }

    @Override // okio.l1
    @p4.l
    public p1 timeout() {
        return this.f20872b;
    }

    @p4.l
    public String toString() {
        return "sink(" + this.f20871a + ')';
    }

    @Override // okio.l1
    public void write(@p4.l l source, long j5) {
        kotlin.jvm.internal.l0.p(source, "source");
        i.e(source.M0(), 0L, j5);
        while (j5 > 0) {
            this.f20872b.throwIfReached();
            i1 i1Var = source.f20987a;
            kotlin.jvm.internal.l0.m(i1Var);
            int min = (int) Math.min(j5, i1Var.f20930c - i1Var.f20929b);
            this.f20871a.write(i1Var.f20928a, i1Var.f20929b, min);
            i1Var.f20929b += min;
            long j6 = min;
            j5 -= j6;
            source.I0(source.M0() - j6);
            if (i1Var.f20929b == i1Var.f20930c) {
                source.f20987a = i1Var.b();
                j1.d(i1Var);
            }
        }
    }
}
