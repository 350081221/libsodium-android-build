package okhttp3.internal.ws;

import com.bytedance.android.live.base.api.push.ILivePush;
import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.i0;
import kotlin.io.c;
import kotlin.jvm.internal.l0;
import okio.l;
import okio.l1;
import okio.n;
import okio.q;
import p4.l;

@i0(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\u0015\u0010\u0016J\u0014\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002J\b\u0010\n\u001a\u00020\bH\u0016R\u0014\u0010\u000b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lokhttp3/internal/ws/MessageDeflater;", "Ljava/io/Closeable;", "Lokio/l;", "Lokio/n;", "suffix", "", "endsWith", "buffer", "Lkotlin/r2;", "deflate", ILivePush.ClickType.CLOSE, "noContextTakeover", "Z", "deflatedBytes", "Lokio/l;", "Ljava/util/zip/Deflater;", "deflater", "Ljava/util/zip/Deflater;", "Lokio/q;", "deflaterSink", "Lokio/q;", "<init>", "(Z)V", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class MessageDeflater implements Closeable {

    @l
    private final okio.l deflatedBytes;

    @l
    private final Deflater deflater;

    @l
    private final q deflaterSink;
    private final boolean noContextTakeover;

    public MessageDeflater(boolean z4) {
        this.noContextTakeover = z4;
        okio.l lVar = new okio.l();
        this.deflatedBytes = lVar;
        Deflater deflater = new Deflater(-1, true);
        this.deflater = deflater;
        this.deflaterSink = new q((l1) lVar, deflater);
    }

    private final boolean endsWith(okio.l lVar, n nVar) {
        return lVar.D(lVar.M0() - nVar.size(), nVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.deflaterSink.close();
    }

    public final void deflate(@l okio.l buffer) throws IOException {
        boolean z4;
        n nVar;
        l0.p(buffer, "buffer");
        if (this.deflatedBytes.M0() == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (this.noContextTakeover) {
                this.deflater.reset();
            }
            this.deflaterSink.write(buffer, buffer.M0());
            this.deflaterSink.flush();
            okio.l lVar = this.deflatedBytes;
            nVar = MessageDeflaterKt.EMPTY_DEFLATE_BLOCK;
            if (endsWith(lVar, nVar)) {
                long M0 = this.deflatedBytes.M0() - 4;
                l.a A0 = okio.l.A0(this.deflatedBytes, null, 1, null);
                try {
                    A0.d(M0);
                    c.a(A0, null);
                } finally {
                }
            } else {
                this.deflatedBytes.writeByte(0);
            }
            okio.l lVar2 = this.deflatedBytes;
            buffer.write(lVar2, lVar2.M0());
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
