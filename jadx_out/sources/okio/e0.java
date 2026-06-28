package okio;

import com.bytedance.android.live.base.api.push.ILivePush;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0012\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nH\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lokio/InputStreamSource;", "Lokio/Source;", "input", "Ljava/io/InputStream;", m0.a.Z, "Lokio/Timeout;", "(Ljava/io/InputStream;Lokio/Timeout;)V", ILivePush.ClickType.CLOSE, "", "read", "", "sink", "Lokio/Buffer;", "byteCount", "toString", "", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nJvmOkio.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmOkio.kt\nokio/InputStreamSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,239:1\n1#2:240\n86#3:241\n*S KotlinDebug\n*F\n+ 1 JvmOkio.kt\nokio/InputStreamSource\n*L\n92#1:241\n*E\n"})
/* loaded from: classes4.dex */
public class e0 implements n1 {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final InputStream f20883a;

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    private final p1 f20884b;

    public e0(@p4.l InputStream input, @p4.l p1 timeout) {
        kotlin.jvm.internal.l0.p(input, "input");
        kotlin.jvm.internal.l0.p(timeout, "timeout");
        this.f20883a = input;
        this.f20884b = timeout;
    }

    @Override // okio.n1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f20883a.close();
    }

    @Override // okio.n1
    public long read(@p4.l l sink, long j5) {
        boolean z4;
        kotlin.jvm.internal.l0.p(sink, "sink");
        if (j5 == 0) {
            return 0L;
        }
        if (j5 >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            try {
                this.f20884b.throwIfReached();
                i1 P0 = sink.P0(1);
                int read = this.f20883a.read(P0.f20928a, P0.f20930c, (int) Math.min(j5, 8192 - P0.f20930c));
                if (read == -1) {
                    if (P0.f20929b == P0.f20930c) {
                        sink.f20987a = P0.b();
                        j1.d(P0);
                        return -1L;
                    }
                    return -1L;
                }
                P0.f20930c += read;
                long j6 = read;
                sink.I0(sink.M0() + j6);
                return j6;
            } catch (AssertionError e5) {
                if (y0.l(e5)) {
                    throw new IOException(e5);
                }
                throw e5;
            }
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j5).toString());
    }

    @Override // okio.n1
    @p4.l
    public p1 timeout() {
        return this.f20884b;
    }

    @p4.l
    public String toString() {
        return "source(" + this.f20883a + ')';
    }
}
