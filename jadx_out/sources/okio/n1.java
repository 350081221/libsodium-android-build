package okio;

import com.bytedance.android.live.base.api.push.ILivePush;
import java.io.Closeable;
import java.io.IOException;

@kotlin.i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00060\u0001j\u0002`\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H&J\b\u0010\n\u001a\u00020\u000bH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lokio/Source;", "Ljava/io/Closeable;", "Lokio/Closeable;", ILivePush.ClickType.CLOSE, "", "read", "", "sink", "Lokio/Buffer;", "byteCount", m0.a.Z, "Lokio/Timeout;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface n1 extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    long read(@p4.l l lVar, long j5) throws IOException;

    @p4.l
    p1 timeout();
}
