package okio;

import com.bytedance.android.live.base.api.push.ILivePush;
import java.io.IOException;

@kotlin.i0(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\r\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0002\b\u0007J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u0013\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0004¨\u0006\u0012"}, d2 = {"Lokio/ForwardingSink;", "Lokio/Sink;", "delegate", "(Lokio/Sink;)V", "()Lokio/Sink;", ILivePush.ClickType.CLOSE, "", "-deprecated_delegate", "flush", m0.a.Z, "Lokio/Timeout;", "toString", "", "write", "source", "Lokio/Buffer;", "byteCount", "", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class w implements l1 {

    @p4.l
    private final l1 delegate;

    public w(@p4.l l1 delegate) {
        kotlin.jvm.internal.l0.p(delegate, "delegate");
        this.delegate = delegate;
    }

    @p4.l
    @u3.h(name = "-deprecated_delegate")
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @kotlin.b1(expression = "delegate", imports = {}))
    /* renamed from: -deprecated_delegate, reason: not valid java name */
    public final l1 m6594deprecated_delegate() {
        return this.delegate;
    }

    @Override // okio.l1, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    @p4.l
    @u3.h(name = "delegate")
    public final l1 delegate() {
        return this.delegate;
    }

    @Override // okio.l1, java.io.Flushable
    public void flush() throws IOException {
        this.delegate.flush();
    }

    @Override // okio.l1
    @p4.l
    public p1 timeout() {
        return this.delegate.timeout();
    }

    @p4.l
    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }

    @Override // okio.l1
    public void write(@p4.l l source, long j5) throws IOException {
        kotlin.jvm.internal.l0.p(source, "source");
        this.delegate.write(source, j5);
    }
}
