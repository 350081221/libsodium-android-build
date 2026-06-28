package okhttp3.internal.http2;

import com.bytedance.android.live.base.api.push.ILivePush;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.tendcloud.tenddata.cq;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import k0.c;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.ranges.j;
import kotlin.ranges.u;
import m0.a;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Hpack;
import okio.BufferedSource;
import okio.n;
import okio.n1;
import okio.p1;
import org.apache.commons.logging.LogFactory;
import org.apache.http.cookie.ClientCookie;
import p4.l;

@i0(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 (2\u00020\u0001:\u0003()*B\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u0017¢\u0006\u0004\b&\u0010'J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J.\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J(\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J(\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J(\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J(\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J(\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J(\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J(\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J(\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\u000e\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u001a\u001a\u00020\bH\u0016R\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006+"}, d2 = {"Lokhttp3/internal/http2/Http2Reader;", "Ljava/io/Closeable;", "Lokhttp3/internal/http2/Http2Reader$Handler;", "handler", "", cq.a.LENGTH, "flags", "streamId", "Lkotlin/r2;", "readHeaders", "padding", "", "Lokhttp3/internal/http2/Header;", "readHeaderBlock", "readData", "readPriority", "readRstStream", "readSettings", "readPushPromise", "readPing", "readGoAway", "readWindowUpdate", "readConnectionPreface", "", "requireSettings", "nextFrame", ILivePush.ClickType.CLOSE, "Lokio/BufferedSource;", "source", "Lokio/BufferedSource;", "client", "Z", "Lokhttp3/internal/http2/Http2Reader$ContinuationSource;", "continuation", "Lokhttp3/internal/http2/Http2Reader$ContinuationSource;", "Lokhttp3/internal/http2/Hpack$Reader;", "hpackReader", "Lokhttp3/internal/http2/Hpack$Reader;", "<init>", "(Lokio/BufferedSource;Z)V", "Companion", "ContinuationSource", "Handler", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class Http2Reader implements Closeable {

    @l
    public static final Companion Companion = new Companion(null);

    @l
    private static final Logger logger;
    private final boolean client;

    @l
    private final ContinuationSource continuation;

    @l
    private final Hpack.Reader hpackReader;

    @l
    private final BufferedSource source;

    @i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lokhttp3/internal/http2/Http2Reader$Companion;", "", "()V", "logger", "Ljava/util/logging/Logger;", "getLogger", "()Ljava/util/logging/Logger;", "lengthWithoutPadding", "", cq.a.LENGTH, "flags", "padding", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @l
        public final Logger getLogger() {
            return Http2Reader.logger;
        }

        public final int lengthWithoutPadding(int i5, int i6, int i7) throws IOException {
            if ((i6 & 8) != 0) {
                i5--;
            }
            if (i7 <= i5) {
                return i5 - i7;
            }
            throw new IOException("PROTOCOL_ERROR padding " + i7 + " > remaining length " + i5);
        }
    }

    @i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\"\u0010#J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\"\u0010\u0019\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R\"\u0010\u001c\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0011\u001a\u0004\b\u001d\u0010\u0013\"\u0004\b\u001e\u0010\u0015R\"\u0010\u001f\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0011\u001a\u0004\b \u0010\u0013\"\u0004\b!\u0010\u0015¨\u0006$"}, d2 = {"Lokhttp3/internal/http2/Http2Reader$ContinuationSource;", "Lokio/n1;", "Lkotlin/r2;", "readContinuationHeader", "Lokio/l;", "sink", "", "byteCount", "read", "Lokio/p1;", a.Z, ILivePush.ClickType.CLOSE, "Lokio/BufferedSource;", "source", "Lokio/BufferedSource;", "", cq.a.LENGTH, "I", "getLength", "()I", "setLength", "(I)V", "flags", "getFlags", "setFlags", "streamId", "getStreamId", "setStreamId", "left", "getLeft", "setLeft", "padding", "getPadding", "setPadding", "<init>", "(Lokio/BufferedSource;)V", "okhttp"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class ContinuationSource implements n1 {
        private int flags;
        private int left;
        private int length;
        private int padding;

        @l
        private final BufferedSource source;
        private int streamId;

        public ContinuationSource(@l BufferedSource source) {
            l0.p(source, "source");
            this.source = source;
        }

        private final void readContinuationHeader() throws IOException {
            int i5 = this.streamId;
            int readMedium = Util.readMedium(this.source);
            this.left = readMedium;
            this.length = readMedium;
            int and = Util.and(this.source.readByte(), 255);
            this.flags = Util.and(this.source.readByte(), 255);
            Companion companion = Http2Reader.Companion;
            if (companion.getLogger().isLoggable(Level.FINE)) {
                companion.getLogger().fine(Http2.INSTANCE.frameLog(true, this.streamId, this.length, and, this.flags));
            }
            int readInt = this.source.readInt() & Integer.MAX_VALUE;
            this.streamId = readInt;
            if (and == 9) {
                if (readInt == i5) {
                } else {
                    throw new IOException("TYPE_CONTINUATION streamId changed");
                }
            } else {
                throw new IOException(and + " != TYPE_CONTINUATION");
            }
        }

        @Override // okio.n1, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        public final int getFlags() {
            return this.flags;
        }

        public final int getLeft() {
            return this.left;
        }

        public final int getLength() {
            return this.length;
        }

        public final int getPadding() {
            return this.padding;
        }

        public final int getStreamId() {
            return this.streamId;
        }

        @Override // okio.n1
        public long read(@l okio.l sink, long j5) throws IOException {
            l0.p(sink, "sink");
            while (true) {
                int i5 = this.left;
                if (i5 == 0) {
                    this.source.skip(this.padding);
                    this.padding = 0;
                    if ((this.flags & 4) != 0) {
                        return -1L;
                    }
                    readContinuationHeader();
                } else {
                    long read = this.source.read(sink, Math.min(j5, i5));
                    if (read == -1) {
                        return -1L;
                    }
                    this.left -= (int) read;
                    return read;
                }
            }
        }

        public final void setFlags(int i5) {
            this.flags = i5;
        }

        public final void setLeft(int i5) {
            this.left = i5;
        }

        public final void setLength(int i5) {
            this.length = i5;
        }

        public final void setPadding(int i5) {
            this.padding = i5;
        }

        public final void setStreamId(int i5) {
            this.streamId = i5;
        }

        @Override // okio.n1
        @l
        public p1 timeout() {
            return this.source.timeout();
        }
    }

    @i0(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J(\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H&J.\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH&J\u0018\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H&J\u0018\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H&J\b\u0010\u0016\u001a\u00020\tH&J \u0010\u001a\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0004H&J \u0010\u001e\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001cH&J\u0018\u0010!\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001fH&J(\u0010%\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u0002H&J&\u0010(\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u00042\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\r0\fH&J8\u0010/\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020)2\u0006\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u001fH&¨\u00060"}, d2 = {"Lokhttp3/internal/http2/Http2Reader$Handler;", "", "", "inFinished", "", "streamId", "Lokio/BufferedSource;", "source", cq.a.LENGTH, "Lkotlin/r2;", "data", "associatedStreamId", "", "Lokhttp3/internal/http2/Header;", "headerBlock", TTDownloadField.TT_HEADERS, "Lokhttp3/internal/http2/ErrorCode;", MediationConstant.KEY_ERROR_CODE, "rstStream", "clearPrevious", "Lokhttp3/internal/http2/Settings;", "settings", "ackSettings", "ack", "payload1", "payload2", "ping", "lastGoodStreamId", "Lokio/n;", "debugData", "goAway", "", "windowSizeIncrement", "windowUpdate", "streamDependency", "weight", "exclusive", LogFactory.PRIORITY_KEY, "promisedStreamId", "requestHeaders", "pushPromise", "", "origin", "protocol", c.f19042f, ClientCookie.PORT_ATTR, "maxAge", "alternateService", "okhttp"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public interface Handler {
        void ackSettings();

        void alternateService(int i5, @l String str, @l n nVar, @l String str2, int i6, long j5);

        void data(boolean z4, int i5, @l BufferedSource bufferedSource, int i6) throws IOException;

        void goAway(int i5, @l ErrorCode errorCode, @l n nVar);

        void headers(boolean z4, int i5, int i6, @l List<Header> list);

        void ping(boolean z4, int i5, int i6);

        void priority(int i5, int i6, int i7, boolean z4);

        void pushPromise(int i5, int i6, @l List<Header> list) throws IOException;

        void rstStream(int i5, @l ErrorCode errorCode);

        void settings(boolean z4, @l Settings settings);

        void windowUpdate(int i5, long j5);
    }

    static {
        Logger logger2 = Logger.getLogger(Http2.class.getName());
        l0.o(logger2, "getLogger(Http2::class.java.name)");
        logger = logger2;
    }

    public Http2Reader(@l BufferedSource source, boolean z4) {
        l0.p(source, "source");
        this.source = source;
        this.client = z4;
        ContinuationSource continuationSource = new ContinuationSource(source);
        this.continuation = continuationSource;
        this.hpackReader = new Hpack.Reader(continuationSource, 4096, 0, 4, null);
    }

    private final void readData(Handler handler, int i5, int i6, int i7) throws IOException {
        boolean z4;
        if (i7 != 0) {
            int i8 = 0;
            boolean z5 = true;
            if ((i6 & 1) != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if ((i6 & 32) == 0) {
                z5 = false;
            }
            if (!z5) {
                if ((i6 & 8) != 0) {
                    i8 = Util.and(this.source.readByte(), 255);
                }
                handler.data(z4, i7, this.source, Companion.lengthWithoutPadding(i5, i6, i8));
                this.source.skip(i8);
                return;
            }
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
    }

    private final void readGoAway(Handler handler, int i5, int i6, int i7) throws IOException {
        if (i5 >= 8) {
            if (i7 == 0) {
                int readInt = this.source.readInt();
                int readInt2 = this.source.readInt();
                int i8 = i5 - 8;
                ErrorCode fromHttp2 = ErrorCode.Companion.fromHttp2(readInt2);
                if (fromHttp2 != null) {
                    n nVar = n.EMPTY;
                    if (i8 > 0) {
                        nVar = this.source.Y(i8);
                    }
                    handler.goAway(readInt, fromHttp2, nVar);
                    return;
                }
                throw new IOException("TYPE_GOAWAY unexpected error code: " + readInt2);
            }
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        throw new IOException("TYPE_GOAWAY length < 8: " + i5);
    }

    private final List<Header> readHeaderBlock(int i5, int i6, int i7, int i8) throws IOException {
        this.continuation.setLeft(i5);
        ContinuationSource continuationSource = this.continuation;
        continuationSource.setLength(continuationSource.getLeft());
        this.continuation.setPadding(i6);
        this.continuation.setFlags(i7);
        this.continuation.setStreamId(i8);
        this.hpackReader.readHeaders();
        return this.hpackReader.getAndResetHeaderList();
    }

    private final void readHeaders(Handler handler, int i5, int i6, int i7) throws IOException {
        boolean z4;
        if (i7 != 0) {
            int i8 = 0;
            if ((i6 & 1) != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if ((i6 & 8) != 0) {
                i8 = Util.and(this.source.readByte(), 255);
            }
            if ((i6 & 32) != 0) {
                readPriority(handler, i7);
                i5 -= 5;
            }
            handler.headers(z4, i7, -1, readHeaderBlock(Companion.lengthWithoutPadding(i5, i6, i8), i8, i6, i7));
            return;
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
    }

    private final void readPing(Handler handler, int i5, int i6, int i7) throws IOException {
        if (i5 == 8) {
            if (i7 == 0) {
                int readInt = this.source.readInt();
                int readInt2 = this.source.readInt();
                boolean z4 = true;
                if ((i6 & 1) == 0) {
                    z4 = false;
                }
                handler.ping(z4, readInt, readInt2);
                return;
            }
            throw new IOException("TYPE_PING streamId != 0");
        }
        throw new IOException("TYPE_PING length != 8: " + i5);
    }

    private final void readPriority(Handler handler, int i5, int i6, int i7) throws IOException {
        if (i5 == 5) {
            if (i7 != 0) {
                readPriority(handler, i7);
                return;
            }
            throw new IOException("TYPE_PRIORITY streamId == 0");
        }
        throw new IOException("TYPE_PRIORITY length: " + i5 + " != 5");
    }

    private final void readPushPromise(Handler handler, int i5, int i6, int i7) throws IOException {
        int i8;
        if (i7 != 0) {
            if ((i6 & 8) != 0) {
                i8 = Util.and(this.source.readByte(), 255);
            } else {
                i8 = 0;
            }
            handler.pushPromise(i7, this.source.readInt() & Integer.MAX_VALUE, readHeaderBlock(Companion.lengthWithoutPadding(i5 - 4, i6, i8), i8, i6, i7));
            return;
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
    }

    private final void readRstStream(Handler handler, int i5, int i6, int i7) throws IOException {
        if (i5 == 4) {
            if (i7 != 0) {
                int readInt = this.source.readInt();
                ErrorCode fromHttp2 = ErrorCode.Companion.fromHttp2(readInt);
                if (fromHttp2 != null) {
                    handler.rstStream(i7, fromHttp2);
                    return;
                }
                throw new IOException("TYPE_RST_STREAM unexpected error code: " + readInt);
            }
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        }
        throw new IOException("TYPE_RST_STREAM length: " + i5 + " != 4");
    }

    private final void readSettings(Handler handler, int i5, int i6, int i7) throws IOException {
        kotlin.ranges.l W1;
        j B1;
        int readInt;
        if (i7 == 0) {
            if ((i6 & 1) != 0) {
                if (i5 == 0) {
                    handler.ackSettings();
                    return;
                }
                throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
            }
            if (i5 % 6 == 0) {
                Settings settings = new Settings();
                W1 = u.W1(0, i5);
                B1 = u.B1(W1, 6);
                int e5 = B1.e();
                int g5 = B1.g();
                int i8 = B1.i();
                if ((i8 > 0 && e5 <= g5) || (i8 < 0 && g5 <= e5)) {
                    while (true) {
                        int and = Util.and(this.source.readShort(), 65535);
                        readInt = this.source.readInt();
                        if (and != 2) {
                            if (and != 3) {
                                if (and != 4) {
                                    if (and == 5 && (readInt < 16384 || readInt > 16777215)) {
                                        break;
                                    }
                                } else if (readInt >= 0) {
                                    and = 7;
                                } else {
                                    throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                }
                            } else {
                                and = 4;
                            }
                        } else if (readInt != 0 && readInt != 1) {
                            throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                        }
                        settings.set(and, readInt);
                        if (e5 == g5) {
                            break;
                        } else {
                            e5 += i8;
                        }
                    }
                    throw new IOException("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: " + readInt);
                }
                handler.settings(false, settings);
                return;
            }
            throw new IOException("TYPE_SETTINGS length % 6 != 0: " + i5);
        }
        throw new IOException("TYPE_SETTINGS streamId != 0");
    }

    private final void readWindowUpdate(Handler handler, int i5, int i6, int i7) throws IOException {
        if (i5 == 4) {
            long and = Util.and(this.source.readInt(), 2147483647L);
            if (and != 0) {
                handler.windowUpdate(i7, and);
                return;
            }
            throw new IOException("windowSizeIncrement was 0");
        }
        throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + i5);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.source.close();
    }

    public final boolean nextFrame(boolean z4, @l Handler handler) throws IOException {
        l0.p(handler, "handler");
        try {
            this.source.U(9L);
            int readMedium = Util.readMedium(this.source);
            if (readMedium <= 16384) {
                int and = Util.and(this.source.readByte(), 255);
                int and2 = Util.and(this.source.readByte(), 255);
                int readInt = this.source.readInt() & Integer.MAX_VALUE;
                Logger logger2 = logger;
                if (logger2.isLoggable(Level.FINE)) {
                    logger2.fine(Http2.INSTANCE.frameLog(true, readInt, readMedium, and, and2));
                }
                if (z4 && and != 4) {
                    throw new IOException("Expected a SETTINGS frame but was " + Http2.INSTANCE.formattedType$okhttp(and));
                }
                switch (and) {
                    case 0:
                        readData(handler, readMedium, and2, readInt);
                        return true;
                    case 1:
                        readHeaders(handler, readMedium, and2, readInt);
                        return true;
                    case 2:
                        readPriority(handler, readMedium, and2, readInt);
                        return true;
                    case 3:
                        readRstStream(handler, readMedium, and2, readInt);
                        return true;
                    case 4:
                        readSettings(handler, readMedium, and2, readInt);
                        return true;
                    case 5:
                        readPushPromise(handler, readMedium, and2, readInt);
                        return true;
                    case 6:
                        readPing(handler, readMedium, and2, readInt);
                        return true;
                    case 7:
                        readGoAway(handler, readMedium, and2, readInt);
                        return true;
                    case 8:
                        readWindowUpdate(handler, readMedium, and2, readInt);
                        return true;
                    default:
                        this.source.skip(readMedium);
                        return true;
                }
            }
            throw new IOException("FRAME_SIZE_ERROR: " + readMedium);
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void readConnectionPreface(@l Handler handler) throws IOException {
        l0.p(handler, "handler");
        if (this.client) {
            if (!nextFrame(true, handler)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        BufferedSource bufferedSource = this.source;
        n nVar = Http2.CONNECTION_PREFACE;
        n Y = bufferedSource.Y(nVar.size());
        Logger logger2 = logger;
        if (logger2.isLoggable(Level.FINE)) {
            logger2.fine(Util.format("<< CONNECTION " + Y.hex(), new Object[0]));
        }
        if (l0.g(nVar, Y)) {
            return;
        }
        throw new IOException("Expected a connection header but was " + Y.utf8());
    }

    private final void readPriority(Handler handler, int i5) throws IOException {
        int readInt = this.source.readInt();
        handler.priority(i5, readInt & Integer.MAX_VALUE, Util.and(this.source.readByte(), 255) + 1, (Integer.MIN_VALUE & readInt) != 0);
    }
}
