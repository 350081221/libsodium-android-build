package okhttp3.internal.http2;

import android.net.http.Headers;
import com.bytedance.android.live.base.api.push.ILivePush;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.tendcloud.tenddata.cq;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.r2;
import m0.a;
import okhttp3.internal.Util;
import okio.BufferedSource;
import okio.j;
import okio.l1;
import okio.n1;
import okio.p1;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\u0018\u0000 k2\u00020\u0001:\u0004klmnB3\b\u0000\u0012\u0006\u00100\u001a\u00020\u001f\u0012\u0006\u00105\u001a\u000204\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010#\u001a\u00020\u0006\u0012\b\u0010\"\u001a\u0004\u0018\u00010\b¢\u0006\u0004\bi\u0010jJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\n\u001a\u00020\bJ$\u0010\u0011\u001a\u00020\u00102\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006J\u000e\u0010\u0012\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\bJ\u0006\u0010\u0014\u001a\u00020\u0013J\u0006\u0010\u0015\u001a\u00020\u0013J\u0006\u0010\u0017\u001a\u00020\u0016J\u0006\u0010\u0019\u001a\u00020\u0018J\u0018\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010!\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fJ\u0016\u0010$\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u0006J\u000e\u0010%\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002J\u000f\u0010(\u001a\u00020\u0010H\u0000¢\u0006\u0004\b&\u0010'J\u000e\u0010+\u001a\u00020\u00102\u0006\u0010*\u001a\u00020)J\u000f\u0010-\u001a\u00020\u0010H\u0000¢\u0006\u0004\b,\u0010'J\u000f\u0010/\u001a\u00020\u0010H\u0000¢\u0006\u0004\b.\u0010'R\u0017\u00100\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u00105\u001a\u0002048\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R*\u0010:\u001a\u00020)2\u0006\u00109\u001a\u00020)8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R*\u0010@\u001a\u00020)2\u0006\u00109\u001a\u00020)8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010;\u001a\u0004\bA\u0010=\"\u0004\bB\u0010?R*\u0010C\u001a\u00020)2\u0006\u00109\u001a\u00020)8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010;\u001a\u0004\bD\u0010=\"\u0004\bE\u0010?R*\u0010F\u001a\u00020)2\u0006\u00109\u001a\u00020)8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010;\u001a\u0004\bG\u0010=\"\u0004\bH\u0010?R\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020\b0I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010L\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u001e\u0010\u001e\u001a\u00060NR\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010O\u001a\u0004\bP\u0010QR\u001e\u0010S\u001a\u00060RR\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u001e\u0010\u0014\u001a\u00060WR\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010X\u001a\u0004\bY\u0010ZR\u001e\u0010\u0015\u001a\u00060WR\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010X\u001a\u0004\b[\u0010ZR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028@@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\u0011\u0010f\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bf\u0010gR\u0011\u0010h\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bh\u0010g¨\u0006o"}, d2 = {"Lokhttp3/internal/http2/Http2Stream;", "", "Lokhttp3/internal/http2/ErrorCode;", MediationConstant.KEY_ERROR_CODE, "Ljava/io/IOException;", "errorException", "", "closeInternal", "Lokhttp3/Headers;", "takeHeaders", "trailers", "", "Lokhttp3/internal/http2/Header;", "responseHeaders", "outFinished", "flushHeaders", "Lkotlin/r2;", "writeHeaders", "enqueueTrailers", "Lokio/p1;", "readTimeout", "writeTimeout", "Lokio/n1;", "getSource", "Lokio/l1;", "getSink", "rstStatusCode", ILivePush.ClickType.CLOSE, "closeLater", "Lokio/BufferedSource;", "source", "", cq.a.LENGTH, "receiveData", TTDownloadField.TT_HEADERS, "inFinished", "receiveHeaders", "receiveRstStream", "cancelStreamIfNecessary$okhttp", "()V", "cancelStreamIfNecessary", "", "delta", "addBytesToWriteWindow", "checkOutNotClosed$okhttp", "checkOutNotClosed", "waitForIo$okhttp", "waitForIo", "id", "I", "getId", "()I", "Lokhttp3/internal/http2/Http2Connection;", Headers.CONN_DIRECTIVE, "Lokhttp3/internal/http2/Http2Connection;", "getConnection", "()Lokhttp3/internal/http2/Http2Connection;", "<set-?>", "readBytesTotal", "J", "getReadBytesTotal", "()J", "setReadBytesTotal$okhttp", "(J)V", "readBytesAcknowledged", "getReadBytesAcknowledged", "setReadBytesAcknowledged$okhttp", "writeBytesTotal", "getWriteBytesTotal", "setWriteBytesTotal$okhttp", "writeBytesMaximum", "getWriteBytesMaximum", "setWriteBytesMaximum$okhttp", "Ljava/util/ArrayDeque;", "headersQueue", "Ljava/util/ArrayDeque;", "hasResponseHeaders", "Z", "Lokhttp3/internal/http2/Http2Stream$FramingSource;", "Lokhttp3/internal/http2/Http2Stream$FramingSource;", "getSource$okhttp", "()Lokhttp3/internal/http2/Http2Stream$FramingSource;", "Lokhttp3/internal/http2/Http2Stream$FramingSink;", "sink", "Lokhttp3/internal/http2/Http2Stream$FramingSink;", "getSink$okhttp", "()Lokhttp3/internal/http2/Http2Stream$FramingSink;", "Lokhttp3/internal/http2/Http2Stream$StreamTimeout;", "Lokhttp3/internal/http2/Http2Stream$StreamTimeout;", "getReadTimeout$okhttp", "()Lokhttp3/internal/http2/Http2Stream$StreamTimeout;", "getWriteTimeout$okhttp", "Lokhttp3/internal/http2/ErrorCode;", "getErrorCode$okhttp", "()Lokhttp3/internal/http2/ErrorCode;", "setErrorCode$okhttp", "(Lokhttp3/internal/http2/ErrorCode;)V", "Ljava/io/IOException;", "getErrorException$okhttp", "()Ljava/io/IOException;", "setErrorException$okhttp", "(Ljava/io/IOException;)V", "isOpen", "()Z", "isLocallyInitiated", "<init>", "(ILokhttp3/internal/http2/Http2Connection;ZZLokhttp3/Headers;)V", "Companion", "FramingSink", "FramingSource", "StreamTimeout", "okhttp"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nHttp2Stream.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http2Stream.kt\nokhttp3/internal/http2/Http2Stream\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokhttp3/internal/Util\n*L\n1#1,688:1\n1#2:689\n615#3,4:690\n615#3,4:694\n563#3:698\n615#3,4:699\n615#3,4:703\n563#3:707\n563#3:708\n615#3,4:709\n563#3:713\n557#3:714\n*S KotlinDebug\n*F\n+ 1 Http2Stream.kt\nokhttp3/internal/http2/Http2Stream\n*L\n176#1:690,4\n255#1:694,4\n263#1:698\n274#1:699,4\n281#1:703,4\n295#1:707\n305#1:708\n491#1:709,4\n637#1:713\n657#1:714\n*E\n"})
/* loaded from: classes4.dex */
public final class Http2Stream {

