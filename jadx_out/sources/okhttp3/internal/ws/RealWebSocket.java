package okhttp3.internal.ws;

import a1.h;
import androidx.core.app.NotificationCompat;
import com.bytedance.android.live.base.api.push.ILivePush;
import com.bytedance.sdk.openadsdk.api.plugin.PluginConstants;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.huawei.agconnect.apms.instrument.Instrumented;
import com.huawei.agconnect.apms.instrument.okhttp3.OkHttp3Instrumentation;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import kotlin.collections.v;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.r2;
import kotlin.text.e0;
import m0.a;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.EventListener;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.ws.RealWebSocket;
import okhttp3.internal.ws.WebSocketReader;
import okio.BufferedSource;
import okio.n;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.protocol.HTTP;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 r2\u00020\u00012\u00020\u0002:\u0005srtuvBA\u0012\u0006\u0010o\u001a\u00020n\u0012\u0006\u0010A\u001a\u00020\r\u0012\u0006\u0010D\u001a\u00020C\u0012\u0006\u0010I\u001a\u00020H\u0012\u0006\u0010K\u001a\u00020\u000f\u0012\b\u0010M\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010O\u001a\u00020\u000f¢\u0006\u0004\bp\u0010qJ\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0002J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\b\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u000bH\u0016J\u000e\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012J!\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010 \u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eJ\u0006\u0010!\u001a\u00020\u000bJ\u0006\u0010\"\u001a\u00020\u0004J\u0016\u0010&\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020$J\u0006\u0010'\u001a\u00020\u000bJ\u0006\u0010(\u001a\u00020\bJ\u0006\u0010)\u001a\u00020\bJ\u0006\u0010*\u001a\u00020\bJ\u0010\u0010,\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u001cH\u0016J\u0010\u0010,\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020\u0006H\u0016J\u0010\u0010/\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020\u0006H\u0016J\u0010\u00100\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020\u0006H\u0016J\u0018\u00103\u001a\u00020\u000b2\u0006\u00101\u001a\u00020\b2\u0006\u00102\u001a\u00020\u001cH\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u001cH\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u0006H\u0016J\u000e\u00104\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u0006J\u001a\u00105\u001a\u00020\u00042\u0006\u00101\u001a\u00020\b2\b\u00102\u001a\u0004\u0018\u00010\u001cH\u0016J \u00105\u001a\u00020\u00042\u0006\u00101\u001a\u00020\b2\b\u00102\u001a\u0004\u0018\u00010\u001c2\u0006\u00106\u001a\u00020\u000fJ\u000f\u00109\u001a\u00020\u0004H\u0000¢\u0006\u0004\b7\u00108J\u000f\u0010<\u001a\u00020\u000bH\u0000¢\u0006\u0004\b:\u0010;J\u001c\u0010@\u001a\u00020\u000b2\n\u0010?\u001a\u00060=j\u0002`>2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015R\u0014\u0010A\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u001a\u0010D\u001a\u00020C8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0014\u0010I\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010K\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010M\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010O\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010LR\u0014\u0010P\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0018\u0010S\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0018\u0010V\u001a\u0004\u0018\u00010U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0018\u0010Y\u001a\u0004\u0018\u00010X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0018\u0010\\\u001a\u0004\u0018\u00010[8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u0016\u0010_\u001a\u00020^8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010QR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010aR\u001a\u0010c\u001a\b\u0012\u0004\u0012\u00020\u00060b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u001a\u0010f\u001a\b\u0012\u0004\u0012\u00020e0b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010dR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010LR\u0016\u0010g\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u0016\u0010i\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR\u0018\u0010k\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010QR\u0016\u0010l\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010hR\u0016\u0010(\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010jR\u0016\u0010)\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010jR\u0016\u0010*\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010jR\u0016\u0010m\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010h¨\u0006w"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket;", "Lokhttp3/WebSocket;", "Lokhttp3/internal/ws/WebSocketReader$FrameCallback;", "Lokhttp3/internal/ws/WebSocketExtensions;", "", "isValid", "Lokio/n;", "data", "", "formatOpcode", "send", "Lkotlin/r2;", "runWriter", "Lokhttp3/Request;", "request", "", "queueSize", "cancel", "Lokhttp3/OkHttpClient;", "client", "connect", "Lokhttp3/Response;", "response", "Lokhttp3/internal/connection/Exchange;", "exchange", "checkUpgradeSuccess$okhttp", "(Lokhttp3/Response;Lokhttp3/internal/connection/Exchange;)V", "checkUpgradeSuccess", "", "name", "Lokhttp3/internal/ws/RealWebSocket$Streams;", "streams", "initReaderAndWriter", "loopReader", "processNextFrame", a.Z, "Ljava/util/concurrent/TimeUnit;", "timeUnit", "awaitTermination", "tearDown", "sentPingCount", "receivedPingCount", "receivedPongCount", "text", "onReadMessage", "bytes", "payload", "onReadPing", "onReadPong", PluginConstants.KEY_ERROR_CODE, MediationConstant.KEY_REASON, "onReadClose", "pong", ILivePush.ClickType.CLOSE, "cancelAfterCloseMillis", "writeOneFrame$okhttp", "()Z", "writeOneFrame", "writePingFrame$okhttp", "()V", "writePingFrame", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "failWebSocket", "originalRequest", "Lokhttp3/Request;", "Lokhttp3/WebSocketListener;", "listener", "Lokhttp3/WebSocketListener;", "getListener$okhttp", "()Lokhttp3/WebSocketListener;", "Ljava/util/Random;", "random", "Ljava/util/Random;", "pingIntervalMillis", "J", "extensions", "Lokhttp3/internal/ws/WebSocketExtensions;", "minimumDeflateSize", DatabaseFileArchive.COLUMN_KEY, "Ljava/lang/String;", "Lokhttp3/Call;", NotificationCompat.CATEGORY_CALL, "Lokhttp3/Call;", "Lokhttp3/internal/concurrent/Task;", "writerTask", "Lokhttp3/internal/concurrent/Task;", "Lokhttp3/internal/ws/WebSocketReader;", "reader", "Lokhttp3/internal/ws/WebSocketReader;", "Lokhttp3/internal/ws/WebSocketWriter;", "writer", "Lokhttp3/internal/ws/WebSocketWriter;", "Lokhttp3/internal/concurrent/TaskQueue;", "taskQueue", "Lokhttp3/internal/concurrent/TaskQueue;", "Lokhttp3/internal/ws/RealWebSocket$Streams;", "Ljava/util/ArrayDeque;", "pongQueue", "Ljava/util/ArrayDeque;", "", "messageAndCloseQueue", "enqueuedClose", "Z", "receivedCloseCode", "I", "receivedCloseReason", h.f116i, "awaitingPong", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "<init>", "(Lokhttp3/internal/concurrent/TaskRunner;Lokhttp3/Request;Lokhttp3/WebSocketListener;Ljava/util/Random;JLokhttp3/internal/ws/WebSocketExtensions;J)V", "Companion", HTTP.CONN_CLOSE, "Message", "Streams", "WriterTask", "okhttp"}, k = 1, mv = {1, 8, 0})
@Instrumented
@r1({"SMAP\nRealWebSocket.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealWebSocket.kt\nokhttp3/internal/ws/RealWebSocket\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue\n+ 4 Util.kt\nokhttp3/internal/Util\n*L\n1#1,654:1\n1#2:655\n84#3,4:656\n90#3,13:664\n608#4,4:660\n*S KotlinDebug\n*F\n+ 1 RealWebSocket.kt\nokhttp3/internal/ws/RealWebSocket\n*L\n269#1:656,4\n512#1:664,13\n457#1:660,4\n*E\n"})
/* loaded from: classes4.dex */
public final class RealWebSocket implements WebSocket, WebSocketReader.FrameCallback {
    private static final long CANCEL_AFTER_CLOSE_MILLIS = 60000;

