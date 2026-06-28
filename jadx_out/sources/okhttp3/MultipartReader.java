package okhttp3;

import android.support.v4.media.session.PlaybackStateCompat;
import com.bytedance.android.live.base.api.push.ILivePush;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import okhttp3.internal.http1.HeadersReader;
import okio.BufferedSource;
import okio.b1;
import okio.n;
import okio.n1;
import okio.p1;
import okio.y0;
import p4.l;
import p4.m;
import u3.h;

@i0(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 #2\u00020\u0001:\u0003#$%B\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u001e\u0010\u001fB\u0011\b\u0016\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\u001e\u0010\"J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001c\u001a\b\u0018\u00010\u001bR\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006&"}, d2 = {"Lokhttp3/MultipartReader;", "Ljava/io/Closeable;", "", "maxResult", "currentPartBytesRemaining", "Lokhttp3/MultipartReader$Part;", "nextPart", "Lkotlin/r2;", ILivePush.ClickType.CLOSE, "Lokio/BufferedSource;", "source", "Lokio/BufferedSource;", "", "boundary", "Ljava/lang/String;", "()Ljava/lang/String;", "Lokio/n;", "dashDashBoundary", "Lokio/n;", "crlfDashDashBoundary", "", "partCount", "I", "", "closed", "Z", "noMoreParts", "Lokhttp3/MultipartReader$PartSource;", "currentPart", "Lokhttp3/MultipartReader$PartSource;", "<init>", "(Lokio/BufferedSource;Ljava/lang/String;)V", "Lokhttp3/ResponseBody;", "response", "(Lokhttp3/ResponseBody;)V", "Companion", "Part", "PartSource", "okhttp"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nMultipartReader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultipartReader.kt\nokhttp3/MultipartReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,210:1\n1#2:211\n*E\n"})
/* loaded from: classes4.dex */
public final class MultipartReader implements Closeable {

    @l
    public static final Companion Companion = new Companion(null);

    @l
    private static final b1 afterBoundaryOptions;

    @l
    private final String boundary;
    private boolean closed;

    @l
    private final n crlfDashDashBoundary;

    @m
    private PartSource currentPart;

    @l
    private final n dashDashBoundary;
    private boolean noMoreParts;
    private int partCount;

    @l
    private final BufferedSource source;

    @i0(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lokhttp3/MultipartReader$Companion;", "", "Lokio/b1;", "afterBoundaryOptions", "Lokio/b1;", "getAfterBoundaryOptions", "()Lokio/b1;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @l
        public final b1 getAfterBoundaryOptions() {
            return MultipartReader.afterBoundaryOptions;
        }
    }

    @i0(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0001R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007R\u0017\u0010\t\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b¨\u0006\u000e"}, d2 = {"Lokhttp3/MultipartReader$Part;", "Ljava/io/Closeable;", "Lkotlin/r2;", ILivePush.ClickType.CLOSE, "Lokhttp3/Headers;", TTDownloadField.TT_HEADERS, "Lokhttp3/Headers;", "()Lokhttp3/Headers;", "Lokio/BufferedSource;", "body", "Lokio/BufferedSource;", "()Lokio/BufferedSource;", "<init>", "(Lokhttp3/Headers;Lokio/BufferedSource;)V", "okhttp"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class Part implements Closeable {

        @l
        private final BufferedSource body;

        @l
        private final Headers headers;

        public Part(@l Headers headers, @l BufferedSource body) {
            l0.p(headers, "headers");
            l0.p(body, "body");
            this.headers = headers;
            this.body = body;
        }

        @l
        @h(name = "body")
        public final BufferedSource body() {
            return this.body;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.body.close();
        }

        @l
        @h(name = TTDownloadField.TT_HEADERS)
        public final Headers headers() {
            return this.headers;
        }
    }

    @i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lokhttp3/MultipartReader$PartSource;", "Lokio/n1;", "Lkotlin/r2;", ILivePush.ClickType.CLOSE, "Lokio/l;", "sink", "", "byteCount", "read", "Lokio/p1;", m0.a.Z, "Lokio/p1;", "<init>", "(Lokhttp3/MultipartReader;)V", "okhttp"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nMultipartReader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultipartReader.kt\nokhttp3/MultipartReader$PartSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Timeout.kt\nokio/Timeout\n*L\n1#1,210:1\n1#2:211\n268#3,26:212\n*S KotlinDebug\n*F\n+ 1 MultipartReader.kt\nokhttp3/MultipartReader$PartSource\n*L\n159#1:212,26\n*E\n"})
    /* loaded from: classes4.dex */
    private final class PartSource implements n1 {

        @l
        private final p1 timeout = new p1();

        public PartSource() {
        }

        @Override // okio.n1, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (l0.g(MultipartReader.this.currentPart, this)) {
                MultipartReader.this.currentPart = null;
            }
        }

        @Override // okio.n1
        public long read(@l okio.l sink, long j5) {
            boolean z4;
            long read;
            long read2;
            l0.p(sink, "sink");
            if (j5 >= 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                if (l0.g(MultipartReader.this.currentPart, this)) {
                    p1 timeout = MultipartReader.this.source.timeout();
                    p1 p1Var = this.timeout;
                    MultipartReader multipartReader = MultipartReader.this;
                    long timeoutNanos = timeout.timeoutNanos();
                    long a5 = p1.Companion.a(p1Var.timeoutNanos(), timeout.timeoutNanos());
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    timeout.timeout(a5, timeUnit);
                    if (timeout.hasDeadline()) {
                        long deadlineNanoTime = timeout.deadlineNanoTime();
                        if (p1Var.hasDeadline()) {
                            timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), p1Var.deadlineNanoTime()));
                        }
                        try {
                            long currentPartBytesRemaining = multipartReader.currentPartBytesRemaining(j5);
                            if (currentPartBytesRemaining == 0) {
                                read2 = -1;
                            } else {
                                read2 = multipartReader.source.read(sink, currentPartBytesRemaining);
                            }
                            timeout.timeout(timeoutNanos, timeUnit);
                            if (p1Var.hasDeadline()) {
                                timeout.deadlineNanoTime(deadlineNanoTime);
                            }
                            return read2;
                        } catch (Throwable th) {
                            timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                            if (p1Var.hasDeadline()) {
                                timeout.deadlineNanoTime(deadlineNanoTime);
                            }
                            throw th;
                        }
                    }
                    if (p1Var.hasDeadline()) {
                        timeout.deadlineNanoTime(p1Var.deadlineNanoTime());
                    }
                    try {
                        long currentPartBytesRemaining2 = multipartReader.currentPartBytesRemaining(j5);
                        if (currentPartBytesRemaining2 == 0) {
                            read = -1;
                        } else {
                            read = multipartReader.source.read(sink, currentPartBytesRemaining2);
                        }
                        timeout.timeout(timeoutNanos, timeUnit);
                        if (p1Var.hasDeadline()) {
                            timeout.clearDeadline();
                        }
                        return read;
                    } catch (Throwable th2) {
                        timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                        if (p1Var.hasDeadline()) {
                            timeout.clearDeadline();
                        }
                        throw th2;
                    }
                }
                throw new IllegalStateException("closed".toString());
            }
            throw new IllegalArgumentException(("byteCount < 0: " + j5).toString());
        }

        @Override // okio.n1
        @l
        public p1 timeout() {
            return this.timeout;
        }
    }

    static {
        b1.a aVar = b1.f20864c;
        n.a aVar2 = n.Companion;
        afterBoundaryOptions = aVar.d(aVar2.l("\r\n"), aVar2.l("--"), aVar2.l(" "), aVar2.l("\t"));
    }

    public MultipartReader(@l BufferedSource source, @l String boundary) throws IOException {
        l0.p(source, "source");
        l0.p(boundary, "boundary");
        this.source = source;
        this.boundary = boundary;
        this.dashDashBoundary = new okio.l().C("--").C(boundary).m0();
        this.crlfDashDashBoundary = new okio.l().C("\r\n--").C(boundary).m0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long currentPartBytesRemaining(long j5) {
        this.source.U(this.crlfDashDashBoundary.size());
        long r5 = this.source.g().r(this.crlfDashDashBoundary);
        if (r5 == -1) {
            return Math.min(j5, (this.source.g().M0() - this.crlfDashDashBoundary.size()) + 1);
        }
        return Math.min(j5, r5);
    }

    @l
    @h(name = "boundary")
    public final String boundary() {
        return this.boundary;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.currentPart = null;
        this.source.close();
    }

    @m
    public final Part nextPart() throws IOException {
        if (!this.closed) {
            if (this.noMoreParts) {
                return null;
            }
            if (this.partCount == 0 && this.source.D(0L, this.dashDashBoundary)) {
                this.source.skip(this.dashDashBoundary.size());
            } else {
                while (true) {
                    long currentPartBytesRemaining = currentPartBytesRemaining(PlaybackStateCompat.ACTION_PLAY_FROM_URI);
                    if (currentPartBytesRemaining == 0) {
                        break;
                    }
                    this.source.skip(currentPartBytesRemaining);
                }
                this.source.skip(this.crlfDashDashBoundary.size());
            }
            boolean z4 = false;
            while (true) {
                int B0 = this.source.B0(afterBoundaryOptions);
                if (B0 != -1) {
                    if (B0 != 0) {
                        if (B0 != 1) {
                            if (B0 == 2 || B0 == 3) {
                                z4 = true;
                            }
                        } else {
                            if (!z4) {
                                if (this.partCount != 0) {
                                    this.noMoreParts = true;
                                    return null;
                                }
                                throw new ProtocolException("expected at least 1 part");
                            }
                            throw new ProtocolException("unexpected characters after boundary");
                        }
                    } else {
                        this.partCount++;
                        Headers readHeaders = new HeadersReader(this.source).readHeaders();
                        PartSource partSource = new PartSource();
                        this.currentPart = partSource;
                        return new Part(readHeaders, y0.e(partSource));
                    }
                } else {
                    throw new ProtocolException("unexpected characters after boundary");
                }
            }
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MultipartReader(@p4.l okhttp3.ResponseBody r3) throws java.io.IOException {
        /*
            r2 = this;
            java.lang.String r0 = "response"
            kotlin.jvm.internal.l0.p(r3, r0)
            okio.BufferedSource r0 = r3.source()
            okhttp3.MediaType r3 = r3.contentType()
            if (r3 == 0) goto L1b
            java.lang.String r1 = "boundary"
            java.lang.String r3 = r3.parameter(r1)
            if (r3 == 0) goto L1b
            r2.<init>(r0, r3)
            return
        L1b:
            java.net.ProtocolException r3 = new java.net.ProtocolException
            java.lang.String r0 = "expected the Content-Type to have a boundary parameter"
            r3.<init>(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.MultipartReader.<init>(okhttp3.ResponseBody):void");
    }
}
