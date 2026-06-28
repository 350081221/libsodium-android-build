package okhttp3.internal.ws;

import com.bytedance.android.live.base.api.push.ILivePush;
import com.bytedance.sdk.openadsdk.api.plugin.PluginConstants;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import okio.l;
import okio.n;
import p4.m;

@i0(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001e\u001a\u00020\u0011\u0012\u0006\u0010\u001f\u001a\u00020\u0011\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b1\u00102J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004J\u0016\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0004J\b\u0010\u0010\u001a\u00020\u0006H\u0016R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0013R\u0014\u0010\u001f\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0013R\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010%R\u0016\u0010'\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010\u0013R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010,\u001a\u0004\u0018\u00010+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010/\u001a\u0004\u0018\u00010.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00063"}, d2 = {"Lokhttp3/internal/ws/WebSocketWriter;", "Ljava/io/Closeable;", "", "opcode", "Lokio/n;", "payload", "Lkotlin/r2;", "writeControlFrame", "writePing", "writePong", PluginConstants.KEY_ERROR_CODE, MediationConstant.KEY_REASON, "writeClose", "formatOpcode", "data", "writeMessageFrame", ILivePush.ClickType.CLOSE, "", "isClient", "Z", "Lokio/m;", "sink", "Lokio/m;", "getSink", "()Lokio/m;", "Ljava/util/Random;", "random", "Ljava/util/Random;", "getRandom", "()Ljava/util/Random;", "perMessageDeflate", "noContextTakeover", "", "minimumDeflateSize", "J", "Lokio/l;", "messageBuffer", "Lokio/l;", "sinkBuffer", "writerClosed", "Lokhttp3/internal/ws/MessageDeflater;", "messageDeflater", "Lokhttp3/internal/ws/MessageDeflater;", "", "maskKey", "[B", "Lokio/l$a;", "maskCursor", "Lokio/l$a;", "<init>", "(ZLokio/m;Ljava/util/Random;ZZJ)V", "okhttp"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nWebSocketWriter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebSocketWriter.kt\nokhttp3/internal/ws/WebSocketWriter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,202:1\n1#2:203\n*E\n"})
/* loaded from: classes4.dex */
public final class WebSocketWriter implements Closeable {
    private final boolean isClient;

    @m
    private final l.a maskCursor;

    @m
    private final byte[] maskKey;

    @p4.l
    private final l messageBuffer;

    @m
    private MessageDeflater messageDeflater;
    private final long minimumDeflateSize;
    private final boolean noContextTakeover;
    private final boolean perMessageDeflate;

    @p4.l
    private final Random random;

    @p4.l
    private final okio.m sink;

    @p4.l
    private final l sinkBuffer;
    private boolean writerClosed;

    public WebSocketWriter(boolean z4, @p4.l okio.m sink, @p4.l Random random, boolean z5, boolean z6, long j5) {
        byte[] bArr;
        l0.p(sink, "sink");
        l0.p(random, "random");
        this.isClient = z4;
        this.sink = sink;
        this.random = random;
        this.perMessageDeflate = z5;
        this.noContextTakeover = z6;
        this.minimumDeflateSize = j5;
        this.messageBuffer = new l();
        this.sinkBuffer = sink.g();
        if (z4) {
            bArr = new byte[4];
        } else {
            bArr = null;
        }
        this.maskKey = bArr;
        this.maskCursor = z4 ? new l.a() : null;
    }

    private final void writeControlFrame(int i5, n nVar) throws IOException {
        boolean z4;
        if (!this.writerClosed) {
            int size = nVar.size();
            if (size <= 125) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                this.sinkBuffer.writeByte(i5 | 128);
                if (this.isClient) {
                    this.sinkBuffer.writeByte(size | 128);
                    Random random = this.random;
                    byte[] bArr = this.maskKey;
                    l0.m(bArr);
                    random.nextBytes(bArr);
                    this.sinkBuffer.write(this.maskKey);
                    if (size > 0) {
                        long M0 = this.sinkBuffer.M0();
                        this.sinkBuffer.v0(nVar);
                        l lVar = this.sinkBuffer;
                        l.a aVar = this.maskCursor;
                        l0.m(aVar);
                        lVar.t0(aVar);
                        this.maskCursor.h(M0);
                        WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                        this.maskCursor.close();
                    }
                } else {
                    this.sinkBuffer.writeByte(size);
                    this.sinkBuffer.v0(nVar);
                }
                this.sink.flush();
                return;
            }
            throw new IllegalArgumentException("Payload size must be less than or equal to 125".toString());
        }
        throw new IOException("closed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        MessageDeflater messageDeflater = this.messageDeflater;
        if (messageDeflater != null) {
            messageDeflater.close();
        }
    }

    @p4.l
    public final Random getRandom() {
        return this.random;
    }

    @p4.l
    public final okio.m getSink() {
        return this.sink;
    }

    public final void writeClose(int i5, @m n nVar) throws IOException {
        n nVar2 = n.EMPTY;
        if (i5 != 0 || nVar != null) {
            if (i5 != 0) {
                WebSocketProtocol.INSTANCE.validateCloseCode(i5);
            }
            l lVar = new l();
            lVar.writeShort(i5);
            if (nVar != null) {
                lVar.v0(nVar);
            }
            nVar2 = lVar.m0();
        }
        try {
            writeControlFrame(8, nVar2);
        } finally {
            this.writerClosed = true;
        }
    }

    public final void writeMessageFrame(int i5, @p4.l n data) throws IOException {
        l0.p(data, "data");
        if (!this.writerClosed) {
            this.messageBuffer.v0(data);
            int i6 = 128;
            int i7 = i5 | 128;
            if (this.perMessageDeflate && data.size() >= this.minimumDeflateSize) {
                MessageDeflater messageDeflater = this.messageDeflater;
                if (messageDeflater == null) {
                    messageDeflater = new MessageDeflater(this.noContextTakeover);
                    this.messageDeflater = messageDeflater;
                }
                messageDeflater.deflate(this.messageBuffer);
                i7 |= 64;
            }
            long M0 = this.messageBuffer.M0();
            this.sinkBuffer.writeByte(i7);
            if (!this.isClient) {
                i6 = 0;
            }
            if (M0 <= 125) {
                this.sinkBuffer.writeByte(((int) M0) | i6);
            } else if (M0 <= WebSocketProtocol.PAYLOAD_SHORT_MAX) {
                this.sinkBuffer.writeByte(i6 | 126);
                this.sinkBuffer.writeShort((int) M0);
            } else {
                this.sinkBuffer.writeByte(i6 | 127);
                this.sinkBuffer.writeLong(M0);
            }
            if (this.isClient) {
                Random random = this.random;
                byte[] bArr = this.maskKey;
                l0.m(bArr);
                random.nextBytes(bArr);
                this.sinkBuffer.write(this.maskKey);
                if (M0 > 0) {
                    l lVar = this.messageBuffer;
                    l.a aVar = this.maskCursor;
                    l0.m(aVar);
                    lVar.t0(aVar);
                    this.maskCursor.h(0L);
                    WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                    this.maskCursor.close();
                }
            }
            this.sinkBuffer.write(this.messageBuffer, M0);
            this.sink.k();
            return;
        }
        throw new IOException("closed");
    }

    public final void writePing(@p4.l n payload) throws IOException {
        l0.p(payload, "payload");
        writeControlFrame(9, payload);
    }

    public final void writePong(@p4.l n payload) throws IOException {
        l0.p(payload, "payload");
        writeControlFrame(10, payload);
    }
}