    @l
    public static final Companion Companion = new Companion(null);
    public static final long DEFAULT_MINIMUM_DEFLATE_SIZE = 1024;
    private static final long MAX_QUEUE_SIZE = 16777216;

    @l
    private static final List<Protocol> ONLY_HTTP1;
    private boolean awaitingPong;

    @m
    private Call call;
    private boolean enqueuedClose;

    @m
    private WebSocketExtensions extensions;
    private boolean failed;

    @l
    private final String key;

    @l
    private final WebSocketListener listener;

    @l
    private final ArrayDeque<Object> messageAndCloseQueue;
    private long minimumDeflateSize;

    @m
    private String name;

    @l
    private final Request originalRequest;
    private final long pingIntervalMillis;

    @l
    private final ArrayDeque<n> pongQueue;
    private long queueSize;

    @l
    private final Random random;

    @m
    private WebSocketReader reader;
    private int receivedCloseCode;

    @m
    private String receivedCloseReason;
    private int receivedPingCount;
    private int receivedPongCount;
    private int sentPingCount;

    @m
    private Streams streams;

    @l
    private TaskQueue taskQueue;

    @m
    private WebSocketWriter writer;

    @m
    private Task writerTask;

    @i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket$Close;", "", "", PluginConstants.KEY_ERROR_CODE, "I", "getCode", "()I", "Lokio/n;", MediationConstant.KEY_REASON, "Lokio/n;", "getReason", "()Lokio/n;", "", "cancelAfterCloseMillis", "J", "getCancelAfterCloseMillis", "()J", "<init>", "(ILokio/n;J)V", "okhttp"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class Close {
        private final long cancelAfterCloseMillis;
        private final int code;