    @l
    public static final Companion Companion = new Companion(null);
    public static final long EMIT_BUFFER_SIZE = 16384;

    @l
    private final Http2Connection connection;

    @m
    private ErrorCode errorCode;

    @m
    private IOException errorException;
    private boolean hasResponseHeaders;

    @l
    private final ArrayDeque<okhttp3.Headers> headersQueue;
    private final int id;
    private long readBytesAcknowledged;
    private long readBytesTotal;

    @l
    private final StreamTimeout readTimeout;

    @l
    private final FramingSink sink;

    @l
    private final FramingSource source;
    private long writeBytesMaximum;
    private long writeBytesTotal;

    @l
    private final StreamTimeout writeTimeout;

    @i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/http2/Http2Stream$Companion;", "", "()V", "EMIT_BUFFER_SIZE", "", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }
    }

    @i0(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b*\u0010+J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u0004H\u0016R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\"\u0010\u0014\u001a\u00020\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001a\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u001e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR$\u0010!\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010'\u001a\u00020\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u0010\u0015\u001a\u0004\b(\u0010\u0017\"\u0004\b)\u0010\u0019¨\u0006,"}, d2 = {"Lokhttp3/internal/http2/Http2Stream$FramingSource;", "Lokio/n1;", "", "read", "Lkotlin/r2;", "updateConnectionFlowControl", "Lokio/l;", "sink", "byteCount", "Lokio/BufferedSource;", "source", "receive$okhttp", "(Lokio/BufferedSource;J)V", "receive", "Lokio/p1;", a.Z, ILivePush.ClickType.CLOSE, "maxByteCount", "J", "", "finished", "Z", "getFinished$okhttp", "()Z", "setFinished$okhttp", "(Z)V", "receiveBuffer", "Lokio/l;", "getReceiveBuffer", "()Lokio/l;", "readBuffer", "getReadBuffer", "Lokhttp3/Headers;", "trailers", "Lokhttp3/Headers;", "getTrailers", "()Lokhttp3/Headers;", "setTrailers", "(Lokhttp3/Headers;)V", "closed", "getClosed$okhttp", "setClosed$okhttp", "<init>", "(Lokhttp3/internal/http2/Http2Stream;JZ)V", "okhttp"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nHttp2Stream.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http2Stream.kt\nokhttp3/internal/http2/Http2Stream$FramingSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokhttp3/internal/Util\n*L\n1#1,688:1\n1#2:689\n615#3,4:690\n615#3,4:694\n563#3:698\n563#3:699\n*S KotlinDebug\n*F\n+ 1 Http2Stream.kt\nokhttp3/internal/http2/Http2Stream$FramingSource\n*L\n407#1:690,4\n418#1:694,4\n458#1:698\n480#1:699\n*E\n"})
    /* loaded from: classes4.dex */
    public final class FramingSource implements n1 {
        private boolean closed;
        private boolean finished;
        private final long maxByteCount;

        @m
        private okhttp3.Headers trailers;

        @l
        private final okio.l receiveBuffer = new okio.l();

        @l
        private final okio.l readBuffer = new okio.l();

        public FramingSource(long j5, boolean z4) {
            this.maxByteCount = j5;
            this.finished = z4;
        }

        private final void updateConnectionFlowControl(long j5) {
            Http2Stream http2Stream = Http2Stream.this;
            if (Util.assertionsEnabled && Thread.holdsLock(http2Stream)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + http2Stream);
            }
            Http2Stream.this.getConnection().updateConnectionFlowControl$okhttp(j5);
        }

        @Override // okio.n1, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            long M0;
            Http2Stream http2Stream = Http2Stream.this;
            synchronized (http2Stream) {
                this.closed = true;
                M0 = this.readBuffer.M0();
                this.readBuffer.c();
                l0.n(http2Stream, "null cannot be cast to non-null type java.lang.Object");
                http2Stream.notifyAll();
                r2 r2Var = r2.f19517a;
            }
            if (M0 > 0) {
                updateConnectionFlowControl(M0);
            }
            Http2Stream.this.cancelStreamIfNecessary$okhttp();
        }

        public final boolean getClosed$okhttp() {
            return this.closed;
        }

        public final boolean getFinished$okhttp() {
            return this.finished;
        }

        @l
        public final okio.l getReadBuffer() {
            return this.readBuffer;
        }

        @l
        public final okio.l getReceiveBuffer() {
            return this.receiveBuffer;
        }

        @m
        public final okhttp3.Headers getTrailers() {
            return this.trailers;
        }

        /* JADX WARN: Code restructure failed: missing block: B:47:0x00c4, code lost:
        
            throw new java.io.IOException("stream closed");
         */
        @Override // okio.n1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public long read(@p4.l okio.l r18, long r19) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 236
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Stream.FramingSource.read(okio.l, long):long");
        }

        public final void receive$okhttp(@l BufferedSource source, long j5) throws IOException {
            boolean z4;
            boolean z5;
            boolean z6;
            l0.p(source, "source");
            Http2Stream http2Stream = Http2Stream.this;
            if (Util.assertionsEnabled && Thread.holdsLock(http2Stream)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + http2Stream);
            }
            long j6 = j5;
            while (j6 > 0) {
                synchronized (Http2Stream.this) {
                    z4 = this.finished;
                    z5 = true;
                    if (this.readBuffer.M0() + j6 > this.maxByteCount) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    r2 r2Var = r2.f19517a;
                }
                if (z6) {
                    source.skip(j6);
                    Http2Stream.this.closeLater(ErrorCode.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z4) {
                    source.skip(j6);
                    return;
                }
                long read = source.read(this.receiveBuffer, j6);
                if (read != -1) {
                    j6 -= read;
                    Http2Stream http2Stream2 = Http2Stream.this;
                    synchronized (http2Stream2) {
                        if (this.closed) {
                            this.receiveBuffer.c();
                        } else {
                            if (this.readBuffer.M0() != 0) {
                                z5 = false;
                            }
                            this.readBuffer.G(this.receiveBuffer);
                            if (z5) {
                                l0.n(http2Stream2, "null cannot be cast to non-null type java.lang.Object");
                                http2Stream2.notifyAll();
                            }
                        }
                    }
                } else {
                    throw new EOFException();
                }
            }
            updateConnectionFlowControl(j5);
        }

        public final void setClosed$okhttp(boolean z4) {
            this.closed = z4;
        }

        public final void setFinished$okhttp(boolean z4) {
            this.finished = z4;
        }

        public final void setTrailers(@m okhttp3.Headers headers) {
            this.trailers = headers;
        }

        @Override // okio.n1
        @l
        public p1 timeout() {
            return Http2Stream.this.getReadTimeout$okhttp();
        }
    }

    @i0(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0014J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\u0006\u0010\u0007\u001a\u00020\u0002¨\u0006\n"}, d2 = {"Lokhttp3/internal/http2/Http2Stream$StreamTimeout;", "Lokio/j;", "Lkotlin/r2;", "timedOut", "Ljava/io/IOException;", "cause", "newTimeoutException", "exitAndThrowIfTimedOut", "<init>", "(Lokhttp3/internal/http2/Http2Stream;)V", "okhttp"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public final class StreamTimeout extends j {
        public StreamTimeout() {
        }

        public final void exitAndThrowIfTimedOut() throws IOException {
            if (exit()) {
                throw newTimeoutException(null);
            }
        }

        @Override // okio.j
        @l
        protected IOException newTimeoutException(@m IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException(a.Z);
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // okio.j
        protected void timedOut() {
            Http2Stream.this.closeLater(ErrorCode.CANCEL);
            Http2Stream.this.getConnection().sendDegradedPingLater$okhttp();
        }
    }

    public Http2Stream(int i5, @l Http2Connection connection, boolean z4, boolean z5, @m okhttp3.Headers headers) {
        l0.p(connection, "connection");
        this.id = i5;
        this.connection = connection;
        this.writeBytesMaximum = connection.getPeerSettings().getInitialWindowSize();
        ArrayDeque<okhttp3.Headers> arrayDeque = new ArrayDeque<>();
        this.headersQueue = arrayDeque;
        this.source = new FramingSource(connection.getOkHttpSettings().getInitialWindowSize(), z5);
        this.sink = new FramingSink(z4);
        this.readTimeout = new StreamTimeout();
        this.writeTimeout = new StreamTimeout();
        if (headers != null) {
            if (!isLocallyInitiated()) {
                arrayDeque.add(headers);
                return;
            }
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
        }
        if (isLocallyInitiated()) {
        } else {
            throw new IllegalStateException("remotely-initiated streams should have headers".toString());
        }
    }

    private final boolean closeInternal(ErrorCode errorCode, IOException iOException) {
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            if (this.errorCode != null) {
                return false;
            }
            this.errorCode = errorCode;
            this.errorException = iOException;
            l0.n(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
            if (this.source.getFinished$okhttp() && this.sink.getFinished()) {
                return false;
            }
            r2 r2Var = r2.f19517a;
            this.connection.removeStream$okhttp(this.id);
            return true;
        }
    }

    public final void addBytesToWriteWindow(long j5) {
        this.writeBytesMaximum += j5;
        if (j5 > 0) {
            l0.n(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    public final void cancelStreamIfNecessary$okhttp() throws IOException {
        boolean z4;
        boolean isOpen;
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            if (!this.source.getFinished$okhttp() && this.source.getClosed$okhttp() && (this.sink.getFinished() || this.sink.getClosed())) {
                z4 = true;
            } else {
                z4 = false;
            }
            isOpen = isOpen();
            r2 r2Var = r2.f19517a;
        }
        if (z4) {
            close(ErrorCode.CANCEL, null);
        } else if (!isOpen) {
            this.connection.removeStream$okhttp(this.id);
        }
    }

    public final void checkOutNotClosed$okhttp() throws IOException {
        if (!this.sink.getClosed()) {
            if (!this.sink.getFinished()) {
                if (this.errorCode != null) {
                    IOException iOException = this.errorException;
                    if (iOException == null) {
                        ErrorCode errorCode = this.errorCode;
                        l0.m(errorCode);
                        throw new StreamResetException(errorCode);
                    }
                    throw iOException;
                }
                return;
            }
            throw new IOException("stream finished");
        }
        throw new IOException("stream closed");
    }

    public final void close(@l ErrorCode rstStatusCode, @m IOException iOException) throws IOException {
        l0.p(rstStatusCode, "rstStatusCode");
        if (!closeInternal(rstStatusCode, iOException)) {
            return;
        }
        this.connection.writeSynReset$okhttp(this.id, rstStatusCode);
    }

    public final void closeLater(@l ErrorCode errorCode) {
        l0.p(errorCode, "errorCode");
        if (!closeInternal(errorCode, null)) {
            return;
        }
        this.connection.writeSynResetLater$okhttp(this.id, errorCode);
    }

    public final void enqueueTrailers(@l okhttp3.Headers trailers) {
        l0.p(trailers, "trailers");
        synchronized (this) {
            boolean z4 = true;
            if (!this.sink.getFinished()) {
                if (trailers.size() == 0) {
                    z4 = false;
                }
                if (z4) {
                    this.sink.setTrailers(trailers);
                    r2 r2Var = r2.f19517a;
                } else {
                    throw new IllegalArgumentException("trailers.size() == 0".toString());
                }
            } else {
                throw new IllegalStateException("already finished".toString());
            }
        }
    }

    @l
    public final Http2Connection getConnection() {
        return this.connection;
    }

    @m
    public final synchronized ErrorCode getErrorCode$okhttp() {
        return this.errorCode;
    }

    @m
    public final IOException getErrorException$okhttp() {
        return this.errorException;
    }

    public final int getId() {
        return this.id;
    }

    public final long getReadBytesAcknowledged() {
        return this.readBytesAcknowledged;
    }

    public final long getReadBytesTotal() {
        return this.readBytesTotal;
    }

    @l
    public final StreamTimeout getReadTimeout$okhttp() {
        return this.readTimeout;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0011 A[Catch: all -> 0x0023, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:10:0x0011, B:15:0x0017, B:16:0x0022), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0017 A[Catch: all -> 0x0023, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:10:0x0011, B:15:0x0017, B:16:0x0022), top: B:2:0x0001 }] */
    @p4.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final okio.l1 getSink() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.hasResponseHeaders     // Catch: java.lang.Throwable -> L23
            if (r0 != 0) goto Le
            boolean r0 = r2.isLocallyInitiated()     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto Lc
            goto Le
        Lc:
            r0 = 0
            goto Lf
        Le:
            r0 = 1
        Lf:
            if (r0 == 0) goto L17
            kotlin.r2 r0 = kotlin.r2.f19517a     // Catch: java.lang.Throwable -> L23
            monitor-exit(r2)
            okhttp3.internal.http2.Http2Stream$FramingSink r0 = r2.sink
            return r0
        L17:
            java.lang.String r0 = "reply before requesting the sink"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L23
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L23
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L23
            throw r1     // Catch: java.lang.Throwable -> L23
        L23:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Stream.getSink():okio.l1");
    }

    @l
    public final FramingSink getSink$okhttp() {
        return this.sink;
    }

    @l
    public final n1 getSource() {
        return this.source;
    }

    @l
    public final FramingSource getSource$okhttp() {
        return this.source;
    }

    public final long getWriteBytesMaximum() {
        return this.writeBytesMaximum;
    }

    public final long getWriteBytesTotal() {
        return this.writeBytesTotal;
    }

    @l
    public final StreamTimeout getWriteTimeout$okhttp() {
        return this.writeTimeout;
    }

    public final boolean isLocallyInitiated() {
        boolean z4;
        if ((this.id & 1) == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (this.connection.getClient$okhttp() == z4) {
            return true;
        }
        return false;
    }

    public final synchronized boolean isOpen() {
        if (this.errorCode != null) {
            return false;
        }
        if ((this.source.getFinished$okhttp() || this.source.getClosed$okhttp()) && (this.sink.getFinished() || this.sink.getClosed())) {
            if (this.hasResponseHeaders) {
                return false;
            }
        }
        return true;
    }

    @l
    public final p1 readTimeout() {
        return this.readTimeout;
    }

    public final void receiveData(@l BufferedSource source, int i5) throws IOException {
        l0.p(source, "source");
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        this.source.receive$okhttp(source, i5);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004f A[Catch: all -> 0x006d, TryCatch #0 {, blocks: (B:10:0x0038, B:14:0x0040, B:16:0x004f, B:17:0x0054, B:24:0x0046), top: B:9:0x0038 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void receiveHeaders(@p4.l okhttp3.Headers r3, boolean r4) {
        /*
            r2 = this;
            java.lang.String r0 = "headers"
            kotlin.jvm.internal.l0.p(r3, r0)
            boolean r0 = okhttp3.internal.Util.assertionsEnabled
            if (r0 == 0) goto L37
            boolean r0 = java.lang.Thread.holdsLock(r2)
            if (r0 != 0) goto L10
            goto L37
        L10:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Thread "
            r4.append(r0)
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r0 = r0.getName()
            r4.append(r0)
            java.lang.String r0 = " MUST NOT hold lock on "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L37:
            monitor-enter(r2)
            boolean r0 = r2.hasResponseHeaders     // Catch: java.lang.Throwable -> L6d
            r1 = 1
            if (r0 == 0) goto L46
            if (r4 != 0) goto L40
            goto L46
        L40:
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r2.source     // Catch: java.lang.Throwable -> L6d
            r0.setTrailers(r3)     // Catch: java.lang.Throwable -> L6d
            goto L4d
        L46:
            r2.hasResponseHeaders = r1     // Catch: java.lang.Throwable -> L6d
            java.util.ArrayDeque<okhttp3.Headers> r0 = r2.headersQueue     // Catch: java.lang.Throwable -> L6d
            r0.add(r3)     // Catch: java.lang.Throwable -> L6d
        L4d:
            if (r4 == 0) goto L54
            okhttp3.internal.http2.Http2Stream$FramingSource r3 = r2.source     // Catch: java.lang.Throwable -> L6d
            r3.setFinished$okhttp(r1)     // Catch: java.lang.Throwable -> L6d
        L54:
            boolean r3 = r2.isOpen()     // Catch: java.lang.Throwable -> L6d
            java.lang.String r4 = "null cannot be cast to non-null type java.lang.Object"
            kotlin.jvm.internal.l0.n(r2, r4)     // Catch: java.lang.Throwable -> L6d
            r2.notifyAll()     // Catch: java.lang.Throwable -> L6d
            kotlin.r2 r4 = kotlin.r2.f19517a     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r2)
            if (r3 != 0) goto L6c
            okhttp3.internal.http2.Http2Connection r3 = r2.connection
            int r4 = r2.id
            r3.removeStream$okhttp(r4)
        L6c:
            return
        L6d:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Stream.receiveHeaders(okhttp3.Headers, boolean):void");
    }

    public final synchronized void receiveRstStream(@l ErrorCode errorCode) {
        l0.p(errorCode, "errorCode");
        if (this.errorCode == null) {
            this.errorCode = errorCode;
            l0.n(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    public final void setErrorCode$okhttp(@m ErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    public final void setErrorException$okhttp(@m IOException iOException) {
        this.errorException = iOException;
    }

    public final void setReadBytesAcknowledged$okhttp(long j5) {
        this.readBytesAcknowledged = j5;
    }

    public final void setReadBytesTotal$okhttp(long j5) {
        this.readBytesTotal = j5;
    }

    public final void setWriteBytesMaximum$okhttp(long j5) {
        this.writeBytesMaximum = j5;
    }

    public final void setWriteBytesTotal$okhttp(long j5) {
        this.writeBytesTotal = j5;
    }

    @l
    public final synchronized okhttp3.Headers takeHeaders() throws IOException {
        okhttp3.Headers removeFirst;
        this.readTimeout.enter();
        while (this.headersQueue.isEmpty() && this.errorCode == null) {
            try {
                waitForIo$okhttp();
            } catch (Throwable th) {
                this.readTimeout.exitAndThrowIfTimedOut();
                throw th;
            }
        }
        this.readTimeout.exitAndThrowIfTimedOut();
        if (!this.headersQueue.isEmpty()) {
            removeFirst = this.headersQueue.removeFirst();
            l0.o(removeFirst, "headersQueue.removeFirst()");
        } else {
            IOException iOException = this.errorException;
            if (iOException == null) {
                ErrorCode errorCode = this.errorCode;
                l0.m(errorCode);
                throw new StreamResetException(errorCode);
            }
            throw iOException;
        }
        return removeFirst;
    }

    @l
    public final synchronized okhttp3.Headers trailers() throws IOException {
        okhttp3.Headers trailers;
        if (this.source.getFinished$okhttp() && this.source.getReceiveBuffer().e0() && this.source.getReadBuffer().e0()) {
            trailers = this.source.getTrailers();
            if (trailers == null) {
                trailers = Util.EMPTY_HEADERS;
            }
        } else {
            if (this.errorCode != null) {
                IOException iOException = this.errorException;
                if (iOException == null) {
                    ErrorCode errorCode = this.errorCode;
                    l0.m(errorCode);
                    throw new StreamResetException(errorCode);
                }
                throw iOException;
            }
            throw new IllegalStateException("too early; can't read the trailers yet");
        }
        return trailers;
    }

    public final void waitForIo$okhttp() throws InterruptedIOException {
        try {
            l0.n(this, "null cannot be cast to non-null type java.lang.Object");
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public final void writeHeaders(@l List<Header> responseHeaders, boolean z4, boolean z5) throws IOException {
        boolean z6;
        l0.p(responseHeaders, "responseHeaders");
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            z6 = true;
            this.hasResponseHeaders = true;
            if (z4) {
                this.sink.setFinished(true);
            }
            r2 r2Var = r2.f19517a;
        }
        if (!z5) {
            synchronized (this.connection) {
                if (this.connection.getWriteBytesTotal() < this.connection.getWriteBytesMaximum()) {
                    z6 = false;
                }
            }
            z5 = z6;
        }
        this.connection.writeHeaders$okhttp(this.id, z4, responseHeaders);
        if (z5) {
            this.connection.flush();
        }
    }

    @l
    public final p1 writeTimeout() {
        return this.writeTimeout;
    }

    @i0(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b!\u0010\"J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\u0004H\u0016R\"\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R$\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u001e\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0010\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014¨\u0006#"}, d2 = {"Lokhttp3/internal/http2/Http2Stream$FramingSink;", "Lokio/l1;", "", "outFinishedOnLastFrame", "Lkotlin/r2;", "emitFrame", "Lokio/l;", "source", "", "byteCount", "write", "flush", "Lokio/p1;", a.Z, ILivePush.ClickType.CLOSE, "finished", "Z", "getFinished", "()Z", "setFinished", "(Z)V", "sendBuffer", "Lokio/l;", "Lokhttp3/Headers;", "trailers", "Lokhttp3/Headers;", "getTrailers", "()Lokhttp3/Headers;", "setTrailers", "(Lokhttp3/Headers;)V", "closed", "getClosed", "setClosed", "<init>", "(Lokhttp3/internal/http2/Http2Stream;Z)V", "okhttp"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nHttp2Stream.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http2Stream.kt\nokhttp3/internal/http2/Http2Stream$FramingSink\n+ 2 Util.kt\nokhttp3/internal/Util\n*L\n1#1,688:1\n615#2,4:689\n615#2,4:693\n615#2,4:697\n*S KotlinDebug\n*F\n+ 1 Http2Stream.kt\nokhttp3/internal/http2/Http2Stream$FramingSink\n*L\n528#1:689,4\n573#1:693,4\n589#1:697,4\n*E\n"})
    /* loaded from: classes4.dex */
    public final class FramingSink implements l1 {
        private boolean closed;
        private boolean finished;

        @l
        private final okio.l sendBuffer;

        @m
        private okhttp3.Headers trailers;

        public FramingSink(boolean z4) {
            this.finished = z4;
            this.sendBuffer = new okio.l();
        }

        private final void emitFrame(boolean z4) throws IOException {
            long min;
            boolean z5;
            boolean z6;
            Http2Stream http2Stream = Http2Stream.this;
            synchronized (http2Stream) {
                http2Stream.getWriteTimeout$okhttp().enter();
                while (http2Stream.getWriteBytesTotal() >= http2Stream.getWriteBytesMaximum() && !this.finished && !this.closed && http2Stream.getErrorCode$okhttp() == null) {
                    try {
                        http2Stream.waitForIo$okhttp();
                    } finally {
                        http2Stream.getWriteTimeout$okhttp().exitAndThrowIfTimedOut();
                    }
                }
                http2Stream.getWriteTimeout$okhttp().exitAndThrowIfTimedOut();
                http2Stream.checkOutNotClosed$okhttp();
                min = Math.min(http2Stream.getWriteBytesMaximum() - http2Stream.getWriteBytesTotal(), this.sendBuffer.M0());
                http2Stream.setWriteBytesTotal$okhttp(http2Stream.getWriteBytesTotal() + min);
                if (z4 && min == this.sendBuffer.M0()) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                z6 = z5;
                r2 r2Var = r2.f19517a;
            }
            Http2Stream.this.getWriteTimeout$okhttp().enter();
            try {
                Http2Stream.this.getConnection().writeData(Http2Stream.this.getId(), z6, this.sendBuffer, min);
            } finally {
                http2Stream = Http2Stream.this;
            }
        }

        @Override // okio.l1, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            boolean z4;
            boolean z5;
            boolean z6;
            Http2Stream http2Stream = Http2Stream.this;
            if (Util.assertionsEnabled && Thread.holdsLock(http2Stream)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + http2Stream);
            }
            Http2Stream http2Stream2 = Http2Stream.this;
            synchronized (http2Stream2) {
                if (this.closed) {
                    return;
                }
                if (http2Stream2.getErrorCode$okhttp() == null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                r2 r2Var = r2.f19517a;
                if (!Http2Stream.this.getSink$okhttp().finished) {
                    if (this.sendBuffer.M0() > 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (this.trailers != null) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (z6) {
                        while (this.sendBuffer.M0() > 0) {
                            emitFrame(false);
                        }
                        Http2Connection connection = Http2Stream.this.getConnection();
                        int id = Http2Stream.this.getId();
                        okhttp3.Headers headers = this.trailers;
                        l0.m(headers);
                        connection.writeHeaders$okhttp(id, z4, Util.toHeaderList(headers));
                    } else if (z5) {
                        while (this.sendBuffer.M0() > 0) {
                            emitFrame(true);
                        }
                    } else if (z4) {
                        Http2Stream.this.getConnection().writeData(Http2Stream.this.getId(), true, null, 0L);
                    }
                }
                synchronized (Http2Stream.this) {
                    this.closed = true;
                    r2 r2Var2 = r2.f19517a;
                }
                Http2Stream.this.getConnection().flush();
                Http2Stream.this.cancelStreamIfNecessary$okhttp();
            }
        }

        @Override // okio.l1, java.io.Flushable
        public void flush() throws IOException {
            Http2Stream http2Stream = Http2Stream.this;
            if (Util.assertionsEnabled && Thread.holdsLock(http2Stream)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + http2Stream);
            }
            Http2Stream http2Stream2 = Http2Stream.this;
            synchronized (http2Stream2) {
                http2Stream2.checkOutNotClosed$okhttp();
                r2 r2Var = r2.f19517a;
            }
            while (this.sendBuffer.M0() > 0) {
                emitFrame(false);
                Http2Stream.this.getConnection().flush();
            }
        }

        public final boolean getClosed() {
            return this.closed;
        }

        public final boolean getFinished() {
            return this.finished;
        }

        @m
        public final okhttp3.Headers getTrailers() {
            return this.trailers;
        }

        public final void setClosed(boolean z4) {
            this.closed = z4;
        }

        public final void setFinished(boolean z4) {
            this.finished = z4;
        }

        public final void setTrailers(@m okhttp3.Headers headers) {
            this.trailers = headers;
        }

        @Override // okio.l1
        @l
        public p1 timeout() {
            return Http2Stream.this.getWriteTimeout$okhttp();
        }

        @Override // okio.l1
        public void write(@l okio.l source, long j5) throws IOException {
            l0.p(source, "source");
            Http2Stream http2Stream = Http2Stream.this;
            if (Util.assertionsEnabled && Thread.holdsLock(http2Stream)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + http2Stream);
            }
            this.sendBuffer.write(source, j5);
            while (this.sendBuffer.M0() >= 16384) {
                emitFrame(false);
            }
        }

        public /* synthetic */ FramingSink(Http2Stream http2Stream, boolean z4, int i5, w wVar) {
            this((i5 & 1) != 0 ? false : z4);
        }
    }
}
