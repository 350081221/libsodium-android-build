package okhttp3.internal.connection;

import android.net.http.Headers;
import androidx.core.app.NotificationCompat;
import com.bytedance.android.live.base.api.push.ILivePush;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketException;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import okhttp3.EventListener;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealResponseBody;
import okhttp3.internal.ws.RealWebSocket;
import okio.l1;
import okio.n1;
import okio.w;
import okio.x;
import okio.y0;
import org.apache.http.protocol.HTTP;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0002JKB'\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u00103\u001a\u000202\u0012\u0006\u00108\u001a\u000207¢\u0006\u0004\bH\u0010IJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0016\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\r\u001a\u00020\u0004J\u0006\u0010\u000e\u001a\u00020\u0004J\u0006\u0010\u000f\u001a\u00020\u0004J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\tJ\u000e\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013J\u000e\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u0013J\u0006\u0010\u0019\u001a\u00020\u0018J\u0006\u0010\u001b\u001a\u00020\u001aJ\u0006\u0010\u001c\u001a\u00020\u0004J\u0006\u0010\u001d\u001a\u00020\u0004J\u0006\u0010\u001e\u001a\u00020\u0004J\u0006\u0010\u001f\u001a\u00020\u0004J9\u0010%\u001a\u00028\u0000\"\n\b\u0000\u0010 *\u0004\u0018\u00010\u00022\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\t2\u0006\u0010$\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b%\u0010&J\u0006\u0010'\u001a\u00020\u0004R\u001a\u0010)\u001a\u00020(8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010.\u001a\u00020-8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001a\u00103\u001a\u0002028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R$\u0010;\u001a\u00020\t2\u0006\u0010:\u001a\u00020\t8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R$\u0010?\u001a\u00020\t2\u0006\u0010:\u001a\u00020\t8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b?\u0010<\u001a\u0004\b@\u0010>R\u001a\u0010B\u001a\u00020A8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0014\u0010G\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bF\u0010>¨\u0006L"}, d2 = {"Lokhttp3/internal/connection/Exchange;", "", "Ljava/io/IOException;", "e", "Lkotlin/r2;", "trackFailure", "Lokhttp3/Request;", "request", "writeRequestHeaders", "", "duplex", "Lokio/l1;", "createRequestBody", "flushRequest", "finishRequest", "responseHeadersStart", "expectContinue", "Lokhttp3/Response$Builder;", "readResponseHeaders", "Lokhttp3/Response;", "response", "responseHeadersEnd", "Lokhttp3/ResponseBody;", "openResponseBody", "Lokhttp3/Headers;", "trailers", "Lokhttp3/internal/ws/RealWebSocket$Streams;", "newWebSocketStreams", "webSocketUpgradeFailed", "noNewExchangesOnConnection", "cancel", "detachWithViolence", "E", "", "bytesRead", "responseDone", "requestDone", "bodyComplete", "(JZZLjava/io/IOException;)Ljava/io/IOException;", "noRequestBody", "Lokhttp3/internal/connection/RealCall;", NotificationCompat.CATEGORY_CALL, "Lokhttp3/internal/connection/RealCall;", "getCall$okhttp", "()Lokhttp3/internal/connection/RealCall;", "Lokhttp3/EventListener;", "eventListener", "Lokhttp3/EventListener;", "getEventListener$okhttp", "()Lokhttp3/EventListener;", "Lokhttp3/internal/connection/ExchangeFinder;", "finder", "Lokhttp3/internal/connection/ExchangeFinder;", "getFinder$okhttp", "()Lokhttp3/internal/connection/ExchangeFinder;", "Lokhttp3/internal/http/ExchangeCodec;", "codec", "Lokhttp3/internal/http/ExchangeCodec;", "<set-?>", "isDuplex", "Z", "isDuplex$okhttp", "()Z", "hasFailure", "getHasFailure$okhttp", "Lokhttp3/internal/connection/RealConnection;", Headers.CONN_DIRECTIVE, "Lokhttp3/internal/connection/RealConnection;", "getConnection$okhttp", "()Lokhttp3/internal/connection/RealConnection;", "isCoalescedConnection$okhttp", "isCoalescedConnection", "<init>", "(Lokhttp3/internal/connection/RealCall;Lokhttp3/EventListener;Lokhttp3/internal/connection/ExchangeFinder;Lokhttp3/internal/http/ExchangeCodec;)V", "RequestBodySink", "ResponseBodySource", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class Exchange {

    @l
    private final RealCall call;

    @l
    private final ExchangeCodec codec;

    @l
    private final RealConnection connection;

    @l
    private final EventListener eventListener;

    @l
    private final ExchangeFinder finder;
    private boolean hasFailure;
    private boolean isDuplex;

    @i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u0005\u001a\u00028\u0000\"\n\b\u0000\u0010\u0003*\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0016R\u0014\u0010\u000f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013¨\u0006\u001a"}, d2 = {"Lokhttp3/internal/connection/Exchange$RequestBodySink;", "Lokio/w;", "Ljava/io/IOException;", "E", "e", "complete", "(Ljava/io/IOException;)Ljava/io/IOException;", "Lokio/l;", "source", "", "byteCount", "Lkotlin/r2;", "write", "flush", ILivePush.ClickType.CLOSE, "contentLength", "J", "", "completed", "Z", "bytesReceived", "closed", "Lokio/l1;", "delegate", "<init>", "(Lokhttp3/internal/connection/Exchange;Lokio/l1;J)V", "okhttp"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nExchange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Exchange.kt\nokhttp3/internal/connection/Exchange$RequestBodySink\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,333:1\n1#2:334\n*E\n"})
    /* loaded from: classes4.dex */
    private final class RequestBodySink extends w {
        private long bytesReceived;
        private boolean closed;
        private boolean completed;
        private final long contentLength;
        final /* synthetic */ Exchange this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RequestBodySink(@l Exchange exchange, l1 delegate, long j5) {
            super(delegate);
            l0.p(delegate, "delegate");
            this.this$0 = exchange;
            this.contentLength = j5;
        }

        private final <E extends IOException> E complete(E e5) {
            if (this.completed) {
                return e5;
            }
            this.completed = true;
            return (E) this.this$0.bodyComplete(this.bytesReceived, false, true, e5);
        }

        @Override // okio.w, okio.l1, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.closed) {
                return;
            }
            this.closed = true;
            long j5 = this.contentLength;
            if (j5 != -1 && this.bytesReceived != j5) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                complete(null);
            } catch (IOException e5) {
                throw complete(e5);
            }
        }

        @Override // okio.w, okio.l1, java.io.Flushable
        public void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e5) {
                throw complete(e5);
            }
        }

        @Override // okio.w, okio.l1
        public void write(@l okio.l source, long j5) throws IOException {
            l0.p(source, "source");
            if (!this.closed) {
                long j6 = this.contentLength;
                if (j6 != -1 && this.bytesReceived + j5 > j6) {
                    throw new ProtocolException("expected " + this.contentLength + " bytes but received " + (this.bytesReceived + j5));
                }
                try {
                    super.write(source, j5);
                    this.bytesReceived += j5;
                    return;
                } catch (IOException e5) {
                    throw complete(e5);
                }
            }
            throw new IllegalStateException("closed".toString());
        }
    }

    @i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J!\u0010\f\u001a\u00028\u0000\"\n\b\u0000\u0010\n*\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013¨\u0006\u001a"}, d2 = {"Lokhttp3/internal/connection/Exchange$ResponseBodySource;", "Lokio/x;", "Lokio/l;", "sink", "", "byteCount", "read", "Lkotlin/r2;", ILivePush.ClickType.CLOSE, "Ljava/io/IOException;", "E", "e", "complete", "(Ljava/io/IOException;)Ljava/io/IOException;", "contentLength", "J", "bytesReceived", "", "invokeStartEvent", "Z", "completed", "closed", "Lokio/n1;", "delegate", "<init>", "(Lokhttp3/internal/connection/Exchange;Lokio/n1;J)V", "okhttp"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nExchange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Exchange.kt\nokhttp3/internal/connection/Exchange$ResponseBodySource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,333:1\n1#2:334\n*E\n"})
    /* loaded from: classes4.dex */
    public final class ResponseBodySource extends x {
        private long bytesReceived;
        private boolean closed;
        private boolean completed;
        private final long contentLength;
        private boolean invokeStartEvent;
        final /* synthetic */ Exchange this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResponseBodySource(@l Exchange exchange, n1 delegate, long j5) {
            super(delegate);
            l0.p(delegate, "delegate");
            this.this$0 = exchange;
            this.contentLength = j5;
            this.invokeStartEvent = true;
            if (j5 == 0) {
                complete(null);
            }
        }

        @Override // okio.x, okio.n1, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.closed) {
                return;
            }
            this.closed = true;
            try {
                super.close();
                complete(null);
            } catch (IOException e5) {
                throw complete(e5);
            }
        }

        public final <E extends IOException> E complete(E e5) {
            if (this.completed) {
                return e5;
            }
            this.completed = true;
            if (e5 == null && this.invokeStartEvent) {
                this.invokeStartEvent = false;
                this.this$0.getEventListener$okhttp().responseBodyStart(this.this$0.getCall$okhttp());
            }
            return (E) this.this$0.bodyComplete(this.bytesReceived, true, false, e5);
        }

        @Override // okio.x, okio.n1
        public long read(@l okio.l sink, long j5) throws IOException {
            l0.p(sink, "sink");
            if (!this.closed) {
                try {
                    long read = delegate().read(sink, j5);
                    if (this.invokeStartEvent) {
                        this.invokeStartEvent = false;
                        this.this$0.getEventListener$okhttp().responseBodyStart(this.this$0.getCall$okhttp());
                    }
                    if (read == -1) {
                        complete(null);
                        return -1L;
                    }
                    long j6 = this.bytesReceived + read;
                    long j7 = this.contentLength;
                    if (j7 != -1 && j6 > j7) {
                        throw new ProtocolException("expected " + this.contentLength + " bytes but received " + j6);
                    }
                    this.bytesReceived = j6;
                    if (j6 == j7) {
                        complete(null);
                    }
                    return read;
                } catch (IOException e5) {
                    throw complete(e5);
                }
            }
            throw new IllegalStateException("closed".toString());
        }
    }

    public Exchange(@l RealCall call, @l EventListener eventListener, @l ExchangeFinder finder, @l ExchangeCodec codec) {
        l0.p(call, "call");
        l0.p(eventListener, "eventListener");
        l0.p(finder, "finder");
        l0.p(codec, "codec");
        this.call = call;
        this.eventListener = eventListener;
        this.finder = finder;
        this.codec = codec;
        this.connection = codec.getConnection();
    }

    private final void trackFailure(IOException iOException) {
        this.hasFailure = true;
        this.finder.trackFailure(iOException);
        this.codec.getConnection().trackFailure$okhttp(this.call, iOException);
    }

    public final <E extends IOException> E bodyComplete(long j5, boolean z4, boolean z5, E e5) {
        if (e5 != null) {
            trackFailure(e5);
        }
        if (z5) {
            if (e5 != null) {
                this.eventListener.requestFailed(this.call, e5);
            } else {
                this.eventListener.requestBodyEnd(this.call, j5);
            }
        }
        if (z4) {
            if (e5 != null) {
                this.eventListener.responseFailed(this.call, e5);
            } else {
                this.eventListener.responseBodyEnd(this.call, j5);
            }
        }
        return (E) this.call.messageDone$okhttp(this, z5, z4, e5);
    }

    public final void cancel() {
        this.codec.cancel();
    }

    @l
    public final l1 createRequestBody(@l Request request, boolean z4) throws IOException {
        l0.p(request, "request");
        this.isDuplex = z4;
        RequestBody body = request.body();
        l0.m(body);
        long contentLength = body.contentLength();
        this.eventListener.requestBodyStart(this.call);
        return new RequestBodySink(this, this.codec.createRequestBody(request, contentLength), contentLength);
    }

    public final void detachWithViolence() {
        this.codec.cancel();
        this.call.messageDone$okhttp(this, true, true, null);
    }

    public final void finishRequest() throws IOException {
        try {
            this.codec.finishRequest();
        } catch (IOException e5) {
            this.eventListener.requestFailed(this.call, e5);
            trackFailure(e5);
            throw e5;
        }
    }

    public final void flushRequest() throws IOException {
        try {
            this.codec.flushRequest();
        } catch (IOException e5) {
            this.eventListener.requestFailed(this.call, e5);
            trackFailure(e5);
            throw e5;
        }
    }

    @l
    public final RealCall getCall$okhttp() {
        return this.call;
    }

    @l
    public final RealConnection getConnection$okhttp() {
        return this.connection;
    }

    @l
    public final EventListener getEventListener$okhttp() {
        return this.eventListener;
    }

    @l
    public final ExchangeFinder getFinder$okhttp() {
        return this.finder;
    }

    public final boolean getHasFailure$okhttp() {
        return this.hasFailure;
    }

    public final boolean isCoalescedConnection$okhttp() {
        return !l0.g(this.finder.getAddress$okhttp().url().host(), this.connection.route().address().url().host());
    }

    public final boolean isDuplex$okhttp() {
        return this.isDuplex;
    }

    @l
    public final RealWebSocket.Streams newWebSocketStreams() throws SocketException {
        this.call.timeoutEarlyExit();
        return this.codec.getConnection().newWebSocketStreams$okhttp(this);
    }

    public final void noNewExchangesOnConnection() {
        this.codec.getConnection().noNewExchanges$okhttp();
    }

    public final void noRequestBody() {
        this.call.messageDone$okhttp(this, true, false, null);
    }

    @l
    public final ResponseBody openResponseBody(@l Response response) throws IOException {
        l0.p(response, "response");
        try {
            String header$default = Response.header$default(response, HTTP.CONTENT_TYPE, null, 2, null);
            long reportedContentLength = this.codec.reportedContentLength(response);
            return new RealResponseBody(header$default, reportedContentLength, y0.e(new ResponseBodySource(this, this.codec.openResponseBodySource(response), reportedContentLength)));
        } catch (IOException e5) {
            this.eventListener.responseFailed(this.call, e5);
            trackFailure(e5);
            throw e5;
        }
    }

    @m
    public final Response.Builder readResponseHeaders(boolean z4) throws IOException {
        try {
            Response.Builder readResponseHeaders = this.codec.readResponseHeaders(z4);
            if (readResponseHeaders != null) {
                readResponseHeaders.initExchange$okhttp(this);
            }
            return readResponseHeaders;
        } catch (IOException e5) {
            this.eventListener.responseFailed(this.call, e5);
            trackFailure(e5);
            throw e5;
        }
    }

    public final void responseHeadersEnd(@l Response response) {
        l0.p(response, "response");
        this.eventListener.responseHeadersEnd(this.call, response);
    }

    public final void responseHeadersStart() {
        this.eventListener.responseHeadersStart(this.call);
    }

    @l
    public final okhttp3.Headers trailers() throws IOException {
        return this.codec.trailers();
    }

    public final void webSocketUpgradeFailed() {
        bodyComplete(-1L, true, true, null);
    }

    public final void writeRequestHeaders(@l Request request) throws IOException {
        l0.p(request, "request");
        try {
            this.eventListener.requestHeadersStart(this.call);
            this.codec.writeRequestHeaders(request);
            this.eventListener.requestHeadersEnd(this.call, request);
        } catch (IOException e5) {
            this.eventListener.requestFailed(this.call, e5);
            trackFailure(e5);
            throw e5;
        }
    }
}
