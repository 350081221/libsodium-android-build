package okio;

import com.bytedance.android.live.base.api.push.ILivePush;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"Lokio/BlackholeSink;", "Lokio/Sink;", "()V", ILivePush.ClickType.CLOSE, "", "flush", m0.a.Z, "Lokio/Timeout;", "write", "source", "Lokio/Buffer;", "byteCount", "", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class k implements l1 {
    @Override // okio.l1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // okio.l1, java.io.Flushable
    public void flush() {
    }

    @Override // okio.l1
    @p4.l
    public p1 timeout() {
        return p1.NONE;
    }

    @Override // okio.l1
    public void write(@p4.l l source, long j5) {
        kotlin.jvm.internal.l0.p(source, "source");
        source.skip(j5);
    }
}
