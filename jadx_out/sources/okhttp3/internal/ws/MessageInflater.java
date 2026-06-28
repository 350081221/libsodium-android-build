package okhttp3.internal.ws;

import com.bytedance.android.live.base.api.push.ILivePush;
import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Inflater;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import okio.d0;
import okio.n1;
import p4.l;

@i0(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0016R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lokhttp3/internal/ws/MessageInflater;", "Ljava/io/Closeable;", "Lokio/l;", "buffer", "Lkotlin/r2;", "inflate", ILivePush.ClickType.CLOSE, "", "noContextTakeover", "Z", "deflatedBytes", "Lokio/l;", "Ljava/util/zip/Inflater;", "inflater", "Ljava/util/zip/Inflater;", "Lokio/d0;", "inflaterSource", "Lokio/d0;", "<init>", "(Z)V", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class MessageInflater implements Closeable {

    @l
    private final okio.l deflatedBytes;

    @l
    private final Inflater inflater;

    @l
    private final d0 inflaterSource;
    private final boolean noContextTakeover;

    public MessageInflater(boolean z4) {
        this.noContextTakeover = z4;
        okio.l lVar = new okio.l();
        this.deflatedBytes = lVar;
        Inflater inflater = new Inflater(true);
        this.inflater = inflater;
        this.inflaterSource = new d0((n1) lVar, inflater);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.inflaterSource.close();
    }

    public final void inflate(@l okio.l buffer) throws IOException {
        boolean z4;
        l0.p(buffer, "buffer");
        if (this.deflatedBytes.M0() == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (this.noContextTakeover) {
                this.inflater.reset();
            }
            this.deflatedBytes.G(buffer);
            this.deflatedBytes.writeInt(65535);
            long bytesRead = this.inflater.getBytesRead() + this.deflatedBytes.M0();
            do {
                this.inflaterSource.a(buffer, Long.MAX_VALUE);
            } while (this.inflater.getBytesRead() < bytesRead);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
