package okhttp3.internal.http2;

import com.bytedance.android.live.base.api.push.ILivePush;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.tendcloud.tenddata.cq;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Hpack;
import okio.m;
import p4.l;

@i0(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0012\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 @2\u00020\u0001:\u0001@B\u0017\u0012\u0006\u00100\u001a\u00020/\u0012\u0006\u00102\u001a\u00020\u0016¢\u0006\u0004\b>\u0010?J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0006\u0010\b\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tJ$\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ\u0006\u0010\u0011\u001a\u00020\u0006J\u0016\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u0010\u0015\u001a\u00020\u0002J(\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0005\u001a\u00020\u0002J(\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0005\u001a\u00020\u0002J\u000e\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\tJ\u001e\u0010\"\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0002J\u001e\u0010&\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010%\u001a\u00020$J\u0016\u0010(\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u0004J&\u0010+\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002J\b\u0010,\u001a\u00020\u0006H\u0016J$\u0010.\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000e0\rR\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00102\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00104\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00106\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00108\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00103R\u0017\u0010:\u001a\u0002098\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=¨\u0006A"}, d2 = {"Lokhttp3/internal/http2/Http2Writer;", "Ljava/io/Closeable;", "", "streamId", "", "byteCount", "Lkotlin/r2;", "writeContinuationFrames", "connectionPreface", "Lokhttp3/internal/http2/Settings;", "peerSettings", "applyAndAckSettings", "promisedStreamId", "", "Lokhttp3/internal/http2/Header;", "requestHeaders", "pushPromise", "flush", "Lokhttp3/internal/http2/ErrorCode;", MediationConstant.KEY_ERROR_CODE, "rstStream", "maxDataLength", "", "outFinished", "Lokio/l;", "source", "data", "flags", "buffer", "dataFrame", "settings", "ack", "payload1", "payload2", "ping", "lastGoodStreamId", "", "debugData", "goAway", "windowSizeIncrement", "windowUpdate", cq.a.LENGTH, "type", "frameHeader", ILivePush.ClickType.CLOSE, "headerBlock", TTDownloadField.TT_HEADERS, "Lokio/m;", "sink", "Lokio/m;", "client", "Z", "hpackBuffer", "Lokio/l;", "maxFrameSize", "I", "closed", "Lokhttp3/internal/http2/Hpack$Writer;", "hpackWriter", "Lokhttp3/internal/http2/Hpack$Writer;", "getHpackWriter", "()Lokhttp3/internal/http2/Hpack$Writer;", "<init>", "(Lokio/m;Z)V", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nHttp2Writer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http2Writer.kt\nokhttp3/internal/http2/Http2Writer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,317:1\n1#2:318\n*E\n"})
/* loaded from: classes4.dex */
public final class Http2Writer implements Closeable {

    @l
    public static final Companion Companion = new Companion(null);
    private static final Logger logger = Logger.getLogger(Http2.class.getName());
    private final boolean client;
    private boolean closed;

    @l
    private final okio.l hpackBuffer;

    @l
    private final Hpack.Writer hpackWriter;
    private int maxFrameSize;

    @l
    private final m sink;

    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lokhttp3/internal/http2/Http2Writer$Companion;", "", "()V", "logger", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }
    }

    public Http2Writer(@l m sink, boolean z4) {
        l0.p(sink, "sink");
        this.sink = sink;
        this.client = z4;
        okio.l lVar = new okio.l();
        this.hpackBuffer = lVar;
        this.maxFrameSize = 16384;
        this.hpackWriter = new Hpack.Writer(0, false, lVar, 3, null);
    }

    private final void writeContinuationFrames(int i5, long j5) throws IOException {
        int i6;
        while (j5 > 0) {
            long min = Math.min(this.maxFrameSize, j5);
            j5 -= min;
            int i7 = (int) min;
            if (j5 == 0) {
                i6 = 4;
            } else {
                i6 = 0;
            }
            frameHeader(i5, i7, 9, i6);
            this.sink.write(this.hpackBuffer, min);
        }
    }

    public final synchronized void applyAndAckSettings(@l Settings peerSettings) throws IOException {
        l0.p(peerSettings, "peerSettings");
        if (!this.closed) {
            this.maxFrameSize = peerSettings.getMaxFrameSize(this.maxFrameSize);
            if (peerSettings.getHeaderTableSize() != -1) {
                this.hpackWriter.resizeHeaderTable(peerSettings.getHeaderTableSize());
            }
            frameHeader(0, 0, 4, 1);
            this.sink.flush();
        } else {
            throw new IOException("closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.closed = true;
        this.sink.close();
    }

    public final synchronized void connectionPreface() throws IOException {
        if (!this.closed) {
            if (!this.client) {
                return;
            }
            Logger logger2 = logger;
            if (logger2.isLoggable(Level.FINE)) {
                logger2.fine(Util.format(">> CONNECTION " + Http2.CONNECTION_PREFACE.hex(), new Object[0]));
            }
            this.sink.v0(Http2.CONNECTION_PREFACE);
            this.sink.flush();
            return;
        }
        throw new IOException("closed");
    }

    public final synchronized void data(boolean z4, int i5, @p4.m okio.l lVar, int i6) throws IOException {
        if (!this.closed) {
            dataFrame(i5, z4 ? 1 : 0, lVar, i6);
        } else {
            throw new IOException("closed");
        }
    }

    public final void dataFrame(int i5, int i6, @p4.m okio.l lVar, int i7) throws IOException {
        frameHeader(i5, i7, 0, i6);
        if (i7 > 0) {
            m mVar = this.sink;
            l0.m(lVar);
            mVar.write(lVar, i7);
        }
    }

    public final synchronized void flush() throws IOException {
        if (!this.closed) {
            this.sink.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final void frameHeader(int i5, int i6, int i7, int i8) throws IOException {
        boolean z4;
        Logger logger2 = logger;
        if (logger2.isLoggable(Level.FINE)) {
            logger2.fine(Http2.INSTANCE.frameLog(false, i5, i6, i7, i8));
        }
        boolean z5 = true;
        if (i6 <= this.maxFrameSize) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if ((Integer.MIN_VALUE & i5) != 0) {
                z5 = false;
            }
            if (z5) {
                Util.writeMedium(this.sink, i6);
                this.sink.writeByte(i7 & 255);
                this.sink.writeByte(i8 & 255);
                this.sink.writeInt(i5 & Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException(("reserved bit set: " + i5).toString());
        }
        throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.maxFrameSize + ": " + i6).toString());
    }

    @l
    public final Hpack.Writer getHpackWriter() {
        return this.hpackWriter;
    }

    public final synchronized void goAway(int i5, @l ErrorCode errorCode, @l byte[] debugData) throws IOException {
        boolean z4;
        l0.p(errorCode, "errorCode");
        l0.p(debugData, "debugData");
        if (!this.closed) {
            boolean z5 = false;
            if (errorCode.getHttpCode() != -1) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                frameHeader(0, debugData.length + 8, 7, 0);
                this.sink.writeInt(i5);
                this.sink.writeInt(errorCode.getHttpCode());
                if (debugData.length == 0) {
                    z5 = true;
                }
                if (!z5) {
                    this.sink.write(debugData);
                }
                this.sink.flush();
            } else {
                throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void headers(boolean z4, int i5, @l List<Header> headerBlock) throws IOException {
        int i6;
        l0.p(headerBlock, "headerBlock");
        if (!this.closed) {
            this.hpackWriter.writeHeaders(headerBlock);
            long M0 = this.hpackBuffer.M0();
            long min = Math.min(this.maxFrameSize, M0);
            if (M0 == min) {
                i6 = 4;
            } else {
                i6 = 0;
            }
            if (z4) {
                i6 |= 1;
            }
            frameHeader(i5, (int) min, 1, i6);
            this.sink.write(this.hpackBuffer, min);
            if (M0 > min) {
                writeContinuationFrames(i5, M0 - min);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final int maxDataLength() {
        return this.maxFrameSize;
    }

    public final synchronized void ping(boolean z4, int i5, int i6) throws IOException {
        int i7;
        if (!this.closed) {
            if (z4) {
                i7 = 1;
            } else {
                i7 = 0;
            }
            frameHeader(0, 8, 6, i7);
            this.sink.writeInt(i5);
            this.sink.writeInt(i6);
            this.sink.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void pushPromise(int i5, int i6, @l List<Header> requestHeaders) throws IOException {
        int i7;
        l0.p(requestHeaders, "requestHeaders");
        if (!this.closed) {
            this.hpackWriter.writeHeaders(requestHeaders);
            long M0 = this.hpackBuffer.M0();
            int min = (int) Math.min(this.maxFrameSize - 4, M0);
            int i8 = min + 4;
            long j5 = min;
            if (M0 == j5) {
                i7 = 4;
            } else {
                i7 = 0;
            }
            frameHeader(i5, i8, 5, i7);
            this.sink.writeInt(i6 & Integer.MAX_VALUE);
            this.sink.write(this.hpackBuffer, j5);
            if (M0 > j5) {
                writeContinuationFrames(i5, M0 - j5);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void rstStream(int i5, @l ErrorCode errorCode) throws IOException {
        boolean z4;
        l0.p(errorCode, "errorCode");
        if (!this.closed) {
            if (errorCode.getHttpCode() != -1) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                frameHeader(i5, 4, 3, 0);
                this.sink.writeInt(errorCode.getHttpCode());
                this.sink.flush();
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void settings(@l Settings settings) throws IOException {
        int i5;
        l0.p(settings, "settings");
        if (!this.closed) {
            frameHeader(0, settings.size() * 6, 4, 0);
            for (int i6 = 0; i6 < 10; i6++) {
                if (settings.isSet(i6)) {
                    if (i6 != 4) {
                        if (i6 != 7) {
                            i5 = i6;
                        } else {
                            i5 = 4;
                        }
                    } else {
                        i5 = 3;
                    }
                    this.sink.writeShort(i5);
                    this.sink.writeInt(settings.get(i6));
                }
            }
            this.sink.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void windowUpdate(int i5, long j5) throws IOException {
        boolean z4;
        if (!this.closed) {
            if (j5 != 0 && j5 <= 2147483647L) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                frameHeader(i5, 4, 8, 0);
                this.sink.writeInt((int) j5);
                this.sink.flush();
            } else {
                throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j5).toString());
            }
        } else {
            throw new IOException("closed");
        }
    }
}
