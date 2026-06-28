package okhttp3.internal.http1;

import android.net.http.Headers;
import com.bytedance.android.live.base.api.push.ILivePush;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.tendcloud.tenddata.cq;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.text.e0;
import m0.a;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;
import okio.BufferedSource;
import okio.l1;
import okio.n1;
import okio.p1;
import okio.y;
import org.apache.http.protocol.HTTP;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 D2\u00020\u0001:\u0007EFGDHIJB)\u0012\b\u0010)\u001a\u0004\u0018\u00010(\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u00101\u001a\u000200\u0012\u0006\u00104\u001a\u000203¢\u0006\u0004\bB\u0010CJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J\b\u0010\f\u001a\u00020\u0007H\u0002J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0005H\u0016J\b\u0010\u0015\u001a\u00020\u000fH\u0016J\u0010\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u0010\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\b\u0010\u001c\u001a\u00020\u001bH\u0016J\b\u0010\u001d\u001a\u00020\u000fH\u0016J\b\u0010\u001e\u001a\u00020\u000fH\u0016J\u0016\u0010\"\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020 J\u0012\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010$\u001a\u00020#H\u0016J\u000e\u0010'\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0017R\u0016\u0010)\u001a\u0004\u0018\u00010(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010,\u001a\u00020+8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00107\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010<R\u0018\u0010=\u001a\u00020#*\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0018\u0010=\u001a\u00020#*\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b=\u0010?R\u0011\u0010@\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b@\u0010A¨\u0006K"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec;", "Lokhttp3/internal/http/ExchangeCodec;", "Lokio/l1;", "newChunkedSink", "newKnownLengthSink", "", cq.a.LENGTH, "Lokio/n1;", "newFixedLengthSource", "Lokhttp3/HttpUrl;", "url", "newChunkedSource", "newUnknownLengthSource", "Lokio/y;", a.Z, "Lkotlin/r2;", "detachTimeout", "Lokhttp3/Request;", "request", "contentLength", "createRequestBody", "cancel", "writeRequestHeaders", "Lokhttp3/Response;", "response", "reportedContentLength", "openResponseBodySource", "Lokhttp3/Headers;", "trailers", "flushRequest", "finishRequest", TTDownloadField.TT_HEADERS, "", "requestLine", "writeRequest", "", "expectContinue", "Lokhttp3/Response$Builder;", "readResponseHeaders", "skipConnectBody", "Lokhttp3/OkHttpClient;", "client", "Lokhttp3/OkHttpClient;", "Lokhttp3/internal/connection/RealConnection;", Headers.CONN_DIRECTIVE, "Lokhttp3/internal/connection/RealConnection;", "getConnection", "()Lokhttp3/internal/connection/RealConnection;", "Lokio/BufferedSource;", "source", "Lokio/BufferedSource;", "Lokio/m;", "sink", "Lokio/m;", "", "state", "I", "Lokhttp3/internal/http1/HeadersReader;", "headersReader", "Lokhttp3/internal/http1/HeadersReader;", "Lokhttp3/Headers;", "isChunked", "(Lokhttp3/Response;)Z", "(Lokhttp3/Request;)Z", "isClosed", "()Z", "<init>", "(Lokhttp3/OkHttpClient;Lokhttp3/internal/connection/RealConnection;Lokio/BufferedSource;Lokio/m;)V", "Companion", "AbstractSource", "ChunkedSink", "ChunkedSource", "FixedLengthSource", "KnownLengthSink", "UnknownLengthSource", "okhttp"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nHttp1ExchangeCodec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http1ExchangeCodec.kt\nokhttp3/internal/http1/Http1ExchangeCodec\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,505:1\n1#2:506\n*E\n"})
/* loaded from: classes4.dex */
public final class Http1ExchangeCodec implements ExchangeCodec {