        @m
        private final n reason;

        public Close(int i5, @m n nVar, long j5) {
            this.code = i5;
            this.reason = nVar;
            this.cancelAfterCloseMillis = j5;
        }

        public final long getCancelAfterCloseMillis() {
            return this.cancelAfterCloseMillis;
        }

        public final int getCode() {
            return this.code;
        }

        @m
        public final n getReason() {
            return this.reason;
        }
    }

    @i0(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket$Companion;", "", "()V", "CANCEL_AFTER_CLOSE_MILLIS", "", "DEFAULT_MINIMUM_DEFLATE_SIZE", "MAX_QUEUE_SIZE", "ONLY_HTTP1", "", "Lokhttp3/Protocol;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }
    }

    @i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket$Message;", "", "", "formatOpcode", "I", "getFormatOpcode", "()I", "Lokio/n;", "data", "Lokio/n;", "getData", "()Lokio/n;", "<init>", "(ILokio/n;)V", "okhttp"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class Message {

        @l
        private final n data;
        private final int formatOpcode;

        public Message(int i5, @l n data) {
            l0.p(data, "data");
            this.formatOpcode = i5;
            this.data = data;
        }

        @l
        public final n getData() {
            return this.data;
        }

        public final int getFormatOpcode() {
            return this.formatOpcode;
        }
    }

    @i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket$Streams;", "Ljava/io/Closeable;", "", "client", "Z", "getClient", "()Z", "Lokio/BufferedSource;", "source", "Lokio/BufferedSource;", "getSource", "()Lokio/BufferedSource;", "Lokio/m;", "sink", "Lokio/m;", "getSink", "()Lokio/m;", "<init>", "(ZLokio/BufferedSource;Lokio/m;)V", "okhttp"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static abstract class Streams implements Closeable {
        private final boolean client;

        @l
        private final okio.m sink;

        @l
        private final BufferedSource source;

        public Streams(boolean z4, @l BufferedSource source, @l okio.m sink) {
            l0.p(source, "source");
            l0.p(sink, "sink");
            this.client = z4;
            this.source = source;
            this.sink = sink;
        }

        public final boolean getClient() {
            return this.client;
        }

        @l
        public final okio.m getSink() {
            return this.sink;
        }

        @l
        public final BufferedSource getSource() {
            return this.source;
        }
    }

    @i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket$WriterTask;", "Lokhttp3/internal/concurrent/Task;", "(Lokhttp3/internal/ws/RealWebSocket;)V", "runOnce", "", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    private final class WriterTask extends Task {
        public WriterTask() {
            super(RealWebSocket.this.name + " writer", false, 2, null);
        }

        @Override // okhttp3.internal.concurrent.Task
        public long runOnce() {
            try {
                if (RealWebSocket.this.writeOneFrame$okhttp()) {
                    return 0L;
                }
                return -1L;
            } catch (IOException e5) {
                RealWebSocket.this.failWebSocket(e5, null);
                return -1L;
            }
        }
    }

    static {
        List<Protocol> k5;
        k5 = v.k(Protocol.HTTP_1_1);
        ONLY_HTTP1 = k5;
    }

    public RealWebSocket(@l TaskRunner taskRunner, @l Request originalRequest, @l WebSocketListener listener, @l Random random, long j5, @m WebSocketExtensions webSocketExtensions, long j6) {
        l0.p(taskRunner, "taskRunner");
        l0.p(originalRequest, "originalRequest");
        l0.p(listener, "listener");
        l0.p(random, "random");
        this.originalRequest = originalRequest;
        this.listener = listener;
        this.random = random;
        this.pingIntervalMillis = j5;
        this.extensions = webSocketExtensions;
        this.minimumDeflateSize = j6;
        this.taskQueue = taskRunner.newQueue();
        this.pongQueue = new ArrayDeque<>();
        this.messageAndCloseQueue = new ArrayDeque<>();
        this.receivedCloseCode = -1;
        if (l0.g(HttpGet.METHOD_NAME, originalRequest.method())) {
            n.a aVar = n.Companion;
            byte[] bArr = new byte[16];
            random.nextBytes(bArr);
            r2 r2Var = r2.f19517a;
            this.key = n.a.p(aVar, bArr, 0, 0, 3, null).base64();
            return;
        }
        throw new IllegalArgumentException(("Request must be GET: " + originalRequest.method()).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isValid(WebSocketExtensions webSocketExtensions) {
        if (webSocketExtensions.unknownValues || webSocketExtensions.clientMaxWindowBits != null) {
            return false;
        }
        if (webSocketExtensions.serverMaxWindowBits != null && !new kotlin.ranges.l(8, 15).l(webSocketExtensions.serverMaxWindowBits.intValue())) {
            return false;
        }
        return true;
    }

    private final void runWriter() {
        if (Util.assertionsEnabled && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        Task task = this.writerTask;
        if (task != null) {
            TaskQueue.schedule$default(this.taskQueue, task, 0L, 2, null);
        }
    }

    public final void awaitTermination(long j5, @l TimeUnit timeUnit) throws InterruptedException {
        l0.p(timeUnit, "timeUnit");
        this.taskQueue.idleLatch().await(j5, timeUnit);
    }

    @Override // okhttp3.WebSocket
    public void cancel() {
        Call call = this.call;
        l0.m(call);
        call.cancel();
    }

    public final void checkUpgradeSuccess$okhttp(@l Response response, @m Exchange exchange) throws IOException {
        boolean K1;
        boolean K12;
        l0.p(response, "response");
        if (response.code() == 101) {
            String header$default = Response.header$default(response, HTTP.CONN_DIRECTIVE, null, 2, null);
            K1 = e0.K1("Upgrade", header$default, true);
            if (K1) {
                String header$default2 = Response.header$default(response, "Upgrade", null, 2, null);
                K12 = e0.K1("websocket", header$default2, true);
                if (K12) {
                    String header$default3 = Response.header$default(response, "Sec-WebSocket-Accept", null, 2, null);
                    String base64 = n.Companion.l(this.key + WebSocketProtocol.ACCEPT_MAGIC).sha1().base64();
                    if (l0.g(base64, header$default3)) {
                        if (exchange != null) {
                            return;
                        } else {
                            throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
                        }
                    }
                    throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + base64 + "' but was '" + header$default3 + '\'');
                }
                throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + header$default2 + '\'');
            }
            throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + header$default + '\'');
        }
        throw new ProtocolException("Expected HTTP 101 response but was '" + response.code() + ' ' + response.message() + '\'');
    }

    @Override // okhttp3.WebSocket
    public boolean close(int i5, @m String str) {
        return close(i5, str, 60000L);
    }

    public final void connect(@l OkHttpClient client) {
        OkHttpClient build;
        final Request build2;
        l0.p(client, "client");
        if (this.originalRequest.header("Sec-WebSocket-Extensions") != null) {
            failWebSocket(new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null);
            return;
        }
        OkHttpClient.Builder protocols = client.newBuilder().eventListener(EventListener.NONE).protocols(ONLY_HTTP1);
        if (!(protocols instanceof OkHttpClient.Builder)) {
            build = protocols.build();
        } else {
            build = OkHttp3Instrumentation.build(protocols);
        }
        Request.Builder header = this.originalRequest.newBuilder().header("Upgrade", "websocket").header(HTTP.CONN_DIRECTIVE, "Upgrade").header("Sec-WebSocket-Key", this.key).header("Sec-WebSocket-Version", "13").header("Sec-WebSocket-Extensions", "permessage-deflate");
        if (!(header instanceof Request.Builder)) {
            build2 = header.build();
        } else {
            build2 = OkHttp3Instrumentation.build(header);
        }
        RealCall realCall = new RealCall(build, build2, true);
        this.call = realCall;
        l0.m(realCall);
        realCall.enqueue(new Callback() { // from class: okhttp3.internal.ws.RealWebSocket$connect$1
            @Override // okhttp3.Callback
            public void onFailure(@l Call call, @l IOException e5) {
                l0.p(call, "call");
                l0.p(e5, "e");
                RealWebSocket.this.failWebSocket(e5, null);
            }

            @Override // okhttp3.Callback
            public void onResponse(@l Call call, @l Response response) {
                boolean isValid;
                ArrayDeque arrayDeque;
                l0.p(call, "call");
                l0.p(response, "response");
                Exchange exchange = response.exchange();
                try {
                    RealWebSocket.this.checkUpgradeSuccess$okhttp(response, exchange);
                    l0.m(exchange);
                    RealWebSocket.Streams newWebSocketStreams = exchange.newWebSocketStreams();
                    WebSocketExtensions parse = WebSocketExtensions.Companion.parse(response.headers());
                    RealWebSocket.this.extensions = parse;
                    isValid = RealWebSocket.this.isValid(parse);
                    if (!isValid) {
                        RealWebSocket realWebSocket = RealWebSocket.this;
                        synchronized (realWebSocket) {
                            arrayDeque = realWebSocket.messageAndCloseQueue;
                            arrayDeque.clear();
                            realWebSocket.close(1010, "unexpected Sec-WebSocket-Extensions in response header");
                        }
                    }
                    try {
                        RealWebSocket.this.initReaderAndWriter(Util.okHttpName + " WebSocket " + build2.url().redact(), newWebSocketStreams);
                        RealWebSocket.this.getListener$okhttp().onOpen(RealWebSocket.this, response);
                        RealWebSocket.this.loopReader();
                    } catch (Exception e5) {
                        RealWebSocket.this.failWebSocket(e5, null);
                    }
                } catch (IOException e6) {
                    RealWebSocket.this.failWebSocket(e6, response);
                    Util.closeQuietly(response);
                    if (exchange != null) {
                        exchange.webSocketUpgradeFailed();
                    }
                }
            }
        });
    }

    public final void failWebSocket(@l Exception e5, @m Response response) {
        l0.p(e5, "e");
        synchronized (this) {
            if (this.failed) {
                return;
            }
            this.failed = true;
            Streams streams = this.streams;
            this.streams = null;
            WebSocketReader webSocketReader = this.reader;
            this.reader = null;
            WebSocketWriter webSocketWriter = this.writer;
            this.writer = null;
            this.taskQueue.shutdown();
            r2 r2Var = r2.f19517a;
            try {
                this.listener.onFailure(this, e5, response);
            } finally {
                if (streams != null) {
                    Util.closeQuietly(streams);
                }
                if (webSocketReader != null) {
                    Util.closeQuietly(webSocketReader);
                }
                if (webSocketWriter != null) {
                    Util.closeQuietly(webSocketWriter);
                }
            }
        }
    }

    @l
    public final WebSocketListener getListener$okhttp() {
        return this.listener;
    }

    public final void initReaderAndWriter(@l String name, @l Streams streams) throws IOException {
        l0.p(name, "name");
        l0.p(streams, "streams");
        WebSocketExtensions webSocketExtensions = this.extensions;
        l0.m(webSocketExtensions);
        synchronized (this) {
            this.name = name;
            this.streams = streams;
            this.writer = new WebSocketWriter(streams.getClient(), streams.getSink(), this.random, webSocketExtensions.perMessageDeflate, webSocketExtensions.noContextTakeover(streams.getClient()), this.minimumDeflateSize);
            this.writerTask = new WriterTask();
            long j5 = this.pingIntervalMillis;
            if (j5 != 0) {
                final long nanos = TimeUnit.MILLISECONDS.toNanos(j5);
                final String str = name + " ping";
                this.taskQueue.schedule(new Task(str) { // from class: okhttp3.internal.ws.RealWebSocket$initReaderAndWriter$lambda$3$$inlined$schedule$1
                    @Override // okhttp3.internal.concurrent.Task
                    public long runOnce() {
                        this.writePingFrame$okhttp();
                        return nanos;
                    }
                }, nanos);
            }
            if (!this.messageAndCloseQueue.isEmpty()) {
                runWriter();
            }
            r2 r2Var = r2.f19517a;
        }
        this.reader = new WebSocketReader(streams.getClient(), streams.getSource(), this, webSocketExtensions.perMessageDeflate, webSocketExtensions.noContextTakeover(!streams.getClient()));
    }

    public final void loopReader() throws IOException {
        while (this.receivedCloseCode == -1) {
            WebSocketReader webSocketReader = this.reader;
            l0.m(webSocketReader);
            webSocketReader.processNextFrame();
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadClose(int i5, @l String reason) {
        boolean z4;
        Streams streams;
        WebSocketReader webSocketReader;
        WebSocketWriter webSocketWriter;
        l0.p(reason, "reason");
        boolean z5 = true;
        if (i5 != -1) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            synchronized (this) {
                if (this.receivedCloseCode != -1) {
                    z5 = false;
                }
                if (z5) {
                    this.receivedCloseCode = i5;
                    this.receivedCloseReason = reason;
                    streams = null;
                    if (this.enqueuedClose && this.messageAndCloseQueue.isEmpty()) {
                        Streams streams2 = this.streams;
                        this.streams = null;
                        webSocketReader = this.reader;
                        this.reader = null;
                        webSocketWriter = this.writer;
                        this.writer = null;
                        this.taskQueue.shutdown();
                        streams = streams2;
                    } else {
                        webSocketReader = null;
                        webSocketWriter = null;
                    }
                    r2 r2Var = r2.f19517a;
                } else {
                    throw new IllegalStateException("already closed".toString());
                }
            }
            try {
                this.listener.onClosing(this, i5, reason);
                if (streams != null) {
                    this.listener.onClosed(this, i5, reason);
                }
                if (webSocketWriter != null) {
                    return;
                } else {
                    return;
                }
            } finally {
                if (streams != null) {
                    Util.closeQuietly(streams);
                }
                if (webSocketReader != null) {
                    Util.closeQuietly(webSocketReader);
                }
                if (webSocketWriter != null) {
                    Util.closeQuietly(webSocketWriter);
                }
            }
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadMessage(@l String text) throws IOException {
        l0.p(text, "text");
        this.listener.onMessage(this, text);
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public synchronized void onReadPing(@l n payload) {
        l0.p(payload, "payload");
        if (!this.failed && (!this.enqueuedClose || !this.messageAndCloseQueue.isEmpty())) {
            this.pongQueue.add(payload);
            runWriter();
            this.receivedPingCount++;
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public synchronized void onReadPong(@l n payload) {
        l0.p(payload, "payload");
        this.receivedPongCount++;
        this.awaitingPong = false;
    }

    public final synchronized boolean pong(@l n payload) {
        l0.p(payload, "payload");
        if (!this.failed && (!this.enqueuedClose || !this.messageAndCloseQueue.isEmpty())) {
            this.pongQueue.add(payload);
            runWriter();
            return true;
        }
        return false;
    }

    public final boolean processNextFrame() throws IOException {
        try {
            WebSocketReader webSocketReader = this.reader;
            l0.m(webSocketReader);
            webSocketReader.processNextFrame();
            if (this.receivedCloseCode != -1) {
                return false;
            }
            return true;
        } catch (Exception e5) {
            failWebSocket(e5, null);
            return false;
        }
    }

    @Override // okhttp3.WebSocket
    public synchronized long queueSize() {
        return this.queueSize;
    }

    public final synchronized int receivedPingCount() {
        return this.receivedPingCount;
    }

    public final synchronized int receivedPongCount() {
        return this.receivedPongCount;
    }

    @Override // okhttp3.WebSocket
    @l
    public Request request() {
        return this.originalRequest;
    }

    @Override // okhttp3.WebSocket
    public boolean send(@l String text) {
        l0.p(text, "text");
        return send(n.Companion.l(text), 1);
    }

    public final synchronized int sentPingCount() {
        return this.sentPingCount;
    }

    public final void tearDown() throws InterruptedException {
        this.taskQueue.shutdown();
        this.taskQueue.idleLatch().await(10L, TimeUnit.SECONDS);
    }

    public final boolean writeOneFrame$okhttp() throws IOException {
        String str;
        WebSocketReader webSocketReader;
        WebSocketWriter webSocketWriter;
        int i5;
        Streams streams;
        synchronized (this) {
            if (this.failed) {
                return false;
            }
            WebSocketWriter webSocketWriter2 = this.writer;
            n poll = this.pongQueue.poll();
            final boolean z4 = true;
            Object obj = null;
            if (poll == null) {
                Object poll2 = this.messageAndCloseQueue.poll();
                if (poll2 instanceof Close) {
                    i5 = this.receivedCloseCode;
                    str = this.receivedCloseReason;
                    if (i5 != -1) {
                        streams = this.streams;
                        this.streams = null;
                        webSocketReader = this.reader;
                        this.reader = null;
                        webSocketWriter = this.writer;
                        this.writer = null;
                        this.taskQueue.shutdown();
                    } else {
                        long cancelAfterCloseMillis = ((Close) poll2).getCancelAfterCloseMillis();
                        TaskQueue taskQueue = this.taskQueue;
                        final String str2 = this.name + " cancel";
                        taskQueue.schedule(new Task(str2, z4) { // from class: okhttp3.internal.ws.RealWebSocket$writeOneFrame$lambda$8$$inlined$execute$default$1
                            @Override // okhttp3.internal.concurrent.Task
                            public long runOnce() {
                                this.cancel();
                                return -1L;
                            }
                        }, TimeUnit.MILLISECONDS.toNanos(cancelAfterCloseMillis));
                        streams = null;
                        webSocketReader = null;
                        webSocketWriter = null;
                    }
                } else {
                    if (poll2 == null) {
                        return false;
                    }
                    str = null;
                    webSocketReader = null;
                    webSocketWriter = null;
                    i5 = -1;
                    streams = null;
                }
                obj = poll2;
            } else {
                str = null;
                webSocketReader = null;
                webSocketWriter = null;
                i5 = -1;
                streams = null;
            }
            r2 r2Var = r2.f19517a;
            try {
                if (poll != null) {
                    l0.m(webSocketWriter2);
                    webSocketWriter2.writePong(poll);
                } else if (obj instanceof Message) {
                    Message message = (Message) obj;
                    l0.m(webSocketWriter2);
                    webSocketWriter2.writeMessageFrame(message.getFormatOpcode(), message.getData());
                    synchronized (this) {
                        this.queueSize -= message.getData().size();
                    }
                } else if (obj instanceof Close) {
                    Close close = (Close) obj;
                    l0.m(webSocketWriter2);
                    webSocketWriter2.writeClose(close.getCode(), close.getReason());
                    if (streams != null) {
                        WebSocketListener webSocketListener = this.listener;
                        l0.m(str);
                        webSocketListener.onClosed(this, i5, str);
                    }
                } else {
                    throw new AssertionError();
                }
                return true;
            } finally {
                if (streams != null) {
                    Util.closeQuietly(streams);
                }
                if (webSocketReader != null) {
                    Util.closeQuietly(webSocketReader);
                }
                if (webSocketWriter != null) {
                    Util.closeQuietly(webSocketWriter);
                }
            }
        }
    }

    public final void writePingFrame$okhttp() {
        int i5;
        synchronized (this) {
            if (this.failed) {
                return;
            }
            WebSocketWriter webSocketWriter = this.writer;
            if (webSocketWriter == null) {
                return;
            }
            if (this.awaitingPong) {
                i5 = this.sentPingCount;
            } else {
                i5 = -1;
            }
            this.sentPingCount++;
            this.awaitingPong = true;
            r2 r2Var = r2.f19517a;
            if (i5 != -1) {
                failWebSocket(new SocketTimeoutException("sent ping but didn't receive pong within " + this.pingIntervalMillis + "ms (after " + (i5 - 1) + " successful ping/pongs)"), null);
                return;
            }
            try {
                webSocketWriter.writePing(n.EMPTY);
            } catch (IOException e5) {
                failWebSocket(e5, null);
            }
        }
    }

    public final synchronized boolean close(int i5, @m String str, long j5) {
        n nVar;
        WebSocketProtocol.INSTANCE.validateCloseCode(i5);
        if (str != null) {
            nVar = n.Companion.l(str);
            if (!(((long) nVar.size()) <= 123)) {
                throw new IllegalArgumentException(("reason.size() > 123: " + str).toString());
            }
        } else {
            nVar = null;
        }
        if (!this.failed && !this.enqueuedClose) {
            this.enqueuedClose = true;
            this.messageAndCloseQueue.add(new Close(i5, nVar, j5));
            runWriter();
            return true;
        }
        return false;
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadMessage(@l n bytes) throws IOException {
        l0.p(bytes, "bytes");
        this.listener.onMessage(this, bytes);
    }

    @Override // okhttp3.WebSocket
    public boolean send(@l n bytes) {
        l0.p(bytes, "bytes");
        return send(bytes, 2);
    }

    private final synchronized boolean send(n nVar, int i5) {
        if (!this.failed && !this.enqueuedClose) {
            if (this.queueSize + nVar.size() > MAX_QUEUE_SIZE) {
                close(1001, null);
                return false;
            }
            this.queueSize += nVar.size();
            this.messageAndCloseQueue.add(new Message(i5, nVar));
            runWriter();
            return true;
        }
        return false;
    }
}
