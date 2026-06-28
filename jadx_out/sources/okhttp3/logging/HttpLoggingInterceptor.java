package okhttp3.logging;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.efs.sdk.base.Constants;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import kotlin.b1;
import kotlin.collections.b0;
import kotlin.collections.l1;
import kotlin.i0;
import kotlin.io.c;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.t1;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.m;
import kotlin.text.e0;
import okhttp3.Connection;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.platform.Platform;
import okio.BufferedSource;
import okio.a0;
import org.apache.http.protocol.HTTP;
import p4.l;
import u3.e;
import u3.h;
import u3.i;

@i0(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002\"#B\u0013\b\u0007\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b \u0010!J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rJ\u000f\u0010\u0012\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016R\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R*\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\r8\u0006@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u001b\u001a\u0004\b\u0012\u0010\u0011\"\u0004\b\u000e\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006$"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor;", "Lokhttp3/Interceptor;", "Lokhttp3/Headers;", TTDownloadField.TT_HEADERS, "", "i", "Lkotlin/r2;", "logHeader", "", "bodyHasUnknownEncoding", "", "name", "redactHeader", "Lokhttp3/logging/HttpLoggingInterceptor$Level;", "level", "setLevel", "-deprecated_level", "()Lokhttp3/logging/HttpLoggingInterceptor$Level;", "getLevel", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "", "headersToRedact", "Ljava/util/Set;", "<set-?>", "Lokhttp3/logging/HttpLoggingInterceptor$Level;", "(Lokhttp3/logging/HttpLoggingInterceptor$Level;)V", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "logger", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "<init>", "(Lokhttp3/logging/HttpLoggingInterceptor$Logger;)V", "Level", "Logger", "okhttp-logging-interceptor"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes4.dex */
public final class HttpLoggingInterceptor implements Interceptor {
    private volatile Set<String> headersToRedact;

    @l
    private volatile Level level;
    private final Logger logger;

    @i0(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Level;", "", "(Ljava/lang/String;I)V", "NONE", "BASIC", "HEADERS", "BODY", "okhttp-logging-interceptor"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes4.dex */
    public enum Level {
        NONE,
        BASIC,
        HEADERS,
        BODY
    }

    @i0(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0007"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "", "", CrashHianalyticsData.MESSAGE, "Lkotlin/r2;", "log", "Companion", "okhttp-logging-interceptor"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes4.dex */
    public interface Logger {
        public static final Companion Companion = new Companion(null);

        @l
        @e
        public static final Logger DEFAULT = new Companion.DefaultLogger();

        @i0(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000¨\u0006\u0001\u0082\u0002\u0007\n\u0005\b\u0091F0\u0001¨\u0006\u0006"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Logger$Companion;", "", "()V", "DEFAULT", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "DefaultLogger", "okhttp-logging-interceptor"}, k = 1, mv = {1, 4, 0})
        /* loaded from: classes4.dex */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = null;

            @i0(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Logger$Companion$DefaultLogger;", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "", CrashHianalyticsData.MESSAGE, "Lkotlin/r2;", "log", "<init>", "()V", "okhttp-logging-interceptor"}, k = 1, mv = {1, 4, 0})
            /* loaded from: classes4.dex */
            private static final class DefaultLogger implements Logger {
                @Override // okhttp3.logging.HttpLoggingInterceptor.Logger
                public void log(@l String message) {
                    l0.p(message, "message");
                    Platform.log$default(Platform.Companion.get(), message, 0, null, 6, null);
                }
            }

            private Companion() {
            }

            public /* synthetic */ Companion(w wVar) {
                this();
            }
        }

        void log(@l String str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @i
    public HttpLoggingInterceptor() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @i
    public HttpLoggingInterceptor(@l Logger logger) {
        Set<String> k5;
        l0.p(logger, "logger");
        this.logger = logger;
        k5 = l1.k();
        this.headersToRedact = k5;
        this.level = Level.NONE;
    }

    private final boolean bodyHasUnknownEncoding(Headers headers) {
        boolean K1;
        boolean K12;
        String str = headers.get(HTTP.CONTENT_ENCODING);
        if (str == null) {
            return false;
        }
        K1 = e0.K1(str, HTTP.IDENTITY_CODING, true);
        if (K1) {
            return false;
        }
        K12 = e0.K1(str, Constants.CP_GZIP, true);
        if (K12) {
            return false;
        }
        return true;
    }

    private final void logHeader(Headers headers, int i5) {
        String value;
        if (this.headersToRedact.contains(headers.name(i5))) {
            value = "██";
        } else {
            value = headers.value(i5);
        }
        this.logger.log(headers.name(i5) + ": " + value);
    }

    @l
    @h(name = "-deprecated_level")
    @k(level = m.ERROR, message = "moved to var", replaceWith = @b1(expression = "level", imports = {}))
    /* renamed from: -deprecated_level, reason: not valid java name */
    public final Level m6591deprecated_level() {
        return this.level;
    }

    @l
    public final Level getLevel() {
        return this.level;
    }

    @Override // okhttp3.Interceptor
    @l
    public Response intercept(@l Interceptor.Chain chain) throws IOException {
        String str;
        char c5;
        String sb;
        boolean K1;
        Charset UTF_8;
        Charset UTF_82;
        l0.p(chain, "chain");
        Level level = this.level;
        Request request = chain.request();
        if (level == Level.NONE) {
            return chain.proceed(request);
        }
        boolean z4 = level == Level.BODY;
        boolean z5 = z4 || level == Level.HEADERS;
        RequestBody body = request.body();
        Connection connection = chain.connection();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("--> ");
        sb2.append(request.method());
        sb2.append(' ');
        sb2.append(request.url());
        sb2.append(connection != null ? " " + connection.protocol() : "");
        String sb3 = sb2.toString();
        if (!z5 && body != null) {
            sb3 = sb3 + " (" + body.contentLength() + "-byte body)";
        }
        this.logger.log(sb3);
        if (z5) {
            Headers headers = request.headers();
            if (body != null) {
                MediaType contentType = body.contentType();
                if (contentType != null && headers.get(HTTP.CONTENT_TYPE) == null) {
                    this.logger.log("Content-Type: " + contentType);
                }
                if (body.contentLength() != -1 && headers.get(HTTP.CONTENT_LEN) == null) {
                    this.logger.log("Content-Length: " + body.contentLength());
                }
            }
            int size = headers.size();
            for (int i5 = 0; i5 < size; i5++) {
                logHeader(headers, i5);
            }
            if (z4 && body != null) {
                if (bodyHasUnknownEncoding(request.headers())) {
                    this.logger.log("--> END " + request.method() + " (encoded body omitted)");
                } else if (body.isDuplex()) {
                    this.logger.log("--> END " + request.method() + " (duplex request body omitted)");
                } else if (body.isOneShot()) {
                    this.logger.log("--> END " + request.method() + " (one-shot body omitted)");
                } else {
                    okio.l lVar = new okio.l();
                    body.writeTo(lVar);
                    MediaType contentType2 = body.contentType();
                    if (contentType2 == null || (UTF_82 = contentType2.charset(StandardCharsets.UTF_8)) == null) {
                        UTF_82 = StandardCharsets.UTF_8;
                        l0.o(UTF_82, "UTF_8");
                    }
                    this.logger.log("");
                    if (Utf8Kt.isProbablyUtf8(lVar)) {
                        this.logger.log(lVar.j0(UTF_82));
                        this.logger.log("--> END " + request.method() + " (" + body.contentLength() + "-byte body)");
                    } else {
                        this.logger.log("--> END " + request.method() + " (binary " + body.contentLength() + "-byte body omitted)");
                    }
                }
            } else {
                this.logger.log("--> END " + request.method());
            }
        }
        long nanoTime = System.nanoTime();
        try {
            Response proceed = chain.proceed(request);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
            ResponseBody body2 = proceed.body();
            l0.m(body2);
            long contentLength = body2.contentLength();
            String str2 = contentLength != -1 ? contentLength + "-byte" : "unknown-length";
            Logger logger = this.logger;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("<-- ");
            sb4.append(proceed.code());
            if (proceed.message().length() == 0) {
                str = "-byte body omitted)";
                sb = "";
                c5 = ' ';
            } else {
                String message = proceed.message();
                StringBuilder sb5 = new StringBuilder();
                str = "-byte body omitted)";
                c5 = ' ';
                sb5.append(String.valueOf(' '));
                sb5.append(message);
                sb = sb5.toString();
            }
            sb4.append(sb);
            sb4.append(c5);
            sb4.append(proceed.request().url());
            sb4.append(" (");
            sb4.append(millis);
            sb4.append("ms");
            sb4.append(z5 ? "" : ", " + str2 + " body");
            sb4.append(')');
            logger.log(sb4.toString());
            if (z5) {
                Headers headers2 = proceed.headers();
                int size2 = headers2.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    logHeader(headers2, i6);
                }
                if (z4 && HttpHeaders.promisesBody(proceed)) {
                    if (bodyHasUnknownEncoding(proceed.headers())) {
                        this.logger.log("<-- END HTTP (encoded body omitted)");
                    } else {
                        BufferedSource source = body2.source();
                        source.request(Long.MAX_VALUE);
                        okio.l g5 = source.g();
                        K1 = e0.K1(Constants.CP_GZIP, headers2.get(HTTP.CONTENT_ENCODING), true);
                        Long l5 = null;
                        if (K1) {
                            Long valueOf = Long.valueOf(g5.M0());
                            a0 a0Var = new a0(g5.clone());
                            try {
                                g5 = new okio.l();
                                g5.G(a0Var);
                                c.a(a0Var, null);
                                l5 = valueOf;
                            } finally {
                            }
                        }
                        MediaType contentType3 = body2.contentType();
                        if (contentType3 == null || (UTF_8 = contentType3.charset(StandardCharsets.UTF_8)) == null) {
                            UTF_8 = StandardCharsets.UTF_8;
                            l0.o(UTF_8, "UTF_8");
                        }
                        if (!Utf8Kt.isProbablyUtf8(g5)) {
                            this.logger.log("");
                            this.logger.log("<-- END HTTP (binary " + g5.M0() + str);
                            return proceed;
                        }
                        if (contentLength != 0) {
                            this.logger.log("");
                            this.logger.log(g5.clone().j0(UTF_8));
                        }
                        if (l5 != null) {
                            this.logger.log("<-- END HTTP (" + g5.M0() + "-byte, " + l5 + "-gzipped-byte body)");
                        } else {
                            this.logger.log("<-- END HTTP (" + g5.M0() + "-byte body)");
                        }
                    }
                } else {
                    this.logger.log("<-- END HTTP");
                }
            }
            return proceed;
        } catch (Exception e5) {
            this.logger.log("<-- HTTP FAILED: " + e5);
            throw e5;
        }
    }

    @h(name = "level")
    public final void level(@l Level level) {
        l0.p(level, "<set-?>");
        this.level = level;
    }

    public final void redactHeader(@l String name) {
        Comparator Q1;
        l0.p(name, "name");
        Q1 = e0.Q1(t1.f19457a);
        TreeSet treeSet = new TreeSet(Q1);
        b0.n0(treeSet, this.headersToRedact);
        treeSet.add(name);
        this.headersToRedact = treeSet;
    }

    @l
    public final HttpLoggingInterceptor setLevel(@l Level level) {
        l0.p(level, "level");
        this.level = level;
        return this;
    }

    public /* synthetic */ HttpLoggingInterceptor(Logger logger, int i5, w wVar) {
        this((i5 & 1) != 0 ? Logger.DEFAULT : logger);
    }
}