    @l
    public static final Companion Companion = new Companion(null);
    private static final long NO_CHUNK_YET = -1;
    private static final int STATE_CLOSED = 6;
    private static final int STATE_IDLE = 0;
    private static final int STATE_OPEN_REQUEST_BODY = 1;
    private static final int STATE_OPEN_RESPONSE_BODY = 4;
    private static final int STATE_READING_RESPONSE_BODY = 5;
    private static final int STATE_READ_RESPONSE_HEADERS = 3;
    private static final int STATE_WRITING_REQUEST_BODY = 2;

    @m
    private final OkHttpClient client;

    @l
    private final RealConnection connection;

    @l
    private final HeadersReader headersReader;

    @l
    private final okio.m sink;

    @l
    private final BufferedSource source;
    private int state;

    @m
    private okhttp3.Headers trailers;

    /* JADX INFO: Access modifiers changed from: private */
    @i0(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b¢\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0006\u0010\n\u001a\u00020\tR\u001a\u0010\u0003\u001a\u00020\u000b8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0010\u001a\u00020\u000f8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;", "Lokio/n1;", "Lokio/p1;", a.Z, "Lokio/l;", "sink", "", "byteCount", "read", "Lkotlin/r2;", "responseBodyComplete", "Lokio/y;", "Lokio/y;", "getTimeout", "()Lokio/y;", "", "closed", "Z", "getClosed", "()Z", "setClosed", "(Z)V", "<init>", "(Lokhttp3/internal/http1/Http1ExchangeCodec;)V", "okhttp"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public abstract class AbstractSource implements n1 {
        private boolean closed;

        @l
        private final y timeout;

        public AbstractSource() {
            this.timeout = new y(Http1ExchangeCodec.this.source.timeout());
        }

        protected final boolean getClosed() {
            return this.closed;
        }

        @l
        protected final y getTimeout() {
            return this.timeout;
        }

        @Override // okio.n1
        public long read(@l okio.l sink, long j5) {
            l0.p(sink, "sink");
            try {
                return Http1ExchangeCodec.this.source.read(sink, j5);
            } catch (IOException e5) {
                Http1ExchangeCodec.this.getConnection().noNewExchanges$okhttp();
                responseBodyComplete();
                throw e5;
            }
        }

        public final void responseBodyComplete() {
            if (Http1ExchangeCodec.this.state == 6) {
                return;
            }
            if (Http1ExchangeCodec.this.state == 5) {
                Http1ExchangeCodec.this.detachTimeout(this.timeout);
                Http1ExchangeCodec.this.state = 6;
            } else {
                throw new IllegalStateException("state: " + Http1ExchangeCodec.this.state);
            }
        }

        protected final void setClosed(boolean z4) {
            this.closed = z4;
        }

        @Override // okio.n1
        @l
        public p1 timeout() {
            return this.timeout;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @i0(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016R\u0014\u0010\u0003\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSink;", "Lokio/l1;", "Lokio/p1;", a.Z, "Lokio/l;", "source", "", "byteCount", "Lkotlin/r2;", "write", "flush", ILivePush.ClickType.CLOSE, "Lokio/y;", "Lokio/y;", "", "closed", "Z", "<init>", "(Lokhttp3/internal/http1/Http1ExchangeCodec;)V", "okhttp"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nHttp1ExchangeCodec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http1ExchangeCodec.kt\nokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSink\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,505:1\n1#2:506\n*E\n"})
    /* loaded from: classes4.dex */
    public final class ChunkedSink implements l1 {
        private boolean closed;

        @l
        private final y timeout;

        public ChunkedSink() {
            this.timeout = new y(Http1ExchangeCodec.this.sink.timeout());
        }

        @Override // okio.l1, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            Http1ExchangeCodec.this.sink.C("0\r\n\r\n");
            Http1ExchangeCodec.this.detachTimeout(this.timeout);
            Http1ExchangeCodec.this.state = 3;
        }

        @Override // okio.l1, java.io.Flushable
        public synchronized void flush() {
            if (this.closed) {
                return;
            }
            Http1ExchangeCodec.this.sink.flush();
        }

        @Override // okio.l1
        @l
        public p1 timeout() {
            return this.timeout;
        }

        @Override // okio.l1
        public void write(@l okio.l source, long j5) {
            l0.p(source, "source");
            if (!this.closed) {
                if (j5 == 0) {
                    return;
                }
                Http1ExchangeCodec.this.sink.l0(j5);
                Http1ExchangeCodec.this.sink.C("\r\n");
                Http1ExchangeCodec.this.sink.write(source, j5);
                Http1ExchangeCodec.this.sink.C("\r\n");
                return;
            }
            throw new IllegalStateException("closed".toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @i0(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec;", "Lkotlin/r2;", "readChunkSize", "Lokio/l;", "sink", "", "byteCount", "read", ILivePush.ClickType.CLOSE, "Lokhttp3/HttpUrl;", "url", "Lokhttp3/HttpUrl;", "bytesRemainingInChunk", "J", "", "hasMoreChunks", "Z", "<init>", "(Lokhttp3/internal/http1/Http1ExchangeCodec;Lokhttp3/HttpUrl;)V", "okhttp"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nHttp1ExchangeCodec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http1ExchangeCodec.kt\nokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,505:1\n1#2:506\n*E\n"})
    /* loaded from: classes4.dex */
    public final class ChunkedSource extends AbstractSource {
        private long bytesRemainingInChunk;
        private boolean hasMoreChunks;
        final /* synthetic */ Http1ExchangeCodec this$0;

        @l
        private final HttpUrl url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChunkedSource(@l Http1ExchangeCodec http1ExchangeCodec, HttpUrl url) {
            super();
            l0.p(url, "url");
            this.this$0 = http1ExchangeCodec;
            this.url = url;
            this.bytesRemainingInChunk = -1L;
            this.hasMoreChunks = true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x004b, code lost:
        
            if (r1 != false) goto L14;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final void readChunkSize() {
            /*
                r7 = this;
                long r0 = r7.bytesRemainingInChunk
                r2 = -1
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 == 0) goto L11
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r7.this$0
                okio.BufferedSource r0 = okhttp3.internal.http1.Http1ExchangeCodec.access$getSource$p(r0)
                r0.K()
            L11:
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r7.this$0     // Catch: java.lang.NumberFormatException -> La2
                okio.BufferedSource r0 = okhttp3.internal.http1.Http1ExchangeCodec.access$getSource$p(r0)     // Catch: java.lang.NumberFormatException -> La2
                long r0 = r0.y0()     // Catch: java.lang.NumberFormatException -> La2
                r7.bytesRemainingInChunk = r0     // Catch: java.lang.NumberFormatException -> La2
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r7.this$0     // Catch: java.lang.NumberFormatException -> La2
                okio.BufferedSource r0 = okhttp3.internal.http1.Http1ExchangeCodec.access$getSource$p(r0)     // Catch: java.lang.NumberFormatException -> La2
                java.lang.String r0 = r0.K()     // Catch: java.lang.NumberFormatException -> La2
                java.lang.CharSequence r0 = kotlin.text.v.C5(r0)     // Catch: java.lang.NumberFormatException -> La2
                java.lang.String r0 = r0.toString()     // Catch: java.lang.NumberFormatException -> La2
                long r1 = r7.bytesRemainingInChunk     // Catch: java.lang.NumberFormatException -> La2
                r3 = 0
                int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r1 < 0) goto L81
                int r1 = r0.length()     // Catch: java.lang.NumberFormatException -> La2
                r2 = 0
                if (r1 <= 0) goto L40
                r1 = 1
                goto L41
            L40:
                r1 = r2
            L41:
                if (r1 == 0) goto L4d
                java.lang.String r1 = ";"
                r5 = 2
                r6 = 0
                boolean r1 = kotlin.text.v.s2(r0, r1, r2, r5, r6)     // Catch: java.lang.NumberFormatException -> La2
                if (r1 == 0) goto L81
            L4d:
                long r0 = r7.bytesRemainingInChunk
                int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r0 != 0) goto L80
                r7.hasMoreChunks = r2
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r7.this$0
                okhttp3.internal.http1.HeadersReader r1 = okhttp3.internal.http1.Http1ExchangeCodec.access$getHeadersReader$p(r0)
                okhttp3.Headers r1 = r1.readHeaders()
                okhttp3.internal.http1.Http1ExchangeCodec.access$setTrailers$p(r0, r1)
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r7.this$0
                okhttp3.OkHttpClient r0 = okhttp3.internal.http1.Http1ExchangeCodec.access$getClient$p(r0)
                kotlin.jvm.internal.l0.m(r0)
                okhttp3.CookieJar r0 = r0.cookieJar()
                okhttp3.HttpUrl r1 = r7.url
                okhttp3.internal.http1.Http1ExchangeCodec r2 = r7.this$0
                okhttp3.Headers r2 = okhttp3.internal.http1.Http1ExchangeCodec.access$getTrailers$p(r2)
                kotlin.jvm.internal.l0.m(r2)
                okhttp3.internal.http.HttpHeaders.receiveHeaders(r0, r1, r2)
                r7.responseBodyComplete()
            L80:
                return
            L81:
                java.net.ProtocolException r1 = new java.net.ProtocolException     // Catch: java.lang.NumberFormatException -> La2
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> La2
                r2.<init>()     // Catch: java.lang.NumberFormatException -> La2
                java.lang.String r3 = "expected chunk size and optional extensions but was \""
                r2.append(r3)     // Catch: java.lang.NumberFormatException -> La2
                long r3 = r7.bytesRemainingInChunk     // Catch: java.lang.NumberFormatException -> La2
                r2.append(r3)     // Catch: java.lang.NumberFormatException -> La2
                r2.append(r0)     // Catch: java.lang.NumberFormatException -> La2
                r0 = 34
                r2.append(r0)     // Catch: java.lang.NumberFormatException -> La2
                java.lang.String r0 = r2.toString()     // Catch: java.lang.NumberFormatException -> La2
                r1.<init>(r0)     // Catch: java.lang.NumberFormatException -> La2
                throw r1     // Catch: java.lang.NumberFormatException -> La2
            La2:
                r0 = move-exception
                java.net.ProtocolException r1 = new java.net.ProtocolException
                java.lang.String r0 = r0.getMessage()
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http1.Http1ExchangeCodec.ChunkedSource.readChunkSize():void");
        }

        @Override // okio.n1, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (getClosed()) {
                return;
            }
            if (this.hasMoreChunks && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                this.this$0.getConnection().noNewExchanges$okhttp();
                responseBodyComplete();
            }
            setClosed(true);
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, okio.n1
        public long read(@l okio.l sink, long j5) {
            boolean z4;
            l0.p(sink, "sink");
            if (j5 >= 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                if (!getClosed()) {
                    if (!this.hasMoreChunks) {
                        return -1L;
                    }
                    long j6 = this.bytesRemainingInChunk;
                    if (j6 == 0 || j6 == -1) {
                        readChunkSize();
                        if (!this.hasMoreChunks) {
                            return -1L;
                        }
                    }
                    long read = super.read(sink, Math.min(j5, this.bytesRemainingInChunk));
                    if (read != -1) {
                        this.bytesRemainingInChunk -= read;
                        return read;
                    }
                    this.this$0.getConnection().noNewExchanges$okhttp();
                    ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                    responseBodyComplete();
                    throw protocolException;
                }
                throw new IllegalStateException("closed".toString());
            }
            throw new IllegalArgumentException(("byteCount < 0: " + j5).toString());
        }
    }

    @i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$Companion;", "", "()V", "NO_CHUNK_YET", "", "STATE_CLOSED", "", "STATE_IDLE", "STATE_OPEN_REQUEST_BODY", "STATE_OPEN_RESPONSE_BODY", "STATE_READING_RESPONSE_BODY", "STATE_READ_RESPONSE_HEADERS", "STATE_WRITING_REQUEST_BODY", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0016\u0010\n\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$FixedLengthSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec;", "Lokio/l;", "sink", "", "byteCount", "read", "Lkotlin/r2;", ILivePush.ClickType.CLOSE, "bytesRemaining", "J", "<init>", "(Lokhttp3/internal/http1/Http1ExchangeCodec;J)V", "okhttp"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nHttp1ExchangeCodec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http1ExchangeCodec.kt\nokhttp3/internal/http1/Http1ExchangeCodec$FixedLengthSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,505:1\n1#2:506\n*E\n"})
    /* loaded from: classes4.dex */
    public final class FixedLengthSource extends AbstractSource {
        private long bytesRemaining;

        public FixedLengthSource(long j5) {
            super();
            this.bytesRemaining = j5;
            if (j5 == 0) {
                responseBodyComplete();
            }
        }

        @Override // okio.n1, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (getClosed()) {
                return;
            }
            if (this.bytesRemaining != 0 && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                Http1ExchangeCodec.this.getConnection().noNewExchanges$okhttp();
                responseBodyComplete();
            }
            setClosed(true);
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, okio.n1
        public long read(@l okio.l sink, long j5) {
            boolean z4;
            l0.p(sink, "sink");
            if (j5 >= 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                if (!getClosed()) {
                    long j6 = this.bytesRemaining;
                    if (j6 == 0) {
                        return -1L;
                    }
                    long read = super.read(sink, Math.min(j6, j5));
                    if (read != -1) {
                        long j7 = this.bytesRemaining - read;
                        this.bytesRemaining = j7;
                        if (j7 == 0) {
                            responseBodyComplete();
                        }
                        return read;
                    }
                    Http1ExchangeCodec.this.getConnection().noNewExchanges$okhttp();
                    ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                    responseBodyComplete();
                    throw protocolException;
                }
                throw new IllegalStateException("closed".toString());
            }
            throw new IllegalArgumentException(("byteCount < 0: " + j5).toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @i0(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016R\u0014\u0010\u0003\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$KnownLengthSink;", "Lokio/l1;", "Lokio/p1;", a.Z, "Lokio/l;", "source", "", "byteCount", "Lkotlin/r2;", "write", "flush", ILivePush.ClickType.CLOSE, "Lokio/y;", "Lokio/y;", "", "closed", "Z", "<init>", "(Lokhttp3/internal/http1/Http1ExchangeCodec;)V", "okhttp"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nHttp1ExchangeCodec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http1ExchangeCodec.kt\nokhttp3/internal/http1/Http1ExchangeCodec$KnownLengthSink\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,505:1\n1#2:506\n*E\n"})
    /* loaded from: classes4.dex */
    public final class KnownLengthSink implements l1 {
        private boolean closed;

        @l
        private final y timeout;

        public KnownLengthSink() {
            this.timeout = new y(Http1ExchangeCodec.this.sink.timeout());
        }

        @Override // okio.l1, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            Http1ExchangeCodec.this.detachTimeout(this.timeout);
            Http1ExchangeCodec.this.state = 3;
        }

        @Override // okio.l1, java.io.Flushable
        public void flush() {
            if (this.closed) {
                return;
            }
            Http1ExchangeCodec.this.sink.flush();
        }

        @Override // okio.l1
        @l
        public p1 timeout() {
            return this.timeout;
        }

        @Override // okio.l1
        public void write(@l okio.l source, long j5) {
            l0.p(source, "source");
            if (!this.closed) {
                Util.checkOffsetAndCount(source.M0(), 0L, j5);
                Http1ExchangeCodec.this.sink.write(source, j5);
                return;
            }
            throw new IllegalStateException("closed".toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$UnknownLengthSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec;", "Lokio/l;", "sink", "", "byteCount", "read", "Lkotlin/r2;", ILivePush.ClickType.CLOSE, "", "inputExhausted", "Z", "<init>", "(Lokhttp3/internal/http1/Http1ExchangeCodec;)V", "okhttp"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nHttp1ExchangeCodec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http1ExchangeCodec.kt\nokhttp3/internal/http1/Http1ExchangeCodec$UnknownLengthSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,505:1\n1#2:506\n*E\n"})
    /* loaded from: classes4.dex */
    public final class UnknownLengthSource extends AbstractSource {
        private boolean inputExhausted;

        public UnknownLengthSource() {
            super();
        }

        @Override // okio.n1, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (getClosed()) {
                return;
            }
            if (!this.inputExhausted) {
                responseBodyComplete();
            }
            setClosed(true);
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, okio.n1
        public long read(@l okio.l sink, long j5) {
            boolean z4;
            l0.p(sink, "sink");
            if (j5 >= 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                if (!getClosed()) {
                    if (this.inputExhausted) {
                        return -1L;
                    }
                    long read = super.read(sink, j5);
                    if (read == -1) {
                        this.inputExhausted = true;
                        responseBodyComplete();
                        return -1L;
                    }
                    return read;
                }
                throw new IllegalStateException("closed".toString());
            }
            throw new IllegalArgumentException(("byteCount < 0: " + j5).toString());
        }
    }

    public Http1ExchangeCodec(@m OkHttpClient okHttpClient, @l RealConnection connection, @l BufferedSource source, @l okio.m sink) {
        l0.p(connection, "connection");
        l0.p(source, "source");
        l0.p(sink, "sink");
        this.client = okHttpClient;
        this.connection = connection;
        this.source = source;
        this.sink = sink;
        this.headersReader = new HeadersReader(source);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void detachTimeout(y yVar) {
        p1 a5 = yVar.a();
        yVar.b(p1.NONE);
        a5.clearDeadline();
        a5.clearTimeout();
    }

    private final boolean isChunked(Response response) {
        boolean K1;
        K1 = e0.K1(HTTP.CHUNK_CODING, Response.header$default(response, HTTP.TRANSFER_ENCODING, null, 2, null), true);
        return K1;
    }

    private final l1 newChunkedSink() {
        boolean z4 = true;
        if (this.state != 1) {
            z4 = false;
        }
        if (z4) {
            this.state = 2;
            return new ChunkedSink();
        }
        throw new IllegalStateException(("state: " + this.state).toString());
    }

    private final n1 newChunkedSource(HttpUrl httpUrl) {
        boolean z4;
        if (this.state == 4) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            this.state = 5;
            return new ChunkedSource(this, httpUrl);
        }
        throw new IllegalStateException(("state: " + this.state).toString());
    }

    private final n1 newFixedLengthSource(long j5) {
        boolean z4;
        if (this.state == 4) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            this.state = 5;
            return new FixedLengthSource(j5);
        }
        throw new IllegalStateException(("state: " + this.state).toString());
    }

    private final l1 newKnownLengthSink() {
        boolean z4 = true;
        if (this.state != 1) {
            z4 = false;
        }
        if (z4) {
            this.state = 2;
            return new KnownLengthSink();
        }
        throw new IllegalStateException(("state: " + this.state).toString());
    }

    private final n1 newUnknownLengthSource() {
        boolean z4;
        if (this.state == 4) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            this.state = 5;
            getConnection().noNewExchanges$okhttp();
            return new UnknownLengthSource();
        }
        throw new IllegalStateException(("state: " + this.state).toString());
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void cancel() {
        getConnection().cancel();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    @l
    public l1 createRequestBody(@l Request request, long j5) {
        l0.p(request, "request");
        if (request.body() != null && request.body().isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if (isChunked(request)) {
            return newChunkedSink();
        }
        if (j5 != -1) {
            return newKnownLengthSink();
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void finishRequest() {
        this.sink.flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void flushRequest() {
        this.sink.flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    @l
    public RealConnection getConnection() {
        return this.connection;
    }

    public final boolean isClosed() {
        return this.state == 6;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    @l
    public n1 openResponseBodySource(@l Response response) {
        l0.p(response, "response");
        if (!HttpHeaders.promisesBody(response)) {
            return newFixedLengthSource(0L);
        }
        if (isChunked(response)) {
            return newChunkedSource(response.request().url());
        }
        long headersContentLength = Util.headersContentLength(response);
        if (headersContentLength != -1) {
            return newFixedLengthSource(headersContentLength);
        }
        return newUnknownLengthSource();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    @m
    public Response.Builder readResponseHeaders(boolean z4) {
        boolean z5;
        int i5 = this.state;
        boolean z6 = false;
        if (i5 != 1 && i5 != 2 && i5 != 3) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (z5) {
            try {
                StatusLine parse = StatusLine.Companion.parse(this.headersReader.readLine());
                Response.Builder headers = new Response.Builder().protocol(parse.protocol).code(parse.code).message(parse.message).headers(this.headersReader.readHeaders());
                if (z4 && parse.code == 100) {
                    return null;
                }
                int i6 = parse.code;
                if (i6 == 100) {
                    this.state = 3;
                    return headers;
                }
                if (102 <= i6 && i6 < 200) {
                    z6 = true;
                }
                if (z6) {
                    this.state = 3;
                    return headers;
                }
                this.state = 4;
                return headers;
            } catch (EOFException e5) {
                throw new IOException("unexpected end of stream on " + getConnection().route().address().url().redact(), e5);
            }
        }
        throw new IllegalStateException(("state: " + this.state).toString());
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public long reportedContentLength(@l Response response) {
        l0.p(response, "response");
        if (!HttpHeaders.promisesBody(response)) {
            return 0L;
        }
        if (isChunked(response)) {
            return -1L;
        }
        return Util.headersContentLength(response);
    }

    public final void skipConnectBody(@l Response response) {
        l0.p(response, "response");
        long headersContentLength = Util.headersContentLength(response);
        if (headersContentLength == -1) {
            return;
        }
        n1 newFixedLengthSource = newFixedLengthSource(headersContentLength);
        Util.skipAll(newFixedLengthSource, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
        newFixedLengthSource.close();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    @l
    public okhttp3.Headers trailers() {
        boolean z4;
        if (this.state == 6) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            okhttp3.Headers headers = this.trailers;
            if (headers == null) {
                return Util.EMPTY_HEADERS;
            }
            return headers;
        }
        throw new IllegalStateException("too early; can't read the trailers yet".toString());
    }

    public final void writeRequest(@l okhttp3.Headers headers, @l String requestLine) {
        boolean z4;
        l0.p(headers, "headers");
        l0.p(requestLine, "requestLine");
        if (this.state == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            this.sink.C(requestLine).C("\r\n");
            int size = headers.size();
            for (int i5 = 0; i5 < size; i5++) {
                this.sink.C(headers.name(i5)).C(": ").C(headers.value(i5)).C("\r\n");
            }
            this.sink.C("\r\n");
            this.state = 1;
            return;
        }
        throw new IllegalStateException(("state: " + this.state).toString());
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void writeRequestHeaders(@l Request request) {
        l0.p(request, "request");
        RequestLine requestLine = RequestLine.INSTANCE;
        Proxy.Type type = getConnection().route().proxy().type();
        l0.o(type, "connection.route().proxy.type()");
        writeRequest(request.headers(), requestLine.get(request, type));
    }

    private final boolean isChunked(Request request) {
        boolean K1;
        K1 = e0.K1(HTTP.CHUNK_CODING, request.header(HTTP.TRANSFER_ENCODING), true);
        return K1;
    }
}
