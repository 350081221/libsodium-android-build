package okhttp3.internal.http2;

import android.net.http.Headers;
import com.bytedance.android.live.base.api.push.ILivePush;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.tendcloud.tenddata.cq;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import k0.c;
import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.r2;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskQueue$execute$1;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http2.Http2Reader;
import okhttp3.internal.platform.Platform;
import okio.BufferedSource;
import okio.m;
import okio.n;
import okio.y0;
import org.apache.commons.logging.LogFactory;
import org.apache.http.cookie.ClientCookie;
import p4.l;
import u3.e;
import u3.i;
import v3.a;

@i0(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 ²\u00012\u00020\u0001:\b³\u0001²\u0001´\u0001µ\u0001B\u0015\b\u0000\u0012\b\u0010¯\u0001\u001a\u00030®\u0001¢\u0006\u0006\b°\u0001\u0010±\u0001J&\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0012\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002J\u0006\u0010\u000f\u001a\u00020\u0002J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\u0002J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0012\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007J\u001c\u0010\n\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007J-\u0010 \u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ(\u0010$\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00072\b\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010#\u001a\u00020\u0016J\u001f\u0010)\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010&\u001a\u00020%H\u0000¢\u0006\u0004\b'\u0010(J\u001f\u0010,\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010*\u001a\u00020%H\u0000¢\u0006\u0004\b+\u0010(J\u001f\u00100\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u0016H\u0000¢\u0006\u0004\b.\u0010/J\u001e\u00104\u001a\u00020\r2\u0006\u00101\u001a\u00020\u00072\u0006\u00102\u001a\u00020\u00022\u0006\u00103\u001a\u00020\u0002J\u0006\u00105\u001a\u00020\rJ\u0006\u00104\u001a\u00020\rJ\u0006\u00106\u001a\u00020\rJ\u0006\u00107\u001a\u00020\rJ\u000e\u00108\u001a\u00020\r2\u0006\u0010*\u001a\u00020%J\b\u00109\u001a\u00020\rH\u0016J)\u00109\u001a\u00020\r2\u0006\u0010:\u001a\u00020%2\u0006\u0010;\u001a\u00020%2\b\u0010<\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0004\b=\u0010>J\u001c\u0010B\u001a\u00020\r2\b\b\u0002\u0010?\u001a\u00020\u00072\b\b\u0002\u0010A\u001a\u00020@H\u0007J\u000e\u0010E\u001a\u00020\r2\u0006\u0010D\u001a\u00020CJ\u000e\u0010G\u001a\u00020\u00072\u0006\u0010F\u001a\u00020\u0016J\u000f\u0010J\u001a\u00020\rH\u0000¢\u0006\u0004\bH\u0010IJ\u0017\u0010M\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0002H\u0000¢\u0006\u0004\bK\u0010LJ%\u0010P\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\bN\u0010OJ-\u0010T\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010Q\u001a\u00020\u0007H\u0000¢\u0006\u0004\bR\u0010SJ/\u0010Y\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010V\u001a\u00020U2\u0006\u0010#\u001a\u00020\u00022\u0006\u0010Q\u001a\u00020\u0007H\u0000¢\u0006\u0004\bW\u0010XJ\u001f\u0010[\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010&\u001a\u00020%H\u0000¢\u0006\u0004\bZ\u0010(R\u001a\u0010\\\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R\u001a\u0010a\u001a\u00020`8\u0000X\u0080\u0004¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010dR&\u0010f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010iR\u001a\u0010k\u001a\u00020j8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010nR\"\u0010o\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bo\u0010p\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR\"\u0010u\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bu\u0010p\u001a\u0004\bv\u0010r\"\u0004\bw\u0010tR\u0016\u0010x\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010]R\u0014\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010yR\u0014\u0010{\u001a\u00020z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010|R\u0014\u0010}\u001a\u00020z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010|R\u0014\u0010~\u001a\u00020z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010|R\u0017\u0010\u0080\u0001\u001a\u00020\u007f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0019\u0010\u0082\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0019\u0010\u0084\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0083\u0001R\u0019\u0010\u0085\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0083\u0001R\u0019\u0010\u0086\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0083\u0001R\u0019\u0010\u0087\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0083\u0001R\u0019\u0010\u0088\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0083\u0001R\u0019\u0010\u0089\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u0083\u0001R\u001c\u0010\u008a\u0001\u001a\u00020C8\u0006¢\u0006\u0010\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R)\u0010\u008e\u0001\u001a\u00020C8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u008e\u0001\u0010\u008b\u0001\u001a\u0006\b\u008f\u0001\u0010\u008d\u0001\"\u0006\b\u0090\u0001\u0010\u0091\u0001R*\u0010\u0093\u0001\u001a\u00020\u00162\u0007\u0010\u0092\u0001\u001a\u00020\u00168\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u0093\u0001\u0010\u0083\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R*\u0010\u0096\u0001\u001a\u00020\u00162\u0007\u0010\u0092\u0001\u001a\u00020\u00168\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u0096\u0001\u0010\u0083\u0001\u001a\u0006\b\u0097\u0001\u0010\u0095\u0001R*\u0010\u0098\u0001\u001a\u00020\u00162\u0007\u0010\u0092\u0001\u001a\u00020\u00168\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u0098\u0001\u0010\u0083\u0001\u001a\u0006\b\u0099\u0001\u0010\u0095\u0001R*\u0010\u009a\u0001\u001a\u00020\u00162\u0007\u0010\u0092\u0001\u001a\u00020\u00168\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u009a\u0001\u0010\u0083\u0001\u001a\u0006\b\u009b\u0001\u0010\u0095\u0001R \u0010\u009d\u0001\u001a\u00030\u009c\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u009d\u0001\u0010\u009e\u0001\u001a\u0006\b\u009f\u0001\u0010 \u0001R\u001d\u0010¢\u0001\u001a\u00030¡\u00018\u0006¢\u0006\u0010\n\u0006\b¢\u0001\u0010£\u0001\u001a\u0006\b¤\u0001\u0010¥\u0001R!\u0010§\u0001\u001a\u00070¦\u0001R\u00020\u00008\u0006¢\u0006\u0010\n\u0006\b§\u0001\u0010¨\u0001\u001a\u0006\b©\u0001\u0010ª\u0001R\u001e\u0010¬\u0001\u001a\t\u0012\u0004\u0012\u00020\u00020«\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¬\u0001\u0010\u00ad\u0001¨\u0006¶\u0001"}, d2 = {"Lokhttp3/internal/http2/Http2Connection;", "Ljava/io/Closeable;", "", "associatedStreamId", "", "Lokhttp3/internal/http2/Header;", "requestHeaders", "", "out", "Lokhttp3/internal/http2/Http2Stream;", "newStream", "Ljava/io/IOException;", "e", "Lkotlin/r2;", "failConnection", "openStreamCount", "id", "getStream", "streamId", "removeStream$okhttp", "(I)Lokhttp3/internal/http2/Http2Stream;", "removeStream", "", "read", "updateConnectionFlowControl$okhttp", "(J)V", "updateConnectionFlowControl", "pushStream", "outFinished", "alternating", "writeHeaders$okhttp", "(IZLjava/util/List;)V", "writeHeaders", "Lokio/l;", "buffer", "byteCount", "writeData", "Lokhttp3/internal/http2/ErrorCode;", MediationConstant.KEY_ERROR_CODE, "writeSynResetLater$okhttp", "(ILokhttp3/internal/http2/ErrorCode;)V", "writeSynResetLater", HiAnalyticsConstant.HaKey.BI_KEY_RESULT, "writeSynReset$okhttp", "writeSynReset", "unacknowledgedBytesRead", "writeWindowUpdateLater$okhttp", "(IJ)V", "writeWindowUpdateLater", "reply", "payload1", "payload2", "writePing", "writePingAndAwaitPong", "awaitPong", "flush", "shutdown", ILivePush.ClickType.CLOSE, "connectionCode", "streamCode", "cause", "close$okhttp", "(Lokhttp3/internal/http2/ErrorCode;Lokhttp3/internal/http2/ErrorCode;Ljava/io/IOException;)V", "sendConnectionPreface", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "start", "Lokhttp3/internal/http2/Settings;", "settings", "setSettings", "nowNs", "isHealthy", "sendDegradedPingLater$okhttp", "()V", "sendDegradedPingLater", "pushedStream$okhttp", "(I)Z", "pushedStream", "pushRequestLater$okhttp", "(ILjava/util/List;)V", "pushRequestLater", "inFinished", "pushHeadersLater$okhttp", "(ILjava/util/List;Z)V", "pushHeadersLater", "Lokio/BufferedSource;", "source", "pushDataLater$okhttp", "(ILokio/BufferedSource;IZ)V", "pushDataLater", "pushResetLater$okhttp", "pushResetLater", "client", "Z", "getClient$okhttp", "()Z", "Lokhttp3/internal/http2/Http2Connection$Listener;", "listener", "Lokhttp3/internal/http2/Http2Connection$Listener;", "getListener$okhttp", "()Lokhttp3/internal/http2/Http2Connection$Listener;", "", "streams", "Ljava/util/Map;", "getStreams$okhttp", "()Ljava/util/Map;", "", "connectionName", "Ljava/lang/String;", "getConnectionName$okhttp", "()Ljava/lang/String;", "lastGoodStreamId", "I", "getLastGoodStreamId$okhttp", "()I", "setLastGoodStreamId$okhttp", "(I)V", "nextStreamId", "getNextStreamId$okhttp", "setNextStreamId$okhttp", "isShutdown", "Lokhttp3/internal/concurrent/TaskRunner;", "Lokhttp3/internal/concurrent/TaskQueue;", "writerQueue", "Lokhttp3/internal/concurrent/TaskQueue;", "pushQueue", "settingsListenerQueue", "Lokhttp3/internal/http2/PushObserver;", "pushObserver", "Lokhttp3/internal/http2/PushObserver;", "intervalPingsSent", "J", "intervalPongsReceived", "degradedPingsSent", "degradedPongsReceived", "awaitPingsSent", "awaitPongsReceived", "degradedPongDeadlineNs", "okHttpSettings", "Lokhttp3/internal/http2/Settings;", "getOkHttpSettings", "()Lokhttp3/internal/http2/Settings;", "peerSettings", "getPeerSettings", "setPeerSettings", "(Lokhttp3/internal/http2/Settings;)V", "<set-?>", "readBytesTotal", "getReadBytesTotal", "()J", "readBytesAcknowledged", "getReadBytesAcknowledged", "writeBytesTotal", "getWriteBytesTotal", "writeBytesMaximum", "getWriteBytesMaximum", "Ljava/net/Socket;", "socket", "Ljava/net/Socket;", "getSocket$okhttp", "()Ljava/net/Socket;", "Lokhttp3/internal/http2/Http2Writer;", "writer", "Lokhttp3/internal/http2/Http2Writer;", "getWriter", "()Lokhttp3/internal/http2/Http2Writer;", "Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;", "readerRunnable", "Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;", "getReaderRunnable", "()Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;", "", "currentPushRequests", "Ljava/util/Set;", "Lokhttp3/internal/http2/Http2Connection$Builder;", "builder", "<init>", "(Lokhttp3/internal/http2/Http2Connection$Builder;)V", "Companion", "Builder", "Listener", "ReaderRunnable", "okhttp"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nHttp2Connection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection\n+ 2 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue\n+ 3 Util.kt\nokhttp3/internal/Util\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,1006:1\n84#2,4:1007\n90#2,13:1014\n90#2,13:1027\n90#2,13:1069\n90#2,13:1082\n90#2,13:1095\n90#2,13:1108\n90#2,13:1121\n90#2,13:1134\n563#3:1011\n557#3:1013\n557#3:1040\n615#3,4:1041\n402#3,5:1045\n402#3,5:1053\n402#3,5:1059\n402#3,5:1064\n1#4:1012\n37#5,2:1050\n13309#6:1052\n13310#6:1058\n*S KotlinDebug\n*F\n+ 1 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection\n*L\n152#1:1007,4\n340#1:1014,13\n361#1:1027,13\n506#1:1069,13\n554#1:1082,13\n893#1:1095,13\n911#1:1108,13\n938#1:1121,13\n952#1:1134,13\n183#1:1011\n319#1:1013\n402#1:1040\n446#1:1041,4\n448#1:1045,5\n461#1:1053,5\n467#1:1059,5\n472#1:1064,5\n455#1:1050,2\n460#1:1052\n460#1:1058\n*E\n"})
/* loaded from: classes4.dex */
public final class Http2Connection implements Closeable {
    public static final int AWAIT_PING = 3;

    @l
    public static final Companion Companion = new Companion(null);

    @l
    private static final Settings DEFAULT_SETTINGS;
    public static final int DEGRADED_PING = 2;
    public static final int DEGRADED_PONG_TIMEOUT_NS = 1000000000;
    public static final int INTERVAL_PING = 1;
    public static final int OKHTTP_CLIENT_WINDOW_SIZE = 16777216;
    private long awaitPingsSent;
    private long awaitPongsReceived;
    private final boolean client;

    @l
    private final String connectionName;

    @l
    private final Set<Integer> currentPushRequests;
    private long degradedPingsSent;
    private long degradedPongDeadlineNs;
    private long degradedPongsReceived;
    private long intervalPingsSent;
    private long intervalPongsReceived;
    private boolean isShutdown;
    private int lastGoodStreamId;

    @l
    private final Listener listener;
    private int nextStreamId;

    @l
    private final Settings okHttpSettings;

    @l
    private Settings peerSettings;

    @l
    private final PushObserver pushObserver;

    @l
    private final TaskQueue pushQueue;
    private long readBytesAcknowledged;
    private long readBytesTotal;

    @l
    private final ReaderRunnable readerRunnable;

    @l
    private final TaskQueue settingsListenerQueue;

    /* renamed from: socket */
    @l
    private final Socket f20852socket;

    @l
    private final Map<Integer, Http2Stream> streams;

    @l
    private final TaskRunner taskRunner;
    private long writeBytesMaximum;
    private long writeBytesTotal;

    @l
    private final Http2Writer writer;

    @l
    private final TaskQueue writerQueue;

    @i0(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b+\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\bB\u0010CJ.\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eJ\u0006\u0010\u0011\u001a\u00020\u0010R\"\u0010\u0013\u001a\u00020\u00128\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\u00020\u00198\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\"\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010#\u001a\u00020\u00048\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010\u0007\u001a\u00020\u00068\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u0010\t\u001a\u00020\b8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\t\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010\u000b\u001a\u00020\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010\r\u001a\u00020\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\r\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010\u000f\u001a\u00020\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010A¨\u0006D"}, d2 = {"Lokhttp3/internal/http2/Http2Connection$Builder;", "", "Ljava/net/Socket;", "socket", "", "peerName", "Lokio/BufferedSource;", "source", "Lokio/m;", "sink", "Lokhttp3/internal/http2/Http2Connection$Listener;", "listener", "Lokhttp3/internal/http2/PushObserver;", "pushObserver", "", "pingIntervalMillis", "Lokhttp3/internal/http2/Http2Connection;", "build", "", "client", "Z", "getClient$okhttp", "()Z", "setClient$okhttp", "(Z)V", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "Lokhttp3/internal/concurrent/TaskRunner;", "getTaskRunner$okhttp", "()Lokhttp3/internal/concurrent/TaskRunner;", "Ljava/net/Socket;", "getSocket$okhttp", "()Ljava/net/Socket;", "setSocket$okhttp", "(Ljava/net/Socket;)V", "connectionName", "Ljava/lang/String;", "getConnectionName$okhttp", "()Ljava/lang/String;", "setConnectionName$okhttp", "(Ljava/lang/String;)V", "Lokio/BufferedSource;", "getSource$okhttp", "()Lokio/BufferedSource;", "setSource$okhttp", "(Lokio/BufferedSource;)V", "Lokio/m;", "getSink$okhttp", "()Lokio/m;", "setSink$okhttp", "(Lokio/m;)V", "Lokhttp3/internal/http2/Http2Connection$Listener;", "getListener$okhttp", "()Lokhttp3/internal/http2/Http2Connection$Listener;", "setListener$okhttp", "(Lokhttp3/internal/http2/Http2Connection$Listener;)V", "Lokhttp3/internal/http2/PushObserver;", "getPushObserver$okhttp", "()Lokhttp3/internal/http2/PushObserver;", "setPushObserver$okhttp", "(Lokhttp3/internal/http2/PushObserver;)V", "I", "getPingIntervalMillis$okhttp", "()I", "setPingIntervalMillis$okhttp", "(I)V", "<init>", "(ZLokhttp3/internal/concurrent/TaskRunner;)V", "okhttp"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class Builder {
        private boolean client;
        public String connectionName;

        @l
        private Listener listener;
        private int pingIntervalMillis;

        @l
        private PushObserver pushObserver;
        public m sink;

        /* renamed from: socket */
        public Socket f20853socket;
        public BufferedSource source;

        @l
        private final TaskRunner taskRunner;

        public Builder(boolean z4, @l TaskRunner taskRunner) {
            l0.p(taskRunner, "taskRunner");
            this.client = z4;
            this.taskRunner = taskRunner;
            this.listener = Listener.REFUSE_INCOMING_STREAMS;
            this.pushObserver = PushObserver.CANCEL;
        }

        public static /* synthetic */ Builder socket$default(Builder builder, Socket socket2, String str, BufferedSource bufferedSource, m mVar, int i5, Object obj) throws IOException {
            if ((i5 & 2) != 0) {
                str = Util.peerName(socket2);
            }
            if ((i5 & 4) != 0) {
                bufferedSource = y0.e(y0.v(socket2));
            }
            if ((i5 & 8) != 0) {
                mVar = y0.d(y0.q(socket2));
            }
            return builder.socket(socket2, str, bufferedSource, mVar);
        }

        @l
        public final Http2Connection build() {
            return new Http2Connection(this);
        }

        public final boolean getClient$okhttp() {
            return this.client;
        }

        @l
        public final String getConnectionName$okhttp() {
            String str = this.connectionName;
            if (str != null) {
                return str;
            }
            l0.S("connectionName");
            return null;
        }

        @l
        public final Listener getListener$okhttp() {
            return this.listener;
        }

        public final int getPingIntervalMillis$okhttp() {
            return this.pingIntervalMillis;
        }

        @l
        public final PushObserver getPushObserver$okhttp() {
            return this.pushObserver;
        }

        @l
        public final m getSink$okhttp() {
            m mVar = this.sink;
            if (mVar != null) {
                return mVar;
            }
            l0.S("sink");
            return null;
        }

        @l
        public final Socket getSocket$okhttp() {
            Socket socket2 = this.f20853socket;
            if (socket2 != null) {
                return socket2;
            }
            l0.S("socket");
            return null;
        }

        @l
        public final BufferedSource getSource$okhttp() {
            BufferedSource bufferedSource = this.source;
            if (bufferedSource != null) {
                return bufferedSource;
            }
            l0.S("source");
            return null;
        }

        @l
        public final TaskRunner getTaskRunner$okhttp() {
            return this.taskRunner;
        }

        @l
        public final Builder listener(@l Listener listener) {
            l0.p(listener, "listener");
            this.listener = listener;
            return this;
        }

        @l
        public final Builder pingIntervalMillis(int i5) {
            this.pingIntervalMillis = i5;
            return this;
        }

        @l
        public final Builder pushObserver(@l PushObserver pushObserver) {
            l0.p(pushObserver, "pushObserver");
            this.pushObserver = pushObserver;
            return this;
        }

        public final void setClient$okhttp(boolean z4) {
            this.client = z4;
        }

        public final void setConnectionName$okhttp(@l String str) {
            l0.p(str, "<set-?>");
            this.connectionName = str;
        }

        public final void setListener$okhttp(@l Listener listener) {
            l0.p(listener, "<set-?>");
            this.listener = listener;
        }

        public final void setPingIntervalMillis$okhttp(int i5) {
            this.pingIntervalMillis = i5;
        }

        public final void setPushObserver$okhttp(@l PushObserver pushObserver) {
            l0.p(pushObserver, "<set-?>");
            this.pushObserver = pushObserver;
        }

        public final void setSink$okhttp(@l m mVar) {
            l0.p(mVar, "<set-?>");
            this.sink = mVar;
        }

        public final void setSocket$okhttp(@l Socket socket2) {
            l0.p(socket2, "<set-?>");
            this.f20853socket = socket2;
        }

        public final void setSource$okhttp(@l BufferedSource bufferedSource) {
            l0.p(bufferedSource, "<set-?>");
            this.source = bufferedSource;
        }

        @l
        @i
        public final Builder socket(@l Socket socket2) throws IOException {
            l0.p(socket2, "socket");
            return socket$default(this, socket2, null, null, null, 14, null);
        }

        @l
        @i
        public final Builder socket(@l Socket socket2, @l String peerName) throws IOException {
            l0.p(socket2, "socket");
            l0.p(peerName, "peerName");
            return socket$default(this, socket2, peerName, null, null, 12, null);
        }

        @l
        @i
        public final Builder socket(@l Socket socket2, @l String peerName, @l BufferedSource source) throws IOException {
            l0.p(socket2, "socket");
            l0.p(peerName, "peerName");
            l0.p(source, "source");
            return socket$default(this, socket2, peerName, source, null, 8, null);
        }

        @l
        @i
        public final Builder socket(@l Socket socket2, @l String peerName, @l BufferedSource source, @l m sink) throws IOException {
            String str;
            l0.p(socket2, "socket");
            l0.p(peerName, "peerName");
            l0.p(source, "source");
            l0.p(sink, "sink");
            setSocket$okhttp(socket2);
            if (this.client) {
                str = Util.okHttpName + ' ' + peerName;
            } else {
                str = "MockWebServer " + peerName;
            }
            setConnectionName$okhttp(str);
            setSource$okhttp(source);
            setSink$okhttp(sink);
            return this;
        }
    }

    @i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lokhttp3/internal/http2/Http2Connection$Companion;", "", "()V", "AWAIT_PING", "", "DEFAULT_SETTINGS", "Lokhttp3/internal/http2/Settings;", "getDEFAULT_SETTINGS", "()Lokhttp3/internal/http2/Settings;", "DEGRADED_PING", "DEGRADED_PONG_TIMEOUT_NS", "INTERVAL_PING", "OKHTTP_CLIENT_WINDOW_SIZE", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @l
        public final Settings getDEFAULT_SETTINGS() {
            return Http2Connection.DEFAULT_SETTINGS;
        }
    }

    @i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000e"}, d2 = {"Lokhttp3/internal/http2/Http2Connection$Listener;", "", "Lokhttp3/internal/http2/Http2Stream;", "stream", "Lkotlin/r2;", "onStream", "Lokhttp3/internal/http2/Http2Connection;", Headers.CONN_DIRECTIVE, "Lokhttp3/internal/http2/Settings;", "settings", "onSettings", "<init>", "()V", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static abstract class Listener {

        @l
        public static final Companion Companion = new Companion(null);

        @l
        @e
        public static final Listener REFUSE_INCOMING_STREAMS = new Listener() { // from class: okhttp3.internal.http2.Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1
            @Override // okhttp3.internal.http2.Http2Connection.Listener
            public void onStream(@l Http2Stream stream) throws IOException {
                l0.p(stream, "stream");
                stream.close(ErrorCode.REFUSED_STREAM, null);
            }
        };

        @i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/http2/Http2Connection$Listener$Companion;", "", "()V", "REFUSE_INCOMING_STREAMS", "Lokhttp3/internal/http2/Http2Connection$Listener;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(w wVar) {
                this();
            }
        }

        public void onSettings(@l Http2Connection connection, @l Settings settings) {
            l0.p(connection, "connection");
            l0.p(settings, "settings");
        }

        public abstract void onStream(@l Http2Stream http2Stream) throws IOException;
    }

    @i0(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0011\b\u0000\u0012\u0006\u00104\u001a\u000203¢\u0006\u0004\b8\u00109J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J(\u0010\f\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J.\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J\u0018\u0010\u0014\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0018\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u0016\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0016J\b\u0010\u0019\u001a\u00020\u0003H\u0016J \u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0007H\u0016J \u0010!\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u001fH\u0016J\u0018\u0010$\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\"H\u0016J(\u0010(\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u0005H\u0016J&\u0010+\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u00072\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J8\u00102\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\u001f2\u0006\u0010/\u001a\u00020,2\u0006\u00100\u001a\u00020\u00072\u0006\u00101\u001a\u00020\"H\u0016R\u001a\u00104\u001a\u0002038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107¨\u0006:"}, d2 = {"Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;", "Lokhttp3/internal/http2/Http2Reader$Handler;", "Lkotlin/Function0;", "Lkotlin/r2;", "invoke", "", "inFinished", "", "streamId", "Lokio/BufferedSource;", "source", cq.a.LENGTH, "data", "associatedStreamId", "", "Lokhttp3/internal/http2/Header;", "headerBlock", TTDownloadField.TT_HEADERS, "Lokhttp3/internal/http2/ErrorCode;", MediationConstant.KEY_ERROR_CODE, "rstStream", "clearPrevious", "Lokhttp3/internal/http2/Settings;", "settings", "applyAndAckSettings", "ackSettings", "ack", "payload1", "payload2", "ping", "lastGoodStreamId", "Lokio/n;", "debugData", "goAway", "", "windowSizeIncrement", "windowUpdate", "streamDependency", "weight", "exclusive", LogFactory.PRIORITY_KEY, "promisedStreamId", "requestHeaders", "pushPromise", "", "origin", "protocol", c.f19042f, ClientCookie.PORT_ATTR, "maxAge", "alternateService", "Lokhttp3/internal/http2/Http2Reader;", "reader", "Lokhttp3/internal/http2/Http2Reader;", "getReader$okhttp", "()Lokhttp3/internal/http2/Http2Reader;", "<init>", "(Lokhttp3/internal/http2/Http2Connection;Lokhttp3/internal/http2/Http2Reader;)V", "okhttp"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nHttp2Connection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection$ReaderRunnable\n+ 2 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 Util.kt\nokhttp3/internal/Util\n*L\n1#1,1006:1\n90#2,13:1007\n90#2,13:1020\n90#2,13:1035\n90#2,13:1049\n37#3,2:1033\n37#3,2:1062\n563#4:1048\n563#4:1064\n*S KotlinDebug\n*F\n+ 1 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection$ReaderRunnable\n*L\n687#1:1007,13\n715#1:1020,13\n758#1:1035,13\n806#1:1049,13\n753#1:1033,2\n824#1:1062,2\n797#1:1048\n841#1:1064\n*E\n"})
    /* loaded from: classes4.dex */
    public final class ReaderRunnable implements Http2Reader.Handler, a<r2> {

        @l
        private final Http2Reader reader;
        final /* synthetic */ Http2Connection this$0;

        public ReaderRunnable(@l Http2Connection http2Connection, Http2Reader reader) {
            l0.p(reader, "reader");
            this.this$0 = http2Connection;
            this.reader = reader;
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void ackSettings() {
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void alternateService(int i5, @l String origin, @l n protocol, @l String host, int i6, long j5) {
            l0.p(origin, "origin");
            l0.p(protocol, "protocol");
            l0.p(host, "host");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r13v1 */
        /* JADX WARN: Type inference failed for: r13v2, types: [T, okhttp3.internal.http2.Settings] */
        /* JADX WARN: Type inference failed for: r13v3 */
        public final void applyAndAckSettings(boolean z4, @l Settings settings) {
            ?? r13;
            long initialWindowSize;
            int i5;
            Http2Stream[] http2StreamArr;
            l0.p(settings, "settings");
            final k1.h hVar = new k1.h();
            Http2Writer writer = this.this$0.getWriter();
            final Http2Connection http2Connection = this.this$0;
            synchronized (writer) {
                synchronized (http2Connection) {
                    Settings peerSettings = http2Connection.getPeerSettings();
                    if (z4) {
                        r13 = settings;
                    } else {
                        Settings settings2 = new Settings();
                        settings2.merge(peerSettings);
                        settings2.merge(settings);
                        r13 = settings2;
                    }
                    hVar.element = r13;
                    initialWindowSize = r13.getInitialWindowSize() - peerSettings.getInitialWindowSize();
                    if (initialWindowSize != 0 && !http2Connection.getStreams$okhttp().isEmpty()) {
                        http2StreamArr = (Http2Stream[]) http2Connection.getStreams$okhttp().values().toArray(new Http2Stream[0]);
                        http2Connection.setPeerSettings((Settings) hVar.element);
                        http2Connection.settingsListenerQueue.schedule(new Task(http2Connection.getConnectionName$okhttp() + " onSettings", true) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$applyAndAckSettings$lambda$7$lambda$6$$inlined$execute$default$1
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // okhttp3.internal.concurrent.Task
                            public long runOnce() {
                                http2Connection.getListener$okhttp().onSettings(http2Connection, (Settings) hVar.element);
                                return -1L;
                            }
                        }, 0L);
                        r2 r2Var = r2.f19517a;
                    }
                    http2StreamArr = null;
                    http2Connection.setPeerSettings((Settings) hVar.element);
                    http2Connection.settingsListenerQueue.schedule(new Task(http2Connection.getConnectionName$okhttp() + " onSettings", true) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$applyAndAckSettings$lambda$7$lambda$6$$inlined$execute$default$1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // okhttp3.internal.concurrent.Task
                        public long runOnce() {
                            http2Connection.getListener$okhttp().onSettings(http2Connection, (Settings) hVar.element);
                            return -1L;
                        }
                    }, 0L);
                    r2 r2Var2 = r2.f19517a;
                }
                try {
                    http2Connection.getWriter().applyAndAckSettings((Settings) hVar.element);
                } catch (IOException e5) {
                    http2Connection.failConnection(e5);
                }
                r2 r2Var3 = r2.f19517a;
            }
            if (http2StreamArr != null) {
                for (Http2Stream http2Stream : http2StreamArr) {
                    synchronized (http2Stream) {
                        http2Stream.addBytesToWriteWindow(initialWindowSize);
                        r2 r2Var4 = r2.f19517a;
                    }
                }
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void data(boolean z4, int i5, @l BufferedSource source, int i6) throws IOException {
            l0.p(source, "source");
            if (this.this$0.pushedStream$okhttp(i5)) {
                this.this$0.pushDataLater$okhttp(i5, source, i6, z4);
                return;
            }
            Http2Stream stream = this.this$0.getStream(i5);
            if (stream == null) {
                this.this$0.writeSynResetLater$okhttp(i5, ErrorCode.PROTOCOL_ERROR);
                long j5 = i6;
                this.this$0.updateConnectionFlowControl$okhttp(j5);
                source.skip(j5);
                return;
            }
            stream.receiveData(source, i6);
            if (z4) {
                stream.receiveHeaders(Util.EMPTY_HEADERS, true);
            }
        }

        @l
        public final Http2Reader getReader$okhttp() {
            return this.reader;
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void goAway(int i5, @l ErrorCode errorCode, @l n debugData) {
            int i6;
            Object[] array;
            l0.p(errorCode, "errorCode");
            l0.p(debugData, "debugData");
            debugData.size();
            Http2Connection http2Connection = this.this$0;
            synchronized (http2Connection) {
                array = http2Connection.getStreams$okhttp().values().toArray(new Http2Stream[0]);
                http2Connection.isShutdown = true;
                r2 r2Var = r2.f19517a;
            }
            for (Http2Stream http2Stream : (Http2Stream[]) array) {
                if (http2Stream.getId() > i5 && http2Stream.isLocallyInitiated()) {
                    http2Stream.receiveRstStream(ErrorCode.REFUSED_STREAM);
                    this.this$0.removeStream$okhttp(http2Stream.getId());
                }
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void headers(boolean z4, int i5, int i6, @l List<Header> headerBlock) {
            l0.p(headerBlock, "headerBlock");
            if (this.this$0.pushedStream$okhttp(i5)) {
                this.this$0.pushHeadersLater$okhttp(i5, headerBlock, z4);
                return;
            }
            final Http2Connection http2Connection = this.this$0;
            synchronized (http2Connection) {
                Http2Stream stream = http2Connection.getStream(i5);
                if (stream == null) {
                    if (http2Connection.isShutdown) {
                        return;
                    }
                    if (i5 <= http2Connection.getLastGoodStreamId$okhttp()) {
                        return;
                    }
                    if (i5 % 2 == http2Connection.getNextStreamId$okhttp() % 2) {
                        return;
                    }
                    final Http2Stream http2Stream = new Http2Stream(i5, http2Connection, false, z4, Util.toHeaders(headerBlock));
                    http2Connection.setLastGoodStreamId$okhttp(i5);
                    http2Connection.getStreams$okhttp().put(Integer.valueOf(i5), http2Stream);
                    http2Connection.taskRunner.newQueue().schedule(new Task(http2Connection.getConnectionName$okhttp() + '[' + i5 + "] onStream", true) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$headers$lambda$2$$inlined$execute$default$1
                        @Override // okhttp3.internal.concurrent.Task
                        public long runOnce() {
                            try {
                                http2Connection.getListener$okhttp().onStream(http2Stream);
                                return -1L;
                            } catch (IOException e5) {
                                Platform.Companion.get().log("Http2Connection.Listener failure for " + http2Connection.getConnectionName$okhttp(), 4, e5);
                                try {
                                    http2Stream.close(ErrorCode.PROTOCOL_ERROR, e5);
                                    return -1L;
                                } catch (IOException unused) {
                                    return -1L;
                                }
                            }
                        }
                    }, 0L);
                    return;
                }
                r2 r2Var = r2.f19517a;
                stream.receiveHeaders(Util.toHeaders(headerBlock), z4);
            }
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ r2 invoke() {
            invoke2();
            return r2.f19517a;
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void ping(boolean z4, final int i5, final int i6) {
            if (z4) {
                Http2Connection http2Connection = this.this$0;
                synchronized (http2Connection) {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            if (i5 == 3) {
                                http2Connection.awaitPongsReceived++;
                                l0.n(http2Connection, "null cannot be cast to non-null type java.lang.Object");
                                http2Connection.notifyAll();
                            }
                            r2 r2Var = r2.f19517a;
                        } else {
                            http2Connection.degradedPongsReceived++;
                        }
                    } else {
                        http2Connection.intervalPongsReceived++;
                    }
                }
                return;
            }
            TaskQueue taskQueue = this.this$0.writerQueue;
            String str = this.this$0.getConnectionName$okhttp() + " ping";
            final Http2Connection http2Connection2 = this.this$0;
            taskQueue.schedule(new Task(str, true) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$ping$$inlined$execute$default$1
                @Override // okhttp3.internal.concurrent.Task
                public long runOnce() {
                    http2Connection2.writePing(true, i5, i6);
                    return -1L;
                }
            }, 0L);
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void priority(int i5, int i6, int i7, boolean z4) {
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void pushPromise(int i5, int i6, @l List<Header> requestHeaders) {
            l0.p(requestHeaders, "requestHeaders");
            this.this$0.pushRequestLater$okhttp(i6, requestHeaders);
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void rstStream(int i5, @l ErrorCode errorCode) {
            l0.p(errorCode, "errorCode");
            if (this.this$0.pushedStream$okhttp(i5)) {
                this.this$0.pushResetLater$okhttp(i5, errorCode);
                return;
            }
            Http2Stream removeStream$okhttp = this.this$0.removeStream$okhttp(i5);
            if (removeStream$okhttp != null) {
                removeStream$okhttp.receiveRstStream(errorCode);
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void settings(final boolean z4, @l final Settings settings) {
            l0.p(settings, "settings");
            this.this$0.writerQueue.schedule(new Task(this.this$0.getConnectionName$okhttp() + " applyAndAckSettings", true) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$settings$$inlined$execute$default$1
                @Override // okhttp3.internal.concurrent.Task
                public long runOnce() {
                    this.applyAndAckSettings(z4, settings);
                    return -1L;
                }
            }, 0L);
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void windowUpdate(int i5, long j5) {
            if (i5 == 0) {
                Http2Connection http2Connection = this.this$0;
                synchronized (http2Connection) {
                    http2Connection.writeBytesMaximum = http2Connection.getWriteBytesMaximum() + j5;
                    l0.n(http2Connection, "null cannot be cast to non-null type java.lang.Object");
                    http2Connection.notifyAll();
                    r2 r2Var = r2.f19517a;
                }
                return;
            }
            Http2Stream stream = this.this$0.getStream(i5);
            if (stream != null) {
                synchronized (stream) {
                    stream.addBytesToWriteWindow(j5);
                    r2 r2Var2 = r2.f19517a;
                }
            }
        }

        /* renamed from: invoke */
        public void invoke2() {
            ErrorCode errorCode;
            ErrorCode errorCode2 = ErrorCode.INTERNAL_ERROR;
            IOException e5 = null;
            try {
                this.reader.readConnectionPreface(this);
                do {
                } while (this.reader.nextFrame(false, this));
                errorCode = ErrorCode.NO_ERROR;
                try {
                    try {
                        this.this$0.close$okhttp(errorCode, ErrorCode.CANCEL, null);
                    } catch (IOException e6) {
                        e5 = e6;
                        ErrorCode errorCode3 = ErrorCode.PROTOCOL_ERROR;
                        this.this$0.close$okhttp(errorCode3, errorCode3, e5);
                        Util.closeQuietly(this.reader);
                    }
                } catch (Throwable th) {
                    th = th;
                    this.this$0.close$okhttp(errorCode, errorCode2, e5);
                    Util.closeQuietly(this.reader);
                    throw th;
                }
            } catch (IOException e7) {
                e5 = e7;
                errorCode = errorCode2;
            } catch (Throwable th2) {
                th = th2;
                errorCode = errorCode2;
                this.this$0.close$okhttp(errorCode, errorCode2, e5);
                Util.closeQuietly(this.reader);
                throw th;
            }
            Util.closeQuietly(this.reader);
        }
    }

    static {
        Settings settings = new Settings();
        settings.set(7, 65535);
        settings.set(5, 16384);
        DEFAULT_SETTINGS = settings;
    }

    public Http2Connection(@l Builder builder) {
        int i5;
        l0.p(builder, "builder");
        boolean client$okhttp = builder.getClient$okhttp();
        this.client = client$okhttp;
        this.listener = builder.getListener$okhttp();
        this.streams = new LinkedHashMap();
        String connectionName$okhttp = builder.getConnectionName$okhttp();
        this.connectionName = connectionName$okhttp;
        if (builder.getClient$okhttp()) {
            i5 = 3;
        } else {
            i5 = 2;
        }
        this.nextStreamId = i5;
        TaskRunner taskRunner$okhttp = builder.getTaskRunner$okhttp();
        this.taskRunner = taskRunner$okhttp;
        TaskQueue newQueue = taskRunner$okhttp.newQueue();
        this.writerQueue = newQueue;
        this.pushQueue = taskRunner$okhttp.newQueue();
        this.settingsListenerQueue = taskRunner$okhttp.newQueue();
        this.pushObserver = builder.getPushObserver$okhttp();
        Settings settings = new Settings();
        if (builder.getClient$okhttp()) {
            settings.set(7, 16777216);
        }
        this.okHttpSettings = settings;
        this.peerSettings = DEFAULT_SETTINGS;
        this.writeBytesMaximum = r2.getInitialWindowSize();
        this.f20852socket = builder.getSocket$okhttp();
        this.writer = new Http2Writer(builder.getSink$okhttp(), client$okhttp);
        this.readerRunnable = new ReaderRunnable(this, new Http2Reader(builder.getSource$okhttp(), client$okhttp));
        this.currentPushRequests = new LinkedHashSet();
        if (builder.getPingIntervalMillis$okhttp() != 0) {
            final long nanos = TimeUnit.MILLISECONDS.toNanos(builder.getPingIntervalMillis$okhttp());
            newQueue.schedule(new Task(connectionName$okhttp + " ping") { // from class: okhttp3.internal.http2.Http2Connection$special$$inlined$schedule$1
                @Override // okhttp3.internal.concurrent.Task
                public long runOnce() {
                    long j5;
                    long j6;
                    boolean z4;
                    synchronized (this) {
                        long j7 = this.intervalPongsReceived;
                        j5 = this.intervalPingsSent;
                        if (j7 < j5) {
                            z4 = true;
                        } else {
                            j6 = this.intervalPingsSent;
                            this.intervalPingsSent = j6 + 1;
                            z4 = false;
                        }
                    }
                    if (z4) {
                        this.failConnection(null);
                        return -1L;
                    }
                    this.writePing(false, 1, 0);
                    return nanos;
                }
            }, nanos);
        }
    }

    public final void failConnection(IOException iOException) {
        ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
        close$okhttp(errorCode, errorCode, iOException);
    }

    public static /* synthetic */ void start$default(Http2Connection http2Connection, boolean z4, TaskRunner taskRunner, int i5, Object obj) throws IOException {
        if ((i5 & 1) != 0) {
            z4 = true;
        }
        if ((i5 & 2) != 0) {
            taskRunner = TaskRunner.INSTANCE;
        }
        http2Connection.start(z4, taskRunner);
    }

    public final synchronized void awaitPong() throws InterruptedException {
        while (this.awaitPongsReceived < this.awaitPingsSent) {
            l0.n(this, "null cannot be cast to non-null type java.lang.Object");
            wait();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        close$okhttp(ErrorCode.NO_ERROR, ErrorCode.CANCEL, null);
    }

    public final void close$okhttp(@l ErrorCode connectionCode, @l ErrorCode streamCode, @p4.m IOException iOException) {
        int i5;
        Object[] objArr;
        l0.p(connectionCode, "connectionCode");
        l0.p(streamCode, "streamCode");
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        try {
            shutdown(connectionCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (!this.streams.isEmpty()) {
                objArr = this.streams.values().toArray(new Http2Stream[0]);
                this.streams.clear();
            } else {
                objArr = null;
            }
            r2 r2Var = r2.f19517a;
        }
        Http2Stream[] http2StreamArr = (Http2Stream[]) objArr;
        if (http2StreamArr != null) {
            for (Http2Stream http2Stream : http2StreamArr) {
                try {
                    http2Stream.close(streamCode, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.writer.close();
        } catch (IOException unused3) {
        }
        try {
            this.f20852socket.close();
        } catch (IOException unused4) {
        }
        this.writerQueue.shutdown();
        this.pushQueue.shutdown();
        this.settingsListenerQueue.shutdown();
    }

    public final void flush() throws IOException {
        this.writer.flush();
    }

    public final boolean getClient$okhttp() {
        return this.client;
    }

    @l
    public final String getConnectionName$okhttp() {
        return this.connectionName;
    }

    public final int getLastGoodStreamId$okhttp() {
        return this.lastGoodStreamId;
    }

    @l
    public final Listener getListener$okhttp() {
        return this.listener;
    }

    public final int getNextStreamId$okhttp() {
        return this.nextStreamId;
    }

    @l
    public final Settings getOkHttpSettings() {
        return this.okHttpSettings;
    }

    @l
    public final Settings getPeerSettings() {
        return this.peerSettings;
    }

    public final long getReadBytesAcknowledged() {
        return this.readBytesAcknowledged;
    }

    public final long getReadBytesTotal() {
        return this.readBytesTotal;
    }

    @l
    public final ReaderRunnable getReaderRunnable() {
        return this.readerRunnable;
    }

    @l
    public final Socket getSocket$okhttp() {
        return this.f20852socket;
    }

    @p4.m
    public final synchronized Http2Stream getStream(int i5) {
        return this.streams.get(Integer.valueOf(i5));
    }

    @l
    public final Map<Integer, Http2Stream> getStreams$okhttp() {
        return this.streams;
    }

    public final long getWriteBytesMaximum() {
        return this.writeBytesMaximum;
    }

    public final long getWriteBytesTotal() {
        return this.writeBytesTotal;
    }

    @l
    public final Http2Writer getWriter() {
        return this.writer;
    }

    public final synchronized boolean isHealthy(long j5) {
        if (this.isShutdown) {
            return false;
        }
        if (this.degradedPongsReceived < this.degradedPingsSent) {
            if (j5 >= this.degradedPongDeadlineNs) {
                return false;
            }
        }
        return true;
    }

    @l
    public final Http2Stream newStream(@l List<Header> requestHeaders, boolean z4) throws IOException {
        l0.p(requestHeaders, "requestHeaders");
        return newStream(0, requestHeaders, z4);
    }

    public final synchronized int openStreamCount() {
        return this.streams.size();
    }

    public final void pushDataLater$okhttp(final int i5, @l BufferedSource source, final int i6, final boolean z4) throws IOException {
        l0.p(source, "source");
        final okio.l lVar = new okio.l();
        long j5 = i6;
        source.U(j5);
        source.read(lVar, j5);
        this.pushQueue.schedule(new Task(this.connectionName + '[' + i5 + "] onData", true) { // from class: okhttp3.internal.http2.Http2Connection$pushDataLater$$inlined$execute$default$1
            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                PushObserver pushObserver;
                Set set;
                try {
                    pushObserver = this.pushObserver;
                    boolean onData = pushObserver.onData(i5, lVar, i6, z4);
                    if (onData) {
                        this.getWriter().rstStream(i5, ErrorCode.CANCEL);
                    }
                    if (onData || z4) {
                        synchronized (this) {
                            set = this.currentPushRequests;
                            set.remove(Integer.valueOf(i5));
                        }
                        return -1L;
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
            }
        }, 0L);
    }

    public final void pushHeadersLater$okhttp(final int i5, @l final List<Header> requestHeaders, final boolean z4) {
        l0.p(requestHeaders, "requestHeaders");
        this.pushQueue.schedule(new Task(this.connectionName + '[' + i5 + "] onHeaders", true) { // from class: okhttp3.internal.http2.Http2Connection$pushHeadersLater$$inlined$execute$default$1
            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                PushObserver pushObserver;
                Set set;
                pushObserver = this.pushObserver;
                boolean onHeaders = pushObserver.onHeaders(i5, requestHeaders, z4);
                if (onHeaders) {
                    try {
                        this.getWriter().rstStream(i5, ErrorCode.CANCEL);
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
                if (onHeaders || z4) {
                    synchronized (this) {
                        set = this.currentPushRequests;
                        set.remove(Integer.valueOf(i5));
                    }
                    return -1L;
                }
                return -1L;
            }
        }, 0L);
    }

    public final void pushRequestLater$okhttp(final int i5, @l final List<Header> requestHeaders) {
        l0.p(requestHeaders, "requestHeaders");
        synchronized (this) {
            if (this.currentPushRequests.contains(Integer.valueOf(i5))) {
                writeSynResetLater$okhttp(i5, ErrorCode.PROTOCOL_ERROR);
                return;
            }
            this.currentPushRequests.add(Integer.valueOf(i5));
            this.pushQueue.schedule(new Task(this.connectionName + '[' + i5 + "] onRequest", true) { // from class: okhttp3.internal.http2.Http2Connection$pushRequestLater$$inlined$execute$default$1
                @Override // okhttp3.internal.concurrent.Task
                public long runOnce() {
                    PushObserver pushObserver;
                    Set set;
                    pushObserver = this.pushObserver;
                    if (pushObserver.onRequest(i5, requestHeaders)) {
                        try {
                            this.getWriter().rstStream(i5, ErrorCode.CANCEL);
                            synchronized (this) {
                                set = this.currentPushRequests;
                                set.remove(Integer.valueOf(i5));
                            }
                            return -1L;
                        } catch (IOException unused) {
                            return -1L;
                        }
                    }
                    return -1L;
                }
            }, 0L);
        }
    }

    public final void pushResetLater$okhttp(final int i5, @l final ErrorCode errorCode) {
        l0.p(errorCode, "errorCode");
        this.pushQueue.schedule(new Task(this.connectionName + '[' + i5 + "] onReset", true) { // from class: okhttp3.internal.http2.Http2Connection$pushResetLater$$inlined$execute$default$1
            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                PushObserver pushObserver;
                Set set;
                pushObserver = this.pushObserver;
                pushObserver.onReset(i5, errorCode);
                synchronized (this) {
                    set = this.currentPushRequests;
                    set.remove(Integer.valueOf(i5));
                    r2 r2Var = r2.f19517a;
                }
                return -1L;
            }
        }, 0L);
    }

    @l
    public final Http2Stream pushStream(int i5, @l List<Header> requestHeaders, boolean z4) throws IOException {
        l0.p(requestHeaders, "requestHeaders");
        if (!this.client) {
            return newStream(i5, requestHeaders, z4);
        }
        throw new IllegalStateException("Client cannot push requests.".toString());
    }

    public final boolean pushedStream$okhttp(int i5) {
        return i5 != 0 && (i5 & 1) == 0;
    }

    @p4.m
    public final synchronized Http2Stream removeStream$okhttp(int i5) {
        Http2Stream remove;
        remove = this.streams.remove(Integer.valueOf(i5));
        l0.n(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return remove;
    }

    public final void sendDegradedPingLater$okhttp() {
        synchronized (this) {
            long j5 = this.degradedPongsReceived;
            long j6 = this.degradedPingsSent;
            if (j5 < j6) {
                return;
            }
            this.degradedPingsSent = j6 + 1;
            this.degradedPongDeadlineNs = System.nanoTime() + 1000000000;
            r2 r2Var = r2.f19517a;
            this.writerQueue.schedule(new Task(this.connectionName + " ping", true) { // from class: okhttp3.internal.http2.Http2Connection$sendDegradedPingLater$$inlined$execute$default$1
                @Override // okhttp3.internal.concurrent.Task
                public long runOnce() {
                    this.writePing(false, 2, 0);
                    return -1L;
                }
            }, 0L);
        }
    }

    public final void setLastGoodStreamId$okhttp(int i5) {
        this.lastGoodStreamId = i5;
    }

    public final void setNextStreamId$okhttp(int i5) {
        this.nextStreamId = i5;
    }

    public final void setPeerSettings(@l Settings settings) {
        l0.p(settings, "<set-?>");
        this.peerSettings = settings;
    }

    public final void setSettings(@l Settings settings) throws IOException {
        l0.p(settings, "settings");
        synchronized (this.writer) {
            synchronized (this) {
                if (!this.isShutdown) {
                    this.okHttpSettings.merge(settings);
                    r2 r2Var = r2.f19517a;
                } else {
                    throw new ConnectionShutdownException();
                }
            }
            this.writer.settings(settings);
        }
    }

    public final void shutdown(@l ErrorCode statusCode) throws IOException {
        l0.p(statusCode, "statusCode");
        synchronized (this.writer) {
            k1.f fVar = new k1.f();
            synchronized (this) {
                if (this.isShutdown) {
                    return;
                }
                this.isShutdown = true;
                int i5 = this.lastGoodStreamId;
                fVar.element = i5;
                r2 r2Var = r2.f19517a;
                this.writer.goAway(i5, statusCode, Util.EMPTY_BYTE_ARRAY);
            }
        }
    }

    @i
    public final void start() throws IOException {
        start$default(this, false, null, 3, null);
    }

    @i
    public final void start(boolean z4) throws IOException {
        start$default(this, z4, null, 2, null);
    }

    @i
    public final void start(boolean z4, @l TaskRunner taskRunner) throws IOException {
        l0.p(taskRunner, "taskRunner");
        if (z4) {
            this.writer.connectionPreface();
            this.writer.settings(this.okHttpSettings);
            if (this.okHttpSettings.getInitialWindowSize() != 65535) {
                this.writer.windowUpdate(0, r5 - 65535);
            }
        }
        taskRunner.newQueue().schedule(new TaskQueue$execute$1(this.connectionName, true, this.readerRunnable), 0L);
    }

    public final synchronized void updateConnectionFlowControl$okhttp(long j5) {
        long j6 = this.readBytesTotal + j5;
        this.readBytesTotal = j6;
        long j7 = j6 - this.readBytesAcknowledged;
        if (j7 >= this.okHttpSettings.getInitialWindowSize() / 2) {
            writeWindowUpdateLater$okhttp(0, j7);
            this.readBytesAcknowledged += j7;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        throw new java.io.IOException("stream closed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0038, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.writer.maxDataLength());
        r6 = r2;
        r8.writeBytesTotal += r6;
        r4 = kotlin.r2.f19517a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void writeData(int r9, boolean r10, @p4.m okio.l r11, long r12) throws java.io.IOException {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            okhttp3.internal.http2.Http2Writer r12 = r8.writer
            r12.data(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L71
            monitor-enter(r8)
        L12:
            long r4 = r8.writeBytesTotal     // Catch: java.lang.Throwable -> L60 java.lang.InterruptedException -> L62
            long r6 = r8.writeBytesMaximum     // Catch: java.lang.Throwable -> L60 java.lang.InterruptedException -> L62
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L37
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> r2 = r8.streams     // Catch: java.lang.Throwable -> L60 java.lang.InterruptedException -> L62
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L60 java.lang.InterruptedException -> L62
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L60 java.lang.InterruptedException -> L62
            if (r2 == 0) goto L2f
            java.lang.String r2 = "null cannot be cast to non-null type java.lang.Object"
            kotlin.jvm.internal.l0.n(r8, r2)     // Catch: java.lang.Throwable -> L60 java.lang.InterruptedException -> L62
            r8.wait()     // Catch: java.lang.Throwable -> L60 java.lang.InterruptedException -> L62
            goto L12
        L2f:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L60 java.lang.InterruptedException -> L62
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L60 java.lang.InterruptedException -> L62
            throw r9     // Catch: java.lang.Throwable -> L60 java.lang.InterruptedException -> L62
        L37:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch: java.lang.Throwable -> L60
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L60
            okhttp3.internal.http2.Http2Writer r4 = r8.writer     // Catch: java.lang.Throwable -> L60
            int r4 = r4.maxDataLength()     // Catch: java.lang.Throwable -> L60
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L60
            long r4 = r8.writeBytesTotal     // Catch: java.lang.Throwable -> L60
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L60
            long r4 = r4 + r6
            r8.writeBytesTotal = r4     // Catch: java.lang.Throwable -> L60
            kotlin.r2 r4 = kotlin.r2.f19517a     // Catch: java.lang.Throwable -> L60
            monitor-exit(r8)
            long r12 = r12 - r6
            okhttp3.internal.http2.Http2Writer r4 = r8.writer
            if (r10 == 0) goto L5b
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L5b
            r5 = 1
            goto L5c
        L5b:
            r5 = r3
        L5c:
            r4.data(r5, r9, r11, r2)
            goto Ld
        L60:
            r9 = move-exception
            goto L6f
        L62:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L60
            r9.interrupt()     // Catch: java.lang.Throwable -> L60
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L60
            r9.<init>()     // Catch: java.lang.Throwable -> L60
            throw r9     // Catch: java.lang.Throwable -> L60
        L6f:
            monitor-exit(r8)
            throw r9
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Connection.writeData(int, boolean, okio.l, long):void");
    }

    public final void writeHeaders$okhttp(int i5, boolean z4, @l List<Header> alternating) throws IOException {
        l0.p(alternating, "alternating");
        this.writer.headers(z4, i5, alternating);
    }

    public final void writePing(boolean z4, int i5, int i6) {
        try {
            this.writer.ping(z4, i5, i6);
        } catch (IOException e5) {
            failConnection(e5);
        }
    }

    public final void writePingAndAwaitPong() throws InterruptedException {
        writePing();
        awaitPong();
    }

    public final void writeSynReset$okhttp(int i5, @l ErrorCode statusCode) throws IOException {
        l0.p(statusCode, "statusCode");
        this.writer.rstStream(i5, statusCode);
    }

    public final void writeSynResetLater$okhttp(final int i5, @l final ErrorCode errorCode) {
        l0.p(errorCode, "errorCode");
        this.writerQueue.schedule(new Task(this.connectionName + '[' + i5 + "] writeSynReset", true) { // from class: okhttp3.internal.http2.Http2Connection$writeSynResetLater$$inlined$execute$default$1
            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                try {
                    this.writeSynReset$okhttp(i5, errorCode);
                    return -1L;
                } catch (IOException e5) {
                    this.failConnection(e5);
                    return -1L;
                }
            }
        }, 0L);
    }

    public final void writeWindowUpdateLater$okhttp(final int i5, final long j5) {
        this.writerQueue.schedule(new Task(this.connectionName + '[' + i5 + "] windowUpdate", true) { // from class: okhttp3.internal.http2.Http2Connection$writeWindowUpdateLater$$inlined$execute$default$1
            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                try {
                    this.getWriter().windowUpdate(i5, j5);
                    return -1L;
                } catch (IOException e5) {
                    this.failConnection(e5);
                    return -1L;
                }
            }
        }, 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0048 A[Catch: all -> 0x0081, TryCatch #0 {, blocks: (B:6:0x0007, B:8:0x000e, B:9:0x0013, B:11:0x0017, B:13:0x002a, B:15:0x0032, B:19:0x0042, B:21:0x0048, B:22:0x0051, B:37:0x007b, B:38:0x0080), top: B:5:0x0007, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final okhttp3.internal.http2.Http2Stream newStream(int r11, java.util.List<okhttp3.internal.http2.Header> r12, boolean r13) throws java.io.IOException {
        /*
            r10 = this;
            r6 = r13 ^ 1
            r4 = 0
            okhttp3.internal.http2.Http2Writer r7 = r10.writer
            monitor-enter(r7)
            monitor-enter(r10)     // Catch: java.lang.Throwable -> L84
            int r0 = r10.nextStreamId     // Catch: java.lang.Throwable -> L81
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            if (r0 <= r1) goto L13
            okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.REFUSED_STREAM     // Catch: java.lang.Throwable -> L81
            r10.shutdown(r0)     // Catch: java.lang.Throwable -> L81
        L13:
            boolean r0 = r10.isShutdown     // Catch: java.lang.Throwable -> L81
            if (r0 != 0) goto L7b
            int r8 = r10.nextStreamId     // Catch: java.lang.Throwable -> L81
            int r0 = r8 + 2
            r10.nextStreamId = r0     // Catch: java.lang.Throwable -> L81
            okhttp3.internal.http2.Http2Stream r9 = new okhttp3.internal.http2.Http2Stream     // Catch: java.lang.Throwable -> L81
            r5 = 0
            r0 = r9
            r1 = r8
            r2 = r10
            r3 = r6
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L81
            r0 = 1
            if (r13 == 0) goto L41
            long r1 = r10.writeBytesTotal     // Catch: java.lang.Throwable -> L81
            long r3 = r10.writeBytesMaximum     // Catch: java.lang.Throwable -> L81
            int r13 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r13 >= 0) goto L41
            long r1 = r9.getWriteBytesTotal()     // Catch: java.lang.Throwable -> L81
            long r3 = r9.getWriteBytesMaximum()     // Catch: java.lang.Throwable -> L81
            int r13 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r13 < 0) goto L3f
            goto L41
        L3f:
            r13 = 0
            goto L42
        L41:
            r13 = r0
        L42:
            boolean r1 = r9.isOpen()     // Catch: java.lang.Throwable -> L81
            if (r1 == 0) goto L51
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> r1 = r10.streams     // Catch: java.lang.Throwable -> L81
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L81
            r1.put(r2, r9)     // Catch: java.lang.Throwable -> L81
        L51:
            kotlin.r2 r1 = kotlin.r2.f19517a     // Catch: java.lang.Throwable -> L81
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L84
            if (r11 != 0) goto L5c
            okhttp3.internal.http2.Http2Writer r11 = r10.writer     // Catch: java.lang.Throwable -> L84
            r11.headers(r6, r8, r12)     // Catch: java.lang.Throwable -> L84
            goto L66
        L5c:
            boolean r1 = r10.client     // Catch: java.lang.Throwable -> L84
            r0 = r0 ^ r1
            if (r0 == 0) goto L6f
            okhttp3.internal.http2.Http2Writer r0 = r10.writer     // Catch: java.lang.Throwable -> L84
            r0.pushPromise(r11, r8, r12)     // Catch: java.lang.Throwable -> L84
        L66:
            monitor-exit(r7)
            if (r13 == 0) goto L6e
            okhttp3.internal.http2.Http2Writer r11 = r10.writer
            r11.flush()
        L6e:
            return r9
        L6f:
            java.lang.String r11 = "client streams shouldn't have associated stream IDs"
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L84
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L84
            r12.<init>(r11)     // Catch: java.lang.Throwable -> L84
            throw r12     // Catch: java.lang.Throwable -> L84
        L7b:
            okhttp3.internal.http2.ConnectionShutdownException r11 = new okhttp3.internal.http2.ConnectionShutdownException     // Catch: java.lang.Throwable -> L81
            r11.<init>()     // Catch: java.lang.Throwable -> L81
            throw r11     // Catch: java.lang.Throwable -> L81
        L81:
            r11 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L84
            throw r11     // Catch: java.lang.Throwable -> L84
        L84:
            r11 = move-exception
            monitor-exit(r7)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Connection.newStream(int, java.util.List, boolean):okhttp3.internal.http2.Http2Stream");
    }

    public final void writePing() throws InterruptedException {
        synchronized (this) {
            this.awaitPingsSent++;
        }
        writePing(false, 3, 1330343787);
    }
}
