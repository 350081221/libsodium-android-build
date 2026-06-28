package okio;

import com.bytedance.android.live.base.api.push.ILivePush;
import java.io.IOException;

@kotlin.i0(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\r\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0002\b\u0007J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u0013\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0004¨\u0006\u0011"}, d2 = {"Lokio/ForwardingSource;", "Lokio/Source;", "delegate", "(Lokio/Source;)V", "()Lokio/Source;", ILivePush.ClickType.CLOSE, "", "-deprecated_delegate", "read", "", "sink", "Lokio/Buffer;", "byteCount", m0.a.Z, "Lokio/Timeout;", "toString", "", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class x implements n1 {

    @p4.l
    private final n1 delegate;

    public x(@p4.l n1 delegate) {
        kotlin.jvm.internal.l0.p(delegate, "delegate");
        this.delegate = delegate;
    }

    @p4.l
    @u3.h(name = "-deprecated_delegate")
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @kotlin.b1(expression = "delegate", imports = {}))
    /* renamed from: -deprecated_delegate, reason: not valid java name */
    public final n1 m6595deprecated_delegate() {
        return this.delegate;
    }

    @Override // okio.n1, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    @p4.l
    @u3.h(name = "delegate")
    public final n1 delegate() {
        return this.delegate;
    }

    @Override // okio.n1
    public long read(@p4.l l sink, long j5) throws IOException {
        kotlin.jvm.internal.l0.p(sink, "sink");
        return this.delegate.read(sink, j5);
    }

    @Override // okio.n1
    @p4.l
    public p1 timeout() {
        return this.delegate.timeout();
    }

    @p4.l
    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }
}
